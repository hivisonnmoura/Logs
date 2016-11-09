package objetodevalor;

import java.util.ArrayList;
import java.util.List;

import entidades.EntidadeNo;
import entidades.EntidadeProcesso;

public class OVNoProcesso {

	private String nomeDoNo;
	private String dataDoNo;
	private int pid;
	private String username;
	private String time;
	private String cpu;
	private int nlwp;
	private String process;
	private String horaDoProcesso;

	private OVNoProcesso() {
	}

	private OVNoProcesso(String nome, String data, int pid2, String username2, String time2, String cpu2, int nlwp2,
			String process2, String hora) {
		this.nomeDoNo = nome;
		this.dataDoNo = data;
		this.pid = pid2;
		this.username = username2;
		this.time = time2;
		this.cpu = cpu2;
		this.nlwp = nlwp2;
		this.process = process2;
		this.horaDoProcesso = hora;

	}

	public static List<OVNoProcesso> criarCom(List<EntidadeNo> no) {
		List<OVNoProcesso> listaDeRetorno = new ArrayList<OVNoProcesso>();
		for (EntidadeNo entidadeNo : no) {
			ArrayList<EntidadeProcesso> processos = entidadeNo.getProcessos();
			for (EntidadeProcesso entidadeProcesso : processos) {
				OVNoProcesso ovnoprocesso = new OVNoProcesso(entidadeNo.getNome(), entidadeNo.getData(),
						entidadeProcesso.getPid(), entidadeProcesso.getUsername(), entidadeProcesso.getTime(),
						entidadeProcesso.getCpu(), entidadeProcesso.getNlwp(), entidadeProcesso.getProcess(),
						entidadeProcesso.getHora());
				listaDeRetorno.add(ovnoprocesso);
			}
		}

		return listaDeRetorno;

	}

	public String getNomeDoNo() {
		return nomeDoNo;
	}

	public void setNomeDoNo(String nomeDoNo) {
		this.nomeDoNo = nomeDoNo;
	}

	public String getDataDoNo() {
		return dataDoNo;
	}

	public void setDataDoNo(String dataDoNo) {
		this.dataDoNo = dataDoNo;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getNlwp() {
		return nlwp;
	}

	public void setNlwp(int nlwp) {
		this.nlwp = nlwp;
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

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getHoraDoProcesso() {
		return horaDoProcesso;
	}

	public void setHoraDoProcesso(String horaDoProcesso) {
		this.horaDoProcesso = horaDoProcesso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ((dataDoNo == null) ? 0 : dataDoNo.hashCode());
		result = prime * result + ((horaDoProcesso == null) ? 0 : horaDoProcesso.hashCode());
		result = prime * result + nlwp;
		result = prime * result + ((nomeDoNo == null) ? 0 : nomeDoNo.hashCode());
		result = prime * result + pid;
		result = prime * result + ((process == null) ? 0 : process.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OVNoProcesso other = (OVNoProcesso) obj;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (dataDoNo == null) {
			if (other.dataDoNo != null)
				return false;
		} else if (!dataDoNo.equals(other.dataDoNo))
			return false;
		if (horaDoProcesso == null) {
			if (other.horaDoProcesso != null)
				return false;
		} else if (!horaDoProcesso.equals(other.horaDoProcesso))
			return false;
		if (nlwp != other.nlwp)
			return false;
		if (nomeDoNo == null) {
			if (other.nomeDoNo != null)
				return false;
		} else if (!nomeDoNo.equals(other.nomeDoNo))
			return false;
		if (pid != other.pid)
			return false;
		if (process == null) {
			if (other.process != null)
				return false;
		} else if (!process.equals(other.process))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

}
