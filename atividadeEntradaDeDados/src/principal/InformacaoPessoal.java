package principal;

import java.util.Scanner;

public class InformacaoPessoal {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		double peso;
		double altura;
		char sexo;
		
		System.out.println("Informe o seu nome:");
		nome = leia.nextLine();
		System.out.println("Informe o seu peso:");
		peso = leia.nextDouble();
		System.out.println("Informe sua altura:");
		altura = leia.nextDouble();
		System.out.println("Informe o seu sexo:");
		sexo = leia.next().charAt(0);
		
		System.out.println("O nome informado foi: " + nome);
		System.out.println("O peso informado foi: " + peso);
		System.out.println("A altura informado foi: " + altura);
		System.out.println("O sexo informado foi: " + sexo);
		
		

	}

}
