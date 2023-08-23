package principal;

import java.util.Scanner;

public class IntervaloEntreOsNumeros {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
				int num1 = 0;
				int num2 = 0;
				
				System.out.println("Entre com o primeiro numero: ");
				num1 = sc.nextInt();
				
				System.out.println("Entre com o segundo numero: ");
				num2 = sc.nextInt();
				
				
				for(int contador = ++num1; contador < num2; contador++) {
					System.out.println(contador);
				}
				
				
		sc.close();
		
	}

}
