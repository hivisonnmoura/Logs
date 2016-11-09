package servicos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import entidades.EntidadeNo;
import entidades.EntidadeProcesso;
import utilidades.ProcessaDadosDoNo;
import servicos.ServicoNo;

public class ServicoFachada {

	ServicoDescompactador servicoDescompactador = new ServicoDescompactador();
	ProcessaDadosDoNo processaDadosDoNo = new ProcessaDadosDoNo();
	ServicoNo servicoNo = new ServicoNo();
	ServicoProcesso servicoProcesso = new ServicoProcesso();

	// static ServicoInterpretador servicoInterpretador = new
	// ServicoInterpretador();

	public static void ServicoFachada() {

	}

	public File solicitarServicoDescompactador(String caminho, List<String> ListaArquivo) {
		File file = servicoDescompactador.extrairLogs(caminho, ListaArquivo);
		System.out.println(file.getAbsolutePath());
		solicitarProcessaDadosDoNo(file);
		return file;
	}

	public void solicitarProcessaDadosDoNo(File caminhoTemp) {
		processaDadosDoNo.processaDiretorio(caminhoTemp);
		// pegar retorno para criar objeto
	}

	public List<EntidadeNo> inserirDados() {

		ArrayList<EntidadeProcesso> processos1 = new ArrayList<EntidadeProcesso>();

		EntidadeProcesso processo1 = servicoProcesso.solicitarCriacaoProcesso(12, "sds", "çaça", "sdsd", 1, "sdsds","sdsd");
		EntidadeProcesso processo2 = servicoProcesso.solicitarCriacaoProcesso(12, "sds", "çaça", "sdsd", 1, "sdsds","sdsd");
		EntidadeProcesso processo3 = servicoProcesso.solicitarCriacaoProcesso(12, "sds", "çaça", "sdsd", 1, "sdsds","sdsd");
		
		processos1.add(processo1);
		processos1.add(processo2);
		processos1.add(processo3);
		
		
		EntidadeNo no1 = servicoNo.solicitarCriacaoNo("no 1", "12/11/11", processos1);
		EntidadeNo no2 = servicoNo.solicitarCriacaoNo("no 2", "12/12/11", processos1);
		EntidadeNo no3 = servicoNo.solicitarCriacaoNo("no 3", "12/12/11", processos1);
		
		List<EntidadeNo> listanodos = new ArrayList<EntidadeNo>();
		
		listanodos.add(no1);
		listanodos.add(no2);
		listanodos.add(no3);
		
		return listanodos;
		
	}
}
