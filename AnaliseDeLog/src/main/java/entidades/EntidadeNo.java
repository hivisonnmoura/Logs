
package entidades;

import java.util.ArrayList;
import java.util.List; 

public class EntidadeNo {
	
	private String nome;
	private String data;
	private List<EntidadeProcesso> processos;
	
	
	private EntidadeNo(String nome, String data, List<EntidadeProcesso> processos) {
		this.nome = nome;
		this.data = data;
		this.processos = processos;
	}

	public static EntidadeNo criarNo(String nome, String data, List<EntidadeProcesso> processos){
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

	public List<EntidadeProcesso> getProcessos() {
		return processos;
	}

	public void setProcessos(List<EntidadeProcesso> processos) {
		this.processos = processos;
	}
	
	
}