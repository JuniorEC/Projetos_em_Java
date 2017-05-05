package br.com.progJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.progJ.AgendaBase;

public class AddContato
{
	public static void main(String[] args) {
		
		AgendaBase();
		
	}
	
	public static void AgendaBase()
	{
		AgendaBase agendaBase;
		Scanner escolha = new Scanner(System.in);
		List<AgendaBase> SalvaContato = new ArrayList<AgendaBase>();
		//AgendaBase.displayMessage(); // Aqui eu posso fazer um ENUM.
		int acao;
		//acao = escolha.nextInt();
		CriarArquivoTexto.AbreArquivo();
		LerArquivoDeDados.AbreArquivo();
		LerArquivoDeDados.LerDados();
		do 
		{			
				AgendaBase.displayMessage();
				acao = escolha.nextInt();
				
				

			if (acao==1)
			{
				LerArquivoDeDados.LerDados();
			}
			
			else if (acao==2)
			{
				
				CriarArquivoTexto.AddDados();
				CriarArquivoTexto.FechaArquivo();
					
			}
			else if (acao==3)
			{
				CriarArquivoTexto.ArrayContato();
			}
	
		}
			while (acao!=0);
			escolha.close();
			CriarArquivoTexto.FechaArquivo();
			LerArquivoDeDados.FechaArquivo();
	
		}		
	}
	
			

		
	

