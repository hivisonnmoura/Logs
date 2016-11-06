package fabricas;

import entidades.EntidadeProcesso;

public class FabricaProcesso {
	public FabricaProcesso(){
		
	}
	public EntidadeProcesso CriarProcesso(int pid, String username, String time, String cpu, int nlwp, String process){
		
		return EntidadeProcesso.CriarProcesso(pid, username, time, cpu, nlwp, process);
		
	}
}
