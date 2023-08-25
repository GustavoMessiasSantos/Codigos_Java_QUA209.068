package entities;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private int idade;
	
	
	
	
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + " Idade: " + idade + "\n";
	}


	@Override
	public int compareTo(Pessoa umaOutraPessoa) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(umaOutraPessoa.nome);
	}
	

}
