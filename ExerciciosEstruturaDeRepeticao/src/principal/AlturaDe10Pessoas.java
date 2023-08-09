package principal;

import java.util.Scanner;

public class AlturaDe10Pessoas {

	public static void main(String[] args) {
		//Faça um programa que receba a altura de 10 pessoas e mostre a media da altura delas
		
		
		Scanner input = new Scanner(System.in);
		
		double altura = 0;
		double mediaAltura = 0;
		
		
		
		
		for(int contador = 0; contador<10; contador++) {
			altura = input.nextDouble();
			altura = altura++;
			
		}
		mediaAltura = altura/10;
		System.out.printf("A media de altura = %.2f m\n",  altura);
		
		
		
		input.close();

	}

}
