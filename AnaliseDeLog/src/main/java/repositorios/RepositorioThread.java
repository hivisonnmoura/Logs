package repositorios;

import java.util.ArrayList;

import entidades.EntidadeThread;

public class RepositorioThread implements RepositorioGenerico<EntidadeThread>{

	ArrayList<EntidadeThread> threads = new ArrayList<EntidadeThread>();

	public ArrayList<EntidadeThread> select(EntidadeThread thread) {
		return select(thread);
	}

	public void insert(EntidadeThread thread) {
		this.threads.add(thread);

	}

	public ArrayList<EntidadeThread> delete() {
		return null;
	}

	
	public ArrayList<EntidadeThread> findall() {
		
		return this.threads;
	}

	
	public EntidadeThread find(EntidadeThread thread) {

		return null;
	}


}
