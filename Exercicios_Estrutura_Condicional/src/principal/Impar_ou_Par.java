package principal;

import java.util.Scanner;

public class Impar_ou_Par {

	public static void main(String[] args) {
		
		
	   Scanner leia = new Scanner(System.in);
	   
	   int numero = 0;
	   
	   System.out.println("Digite um número para saber se é par ou ímpar");
	   numero = leia.nextInt();
	   
	   if(numero%2 == 0) {
		   System.out.println(numero + " É par");
	   }else {
		   System.out.println(numero + " É ímpar");
	   }
	   
	   
	   leia.close();
	

	}

}
