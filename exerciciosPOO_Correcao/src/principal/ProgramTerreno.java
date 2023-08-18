package principal;

import java.util.Scanner;

import entities.TerrenoCorrecao;

public class ProgramTerreno {

	public static void main(String[] args) {
		//correção exercicio terreno
		Scanner sc = new Scanner(System.in);
		TerrenoCorrecao terreno = new TerrenoCorrecao();
		
		System.out.println("Entre com a largura do terreno: ");
		terreno.largura = sc.nextDouble();
		System.out.println("Entre com o comprimento do terreno: ");
		terreno.comprimento = sc.nextDouble();
		
		System.out.printf("O tamanho do terreno é %.2f Metros quadrados\n", terreno.obterMetroQuadrado());
		
		
		sc.close();
		
		

	}

}
