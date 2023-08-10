package principal;

public class Vetor {

	public static void main(String[] args) {
		// Vetor é uma sequência não ordenada de dados do mesmo tipo a contagem do vetor
		// é por indice e inicia do indice 0
		// Vetor não pode conter dados de tipos diferentes
		// Vetor também é conhecido como Array
		// Vetor é undimensional, uma direção
		// os dados do array são armazenados em um espço de memoria
		
		/*(xpto123) = 10, 20, 30, 40
		 * 
		 */
		int array = 5;
		String nome = "Gustavo";
		
		
		int[] numeros = new int[array];
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		//numeros[5] = 10;
		System.out.println(numeros[0]);
		
		for(int contador = 0; contador < numeros.length; contador++) {
			System.out.println("Dentro do for: " + numeros[contador]);
		}
		for (int numero : numeros) {
			System.out.println(numero);
		}

	}

}
