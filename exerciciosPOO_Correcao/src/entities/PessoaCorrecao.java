package entities;

public class PessoaCorrecao {
	
	public String nome;
	public int anoNascimento;
	
	public void obterIdade() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + (2023-anoNascimento));
	}

}
