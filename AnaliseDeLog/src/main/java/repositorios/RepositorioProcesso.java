package repositorios;

import java.util.ArrayList;
import entidades.EntidadeProcesso;

public class RepositorioProcesso implements RepositorioGenerico<EntidadeProcesso> {
	static ArrayList<EntidadeProcesso> processos = new ArrayList<EntidadeProcesso>();

	public ArrayList<EntidadeProcesso> select(EntidadeProcesso processo) {
		return select(processo);
	}

	public EntidadeProcesso selectByHora(String hora) {
		for (EntidadeProcesso itemProcesso : processos) {
			if (hora.equals(itemProcesso.getHora())) {
				return itemProcesso;
			}
		}
		return null;
	}

	public void insert(EntidadeProcesso processo) {
		this.processos.add(processo);

	}

	public ArrayList<EntidadeProcesso> delete() {
		return null;
	}

	public ArrayList<EntidadeProcesso> findall() {

		return this.processos;
	}

	public EntidadeProcesso find(EntidadeProcesso processo) {

		return null;
	}

}
