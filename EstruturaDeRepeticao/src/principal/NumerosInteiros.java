package principal;

import java.util.Scanner;

public class NumerosInteiros {

	public static void main(String[] args) {
		//Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o 
		//no intervalo compreendido por eles.
		
		Scanner leia = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int contador = 0;
		
		System.out.println("Digite um numero inteiro!");
		numero1 = leia.nextInt();
		System.out.println("Digite outro numero inteiro!");
		numero2 = leia.nextInt();
		
		do {
			if(numero1>numero2) {
				contador++;
				numero1 = numero1 - 1;
				System.out.println(numero1);
			}else if(numero2>numero1) {
				contador++;
				numero1 = numero1 + 1;
				System.out.println(numero1);
			}else {
				System.out.println("N�o h� intervalo!");
			}
			
		}while(numero1 != numero2);
		
		leia.close();
		

	}

}
