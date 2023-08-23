package principal;

import java.util.Scanner;

public class Maior_3Numeros {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int C = 0;
		
		System.out.println("Digite um número!");
		A = leia.nextInt();
		System.out.println("Digite outro número!");
		B = leia.nextInt();
		System.out.println("Digite outro número!");
		C = leia.nextInt();
		
		if(A>B && A>C) {
			System.out.println("O Numero maior é " + A);
		}else if(B>A && B>C) {
			System.out.println("O Numero maior é " + B);
		}else if(C>A && C>B) {
			System.out.println("O Numero maior é " + C);
		}else {
			System.out.println("Existem números iguais");
		}
		
		
		
		leia.close();

	}

}
