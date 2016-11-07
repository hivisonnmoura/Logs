package entidades;

public class EntidadeStack {
	private String pidHexa;
	private String descricao;
	
	private EntidadeStack(String pidHexa, String descricao) {
		this.pidHexa = pidHexa;
		this.descricao = descricao;
	}
	
	public static EntidadeStack criarStack(String pidHexa, String descricao){
		return new EntidadeStack(pidHexa, descricao);
	}

	public String getPidHexa() {
		return pidHexa;
	}

	public void setPidHexa(String pidHexa) {
		this.pidHexa = pidHexa;
	}

	public String getStack() {
		return descricao;
	}

	public void setStack(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}

