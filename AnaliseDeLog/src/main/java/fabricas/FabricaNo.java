<<<<<<< HEAD
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
=======
package fabricas;

import java.util.ArrayList;
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
>>>>>>> 516fa9ad355a3f3e95e169cf51fff95ca91e16c5
