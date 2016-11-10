package entidades;

public class EntidadeThread {
	private int pid;
	private String cpu;
	private int lwpid;
	private String caminho;

	private EntidadeThread(int pid, String cpu, int lwpid, String caminho) {
		this.pid = pid;
		this.cpu = cpu;
		this.lwpid = lwpid;
		this.caminho = caminho;
	}

	public static EntidadeThread criarThread(int pid, String cpu, int lwpid, String caminho) {
		return new EntidadeThread(pid, cpu, lwpid, caminho);
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getLwpid() {
		return lwpid;
	}

	public void setLwpid(int lwpid) {
		this.lwpid = lwpid;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
}
