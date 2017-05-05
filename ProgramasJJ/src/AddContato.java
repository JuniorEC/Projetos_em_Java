import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.progJ.AgendaBase;
import br.com.progJ.CriarArquivoTexto;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.awt.event.ActionEvent;

public class AddContato extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField sobrenome;
	private JTextField telefone;
	private JTextField celular;
	private JTextField email;
	private static ObjectOutputStream output = null;
	public static List<AgendaBase> SalvaContato = new ArrayList<AgendaBase>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddContato frame = new AddContato();
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
	public AddContato() {
		super("Add Contato");
		
		CriarArquivoTexto.AbreArquivo();
		
		JTextField Nome = null;
		JTextField Sobrenome = null;
		JTextField Telefone = null;
		JTextField Celular = null;
		JTextField Email = null;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNovoContato = new JLabel("Nome ");
		lblNovoContato.setBounds(10, 40, 90, 25);
		contentPane.add(lblNovoContato);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(10, 81, 90, 25);
		contentPane.add(lblSobrenome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 117, 90, 25);
		contentPane.add(lblTelefone);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(10, 153, 90, 25);
		contentPane.add(lblCelular);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 189, 90, 25);
		contentPane.add(lblEmail);
		
		nome = new JTextField();
		nome.setBounds(110, 42, 141, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		
		sobrenome = new JTextField();
		sobrenome.setBounds(110, 83, 141, 20);
		contentPane.add(sobrenome);
		sobrenome.setColumns(10);
		
		
		telefone = new JTextField();
		telefone.setForeground(Color.LIGHT_GRAY);
		telefone.setToolTipText("");
		telefone.setBounds(110, 119, 141, 20);
		contentPane.add(telefone);
		telefone.setColumns(10);
		
		
		celular = new JTextField();
		celular.setToolTipText("");
		celular.setForeground(Color.LIGHT_GRAY);
		celular.setBounds(110, 155, 141, 20);
		contentPane.add(celular);
		celular.setColumns(10);
		
		
		email = new JTextField();
		email.setToolTipText("");
		email.setForeground(Color.LIGHT_GRAY);
		email.setBounds(110, 191, 141, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		
		
		
		JButton btnNewButton = new JButton("Salvar");
		//btnNewButton.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent arg0) {
		//		try
		//		{
		//		AgendaBase agendaBase = new AgendaBase(Nome, Sobrenome, Telefone, Celular, Email);
		//		SalvaContato.add(agendaBase);
		//		output.writeObject(agendaBase);
		//		}
				
		//		catch (IOException ioException)
		//		{
		//			System.err.println("Error ao escrever arquivo");
		//			return;
		//		}
		//		catch (NoSuchElementException elementException)
		//		{
		//			System.err.println("Dados invalidos, todos serão descartados");
		//			return;
		//		}
				
				
		//		CriarArquivoTexto.FechaArquivo();
				
		//	}
		//});
		btnNewButton.setBounds(182, 343, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(80, 343, 89, 23);
		contentPane.add(btnCancelar);
	}
}
