package principal;

import java.util.Scanner;

public class Ordem_Decrescente {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		
		
		if((A>B && A>C) && B>C) {
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
		}else if((A>B && A>C) && C>B ) {
			System.out.println(A);
			System.out.println(C);
			System.out.println(B);
		}else if((B>A && B>C) && C>A) {
			System.out.println(B);
			System.out.println(C);
			System.out.println(A);
		}else if((B>A && B>C) && A>C) {
			System.out.println(B);
			System.out.println(A);
			System.out.println(C);
		}else if((C>A && C>B) && A>B) {
			System.out.println(C);
			System.out.println(A);
			System.out.println(B);
		}else if((C>A && C>B) && B>A) {
			System.out.println(C);
			System.out.println(B);
			System.out.println(A);
		}
		
		
		leia.close();

	}

}
