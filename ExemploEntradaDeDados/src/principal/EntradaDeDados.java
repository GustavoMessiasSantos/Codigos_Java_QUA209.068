package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		double altura;
		char sexo;

		System.out.print("\nPor favor, digite o seu nome: ");
		// Leitura de dados tipo String (conjunto caracteres)
		nome = leia.nextLine();
		// Leitura de dados tipo Int (conjunto inteiros)
		System.out.print("\nPor favor, digite sua idade: ");
		idade = leia.nextInt();
		// Leitura de dados tipo Double (conjunto reais)
		System.out.print("\nDigite sua Altura: ");
		altura = leia.nextDouble();
		// Leitura de dados tipo char (unico caractere)
		System.out.print("\nQual seu sexo?");
		sexo = leia.next().charAt(0);
        // \n quebra uma linha
		System.out.println("O nome digitado foi: " + nome);
		System.out.println("A idade digitada foi: " + idade);
		System.out.println("A Altura digitada foi: " + altura);
		System.out.println("O sexo digitado foi: " + sexo);

		leia.close();

	}

}
