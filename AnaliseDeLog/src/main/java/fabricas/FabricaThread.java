package fabricas;


import entidades.EntidadeThread;

public class FabricaThread {
	private FabricaThread(){
		
	}
	public static FabricaThread nova(){
		return new FabricaThread();
	}
<<<<<<< HEAD
	public EntidadeThread criarThread (int pid, String username, String cpu, String process, int lwpid){
		return EntidadeThread.criarThread(pid, username, cpu, process, lwpid);
=======
	public EntidadeThread criarThread (int pid, String cpu, int lwpid){
		return EntidadeThread.criarThread(pid, cpu, lwpid);
>>>>>>> 516fa9ad355a3f3e95e169cf51fff95ca91e16c5
	}
}