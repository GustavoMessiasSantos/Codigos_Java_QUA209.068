package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		// Listas trabralham com dados do mesmo tipo
		// Uma lista é um tipo generico de uma collection
		// uma lista é uma coleção de dados

		ArrayList<String> nomes = new ArrayList<>();

		String nome1 = "Adcionado por ultimo";

		nomes.add("Gustavo");
		nomes.add("Roberto");
		nomes.add("Larissa");
		nomes.add("Marcelo");
		nomes.add(nome1);

		System.out.println(nomes);

		System.out.println(nomes.get(4));

		nomes.remove(1);

		System.out.println(nomes);

		System.out.println("Imprimindo com forEach: ");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("Imprimindo com for: ");
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		System.out.println("Imprimindo com expressão lambda: ");

		// pesquisem sobre expressão lambda
		nomes.forEach(nome -> System.out.println(nome));
		
	    System.out.println("Imprimindo ordenadamente: ");
	    Collections.sort(nomes);
	    
	
	}
}
