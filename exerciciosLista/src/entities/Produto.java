package entities;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements comparable<produto> {
	
	private String nome;
	private int quantidade;
	private double preco;
	
	
	
	public String getNomeString() {
		return nome;
	}
	public void setNomeString(String nomeString) {
		this.nome = nomeString;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + ", Quantidade" + quantidade + ", Preço unitário: " + preco;
	}


}
