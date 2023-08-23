package entities;

public class Loja {
	
	public String nome;
	public char pagamento;
	public int Quantidade;
	public double preco;
	
	public void vendaDeProduto() {
		double desconto;
		double precoTotal;
		double precoFinal;
		
		if(pagamento == '1') {
			desconto = 0.06;
			precoTotal = (double)Quantidade * preco;
			precoFinal = precoTotal + (precoTotal*desconto);
			System.out.println("Você comprou " + Quantidade + " unidades de " + nome);
			System.out.printf("Seu total foi: %.2f R$\n", precoFinal);
		}else if(pagamento == '2') {
			desconto = 0.08;
			precoTotal = (double)Quantidade * preco;
			precoFinal = precoTotal + (precoTotal*desconto);
			System.out.println("Você comprou " + Quantidade + " unidades de " + nome);
			System.out.printf("Seu total foi: %.2f R$\n",  precoFinal);
		}else if(pagamento == '3') {
			desconto = 0.05;
			precoTotal = (double)Quantidade * preco;
			precoFinal = precoTotal + (precoTotal*desconto);
			System.out.println("Você comprou " + Quantidade + " unidades de " + nome);
			System.out.printf("Seu total foi: %.2f R$\n",  precoFinal);
		}else if(pagamento == '4') {
			desconto = 0;
			precoTotal = (double)Quantidade * preco;
			System.out.println("Você comprou " + Quantidade + " unidades de " + nome);
			System.out.printf("Seu total foi: %.2f R$\n",  precoTotal);
		}else {
			System.out.println("Você digitou a opção de pagamento errada!");
		}
	}

}
