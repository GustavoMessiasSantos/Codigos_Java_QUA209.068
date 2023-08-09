package principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// Faça um programa que receba um operador (+, -, /, *) e um numero e mostre a
		// tabuada conforme os dados de entrada
		// (numero não pode ser maior que 10 e nem menor que 0)

		Scanner leia = new Scanner(System.in);

		int numero = 0;
		char operador = 0;
        int contador = 0;

		
        System.out.println("Escolha um número entre 0 e 10");
		numero = leia.nextInt();
        System.out.println("Escolha uma operação entre: '+', '-', '*', '/' ");	
		operador = leia.next().charAt(0);

        for(contador = 1; contador<10; contador++) {
        	if(operador == '+') {
        		
        		System.out.println(numero);
        	}
        }        
        
		leia.close();

	}

}
