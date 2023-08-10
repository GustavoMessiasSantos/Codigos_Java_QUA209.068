import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		// Faça um programa que receba o nome do aluno e as 4 notas bimestrais desse
		// aluno,
		// mostre a media e se foi aprovado (>=7) ou reprovado(<7);

		Scanner sc = new Scanner(System.in);

		double[] notas = new double[4];
		
		System.out.println("Entre com o nome do aluno: ");
		String nome = sc.nextLine();
		
		
		for(int cont = 0; cont<notas.length; cont++) {
			System.out.println("Entre com a nota: ");
			notas[cont] = sc.nextDouble();
		}
		double media = (notas[0] + notas[1] + notas[2] + notas[3])/4;
		System.out.printf("A media do %s é %.2f", nome, media);
		
		
		
		sc.close();

	}

}
