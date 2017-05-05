import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Enter {

	private JFrame frame;
	private JTextField usuario;
	private JPasswordField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enter window = new Enter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Enter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblUsuario.setBounds(222, 72, 46, 30);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSenha.setBounds(222, 135, 46, 30);
		frame.getContentPane().add(lblSenha);
		
		usuario = new JTextField();
		usuario.setBounds(278, 72, 96, 30);
		frame.getContentPane().add(usuario);
		usuario.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if((usuario != null)&&(senha != null))
				{
					JOptionPane.showMessageDialog(null, "Dados corretos");
					frame.dispose();
					Cellphone cellphone = new Cellphone();
					cellphone.setVisible(true);
					
				}
			}
		});
		btnEntrar.setBounds(335, 228, 89, 23);
		frame.getContentPane().add(btnEntrar);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/User.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(22, 34, 153, 196);
		frame.getContentPane().add(label);
		
		senha = new JPasswordField();
		senha.setBounds(278, 135, 96, 30);
		frame.getContentPane().add(senha);
	}
}
