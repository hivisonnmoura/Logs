package servicos;

import entidades.EntidadeProcesso;
import fabricas.FabricaProcesso;

public class ServicoProcesso {
	FabricaProcesso fabricaprocesso = new FabricaProcesso();
	
	public ServicoProcesso(){
		
	}
	public EntidadeProcesso solicitarCriacaoProcesso(int pid, String username, String time, String cpu, int nlwp, String process){
		EntidadeProcesso processo = fabricaprocesso.CriarProcesso(pid, username, time, cpu, nlwp, process);
		return processo;
	}
}
