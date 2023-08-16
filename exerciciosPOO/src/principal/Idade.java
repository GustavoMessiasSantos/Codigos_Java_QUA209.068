package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Idade {

	public static void main(String[] args) {
		//Faça um programa que receba o nome e o ano de nascimento e retorne a idade atual do usuário;
		
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		pessoa.nome = sc.nextLine();
		System.out.println("Agora digite o seu ano de nascimento");
		pessoa.anoNascimento = sc.nextInt();
		pessoa.idadeA = pessoa.idade(pessoa.anoNascimento);
		
		
		System.out.println(pessoa.nome);
		System.out.println("Sua idade atual é: " + pessoa.idade(pessoa.anoNascimento) + " Anos");

	}

}
