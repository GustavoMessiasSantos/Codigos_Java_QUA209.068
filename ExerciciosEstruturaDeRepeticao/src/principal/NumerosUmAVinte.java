package principal;

import java.util.Scanner;

public class NumerosUmAVinte {

	public static void main(String[] args) {
		//Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do outro. 
				//Depois modifique o programa para que ele mostre os n�meros um ao lado do outro.
				
				
				Scanner leia = new Scanner(System.in);
				
				
				int contador;
				
				for(contador = 1; contador<21; contador++) {
					System.out.print(contador + " ");
				}
				
				
				for(contador = 1; contador<21; contador++) {
					System.out.printf("\n" + contador);
				}
				
				
				
				
				leia.close();	
		}

}
