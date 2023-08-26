package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ProgramPessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> pessoas = new ArrayList<>();
		
		System.out.println("Digite um nome: ");
		String pessoa1 = sc.nextLine();
		System.out.println("Digite um nome: ");
		String pessoa2 = sc.nextLine();
		System.out.println("Digite um nome: ");
		String pessoa3 = sc.nextLine();
		System.out.println("Digite um nome: ");
		String pessoa4 = sc.nextLine();
		System.out.println("Digite um nome: ");
		String pessoa5 = sc.nextLine();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		pessoas.add(pessoa5);
		
		Collections.sort(pessoas, String.CASE_INSENSITIVE_ORDER);
		System.out.println(pessoas);
		
		
		sc.close();
		
		
		
		
		

	}

}
