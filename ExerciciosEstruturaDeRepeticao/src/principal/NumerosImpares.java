package principal;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		//Fa�a um programa que imprima na tela apenas os n�meros �mpares entre 1 e 50.

				Scanner leia = new Scanner(System.in);
				
				int numero = -1;
				int contador = 0;
				
				for(contador = 0; contador<25; contador++) {
					numero = numero + 2;
					System.out.println(numero);
				}
				
				leia.close();
				
	}

}
