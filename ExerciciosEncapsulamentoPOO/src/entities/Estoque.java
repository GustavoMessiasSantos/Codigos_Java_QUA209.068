package entities;

public class Estoque {

	private String produto;
	private int quantidade;
	private int preco;

	
	
	
	public void TotalProduto() {
		System.out.println("Produto: " + produto);
		System.out.println("Quantidade: " + quantidade);
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
