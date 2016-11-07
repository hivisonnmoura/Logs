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
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmNodos extends JFrame {

	private JPanel contentPane;
	private JTable tableNodosCriticos;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public FrmNodos() {
		setTitle("Logz - Resumo de pontos cr\u00EDticos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPlanilha = new JPanel();
		panelPlanilha.setLayout(null);
		panelPlanilha.setBorder(new TitledBorder(null, "Relatório dos pontos críticos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPlanilha.setBounds(60, 129, 394, 181);
		contentPane.add(panelPlanilha);
		
		tableNodosCriticos = new JTable();
		tableNodosCriticos.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tableNodosCriticos.setColumnSelectionAllowed(true);
		tableNodosCriticos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"", "New column", "New column", "New column", "New column"
			}
		));
		tableNodosCriticos.setCellSelectionEnabled(true);
		tableNodosCriticos.setBounds(10, 37, 374, 112);
		panelPlanilha.add(tableNodosCriticos);
		
		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.setBounds(365, 318, 89, 23);
		contentPane.add(btnPrximo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(3);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(221, 4, 94, 20);
		contentPane.add(comboBox);
		
		JLabel lblSelecioneOHorrio = new JLabel("Seleciona a data:");
		lblSelecioneOHorrio.setBounds(109, 6, 206, 14);
		contentPane.add(lblSelecioneOHorrio);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Filtro de horário", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(142, 34, 231, 82);
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
