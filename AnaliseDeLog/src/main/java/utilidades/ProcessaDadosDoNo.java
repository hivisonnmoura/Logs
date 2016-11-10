package utilidades;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import entidades.EntidadeProcesso;
import servicos.ServicoNo;

public class ProcessaDadosDoNo {
	static ProcessaDadosCPU processaDadosCPU = new ProcessaDadosCPU();
	static ArrayList<EntidadeProcesso> listaProcesso = new ArrayList<EntidadeProcesso>();
	static ServicoNo servicoNo = new ServicoNo();

	public String[] processaDiretorio(File file) {
		String[] arquivos = file.list();
		String diretorioDoTemp = file.getAbsolutePath();
		processaDiretorioDoArquivo(arquivos, diretorioDoTemp);
		return arquivos;
	}

	public static void processaDiretorioDoArquivo(String[] arquivos, String diretorioDoTemp) {
		for (String file1 : arquivos) {
			String[] noAtributoData = file1.split("_");
			String nomeNo = noAtributoData[1];
			String dataNo = noAtributoData[2];
			String diretorio = diretorioDoTemp.concat("\\").concat(file1);
			processaDadosCPU.processaDiretorioDoNo(diretorio, nomeNo, dataNo);
		}
	}

}
