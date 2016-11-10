package servicos;

import java.util.ArrayList;

import entidades.EntidadeThread;
import fabricas.FabricaThread;
import repositorios.RepositorioThread;

public class ServicoThread {
	private RepositorioThread repositorioThread = new RepositorioThread();
	ArrayList<EntidadeThread> entidadeThread = new ArrayList<EntidadeThread>();

	public ServicoThread() {

	}

	public EntidadeThread solicitarCriacaoThread(int pid, String cpu, int lwpid, String caminho) {
		EntidadeThread thread = FabricaThread.nova().criarThread(pid, cpu, lwpid, caminho);
		repositorioThread.insert(thread);
		return thread;
	}
	
	public void buscarThreadDoRepositorio() {
		entidadeThread = repositorioThread.findall();
		for (EntidadeThread entidadeThread2 : entidadeThread) {
			System.out.println(entidadeThread2);
		}
	}
	
}
