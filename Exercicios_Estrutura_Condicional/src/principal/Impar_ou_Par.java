package principal;

import java.util.Scanner;

public class Impar_ou_Par {

	public static void main(String[] args) {
		
		
	   Scanner leia = new Scanner(System.in);
	   
	   int numero = 0;
	   
	   System.out.println("Digite um n�mero para saber se � par ou �mpar");
	   numero = leia.nextInt();
	   
	   if(numero%2 == 0) {
		   System.out.println(numero + " � par");
	   }else {
		   System.out.println(numero + " � �mpar");
	   }
	   
	   
	   leia.close();
	

	}

}
