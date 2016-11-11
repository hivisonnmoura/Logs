package servicos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import entidades.EntidadeNo;
import entidades.EntidadeThread;
import repositorios.RepositorioThread;
import utilidades.ProcessaDadosDoNo;
import utilidades.ProcessaStacksUtil;

public class ServicoFachada {

	//RepositorioThread repositorioThread = new RepositorioThread();
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

	public List<EntidadeThread> buscarTodosObjetosRepositorioThread() {
		ServicoThread thread = new ServicoThread();
		return  thread.buscarThreadDoRepositorio();
	}

	public String direcionaCPUProcess(String caminhoDiretorio) {
			
		String conversaoDiretorioProcessParaDetalhado = caminhoDiretorio.replace("CPUProcess_","CPUProcess_Detalhado_");
		return conversaoDiretorioProcessParaDetalhado;
		
	}
	
	
	
	public List<EntidadeNo> retornaListaEntidadeNo() {
		ServicoNo no = new ServicoNo();
		return no.buscarTodos();
	}

	public  List<String> direcionaStack(EntidadeThread selectedItem) {
		String caminhoDaStack = selectedItem.getCaminho().replace("CPUProcess_Detalhado_", "ResultDumps_").replace(".txt", ".log");
		int decimalLwpid = selectedItem.getLwpid();
		return ProcessaStacksUtil.processaStack(caminhoDaStack, decimalLwpid);
		
	}

	
	

}
