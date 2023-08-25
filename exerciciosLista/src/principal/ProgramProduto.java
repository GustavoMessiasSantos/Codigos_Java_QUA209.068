package principal;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Produto;

public class ProgramProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto produto = new Produto();
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		
		for(int i = 1; i<4; i++) {
		produto = new Produto();
		
		System.out.println("Entre com o nome do produto: ");
		produto.setNomeString(sc.nextLine());
		
		System.out.println("Entre com a quantidade do produto: ");
		produto.setQuantidade(sc.nextInt());
		
		System.out.println("Entre com o valor do produto: ");
		produto.setPreco(sc.nextDouble());
		sc.nextLine();
		
		produtos.add(produto);
		}
		
		System.out.println(produtos);
		

	}

}
