package principal;

import java.util.Scanner;

public class conversorCelciusFahrenheit {

	public static void main(String[] args) {
		//Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		
		Scanner leia = new Scanner(System.in);
		
		int celcius;
		int fahrenheit;
		
		System.out.println("Digita a temperatura em �C");
		celcius = leia.nextInt();
		
	    fahrenheit = (celcius * 9/5) + 32;
		System.out.println("A temperatura em fahrenheit � de " + fahrenheit + "�F");
		
		
		
		
		leia.close();

	}

}
