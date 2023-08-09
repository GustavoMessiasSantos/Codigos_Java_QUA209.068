package principal;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		// Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

		Scanner leia = new Scanner(System.in);

		int contador;

		for (contador = 0; contador <= 50; contador++) {
			if (contador % 2 != 0) {
				System.out.println(contador);
			}
				
		/*contador = contador + n;
		 * contador += n;
		 * contador -= n;
		 * contador *= n;
		 * contador /= n;
		 * contador %= n;
		 *  		
		 */
				



		}

		leia.close();

	}

}
