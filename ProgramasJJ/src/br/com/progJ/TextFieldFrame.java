package br.com.progJ;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame
{
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JPasswordField passwordField;
	
	
	public TextFieldFrame()
	{
		super("Testando JTextfield");
		setLayout(new FlowLayout() );
		
		textField1 = new JTextField(15);
		add( textField1);
		
		textField2 = new JTextField("Digite aqui.");
		add( textField2);
		
		textField3 = new JTextField("Local de texto nao editavel", 21);
		textField3.setEditable(false);
		add( textField3);
		
		passwordField = new JPasswordField("Hidden text");
		add( passwordField);
		
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	
	public class TextFieldHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event) 
		{
			String string = "";
			
			if (event.getSource() == textField1)
				string = String.format("TextField1: %s", event.getActionCommand() );
			
			else if (event.getSource() == textField2)
				string = String.format("textField2: %s", event.getActionCommand() );

			else if (event.getSource() == textField3)
				string = String.format("textField3: %s", event.getActionCommand() );
			
			else if (event.getSource() == passwordField)
				string = String.format("passwordField: %s", event.getActionCommand() );
			
			JOptionPane.showMessageDialog(null, string);
			
			
			
		}
		
	}

}
