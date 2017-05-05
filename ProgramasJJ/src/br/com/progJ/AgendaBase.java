package br.com.progJ;

import java.io.Serializable;



@SuppressWarnings("serial")
public class AgendaBase implements Serializable
{

	private String Nome;
	private String Sobrenome;
	private String Telefone;
	private String Celular;
	private String Email;
	
	public AgendaBase(){
		
	}
	
	public AgendaBase(String nome, String sobrenome, String telefone,
			String celular, String email) {
		super();
		Nome = nome;
		Sobrenome = sobrenome;
		Telefone = telefone;
		Celular = celular;
		Email = email;
	}
	
	

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getCelular() {
		return Celular;
	}

	public void setCelular(String celular) {
		Celular = celular;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
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
		builder.append(Nome + Sobrenome +"\n [Nome \t");
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
