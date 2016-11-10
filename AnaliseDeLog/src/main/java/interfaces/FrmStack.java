//package interfaces;
//
//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JLabel;
//import javax.swing.JComboBox;
//import javax.swing.JTextPane;
//import javax.swing.border.TitledBorder;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.TextArea;
//
//public class FrmStack extends JFrame {
//
//	private JPanel contentPane;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FrmStack frame = new FrmStack();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public FrmStack() {
//		setTitle("Logz - An\u00E1lise de stacks");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 500, 500);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JLabel lblSelecioneAThread = new JLabel("Selecione a Thread desejada: ");
//		lblSelecioneAThread.setBounds(155, 21, 145, 14);
//		contentPane.add(lblSelecioneAThread);
//		
//		JComboBox comboBox = new JComboBox();
//		comboBox.setBounds(155, 36, 160, 20);
//		contentPane.add(comboBox);
//		
//		JPanel panel = new JPanel();
//		panel.setBorder(new TitledBorder(null, "Descri��o da Stack da Thread escolhida", TitledBorder.LEADING, TitledBorder.TOP, null, null));
//		panel.setBounds(4, 93, 476, 333);
//		contentPane.add(panel);
//		panel.setLayout(null);
//		
//		TextArea textArea = new TextArea();
//		textArea.setText("Descri\u00E7\u00E3o da Stack");
//		textArea.setBounds(10, 21, 456, 302);
//		panel.add(textArea);
//		
//		JButton btnRetornar = new JButton("Retornar");
//		btnRetornar.setBounds(206, 427, 89, 23);
//		contentPane.add(btnRetornar);
//		
//		JButton btnNewButton = new JButton("Copiar");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
//		btnNewButton.setBounds(298, 427, 89, 23);
//		contentPane.add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("Fechar");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
//		btnNewButton_1.setBounds(391, 427, 89, 23);
//		contentPane.add(btnNewButton_1);
//	}
//}


package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class FrmStack extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmStack frame = new FrmStack();
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
	public FrmStack() {
		setTitle("Logz - An\u00E1lise de stacks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelecioneAThread = new JLabel("Selecione a Thread desejada: ");
		lblSelecioneAThread.setBounds(155, 21, 256, 14);
		contentPane.add(lblSelecioneAThread);
		
		
		setLocationRelativeTo(null);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		comboBox.setBounds(155, 36, 170, 20);
		contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Descricao da Stack da Thread escolhida", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(4, 93, 476, 333);
		contentPane.add(panel);
		panel.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent arg0) {

				
			}
		});
		textArea.addKeyListener(new KeyAdapter() {

		});
		textArea.setText("Descri\u00E7\u00E3o da Stack");
		textArea.setBounds(10, 21, 456, 302);
		panel.add(textArea);
		
		JButton btnRetornar = new JButton("Retornar");
		btnRetornar.setBounds(10, 427, 89, 23);
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FrmNodos telaDois = new FrmNodos();
				telaDois.setVisible(true);
				setVisible(false);
				
			}
		});

		contentPane.add(btnRetornar);
		
		JButton btnNewButton = new JButton("Copiar");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			String descricaoStack = textArea.getText();

			Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();  
			ClipboardOwner selection = new StringSelection(textArea.getText());  
			board.setContents((Transferable) selection, selection);

			}
		});
		btnNewButton.setBounds(210, 427, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Fechar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(391, 427, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}