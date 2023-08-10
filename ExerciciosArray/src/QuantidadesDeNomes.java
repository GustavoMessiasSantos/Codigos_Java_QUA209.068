import java.util.Scanner;

public class QuantidadesDeNomes {

	public static void main(String[] args) {
		// Faça um programa que peça quantidade x de nomes e mostre os nomes inseridos;

		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[8];
		String nome;

		for (int cont = 0; cont < nomes.length; cont++) {
			System.out.println("Digite um nome: ");
			nome = sc.nextLine();
			nomes[cont] = nome;

		}
		for (int cont = 0; cont < nomes.length; cont++) {
			System.out.println("Os nomes Digitados foram: " + nomes[cont]);
		}
		sc.close();
	}

}
