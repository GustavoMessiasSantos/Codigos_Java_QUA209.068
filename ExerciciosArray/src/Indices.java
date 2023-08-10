
public class Indices {

	public static void main(String[] args) {
		// *Faça um programa que mostre os índices de um array de 100 posições;

		
		
		int array = 100;
		
		int[] numeros = new int[array];
		
	
		
		for(int cont = 0; cont<array; cont++) {
			numeros[cont] = cont;
			System.out.println(numeros[cont]);
		}

	}

}
