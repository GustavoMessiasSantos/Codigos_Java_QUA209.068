package principal;

import java.util.Scanner;

public class Maior_3Numeros {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int C = 0;
		
		System.out.println("Digite um n�mero!");
		A = leia.nextInt();
		System.out.println("Digite outro n�mero!");
		B = leia.nextInt();
		System.out.println("Digite outro n�mero!");
		C = leia.nextInt();
		
		if(A>B && A>C) {
			System.out.println("O Numero maior � " + A);
		}else if(B>A && B>C) {
			System.out.println("O Numero maior � " + B);
		}else if(C>A && C>B) {
			System.out.println("O Numero maior � " + C);
		}else {
			System.out.println("Existem n�meros iguais");
		}
		
		
		
		leia.close();

	}

}
