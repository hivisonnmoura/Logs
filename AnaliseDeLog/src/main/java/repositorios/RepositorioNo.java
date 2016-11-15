package repositorios;

import java.util.ArrayList;

import entidades.EntidadeNo;

public class RepositorioNo implements RepositorioGenerico<EntidadeNo> {
	
	private static ArrayList<EntidadeNo> nos = new ArrayList<EntidadeNo>();

	public ArrayList<EntidadeNo> select(EntidadeNo no) {
		return select(no);
	}

	public EntidadeNo selectByData(String data) {
		for (EntidadeNo itemNo : nos) {
			if (data.equals(itemNo.getData())) {
				return itemNo;
			}
		}
		return null;
	}

	public void insert(EntidadeNo no) {
		nos.add(no);

	}

	public ArrayList<EntidadeNo> delete() {
		nos.clear();
		return null;
	}

	public ArrayList<EntidadeNo> findall() {
		return nos;
	}

	public EntidadeNo find(EntidadeNo no) {

		return null;
	}

}
