package br.com.progJ;

import java.io.Serializable;

import javax.swing.JTextField;



@SuppressWarnings("serial")
public class AgendaBase implements Serializable
{

	public static Object setEmail;
	private JTextField Nome;
	private JTextField Sobrenome;
	private JTextField Telefone;
	private JTextField Celular;
	private JTextField Email;
	
	public AgendaBase(){
		
	}
	
	public AgendaBase(JTextField nome, JTextField sobrenome, JTextField telefone,
			JTextField celular, JTextField email) {
		super();
		Nome = nome;
		Sobrenome = sobrenome;
		Telefone = telefone;
		Celular = celular;
		Email = email;
	}
	
	

	public JTextField getNome() {
		return Nome;
	}

	public void setNome(JTextField nome) {
		Nome = nome;
	}

	public JTextField getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(JTextField sobrenome) {
		Sobrenome = sobrenome;
	}

	public JTextField getTelefone() {
		return Telefone;
	}

	public void setTelefone(JTextField telefone) {
		Telefone = telefone;
	}

	public JTextField getCelular() {
		return Celular;
	}

	public void setCelular(JTextField celular) {
		Celular = celular;
	}

	public JTextField getEmail() {
		return Email;
	}

	public void setEmail(JTextField email) {
		Email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Celular == null) ? 0 : Celular.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result
				+ ((Sobrenome == null) ? 0 : Sobrenome.hashCode());
		result = prime * result
				+ ((Telefone == null) ? 0 : Telefone.hashCode());
		return result;
	}

	public static void displayMessage() 
	{
		System.out.println("####################################################");
		System.out.println("#  1- Fazer uma Ligação                            #");
		System.out.println("#  2- Adicionar Contato                            #");
		System.out.println("#  3- Buscar Contatos                              #");
		System.out.println("#  0- Sair                                         #");
		System.out.println("#  Digite o numero da Opcao:                       #");
		System.out.println("####################################################");
		
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(Nome+"\n [Nome \t");
		builder.append(Nome);
		builder.append(", Sobrenome \t");
		builder.append(Sobrenome);
		builder.append(", Telefone \t");
		builder.append(Telefone);
		builder.append(", Celular \t");
		builder.append(Celular);
		builder.append(", Email \t");
		builder.append(Email);
		builder.append("]");
		builder.append("\n");
		return builder.toString();
	

	}

}
