package servicos;

import entidades.EntidadeProcesso;
import fabricas.FabricaProcesso;

public class ServicoProcesso {
	
	public ServicoProcesso(){
		
	}
	public EntidadeProcesso solicitarCriacaoProcesso(int pid, String username, String time, String cpu, int nlwp, String process){
		return FabricaProcesso.nova().criarProcesso(pid, username, time, cpu, nlwp, process);
	}
}
