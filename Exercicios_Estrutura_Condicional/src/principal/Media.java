package principal;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double mediaFinal;
		
		nota1 = leia.nextDouble();
		nota2 = leia.nextDouble();
		nota3 = leia.nextDouble();
		nota4 = leia.nextDouble();
		
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		if(mediaFinal <= 4) {
			System.out.println("Você está reprovado!");
		}else if(mediaFinal >= 5 && mediaFinal < 7) {
			System.out.println("Você está de recuperação!");
		}else if(mediaFinal >= 7 && mediaFinal < 10) {
			System.out.println("Você está aprovado!");
		}else if(mediaFinal == 10) {
			System.out.println("Você foi aprovado com honra!");
		}
		
		
		
		leia.close();
		
		
	}

}
