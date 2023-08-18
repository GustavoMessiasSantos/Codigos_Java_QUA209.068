package principal;

import java.util.Scanner;

import entities.PessoaCorrecao;

public class ProgramPessoaCorrecao {

	public static void main(String[] args) {
		//correcao exercico;
		
		Scanner sc = new Scanner(System.in);
		PessoaCorrecao pessoa = new PessoaCorrecao();
		
		System.out.println("Entre com o nome: ");
		pessoa.nome = sc.nextLine();
		System.out.println("Entre com o ano nascimento: ");
		pessoa.anoNascimento = sc.nextInt();
		
		pessoa.obterIdade();
		
		sc.close();

	}

}
