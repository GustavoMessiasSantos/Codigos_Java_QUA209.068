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
			System.out.println("Voc� est� reprovado!");
		}else if(mediaFinal >= 6 && mediaFinal < 7) {
			System.out.println("Voc� est� de recupera��o!");
		}else if(mediaFinal >= 7 && mediaFinal < 10) {
			System.out.println("Voc� est� aprovado!");
		}else if(mediaFinal == 10) {
			System.out.println("Voc� foi aprovado com honra!");
		}else {
			System.out.println("Voc� digitou algum n�mero errado!");
		}
		System.out.println("Sua m�dia foi: " + mediaFinal);
		
		
		leia.close();
		
		
	}

}
