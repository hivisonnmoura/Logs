package utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import entidades.EntidadeProcesso;
import servicos.ServicoProcesso;

public class ProcessaCpuProcess {

	public static EntidadeProcesso processaArquivoCpuProcess(File pastaFinal) {
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

		

		try {
			br = new BufferedReader(new FileReader(caminhoDoArquivo));

			linhaCpuProcess = br.readLine();
			linhaCpuProcess = br.readLine();
			//System.out.println(linhaCpuProcess);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		cpuProcessDados = linhaCpuProcess.split("\\s+");// vetor da linha do cpu process
		cpuProcessDados[0] = cpuProcessAtributos[3];// posicao valor da hora do processo
		
		/* setar atributos pelo vetor do cpuProcesse em um objeto do tipo Processo*/
		
		
		
		int pid = Integer.parseInt(cpuProcessDados[1]);
		String username = cpuProcessDados[2];
		String hora = cpuProcessDados[0];
		String cpu = cpuProcessDados[8];
		String[] quebraNlwp = cpuProcessDados[10].split("/");
		int nlwp = Integer.parseInt(quebraNlwp[1]); 
		String process = quebraNlwp[0];
		String time = cpuProcessDados[7];
		
		
		EntidadeProcesso processo = new EntidadeProcesso(pid, username, time, cpu, nlwp, process, hora);
		ServicoProcesso servicoProcesso = new ServicoProcesso();
		servicoProcesso.solicitarCriacaoProcesso(pid, username, time, cpu, nlwp, process, hora);
		
		
		
		 //System.out.println(processo.getPid()+processo.getCpu() );
		 
		return processo; // retorna vetor de dados CPU process para a
								// tabela
	}

	private static String tratarHora(String[] ajustaHoraComDivisao) {
		String ajustaHora = new String();
		ajustaHora = ajustaHoraComDivisao[3];
		ajustaHora = new StringBuffer(ajustaHora).insert(2, ":").delete(5,9).toString();
		return ajustaHora;
	}
}