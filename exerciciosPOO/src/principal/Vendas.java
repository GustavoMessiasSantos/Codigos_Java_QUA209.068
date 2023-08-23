package principal;

import java.util.Scanner;

import entities.Loja;

public class Vendas {

	public static void main(String[] args) {
		//Faça um programa que simule uma venda (nome, preço, quantidade) e ao final pergunte se é pix, dinheiro, debito, credito
		//(para pix tem desconto de 6%, dinheiro desconto de 8%, para debito 5 % e credito não possui desconto);
		
		
		Scanner sc = new Scanner(System.in);
		Loja loja = new Loja();
		
		System.out.println("Digite o nome do produto: ");
		loja.nome = sc.nextLine();
		System.out.println("Digite a opcao de pagamento: ");
		System.out.println("1 para pix, 2 para dinheiro, 3 para débito, 4 para crédito");
		loja.pagamento = sc.next().charAt(0);
		while(loja.pagamento != '1' && loja.pagamento != '2' && loja.pagamento != '3' 
			&&	loja.pagamento != '4' ) {
			System.out.println("Digite a opcao de pagamento: ");
			System.out.println("1 para pix, 2 para dinheiro, 3 para débito, 4 para crédito");
			loja.pagamento = sc.next().charAt(0);
		}
		System.out.println("Agora digite a quantidade que você deseja comprar: ");
		loja.Quantidade = sc.nextInt();
		System.out.println("Agora digite o preço do produto: ");
		loja.preco = sc.nextDouble();
		
		loja.vendaDeProduto();
		
		sc.close();

	}

}
