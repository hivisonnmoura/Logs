package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.EntidadeNo;

public class RepositorioNo implements RepositorioGenerico<EntidadeNo> {
	static ArrayList<EntidadeNo> nos = new ArrayList<EntidadeNo>();
	
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

		return null;
	}

	public ArrayList<EntidadeNo> findall() {
		nos.forEach(System.out::println);
		return nos;
	}

	public EntidadeNo find(EntidadeNo no) {

		return null;
	}
	

}
