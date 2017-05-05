package br.com.progJ;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.progJ.AgendaBase;

public class LerArquivoDeDados {
	private static ObjectInputStream input;

	public static void AbreArquivo() 
	{
		try
		{
			input = new ObjectInputStream(new FileInputStream("Teste.txt") );
		}
		catch(IOException ioException)
		{
			System.err.println("Erro ao abrir o arquivo");
		}
				
	}
	
	public static void LerDados()
	{
		AgendaBase agendaBase;
		System.out.printf("%-12s%-12s%-12s%-12s%-12s\n","Nome","Sobrenome","Telefone","Celular","Email");
		
		try
		{
			while (true)
			{
				agendaBase = (AgendaBase) input.readObject();
				
				System.out.printf("%s %s %s %s %s\n", agendaBase.getNome(),agendaBase.getSobrenome(),
						agendaBase.getTelefone(),agendaBase.getCelular(),agendaBase.getEmail());
				CriarArquivoTexto.SalvaContato.add(agendaBase);
			}
		}	
		catch (EOFException endEofFileException)
		{
			return;
		}
		catch (ClassNotFoundException classNotFoundException)
		{
			System.err.println("Não foi possivel criar objeto.");
		}
		catch(IOException ioException)
		{
			System.err.println("Erro durante ler o arquivo.");
		}
	}
	public static void FechaArquivo() 
	{
		try
		{
		if (input != null)
			input.close();
		}
		catch (IOException ioException)
		{
			System.err.println("Erro ao fechar arquivo");
			System.exit(1);
		}
	}
}
