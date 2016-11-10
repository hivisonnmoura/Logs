package servicos;

import entidades.EntidadeThread;
import fabricas.FabricaThread;
import repositorios.RepositorioThread;

public class ServicoThread {
	private RepositorioThread repositorioThread = new RepositorioThread();
	
	public ServicoThread(){
		
	}
<<<<<<< HEAD
	public EntidadeThread solicitarCriacaoThread(int pid, String username, String cpu, String process, int lwpid){
		EntidadeThread thread = FabricaThread.nova().criarThread(pid, username, cpu, process, lwpid);
=======
	public EntidadeThread solicitarCriacaoThread(int pid, String cpu, int lwpid){
		EntidadeThread thread = FabricaThread.nova().criarThread(pid, cpu, lwpid);
>>>>>>> 516fa9ad355a3f3e95e169cf51fff95ca91e16c5
		repositorioThread.insert(thread);
		return thread;
	}
}
