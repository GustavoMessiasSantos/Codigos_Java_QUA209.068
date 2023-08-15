package principal;

import java.util.Scanner;

public class CalcularMetroQuadrado {

	public static void main(String[] args) {
		// crie um programa que receba os valores
		// de largura e comprimento do terreno
		// e informa quantos metros quadrados ele tem
		// utilize função
		
		Scanner sc = new Scanner(System.in);
		
		double largura = 0;
		double comprimento = 0;
		
		System.out.println("Digite o tamanho da largura: ");
		largura = sc.nextDouble();
		System.out.println("Digite o tamano do comprimento: ");
		comprimento = sc.nextDouble();
		
		System.out.printf("O Tamanho do terreno é %.2f metros quadrados\n",  metroQuadrado(largura, comprimento));
		
		
		sc.close();
		

	}
	static double metroQuadrado(double largura, double comprimento) {
		return largura * comprimento;
	}

}
