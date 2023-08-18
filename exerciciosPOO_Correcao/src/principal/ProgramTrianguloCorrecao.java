package principal;

import java.util.Scanner;

import entities.TrianguloCorrecao;

public class ProgramTrianguloCorrecao {

	public static void main(String[] args) {
		//correcao exercicio;
		
		Scanner sc = new Scanner(System.in);
		TrianguloCorrecao triangulo = new TrianguloCorrecao();
		
		System.out.println("Entre com o valor do lado A: ");
		triangulo.ladoA= sc.nextInt();
		System.out.println("Entre com o valor do lado B: ");
		triangulo.ladoB= sc.nextInt();
		System.out.println("Entre com o valor do lado C: ");
		triangulo.ladoC= sc.nextInt();
		
		triangulo.obterTipoTriangulo();
		
		
		sc.close();

	}

}
