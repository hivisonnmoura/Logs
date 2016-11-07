package servicos;

import entidades.EntidadeStack;
import fabricas.FabricaStack;

public class ServicoStack {
	
	public ServicoStack(){
		
	}
	public EntidadeStack solicitarCriacaoStack(String pidHexa, String descricao){
		return FabricaStack.nova().criarStack(pidHexa, descricao);
	}

}
