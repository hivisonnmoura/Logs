package fabricas;

import java.util.ArrayList;

import entidades.EntidadeNo;
import entidades.EntidadeProcesso;

public class FabricaNo {

	public FabricaNo() {

	}

	public static FabricaNo nova() {
		return new FabricaNo();
	}

	public EntidadeNo criarNo(String nome, String data, ArrayList<EntidadeProcesso> processos) {
		return EntidadeNo.criarNo(nome, data, processos);
	}

}