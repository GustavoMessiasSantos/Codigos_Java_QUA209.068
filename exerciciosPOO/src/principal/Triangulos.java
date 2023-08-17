package principal;

import java.util.Scanner;

import entities.LadosDoTriangulo;

public class Triangulos {

	public static void main(String[] args) {
		//Faça um programa que receba 3 valores e indique/retorne que tipo de triangulo ele pode ser;
		
		Scanner sc = new Scanner(System.in);
		LadosDoTriangulo triangulo = new LadosDoTriangulo();
		
		triangulo.A = sc.nextInt();
		triangulo.B = sc.nextInt();
		triangulo.C = sc.nextInt();
		
	    triangulo.tipoTriangulo();
		
		
		
		
		sc.close();

	}

}
