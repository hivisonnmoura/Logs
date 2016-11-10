package entidades;

public class EntidadeThread {
	private int pid;
	private String cpu;
	private int lwpid;


	private EntidadeThread(int pid, String cpu, int lwpid) {

		this.pid = pid;
		this.cpu = cpu;
		this.lwpid = lwpid;
	}

	
	public static EntidadeThread criarThread(int pid, String cpu, int lwpid){
		return new EntidadeThread(pid, cpu, lwpid);		
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

}

