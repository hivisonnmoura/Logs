package fabricas;


import entidades.EntidadeThread;

public class FabricaThread {
	private FabricaThread(){
		
	}
	public static FabricaThread nova(){
		return new FabricaThread();
	}
	public EntidadeThread criarThread (int pid, String cpu, int lwpid, String caminho){
		return EntidadeThread.criarThread(pid, cpu, lwpid, caminho);
	}
}