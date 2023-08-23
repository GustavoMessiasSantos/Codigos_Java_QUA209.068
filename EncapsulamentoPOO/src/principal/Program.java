package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Gustavo");
		
		pessoa.calcularIdade(1998);
		
		pessoa.imprimeDados();
		
		
		sc.close();

	}

}
