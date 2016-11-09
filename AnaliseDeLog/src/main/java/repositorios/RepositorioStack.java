package repositorios;

import java.util.ArrayList;

import entidades.EntidadeStack;

public class RepositorioStack implements RepositorioGenerico<EntidadeStack> {
	ArrayList<EntidadeStack> stacks = new ArrayList<EntidadeStack>();

	public ArrayList<EntidadeStack> select(EntidadeStack stack) {
		return select(stack);
	}

	public void insert(EntidadeStack stack) {
		this.stacks.add(stack);

	}

	public ArrayList<EntidadeStack> delete() {
		return null;
	}

	
	public ArrayList<EntidadeStack> findall() {
		
		return this.stacks;
	}

	
	public EntidadeStack find(EntidadeStack stack) {

		return null;
	}

	

}
