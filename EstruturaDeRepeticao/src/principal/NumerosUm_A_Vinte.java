package principal;

import java.util.Scanner;

public class NumerosUm_A_Vinte {

	public static void main(String[] args) {
		//Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do outro. 
		//Depois modifique o programa para que ele mostre os n�meros um ao lado do outro.
		
		
		Scanner leia = new Scanner(System.in);
		
		
		int numero = 1;
		int contador = 0;
		
		for(contador = 0; contador<20; contador++) {
			System.out.print(numero + " ");
			numero = numero + 1;
		}
		
		numero = 1;
		
		for(contador = 0; contador<20; contador++) {
			System.out.printf("\n" + numero);
			numero = numero + 1;
		}
		
		
		
		
		leia.close();
		
		
		
	}

}
