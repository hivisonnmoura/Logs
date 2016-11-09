package utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProcessaCpuProcess {

	public static String[] processaArquivoCpuProcess(File pastaFinal) {
		BufferedReader br = null;
		String[] cpuProcessDados;
		String linhaCpuProcess = null;
		String caminhoDoArquivo = pastaFinal.getAbsolutePath();

		caminhoDoArquivo = caminhoDoArquivo.replace("\\", "\\\\");
		//System.out.println(caminhoDoArquivo);
		String[] nomePartes = caminhoDoArquivo.split("\\\\");
		String dadosCpuProcess = nomePartes[nomePartes.length - 1];

		String[] cpuProcessAtributos = dadosCpuProcess.split("_");

		cpuProcessAtributos[3] = tratarHora(cpuProcessAtributos);

		System.out.println(cpuProcessAtributos[3]);

		try {
			br = new BufferedReader(new FileReader(caminhoDoArquivo));

			linhaCpuProcess = br.readLine();
			linhaCpuProcess = br.readLine();
			System.out.println(linhaCpuProcess);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		cpuProcessDados = linhaCpuProcess.split("\\s+");
		
		 System.out.println(cpuProcessDados[0]);
		return cpuProcessDados; // retorna vetor de dados CPU process para a
								// tabela
	}

	private static String tratarHora(String[] ajustaHoraComDivisao) {
		String ajustaHora = new String();
		ajustaHora = ajustaHoraComDivisao[3];
		ajustaHora = new StringBuffer(ajustaHora).insert(2, ":").delete(5,9).toString();
		return ajustaHora;
	}
}