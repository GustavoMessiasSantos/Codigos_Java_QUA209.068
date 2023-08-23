package entities;

public class Pessoa {

	private String nome;
	private int idade;
	private int anoNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return anoNascimento;
	}

	public void setAno(int ano) {
		this.anoNascimento = ano;
	}

	public int getIdade() {
		idade = 2023 - anoNascimento;
		return idade;
	}

	public void calcularIdade(int anoNascimento) {
		idade = 2023 - anoNascimento;

	}
	public void imprimeDados(){
		System.out.println(nome + " tem " + idade + " Anos");
	}

}
