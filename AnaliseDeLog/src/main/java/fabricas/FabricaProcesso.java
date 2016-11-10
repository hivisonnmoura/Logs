package fabricas;

import entidades.EntidadeProcesso;

public class FabricaProcesso {
<<<<<<< HEAD
	private FabricaProcesso() {

	}

	public static FabricaProcesso nova() {
		return new FabricaProcesso();
	}

	public EntidadeProcesso criarProcesso(int pid, String username, String time, String cpu, int nlwp, String process, String hora) {

		return EntidadeProcesso.criarProcesso(pid, username, time, cpu, nlwp, process, hora);

=======
	private FabricaProcesso(){
		
	}
	public static FabricaProcesso nova(){
		return new FabricaProcesso();
	}
	public EntidadeProcesso criarProcesso(int pid, String username, String time, String cpu, int nlwp, String process, String hora){
		
		return EntidadeProcesso.criarProcesso(pid, username, time, cpu, nlwp, process,hora);
		
>>>>>>> 516fa9ad355a3f3e95e169cf51fff95ca91e16c5
	}
}
