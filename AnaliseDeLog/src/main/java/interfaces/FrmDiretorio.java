package interfaces;

import javax.swing.JFileChooser;
import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import servicos.ServicoFachada;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDiretorio extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JTextField txtInserirDiretrio;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDiretorio frame = new FrmDiretorio();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public FrmDiretorio() {
		setTitle("Logz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 300, 444, 339);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBorder(
				new TitledBorder(null, "Selecionar o Diretorio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 90, 408, 47);
		contentPane.add(panel);
		panel.setLayout(null);

		txtInserirDiretrio = new JTextField();
		txtInserirDiretrio.setForeground(Color.LIGHT_GRAY);
		txtInserirDiretrio.setBounds(6, 17, 285, 20);
		panel.add(txtInserirDiretrio);
		txtInserirDiretrio.setColumns(10);

		JButton btnLocalizar = new JButton("Localizar");
		btnLocalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser file = new JFileChooser();
				file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int i = file.showSaveDialog(null);
				if (i == 1) {

				} else {

					File arquivo = file.getSelectedFile();
					String caminho = arquivo.toString();
					txtInserirDiretrio.setText(arquivo.getAbsolutePath());
					
					
				}
			}
		});
		btnLocalizar.setBounds(301, 16, 97, 23);
		panel.add(btnLocalizar);
		
		JButton btnDescompactar = new JButton("Descompactar");
		btnDescompactar.setBounds(135, 231, 150, 23);
		contentPane.add(btnDescompactar);
		btnDescompactar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setCursor(Cursor.WAIT_CURSOR);
				List<String> ListaArquivo = new ArrayList<String>();
				String caminho = txtInserirDiretrio.getText();
				File arquivo = new File(caminho);

				for (File f : arquivo.listFiles()) {
					if (f.isFile()) {

						if (f.getName().endsWith(".tar.gz")) {
							
							ListaArquivo.add(f.getName().toString());
						}
					}

				}
				ServicoFachada servicoFachada = new ServicoFachada();
				servicoFachada.solicitarServicoDescompactador(caminho, ListaArquivo);
				FrmNodos formDois = new FrmNodos();
				formDois.setVisible(true);
				setVisible(false);
			}});

		setCursor(Cursor.getDefaultCursor());
		btnLocalizar.setBounds(301, 16, 97, 23);
		panel.add(btnLocalizar);
	}
	
}
