package repositorios;

import java.util.ArrayList;

import entidades.EntidadeThread;

public class RepositorioThread implements RepositorioGenerico<EntidadeThread> {

	
	static ArrayList<EntidadeThread> threads = new ArrayList<EntidadeThread>();
   

	public ArrayList<EntidadeThread> select(EntidadeThread thread) {
		return select(thread);
	}
	
	public void insert(EntidadeThread thread) {
		threads.add(thread);
		
	}
	
	
	public ArrayList<EntidadeThread> delete() {
			threads.clear();
			return null;
	}

	public ArrayList<EntidadeThread> findall() {
		
		return threads;
	}

	public EntidadeThread find(EntidadeThread thread) {

		return null;
	}


}
