package servicos;

import java.util.List;
import entidades.EntidadeNo;
import objetodevalor.OVNoProcesso;

class ServicoDeTesteDeTela {

	private List<OVNoProcesso> prepararParaVisualizacao(List<EntidadeNo> no) {
		return OVNoProcesso.criarCom(no);
	}

}
