package interfaces;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import java.awt.Color;


import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.JButton;

import objetodevalor.OVNoProcesso;

import servicos.ServicoFachada;
import utilidades.ProcessaDadosCpuDetalhado;

import javax.swing.border.LineBorder;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import java.awt.event.MouseAdapter;

class FrmNodos extends JFrame {

	private JTable tableNodosCriticos;
	private JTextField textField;
	private JTextField textField_1;
	private DadoTableModel tableModel;

	private ServicoFachada servicoFachada = new ServicoFachada();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmNodos frame = new FrmNodos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrmNodos() {
		setResizable(false);
		setTitle("Logz - Resumo de pontos cr\u00EDticos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 439);
		JPanel contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		setLocationRelativeTo(null);

		JPanel panelPlanilha = new JPanel();
		panelPlanilha.setLayout(null);
		panelPlanilha.setBorder(new TitledBorder(null, "Relatorio dos pontos criticos", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panelPlanilha.setBounds(10, 11, 579, 364);
		contentPane.add(panelPlanilha);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 559, 332);
		panelPlanilha.add(scrollPane);
		
		MouseListener mouseClick = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		};

		tableNodosCriticos = new JTable();
		tableNodosCriticos.setColumnSelectionAllowed(true);
		tableNodosCriticos.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		tableNodosCriticos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tableNodosCriticos.addColumnSelectionInterval(0, 9);
			}
		});

		scrollPane.setViewportView(tableNodosCriticos);		
		tableNodosCriticos.setModel(new DadoTableModel(OVNoProcesso.criarCom(servicoFachada.retornaListaEntidadeNo())));
		tableNodosCriticos.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tableNodosCriticos.setColumnSelectionAllowed(true);
		tableNodosCriticos.setCellSelectionEnabled(true);
		tableNodosCriticos.getColumnModel().getColumn(1).setPreferredWidth(120);
		tableNodosCriticos.getColumnModel().getColumn(0).setPreferredWidth(120);
		tableNodosCriticos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);


		JButton btnPrximo = new JButton("Proximo");
		btnPrximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				
				
				String caminhoDiretorio = tableNodosCriticos.getModel()
						.getValueAt(tableNodosCriticos.getSelectedRow(), 9).toString();
				String caminhoCpuDetalhado = servicoFachada.direcionaCPUProcess(caminhoDiretorio);
				ProcessaDadosCpuDetalhado.processaCpuDetalhada(caminhoCpuDetalhado);
				FrmStack frmStack = new FrmStack();
				frmStack.setVisible(true);
				setVisible(false);

			}
		});
		btnPrximo.setBounds(500, 377, 89, 23);
		contentPane.add(btnPrximo);
		
		JButton btnRetornar = new JButton("Retornar");
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				servicoFachada.deletaRepositorios();
				FrmDiretorio frmDiretorio = new FrmDiretorio();
				frmDiretorio.setVisible(true);
				setVisible(false);
			

			}
		});
		btnRetornar.setBounds(10, 377, 89, 23);
		contentPane.add(btnRetornar);
		

	}
}
