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

public class FrmNodos extends JFrame {

	private JPanel contentPane;
	private JTable tableNodosCriticos;

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
		panelPlanilha.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPlanilha.setBounds(40, 93, 394, 181);
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
		btnPrximo.setBounds(345, 296, 89, 23);
		contentPane.add(btnPrximo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(3);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(107, 46, 193, 20);
		contentPane.add(comboBox);
		
		JLabel lblSelecioneOHorrio = new JLabel("Selecione o hor\u00E1rio desejado");
		lblSelecioneOHorrio.setBounds(107, 27, 147, 14);
		contentPane.add(lblSelecioneOHorrio);
	}
}
