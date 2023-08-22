package entities;

public class Funcionarios {
	
	private String nome;
	protected String cargo;
	protected double salario;
	protected double salarioFinal;
	private int idade;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void salarioBrutoFinal() {
		salarioFinal += salario;

	}
	
	public void informacoesFuncionario() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salario Bruto: " + salarioFinal);
	}
	

}
