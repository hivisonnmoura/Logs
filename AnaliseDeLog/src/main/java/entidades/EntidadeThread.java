package entidades;

public class EntidadeThread {
	private int pid;
<<<<<<< HEAD
	private String username;
	private String cpu;
	private String process;
	private int lwpid;


	private EntidadeThread(int pid, String username, String cpu, String process, int lwpid) {

		this.pid = pid;
		this.username = username;
		this.cpu = cpu;
		this.process = process;
=======
	private String cpu;
	private int lwpid;


	private EntidadeThread(int pid, String cpu, int lwpid) {

		this.pid = pid;
		this.cpu = cpu;
>>>>>>> 516fa9ad355a3f3e95e169cf51fff95ca91e16c5
		this.lwpid = lwpid;
	}

	
<<<<<<< HEAD
	public static EntidadeThread criarThread(int pid, String username, String cpu, String process, int lwpid){
		return new EntidadeThread(pid, username, cpu, process, lwpid);		
=======
	public static EntidadeThread criarThread(int pid, String cpu, int lwpid){
		return new EntidadeThread(pid, cpu, lwpid);		
>>>>>>> 516fa9ad355a3f3e95e169cf51fff95ca91e16c5
	}


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

<<<<<<< HEAD
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

=======
>>>>>>> 516fa9ad355a3f3e95e169cf51fff95ca91e16c5
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

<<<<<<< HEAD
	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

=======
>>>>>>> 516fa9ad355a3f3e95e169cf51fff95ca91e16c5
	public int getLwpid() {
		return lwpid;
	}

	public void setLwpid(int lwpid) {
		this.lwpid = lwpid;
	}

}

