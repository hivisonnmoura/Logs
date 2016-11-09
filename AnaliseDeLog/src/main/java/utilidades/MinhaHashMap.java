package utilidades;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MinhaHashMap {

	private String nome = "chuleh";
	private String idade = "20";
	
	public void organizaTudo(){
		
		MotorDeLeituraDoArquivoDeLog motor = new MotorDeLeituraDoArquivoDeLog();
		Map<String, List<StackNovaDoLog>> mapaPronto = motor.leiaOArquivoECarregueTudoNoMapa();
		MinhaHashMap hashMap = new MinhaHashMap();
		Set todasAsChaves = mapaPronto.keySet();
		for (Object object : todasAsChaves) {
 			String chave = (String) object;
			System.out.println("Chave: "+ chave);
		}
		
		Collection<List<StackNovaDoLog>> values = mapaPronto.values();
		
		for (List<StackNovaDoLog> stacks : values) {
			System.out.println(stacks);
			for (StackNovaDoLog stackNovaDoLog : stacks) {
				System.out.println(stackNovaDoLog.valor);
			}
		}
		
	}
	
	public static void main(String[] args) {
		MinhaHashMap hashMap = new MinhaHashMap();
		hashMap.organizaTudo();
		
	}
	
}
