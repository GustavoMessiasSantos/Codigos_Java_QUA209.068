package principal;

import java.util.Scanner;

import entities.Terreno;

public class MetroQuadrado {

	public static void main(String[] args) {
		// Faça um programa que calcule a área de um terreno e mostre o m²;
		
		Scanner sc = new Scanner(System.in);
		Terreno terreno = new Terreno();
		
		System.out.println("Digite o tamanho da comprimento do terreno: ");
		terreno.comprimento = sc.nextDouble();
		
		System.out.println("Digite o tamanho da largura do terreno: ");
		terreno.largura = sc.nextDouble();
		
		terreno.area = terreno.metroQuadrado(terreno.comprimento, terreno.largura, terreno.area);
		
		System.out.printf("\nO tamanho do terreno é: %.2f metros Quadrados",terreno.area);
		
		sc.close();
		

	}

}
