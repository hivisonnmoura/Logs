package servicos;

import java.io.File;
import java.util.List;
import repositorios.RepositorioProcesso;
import repositorios.RepositorioNo;
import entidades.EntidadeNo;
import entidades.EntidadeThread;
import repositorios.RepositorioThread;
import utilidades.ProcessaDadosDoNo;
import utilidades.ProcessaStacksUtil;

public class ServicoFachada {

	ServicoDescompactador servicoDescompactador = new ServicoDescompactador();
	ProcessaDadosDoNo processaDadosDoNo = new ProcessaDadosDoNo();
	RepositorioProcesso repositorioProcesso = new RepositorioProcesso();
	RepositorioNo repositorioNo = new RepositorioNo();
	RepositorioThread repositorioThread = new RepositorioThread();
	
	ServicoNo servicoNo = new ServicoNo();
	ServicoProcesso servicoProcesso = new ServicoProcesso();

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

	}

	public void deletaRepositorios() {
		repositorioProcesso.delete();
		repositorioNo.delete();
	}

	public void solicitarProcessaDadosCpuDetalhado(File caminhoTemp) {
		processaDadosDoNo.processaDiretorio(caminhoTemp);

	}

	public List<EntidadeThread> buscarTodosObjetosRepositorioThread() {
		ServicoThread thread = new ServicoThread();
		return thread.buscarThreadDoRepositorio();
	}

	public String direcionaCPUProcess(String caminhoDiretorio) {

		String conversaoDiretorioProcessParaDetalhado = caminhoDiretorio.replace("CPUProcess_",
				"CPUProcess_Detalhado_");
		return conversaoDiretorioProcessParaDetalhado;

	}

	public List<EntidadeNo> retornaListaEntidadeNo() {
		ServicoNo no = new ServicoNo();
		return no.buscarTodos();
	}

	public List<String> direcionaStack(EntidadeThread selectedItem) {
		String caminhoDaStack = selectedItem.getCaminho().replace("CPUProcess_Detalhado_", "ResultDumps_")
				.replace(".txt", ".log");
		int decimalLwpid = selectedItem.getLwpid();
		return ProcessaStacksUtil.processaStack(caminhoDaStack, decimalLwpid);

	}

	public void deletaStack(){
		repositorioThread.delete();
	}

}
