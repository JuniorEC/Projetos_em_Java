import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.progJ.CriarArquivoTexto;
import br.com.progJ.LerArquivoDeDados;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class Cellphone extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cellphone frame = new Cellphone();
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
	public Cellphone() {
		super("Bem vindo"); 
		
		CriarArquivoTexto.AbreArquivo();
		LerArquivoDeDados.AbreArquivo();
		LerArquivoDeDados.LerDados();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLigar = new JButton("Ligar");
		btnLigar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LerArquivoDeDados.LerDados();
				
			}
		});
		Image ligar = new ImageIcon(this.getClass().getResource("/call-icon.png")).getImage();
		btnLigar.setIcon(new ImageIcon(ligar));
		btnLigar.setBounds(10, 11, 144, 139);
		contentPane.add(btnLigar);
		
		JButton btnMensagem = new JButton("Mensagem");
		btnMensagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		Image mensagem = new ImageIcon(this.getClass().getResource("/new-message-icon.png")).getImage();
		btnMensagem.setIcon(new ImageIcon(mensagem));
		btnMensagem.setBounds(10, 188, 144, 139);
		contentPane.add(btnMensagem);
		
		JButton btnContatos = new JButton("Contatos");
		btnContatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Window frame = new Cellphone();
				frame.dispose();
				AddContato addContato = new AddContato();
				addContato.setVisible(true);
				
				CriarArquivoTexto.AddDados();
				CriarArquivoTexto.FechaArquivo();
				
			}
		});
		Image contato = new ImageIcon(this.getClass().getResource("/add-contact-icon.png")).getImage();
		btnContatos.setIcon(new ImageIcon(contato));
		btnContatos.setVerticalAlignment(SwingConstants.BOTTOM);
		btnContatos.setBounds(211, 11, 144, 139);
		contentPane.add(btnContatos);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CriarArquivoTexto.FechaArquivo();
				LerArquivoDeDados.FechaArquivo();
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		btnSair.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSair.setBounds(211, 188, 144, 139);
		contentPane.add(btnSair);
		
	}
}
