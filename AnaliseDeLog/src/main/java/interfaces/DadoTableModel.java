package interfaces;

import objetodevalor.OVNoProcesso;


import java.util.List;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

class DadoTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private List<OVNoProcesso> dados;
	private String[] colunas = { "Nome do No", "Data do No", "PID", "Username", "HH:MM:SS", "CPU", "NLWP", "Process",
			"Hora do Processo", "nome do arquivo" };

	public DadoTableModel(List<OVNoProcesso> ov) {
		dados = ov;

		this.addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent eventoQualquer) {
				int linha = eventoQualquer.getFirstRow();
				OVNoProcesso ovnoprocesso = dados.get(linha);

			}
		});
	}

	public void addRow(OVNoProcesso ovnoprocesso) {
		this.dados.add(ovnoprocesso);
		this.fireTableDataChanged();
	}

	public String getColumnName(int num) {
		return this.colunas[num];
	}

	public int getRowCount() {
		return dados.size();
	}

	public int getColumnCount() {
		return colunas.length;
	}

	public Object getValueAt(int linha, int coluna) {
		switch (coluna) {
		case 0:
			return dados.get(linha).getNomeDoNo();
		case 1:
			return dados.get(linha).getDataDoNo();
		case 2:
			return dados.get(linha).getPid();
		case 3:
			return dados.get(linha).getUsername();
		case 4:
			return dados.get(linha).getTime();
		case 5:
			return dados.get(linha).getCpu();
		case 6:
			return dados.get(linha).getNlwp();
		case 7:
			return dados.get(linha).getProcess();
		case 8:
			return dados.get(linha).getHoraDoProcesso();
		case 9:
			return dados.get(linha).getDiretorio();

		}
		return null;
	}

	public OVNoProcesso get(int linha) {
		return this.dados.get(linha);
	}
	
}
