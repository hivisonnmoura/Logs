package utilidades;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ProcessaDadosCpu {
	
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
	
	public static void main(String[] args) {
File arquivo = new File(
				"C:\\Users\\Wendler\\Desktop\\Empresas\\Indra\\Projeto Elektro\\acompanhamento_cmpsczeus01_10-20\\CPUProcess_cmpsczeus01_10-20_1625.txt");
		processaArquivo(arquivo);
	}
}
