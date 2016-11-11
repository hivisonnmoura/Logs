package servicos;

import java.util.ArrayList;

import entidades.EntidadeThread;
import fabricas.FabricaThread;
import repositorios.RepositorioThread;

public class ServicoThread {
	private RepositorioThread repositorioThread = new RepositorioThread();
	

	public ServicoThread() {

	}

	public EntidadeThread solicitarCriacaoThread(int pid, String cpu, int lwpid, String caminho) {
		EntidadeThread thread = FabricaThread.nova().criarThread(pid, cpu, lwpid, caminho);
		repositorioThread.insert(thread);
		return thread;
	}
	
	public ArrayList<EntidadeThread> buscarThreadDoRepositorio() {
		return repositorioThread.findall();
		}
	}
	

