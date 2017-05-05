package br.com.progJ;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import br.com.progJ.AgendaBase;

public class CriarArquivoTexto {
	
	private static ObjectOutputStream output;
	public static List<AgendaBase> SalvaContato = new ArrayList<AgendaBase>();
	
	public static void AbreArquivo() 
	{
		try
		{
			output = new ObjectOutputStream(new FileOutputStream("Teste.txt") );
		}
		catch ( IOException ioException)
		{
			System.err.println("Erro ao abrir o arquivo");
		}
	}
	
	public static void AddDados()
	{
		AgendaBase agendaBase;
		String Nome;
		String Sobrenome;
		String Telefone;
		String Celular;
		String Email;
		String Resposta = "S";
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.printf("%s\n%s\n\n",
				"Para terminar a inserção de dados dêe espaço.",
				"quando você escrever oque será inserido no arquivo, use <Ctrl> + z + enter para sair.");

		

		//while (Resposta.equals("S"))
		{
			try
			{
				System.out.println("Digite o nome do contato:");
				Nome = input.next();
				System.out.println("Digite o sobrenome do contato:");
				Sobrenome = input.next();
				System.out.println("Digite o telefone do contato:");
				Telefone = input.next();
				System.out.println("Digite o Celular do contato:");
				Celular = input.next();
				System.out.println("Digite o email do contato:");
				Email = input.next();
				
				
				
				if ( Nome != null )
				{
					agendaBase = new AgendaBase();
					SalvaContato.add(agendaBase);
					output.writeObject(agendaBase); // Este método grava o objeto na saída.
				}
				
			}
			catch (IOException ioException)
			{
				System.err.println("Error ao escrever arquivo");
				return;
			}
			catch (NoSuchElementException elementException)
			{
				System.err.println("Dados invalidos, todos serão descartados");
				input.nextLine();
			}
			System.out.printf("%s\n%s",
					"Deseja cadastrar mais um contato? S ou N ","?");
				Resposta = input.next();
				
		}
	}
	
	public static void ArrayContato()
	{
		
		if (SalvaContato.isEmpty())
		{
			System.out.println("Não existem Contatos cadastrados porra!");
			
		}
		else
		{
		for(int i=0; i < SalvaContato.size(); i++)
		{
		System.out.println(SalvaContato.toArray()[i] + "\n");
		}
		
		System.out.println("Total de Contatos: "+ SalvaContato.size());

		}
	}
	

	
	public static void FechaArquivo() 
	{
		try
		{
		if (output != null)
			output.close();
		}
		catch (IOException ioException)
		{
			System.err.println("Erro ao fechar arquivo");
			System.exit(1);
		}
	}

}
