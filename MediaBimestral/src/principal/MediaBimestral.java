package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaBimestral {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.

		Scanner leia = new Scanner(System.in);

		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		DecimalFormat formatador = new DecimalFormat ("0.00");
				
		System.out.printf("A media final �: " + formatador.format(media));		
		

		leia.close();

	}

}
