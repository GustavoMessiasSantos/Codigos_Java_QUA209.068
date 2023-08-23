package principal;

import java.util.Scanner;

import entities.Numeros;

public class EquacaoDoSegundoGrau {

	public static void main(String[] args) {
		//Faça um programa que receba os números de uma equação do segundo grau, retorne o valor de xI, e xII;
		
		Scanner sc = new Scanner(System.in);
		
		Numeros numero = new Numeros();
		
		numero.A = sc.nextInt();
		numero.B = sc.nextInt();
		numero.C = sc.nextInt();
		
		int x1 = (-numero.B + numero.EquacaoSegundoGrau(numero.A, numero.B, numero.C))/(2*numero.A);
		int x2 = (-numero.B - numero.EquacaoSegundoGrau(numero.A, numero.B, numero.C))/(2*numero.A);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		sc.close();

	}

}
