package servicos;

import entidades.EntidadeStack;
import fabricas.FabricaStack;
import repositorios.RepositorioStack;

public class ServicoStack {
	
	private RepositorioStack repositorioStack = new RepositorioStack();
	
	public ServicoStack(){
		
	}
	public EntidadeStack solicitarCriacaoStack(String pidHexa, String descricao){
		EntidadeStack stack = FabricaStack.nova().criarStack(pidHexa, descricao);
		repositorioStack.insert(stack);
		return stack;
	}

}
