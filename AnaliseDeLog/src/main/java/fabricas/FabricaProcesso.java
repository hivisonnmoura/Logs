package fabricas;

import entidades.EntidadeProcesso;

public class FabricaProcesso {
	private FabricaProcesso(){
		
	}
	public static FabricaProcesso nova(){
		return new FabricaProcesso();
	}
	public EntidadeProcesso criarProcesso(int pid, String username, String time, String cpu, int nlwp, String process, String hora, String diretorio){
		
		return EntidadeProcesso.criarProcesso(pid, username, time, cpu, nlwp, process,hora,diretorio);
		
	}
}
