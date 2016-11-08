package utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ProcessaDadosCPU {
	
	private static String[] processaArquivo(File arquivo) {
		BufferedReader br = null;
		String[] cpuProcessDados;
		String linhaCpuProcess = null;
		
		try {
			br = new BufferedReader(new FileReader(arquivo));
			
			//System.out.println("Reading the file using readLine() method:");
			linhaCpuProcess = br.readLine();
			linhaCpuProcess = br.readLine();
			System.out.println(linhaCpuProcess);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		cpuProcessDados = linhaCpuProcess.split("\\s+");
		//System.out.println(cpuProcessDados[1]);
		return cpuProcessDados; //retorna vetor de dados CPU process para a tabela
	}
	
	 public void processaDiretorioDoNo(String caminho,String nomeNo){
		 List<String> resposta = new ArrayList<String>();
		 File arquivo = new File(caminho);
		 String[]arquivoCpu = arquivo.list();
		 
		  for (String file : arquivoCpu) {
			  Pattern pattern = Pattern.compile("CPUProcess_"+nomeNo);
			  Matcher matcher = pattern.matcher(file);
			  if(matcher.find()){
				  resposta.add(file);
			  }
			     
		  }
		  for (String file:resposta){
			  System.out.println("escolhido: " + file);
		  }
	  }
	
	
	
	public static void main(String[] args) {
File arquivo = new File(
				"C:\\Users\\Wendler\\Desktop\\Empresas\\Indra\\Projeto Elektro\\acompanhamento_cmpsczeus01_10-20\\CPUProcess_cmpsczeus01_10-20_1625.txt");
		processaArquivo(arquivo);
	}
}
