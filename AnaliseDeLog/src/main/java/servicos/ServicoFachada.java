package servicos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import entidades.EntidadeNo;
import entidades.EntidadeThread;
import repositorios.RepositorioNo;
import repositorios.RepositorioProcesso;
import repositorios.RepositorioThread;
import utilidades.ProcessaDadosDoNo;

public class ServicoFachada {

	//RepositorioThread repositorioThread = new RepositorioThread();
	ServicoDescompactador servicoDescompactador = new ServicoDescompactador();
	ProcessaDadosDoNo processaDadosDoNo = new ProcessaDadosDoNo();
	RepositorioProcesso repositorioProcesso = new RepositorioProcesso();
	RepositorioNo repositorioNo = new RepositorioNo();
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
	
	public void deletaRepositorios(){
		repositorioProcesso.delete();
		repositorioNo.delete();
	}
	
	public List<EntidadeNo> retornaListaEntidadeNo() {
		ServicoNo no = new ServicoNo();
		return no.buscarTodos();
	}
	

}
