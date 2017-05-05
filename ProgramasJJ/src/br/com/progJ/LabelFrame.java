package br.com.progJ;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.com.progJ.TextFieldFrame.TextFieldHandler;

public class LabelFrame extends JFrame
{
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;


	public LabelFrame()
	{
		super("Bem vindo!");
		
		setLayout(new FlowLayout());
		
		label1 = new JLabel("1- Fazer uma Ligação.");
		label1.setToolTipText("This is Label1");
		add(label1);
		
		label2 = new JLabel("2- Adicionar Contato.");
		label2.setToolTipText("This is Label1");
		add(label2);
		
		label3 = new JLabel("3- Buscar Contatos.");
		label3.setToolTipText("This is Label1");
		add(label3);
		
		label4 = new JLabel("4- Sair.");
		label4.setToolTipText("This is Label1");
		add(label4);
		
		label5 = new JLabel("Digite o numero da Opcao e aperte Enter:");
		label1.setToolTipText("This is Label1");
		add(label5);
		textField1 = new JTextField(5);
		add(textField1);
		
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
	}	
		
	private class TextFieldHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event) 
		{
			String string = "";
			
			if (event.getSource() == textField1)
				string = String.format("TextField2: %s", event.getActionCommand() );
			
			
			JOptionPane.showMessageDialog(null, string);

		
		/* Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
		label2 = new JLabel ("Label whit text and icon",bug,SwingConstants.LEFT);
		label2.setText("This is label2");
		add(label2);
		
		label3 = new JLabel();
		label3.setText("Label with icon and text at buttom");
		label3.setIcon(bug);;
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3");
		add(label3);*/
		}		
	}

}
