package servicos;

import java.util.ArrayList;

import entidades.EntidadeNo;
import entidades.EntidadeProcesso;
import fabricas.FabricaNo;
import repositorios.RepositorioNo;

public class ServicoNo {
	
	private RepositorioNo repositorioNo = new RepositorioNo(); 

	public ServicoNo() {

	}

	public EntidadeNo solicitarCriacaoNo (String nome, String data, ArrayList<EntidadeProcesso> processos){
		EntidadeNo no = FabricaNo.nova().criarNo(nome, data, processos);
		repositorioNo.insert(no);
		return no;
		
		
	}

	public EntidadeNo solicitarselectByData(String data) {
		return repositorioNo.selectByData(data);
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> d864e7eb2bb02af2241e228b5eac59a14db85d89
