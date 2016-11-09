package utilidades;

public class StackNovaDoLog {
	public String valor;
	
	private StackNovaDoLog(String valor) {
		this.valor = valor;
	}

	public static StackNovaDoLog novo(String stackQueVeioDoArquivoTexto) {
		return new StackNovaDoLog(stackQueVeioDoArquivoTexto);
	}
}
