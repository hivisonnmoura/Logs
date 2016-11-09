package servicos;

import entidades.EntidadeThread;
import fabricas.FabricaThread;
import repositorios.RepositorioThread;

public class ServicoThread {
	private RepositorioThread repositorioThread = new RepositorioThread();
	
	public ServicoThread(){
		
	}
	public EntidadeThread solicitarCriacaoThread(int pid, String username, String cpu, String process, int lwpid){
		EntidadeThread thread = FabricaThread.nova().criarThread(pid, username, cpu, process, lwpid);
		repositorioThread.insert(thread);
		return thread;
	}
}
