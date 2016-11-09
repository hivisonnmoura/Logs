
package entidades;

public class EntidadeProcesso {

	private int pid;
	private String username;
	private String time;
	private String cpu;
	private int nlwp;
	private String process;
	private String hora;

	private EntidadeProcesso(int pid, String username, String time, String cpu, int nlwp, String process, String hora) {
		this.pid = pid;
		this.username = username;
		this.time = time;
		this.cpu = cpu;
		this.nlwp = nlwp;
		this.process = process;
		this.hora = hora;
	}
	
	public static EntidadeProcesso criarProcesso(int pid, String username, String time, String cpu, int nlwp, String process, String hora){
		
		return new EntidadeProcesso(pid,username,time,cpu,nlwp,process,hora);
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getNlwp() {
		return nlwp;
	}

	public void setNlwp(int nlwp) {
		this.nlwp = nlwp;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

}
