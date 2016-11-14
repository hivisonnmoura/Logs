package fabricas;

import java.util.List;

import entidades.EntidadeNo;
import entidades.EntidadeProcesso;

public class FabricaNo {

	public FabricaNo() {

	}

	public static FabricaNo nova() {
		return new FabricaNo();
	}

	public EntidadeNo criarNo(String nome, String data, List<EntidadeProcesso> processos) {
		return EntidadeNo.criarNo(nome, data, processos);
	}

}