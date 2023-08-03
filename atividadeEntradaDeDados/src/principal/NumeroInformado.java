package principal;

import java.util.Scanner;

public class NumeroInformado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um numero:");
		 
		numero = leia.nextInt();
		
		System.out.println("O numero informado foi: " + numero);
		
		
		
		
		leia.close();
		

	}

}
