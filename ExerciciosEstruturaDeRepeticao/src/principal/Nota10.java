package principal;

import java.util.Scanner;

public class Nota10 {

	public static void main(String[] args) {
		/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja
		 * inválido e continue pedindo até que o usuário informe um valor válido.
		 * 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int contador = 0;
		double nota = 0;
		
		System.out.println("Digite sua nota: ");
		nota = leia.nextInt();
	    while(nota >= 10 || nota <= 0) {
	    	System.out.println("Digite uma nota valida!");
	    	contador++;
	    	System.out.println("Digite sua nota: ");
	    	nota = leia.nextDouble();
	    	if(nota >= 0 && nota <= 10) {
	    		System.out.println("Sua nota foi: " + nota);
	    	}
	    }
		
		
		leia.close();
		
		

	}

}
