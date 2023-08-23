package principal;

import java.util.Scanner;

public class SomaDeDoisNumeros {

	public static void main(String[] args) {
	//Faça um Programa que peça dois números e imprima a soma;
		
		Scanner leia = new Scanner(System.in);
		int numero1;
		int numero2;
		int soma;
		
		
		System.out.println("Digite um numero:");
		numero1 = leia.nextInt();
		System.out.println("Agora digite outro numero:");
		numero2 = leia.nextInt();
		
		soma = numero1 + numero2;
				
		System.out.println("O resultado da soma é = " + soma);		
		
		leia.close();
	}

}
