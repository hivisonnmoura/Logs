package interfaces;

import java.awt.BorderLayout;
import javax.swing.JFileChooser;
import java.awt.EventQueue;
import java.awt.Frame;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;

import filtros.FiltroTarGz;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDiretorio extends JFrame {

	private JPanel contentPane;
	private JTextField txtInserirDiretrio;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDiretorio frame = new FrmDiretorio();
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
	public FrmDiretorio() {
		setTitle("Logz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBorder(
				new TitledBorder(null, "Selecionar o Diret�rio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 90, 320, 47);
		contentPane.add(panel);
		panel.setLayout(null);

		txtInserirDiretrio = new JTextField();
		txtInserirDiretrio.setForeground(Color.LIGHT_GRAY);
		txtInserirDiretrio.setBounds(6, 17, 221, 20);
		panel.add(txtInserirDiretrio);
		txtInserirDiretrio.setText("C:\\logs");
		txtInserirDiretrio.setColumns(10);

		JButton btnLocalizar = new JButton("Localizar");
		btnLocalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser file = new JFileChooser();
				file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				int i = file.showSaveDialog(null);
				if (i == 1) {
					// JtextFieldLocal.setText("");
				} else {

					File arquivo = file.getSelectedFile();

					// File[] qtdArquivos = arquivo.listFiles();

					// int cont = 0;
					List<String> ListaArquivo = new ArrayList<String>();

					for (File f : arquivo.listFiles()) {
						if (f.isFile()) {

							if (f.getName().endsWith(".tar.gz")) {

								ListaArquivo.add(f.getName().toString());
							}
						}

					}
					// MetodoDescompactar(arquivo.getAbsolutePath(),ListaArquivo);
				}
			}
		});
		btnLocalizar.setBounds(237, 16, 73, 23);
		panel.add(btnLocalizar);
	}
}
