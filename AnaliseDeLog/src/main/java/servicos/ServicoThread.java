package servicos;

import entidades.EntidadeThread;
import fabricas.FabricaThread;

public class ServicoThread {
	public ServicoThread(){
		
	}
	public EntidadeThread solicitarCriacaoThread(int pid, String username, String cpu, String process, int lwpid){
		return FabricaThread.nova().criarThread(pid, username, cpu, process, lwpid);
	}
}
