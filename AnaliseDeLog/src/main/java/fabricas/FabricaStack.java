package fabricas;


import entidades.EntidadeStack;

public class FabricaStack {
	private FabricaStack(){
		
	}
	public static FabricaStack nova(){
		return new FabricaStack();
	}
	public EntidadeStack criarStack (String pidHexa, String descricao){
		return EntidadeStack.criarStack(pidHexa, descricao);
		
	}

}
