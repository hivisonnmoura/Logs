package entidades;

public class EntidadeThread {
	private int pid;
	private String username;
	private String cpu;
	private String process;
	private int lwpid;

	private EntidadeThread(int pid, String username, String cpu, String process, int lwpid) {

		this.pid = pid;
		this.username = username;
		this.cpu = cpu;
		this.process = process;
		this.lwpid = lwpid;
	}

	public static EntidadeThread criarThread(int pid, String username, String cpu, String process, int lwpid) {
		return new EntidadeThread(pid, username, cpu, process, lwpid);
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public int getLwpid() {
		return lwpid;
	}

	public void setLwpid(int lwpid) {
		this.lwpid = lwpid;
	}

}
