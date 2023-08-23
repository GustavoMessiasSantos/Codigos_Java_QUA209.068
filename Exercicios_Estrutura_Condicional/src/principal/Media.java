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
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite sua terceira nota: ");
		nota3 = leia.nextDouble();
		System.out.println("Digite sua quarta nota: ");
		nota4 = leia.nextDouble();
		
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		if(mediaFinal <= 6) {
			System.out.println("Você está reprovado!");
		}else if(mediaFinal >= 6 && mediaFinal < 7) {
			System.out.println("Você está de recuperação!");
		}else if(mediaFinal >= 7 && mediaFinal < 10) {
			System.out.println("Você está aprovado!");
		}else if(mediaFinal == 10) {
			System.out.println("Você foi aprovado com honra!");
		}else {
			System.out.println("Você digitou algum número errado!");
		}
		System.out.println("Sua média foi: " + mediaFinal);
		
		
		leia.close();
		
		
	}

}
