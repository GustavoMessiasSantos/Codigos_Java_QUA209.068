package principal;

import java.util.Scanner;

public class Maior_3Numeros {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		
		A = leia.nextInt();
		B = leia.nextInt();
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
