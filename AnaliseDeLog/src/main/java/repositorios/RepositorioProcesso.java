package repositorios;

import java.util.ArrayList;

import entidades.EntidadeProcesso;

public class RepositorioProcesso implements RepositorioGenerico<EntidadeProcesso> {
	ArrayList<EntidadeProcesso> processo = new ArrayList<EntidadeProcesso>();

	public ArrayList<EntidadeProcesso> select(EntidadeProcesso processo) {
		return select(processo);
	}

	public void insert(EntidadeProcesso processo) {
		this.processo.add(processo);

	}

	public ArrayList<EntidadeProcesso> delete() {
		return null;
	}

	public ArrayList<EntidadeProcesso> findall() {
		
		return this.processo;
	}

	public EntidadeProcesso find(EntidadeProcesso obj) {

		return null;
	}

}
