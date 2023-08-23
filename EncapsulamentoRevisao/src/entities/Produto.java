package entities;

public class Produto {
	
	private String nome;
	private int quantidade;
	private double preco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public void adicionarQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public void mostrarEstoque() {
		System.out.println("Nome do Produto: " + nome);
		System.out.println("Quantidade em estoque: " + quantidade);
		System.out.println("Preço unitário: R$" + preco);
		System.out.printf("Valor total em estoque: %.2fR$\n", (quantidade*preco));
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Nome do produto " + nome + "\nQuantidade: " + quantidade;
}
}
