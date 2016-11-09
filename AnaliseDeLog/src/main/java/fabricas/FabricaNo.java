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

<<<<<<< HEAD
}
=======
}
>>>>>>> d864e7eb2bb02af2241e228b5eac59a14db85d89
