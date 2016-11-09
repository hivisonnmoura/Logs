package utilidades;

<<<<<<< HEAD
=======

>>>>>>> d864e7eb2bb02af2241e228b5eac59a14db85d89

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ProcessaDadosCPU {
	
	ProcessaCpuProcess processaCpuProcess = new ProcessaCpuProcess();
	
	 public void processaDiretorioDoNo(String caminho,String nomeNo){
		 List<String> resposta = new ArrayList<String>();
		 File arquivo = new File(caminho);
		 String[]arquivoCpu = arquivo.list();
		 
		  for (String file : arquivoCpu) {
			  Pattern pattern = Pattern.compile("CPUProcess_" + nomeNo);
			  Matcher matcher = pattern.matcher(file);
			  if(matcher.find()){
				  resposta.add(file);
			  }
			     
		  }
		  for (String file:resposta){
			  
			  String diretorioFinal = caminho.concat("\\").concat(file);
			  File pastaFinal = new File(diretorioFinal);
			  processaCpuProcess.processaArquivoCpuProcess(pastaFinal);
			  System.out.println("escolhido: " + diretorioFinal);
		  }
	  }
}
