package servicos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import entidades.EntidadeNo;
import entidades.EntidadeThread;
import repositorios.RepositorioThread;
import utilidades.ProcessaDadosDoNo;

public class ServicoFachada {

	RepositorioThread repositorioThread = new RepositorioThread();
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
		solicitarProcessaDadosDoNo(file);
		solicitarProcessaDadosCpuDetalhado(file);
		return file;
	}

	public void solicitarProcessaDadosDoNo(File caminhoTemp) {
		processaDadosDoNo.processaDiretorio(caminhoTemp);
		// pegar retorno para criar objeto

	}

	// carrega na memoria
	public void solicitarProcessaDadosCpuDetalhado(File caminhoTemp) {
		processaDadosDoNo.processaDiretorio(caminhoTemp);

	}

	public ArrayList<EntidadeThread> buscarTodosObjetosRepositorioThread() {
		return repositorioThread.findall();
	}

	public String direcionaCPUProcess(String caminhoDiretorio) {
			
		String conversaoDiretorioProcessParaDetalhado = caminhoDiretorio.replace("CPUProcess_","CPUProcess_Detalhado_");
		return conversaoDiretorioProcessParaDetalhado;
		
	}

	public List<EntidadeNo> retornaListaEntidadeNo() {
		
		return ;
	}
	

}
