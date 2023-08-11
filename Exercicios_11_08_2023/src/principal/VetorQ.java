package principal;

import java.util.Scanner;

public class VetorQ {

	public static void main(String[] args) {
		//Ler um vetor Q de 20 posições (aceitar somente números positivos), caso não atenda a condição deve informar novamente 
		//o numero até que a condição seja aceita, ao final mostre os números inseridos no vetor e a soma deles.
		
		
		//Definir a função de entrada do código
		Scanner sc = new Scanner(System.in);
		
		//Declarar o vetor
		int[] Q = new int[5];
		int numero = 0;
		int cont = 0;
		
	    if(numero>=0) {
	    	for(cont = 0; cont<Q.length; cont++) {
	    		System.out.println("Digite um número ");
	    		numero = sc.nextInt();
	    		Q[cont] = numero;
	    	}
	    }else {
	    	while(numero<0) {
	    		System.out.println("Digite um número ");
	    		numero = sc.nextInt();
	    	}
	    }
			
		
		
		
		
		sc.close();

	}

}
