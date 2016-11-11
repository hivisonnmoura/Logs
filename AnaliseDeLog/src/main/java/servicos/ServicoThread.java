package servicos;

import java.util.ArrayList;

import entidades.EntidadeThread;
import fabricas.FabricaThread;
import repositorios.RepositorioThread;

public class ServicoThread {
	ArrayList<EntidadeThread> entidadeThread = new ArrayList<EntidadeThread>();
	
	private RepositorioThread repositorioThread = new RepositorioThread();
	

	public ServicoThread() {

	}

	public EntidadeThread solicitarCriacaoThread(int pid, String cpu, int lwpid, String caminho) {
		EntidadeThread thread = FabricaThread.nova().criarThread(pid, cpu, lwpid, caminho);
		repositorioThread.insert(thread);
		return thread;
	}
	
	public ArrayList<EntidadeThread> buscarThreadDoRepositorio() {
		entidadeThread = repositorioThread.findall();
		return entidadeThread;
		}
	}
	

