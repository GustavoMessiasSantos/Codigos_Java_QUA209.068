package principal;

import java.util.Scanner;

import entities.Estoque;

public class ProgramEstoque {

	public static void main(String[] args) {
		//crie um programa de estoque, 
		//onde você poderá inserir um produto e a quantidade e 
		//mostrar o valor total do estoque da loja; use scanner
		
		Scanner sc = new Scanner(System.in);
		Estoque estoque = new Estoque();
		
		System.out.println("Digite o nome do produto: ");
		estoque.setProduto(sc.nextLine());
		System.out.println("Digite a quantidade do produto");
		estoque.setQuantidade(sc.nextInt());
		
		estoque.TotalProduto();
		
		
		
		sc.close();

	}

}
