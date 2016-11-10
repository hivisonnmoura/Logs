package servicos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import entidades.EntidadeNo;
import entidades.EntidadeProcesso;
import utilidades.ProcessaDadosDoNo;

public class ServicoFachada {

	ServicoDescompactador servicoDescompactador = new ServicoDescompactador();
	ProcessaDadosDoNo processaDadosDoNo = new ProcessaDadosDoNo();

	ServicoNo servicoNo = new ServicoNo();
	ServicoProcesso servicoProcesso = new ServicoProcesso();
	ArrayList<EntidadeNo> listaNos = new ArrayList<EntidadeNo>();

	// static ServicoInterpretador servicoInterpretador = new
	// ServicoInterpretador();

	public static void ServicoFachada() {

	}

	public File solicitarServicoDescompactador(String caminho, List<String> ListaArquivo) {
		File file = servicoDescompactador.extrairLogs(caminho, ListaArquivo);

		solicitarProcessaDadosDoNo(file);
		return file;
	}

	public void solicitarProcessaDadosDoNo(File caminhoTemp) {
		processaDadosDoNo.processaDiretorio(caminhoTemp);
		// pegar retorno para criar objeto
	}

	public ArrayList<EntidadeNo> retornaListaEntidadeNo() {
		return  servicoNo.buscarTodos();
		
	}
}
