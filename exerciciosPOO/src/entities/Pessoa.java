package entities;

public class Pessoa {
	
	public String nome;
	public int anoNascimento;
	public int idadeA;
	
	public int idade(int anoNascimento) {
		int idadeAtual;
		idadeAtual = 2023 - anoNascimento;
		return idadeAtual;
	}
	

}
