package servicos;

import entidades.EntidadeProcesso;
import fabricas.FabricaProcesso;
import repositorios.RepositorioProcesso;

public class ServicoProcesso {

	private RepositorioProcesso repositorioProcesso = new RepositorioProcesso();

	public ServicoProcesso() {

	}

	public EntidadeProcesso solicitarCriacaoProcesso(int pid, String username, String time, String cpu, int nlwp,
			String process, String hora) {
<<<<<<< HEAD
		EntidadeProcesso processo = FabricaProcesso.nova().criarProcesso(pid, username, time, cpu, nlwp,
				process, hora);
		repositorioProcesso.insert(processo);
		return processo;
=======
		return FabricaProcesso.nova().criarProcesso(pid, username, time, cpu, nlwp, process, hora);
>>>>>>> 516fa9ad355a3f3e95e169cf51fff95ca91e16c5
	}

	public EntidadeProcesso solicitarselectByHora(String hora) {
		return repositorioProcesso.selectByHora(hora);
	}
}
