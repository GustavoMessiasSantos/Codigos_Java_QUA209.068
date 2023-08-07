package principal;

import java.util.Scanner;

public class Maior_Numero {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int A;
		int B;
		
		A = leia.nextInt();
		B = leia.nextInt();
		
		if(A>B) {
			System.out.println("O Numero maior é " + A);
		}else {
			System.out.println("O Numero maior é " + B);
		}
		
		
		leia.close();

	}

}
