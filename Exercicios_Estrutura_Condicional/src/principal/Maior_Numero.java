package principal;

import java.util.Scanner;

public class Maior_Numero {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		
		A = leia.nextInt();
		B = leia.nextInt();
		
		if(A>B) {
			System.out.println("O Numero maior é " + A);
		}else {
			System.out.println("O Numero maior é " + B);
		}
		System.out.println("O maior número é: " + Math.max(A, B));
		
		leia.close();

	}

}
