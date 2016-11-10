package servicos;

import entidades.EntidadeThread;
import fabricas.FabricaThread;
import repositorios.RepositorioThread;

public class ServicoThread {
	private RepositorioThread repositorioThread = new RepositorioThread();
	
	public ServicoThread(){
		
	}
	public EntidadeThread solicitarCriacaoThread(int pid, String cpu, int lwpid){
		EntidadeThread thread = FabricaThread.nova().criarThread(pid, cpu, lwpid);
		repositorioThread.insert(thread);
		return thread;
	}
}
