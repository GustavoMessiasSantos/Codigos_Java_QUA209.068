package principal;

import java.util.Scanner;

public class conversorFahrenheitCelcius {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		//C = 5 * ((F-32) / 9).
		
		Scanner leia = new Scanner(System.in);
		
		int fahrenheit;
		int celcius;
		
		
		System.out.println("Qual a tempereatura em �F?");
		fahrenheit = leia.nextInt();
		
		celcius = 5 * ((fahrenheit-32)/9);
		
		System.out.println("A temperatura em Celcius � " + celcius + "�C");
		
		
		leia.close();

	}

}
