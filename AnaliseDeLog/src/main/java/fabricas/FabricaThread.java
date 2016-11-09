package fabricas;


import entidades.EntidadeThread;

public class FabricaThread {
	private FabricaThread(){
		
	}
	public static FabricaThread nova(){
		return new FabricaThread();
	}
	public EntidadeThread criarThread (int pid, String username, String cpu, String process, int lwpid){
		return EntidadeThread.criarThread(pid, username, cpu, process, lwpid);
	}
}