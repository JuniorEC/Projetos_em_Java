package br.com.progJ;

public class TestaCAT {

	//public static void main(String[] args) 
	{
		CriarArquivoTexto aplication = new CriarArquivoTexto();
		
		aplication.AbreArquivo();
		aplication.AddDados();
		aplication.FechaArquivo();
		
		
	}
	
	public static void main(String[] args) 
	{
		LerArquivoDeDados aplication = new LerArquivoDeDados();
		
		aplication.AbreArquivo();
		aplication.LerDados();
		aplication.FechaArquivo();
		
		
	}
}
