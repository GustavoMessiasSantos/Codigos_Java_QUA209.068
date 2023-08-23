package principal;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		/*
		 * Ler um vetor Q de 20 posições (aceitar somente números positivos), caso não
		 * atenda a condição deve informar novamente o numero até que a condição seja
		 * aceita, ao final mostre os números inseridos no vetor e a soma deles. *
		 */

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[20];
		int soma = 0;
		// i = iterador mesmo que o contador
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Entre com o numero: ");
			numeros[i] = sc.nextInt();
			while (numeros[i] < 0) {
				System.out.println("Numero inválido.");
				System.out.println("Entre com o numero: ");
				numeros[i] = sc.nextInt();
			}
			soma += numeros[i];
		}
		System.out.println("A soma dos numeros é: " + soma);
		System.out.println("Numeros digitados: ");
		for (int numero : numeros) {
			System.out.println(numero);
		}

	}

}
