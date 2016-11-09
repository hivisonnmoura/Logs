package entidades;

import java.util.ArrayList; 

public class EntidadeNo {
	
	private String nome;
	private String data;
	private ArrayList<EntidadeProcesso> processos;
	
	
	private EntidadeNo(String nome, String data, ArrayList<EntidadeProcesso> processos) {
		this.nome = nome;
		this.data = data;
		this.processos = processos;
	}

	public static EntidadeNo criarNo(String nome, String data, ArrayList<EntidadeProcesso> processos){
		return new EntidadeNo (nome, data, processos);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<EntidadeProcesso> getProcessos() {
		return processos;
	}

	public void setProcessos(ArrayList<EntidadeProcesso> processos) {
		this.processos = processos;
	}
	
	
}
