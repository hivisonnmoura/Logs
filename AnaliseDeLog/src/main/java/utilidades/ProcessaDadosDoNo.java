package utilidades;

<<<<<<< HEAD

=======
>>>>>>> c0a27c84f6508a298647f4c7316cff22c620df53
import java.io.File;

public class ProcessaDadosDoNo {

	public static String[] processaNomeDoArquivo(String caminhoDoArquivo) {
		caminhoDoArquivo = caminhoDoArquivo.replace("\\", File.separator);
		System.out.println(caminhoDoArquivo);
		String[] nomePartes = caminhoDoArquivo.split(File.separator);
		String nomePasta = nomePartes[nomePartes.length - 3];
		//System.out.println(nomePasta);

		
		String[] noAtributoData = nomePasta.split("_");
		noAtributoData[2] = noAtributoData[2].replace("-","/");
		//System.out.println(noAtributoData[1]);
		return noAtributoData; //Retorna vetor com dados da pasta 1--> Nome 2--> Data

	}
	
	public void processaDiretorio(File file){
		String[] processaNomeDoArquivo = processaNomeDoArquivo(file.getAbsolutePath());
		for (String string : processaNomeDoArquivo) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		File arquivo = new File(
				"C:\\Users\\Wendler\\Desktop\\Empresas\\Indra\\Projeto Elektro\\acompanhamento_cmpsczeus01_10-20\\CPUProcess_cmpsczeus01_10-20_1625.txt");

		processaNomeDoArquivo(arquivo.getPath());
	}
}
