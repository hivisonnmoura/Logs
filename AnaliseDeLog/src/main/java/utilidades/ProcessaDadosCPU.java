package motorTxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class ProcessaDadosCPU {

	public static void processaNomeDoArquivo(String caminhoDoArquivo) {
		caminhoDoArquivo = caminhoDoArquivo.replace("\\", "\\\\");
		System.out.println(caminhoDoArquivo);
		String[] nomePartes = caminhoDoArquivo.split("\\\\");
		String nomePasta = nomePartes[nomePartes.length - 3];
		System.out.println(nomePasta);
		String nomeArquivo = nomePartes[nomePartes.length - 1];
		
		String[] cpuProcessArquivoAtributos = nomeArquivo.split("_");
		System.out.println(cpuProcessArquivoAtributos[1]);
		String[] cpuNomePastaAtributos = nomePasta.split("_");
		System.out.println(cpuNomePastaAtributos[2]);
	}

	
	private static void processaArquivo(File arquivo) {
		// Posicoes [0] = numero, posicoes[1] = data, posicoes[2]=hora
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(arquivo));
			int f = 0;
			// One way of reading the file
			System.out.println("Reading the file using readLine() method:");
			String linhaCpuProcess = br.readLine();
			while (f < 1) {
				linhaCpuProcess = br.readLine();
				f++;
			}
			System.out.println(linhaCpuProcess);
			String[] data;
			data = linhaCpuProcess.split("\\s+");
			System.out.println(data[9]);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		File arquivo = new File(
				"C:\\Users\\Wendler\\Desktop\\Empresas\\Indra\\Projeto Elektro\\acompanhamento_cmpsczeus01_10-20\\CPUProcess_cmpsczeus01_10-20_1625.txt");

		processaNomeDoArquivo(arquivo.getPath());
		processaArquivo(arquivo);
	}
}
