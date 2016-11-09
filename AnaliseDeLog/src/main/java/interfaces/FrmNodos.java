package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import objetodevalor.OVNoProcesso;
import servicos.ServicoFachada;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ListSelectionModel;

public class FrmNodos extends JFrame {

	private JPanel contentPane;
	private JTable tableNodosCriticos;
	private JTextField textField;
	private JTextField textField_1;
	private DadoTableModel tableModel;
	
	ServicoFachada servicoFachada = new ServicoFachada();

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
		setBounds(100, 100, 520, 402);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);

		JPanel panelPlanilha = new JPanel();
		panelPlanilha.setLayout(null);
		panelPlanilha.setBorder(new TitledBorder(null, "Relatório dos pontos críticos", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panelPlanilha.setBounds(55, 144, 394, 164);
		contentPane.add(panelPlanilha);

		tableNodosCriticos = new JTable();
		tableNodosCriticos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableNodosCriticos.setModel(new DadoTableModel(OVNoProcesso.criarCom(servicoFachada.inserirDados())));
		tableNodosCriticos.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tableNodosCriticos.setColumnSelectionAllowed(true);
		tableNodosCriticos.setCellSelectionEnabled(true);
		tableNodosCriticos.setBounds(10, 37, 374, 112);
		panelPlanilha.add(tableNodosCriticos);
		

		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//carregar a linha selecionada
				//carregar threads com a linha selecionada
				//chamar a tela 3
				FrmStack telaTres = new FrmStack();
				telaTres.setVisible(true);
				setVisible(false);
				
				
			}
		});
		btnPrximo.setBounds(360, 319, 89, 23);
		contentPane.add(btnPrximo);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.setToolTipText("");
		comboBox.setMaximumRowCount(3);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(242, 24, 112, 18);
		contentPane.add(comboBox);

		JLabel lblSelecioneOHorrio = new JLabel("Seleciona a data:");
		lblSelecioneOHorrio.setBounds(135, 26, 112, 14);
		contentPane.add(lblSelecioneOHorrio);

		JPanel panel = new JPanel();
		panel.setBorder(
				new TitledBorder(null, "Filtro de horário", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(127, 51, 231, 82);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHoraInicial = new JLabel("Hora inicial: ");
		lblHoraInicial.setBounds(6, 23, 89, 16);
		panel.add(lblHoraInicial);

		JLabel lblHoraFinal = new JLabel("Hora final: ");
		lblHoraFinal.setBounds(6, 56, 89, 16);
		panel.add(lblHoraFinal);

		textField = new JTextField();
		textField.setBounds(95, 18, 130, 26);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(95, 50, 130, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
	}
}
