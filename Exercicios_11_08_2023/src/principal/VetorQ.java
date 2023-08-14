package principal;

import java.util.Scanner;

public class VetorQ {

	public static void main(String[] args) {
		// Ler um vetor Q de 20 posi��es (aceitar somente n�meros positivos), caso n�o
		// atenda a condi��o deve informar novamente
		// o numero at� que a condi��o seja aceita, ao final mostre os n�meros inseridos
		// no vetor e a soma deles.

		// Definir a fun��o de entrada do c�digo
		Scanner sc = new Scanner(System.in);

		// Declarar o vetor
		int[] Q = new int[5];
		int soma = 0;
		int cont = 0;

		for (cont = 0; cont < Q.length; cont++) {
			System.out.println("Digite um n�mero: ");
			Q[cont] = sc.nextInt();
			while (Q[cont] < 0) {
				System.out.println("N�mero inv�lido!");
				System.out.println("Digite um n�mero: ");
				Q[cont] = sc.nextInt();

			}
			soma += Q[cont];
			
			}
		System.out.println("A soma dos numeros �: " + soma);
		System.out.println("Numeros digitados: ");

		for (int numero : Q) {
			System.out.println(numero);
		}

		sc.close();

	}
}
