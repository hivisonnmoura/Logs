<<<<<<< HEAD
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
}
=======
package servicos;

import java.util.ArrayList;
import java.util.List;

import entidades.EntidadeNo;
import entidades.EntidadeProcesso;
import fabricas.FabricaNo;
import repositorios.RepositorioNo;

public class ServicoNo {
	List<EntidadeNo> entidadeNo = new ArrayList<EntidadeNo>();
	
	private RepositorioNo repositorioNo = new RepositorioNo(); 

	public ServicoNo() {

	}

	public EntidadeNo solicitarCriacaoNo (String nome, String data, List<EntidadeProcesso> processos){
		EntidadeNo no = FabricaNo.nova().criarNo(nome, data, processos);
		repositorioNo.insert(no);
		System.out.println("Funcionou" +no);
		return no;
	}

	public EntidadeNo solicitarselectByData(String data) {
		return repositorioNo.selectByData(data);
	}
	
}
>>>>>>> 516fa9ad355a3f3e95e169cf51fff95ca91e16c5
