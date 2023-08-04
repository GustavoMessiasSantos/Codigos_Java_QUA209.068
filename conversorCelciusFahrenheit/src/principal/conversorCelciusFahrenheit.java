package principal;

import java.util.Scanner;

public class conversorCelciusFahrenheit {

	public static void main(String[] args) {
		//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		
		Scanner leia = new Scanner(System.in);
		
		int celcius;
		int fahrenheit;
		
		System.out.println("Digita a temperatura em ºC");
		celcius = leia.nextInt();
		
	    fahrenheit = (celcius * 9/5) + 32;
		System.out.println("A temperatura em fahrenheit é de " + fahrenheit + "ºF");
		
		
		
		
		leia.close();

	}

}
