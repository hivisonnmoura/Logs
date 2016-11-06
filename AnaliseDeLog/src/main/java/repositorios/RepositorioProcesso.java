package repositorios;

import java.util.ArrayList;

import entidades.EntidadeProcesso;

public class RepositorioProcesso implements RepositorioGenerico<EntidadeProcesso> {
	ArrayList<EntidadeProcesso> processo = new ArrayList<EntidadeProcesso>();

	@Override
	public ArrayList<EntidadeProcesso> select(EntidadeProcesso processo) {
		return select(processo);
	}

	@Override
	public void insert(EntidadeProcesso processo) {
		this.processo.add(processo);

	}

	@Override
	public ArrayList<EntidadeProcesso> delete() {
		return null;
	}

	@Override
	public ArrayList<EntidadeProcesso> findall() {
		
		return this.processo;
	}

	@Override
	public EntidadeProcesso find(EntidadeProcesso obj) {

		return null;
	}

}
