package principal;

import java.util.Scanner;

public class SomaDeDoisNumeros {

	public static void main(String[] args) {
	//Fa�a um Programa que pe�a dois n�meros e imprima a soma;
		
		Scanner leia = new Scanner(System.in);
		int numero1;
		int numero2;
		int soma;
		
		
		System.out.println("Digite um numero:");
		numero1 = leia.nextInt();
		System.out.println("Agora digite outro numero:");
		numero2 = leia.nextInt();
		
		soma = numero1 + numero2;
				
		System.out.println("O resultado da soma � = " + soma);		
		
		leia.close();
	}

}
