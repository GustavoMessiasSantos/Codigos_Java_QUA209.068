package principal;

import java.util.Scanner;

public class Impar_ou_Par {

	public static void main(String[] args) {
		
		
	   Scanner leia = new Scanner(System.in);
	   
	   int numero;
	   
	   System.out.println("Digite um número");
	   numero = leia.nextInt();
	   
	   if(numero%2 == 0) {
		   System.out.println("O número é par");
	   }else {
		   System.out.println("O número é ímpar");
	   }
	   
	   
	   leia.close();
	

	}

}
