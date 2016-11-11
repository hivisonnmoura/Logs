package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.EntidadeThread;

public class RepositorioThread implements RepositorioGenerico<EntidadeThread> {

	static ArrayList<EntidadeThread> threads = new ArrayList<EntidadeThread>();

	public ArrayList<EntidadeThread> select(EntidadeThread thread) {
		return select(thread);
	}
	@Override
	public void insert(EntidadeThread thread) {
		threads.add(thread);

	}

	public ArrayList<EntidadeThread> delete() {
		return null;
	}

	public ArrayList<EntidadeThread> findall() {
		return threads;
	}

	public EntidadeThread find(EntidadeThread thread) {

		return null;
	}

}
