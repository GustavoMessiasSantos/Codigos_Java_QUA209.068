
public class Indices {

	public static void main(String[] args) {
		// *Fa�a um programa que mostre os �ndices de um array de 100 posi��es;

		
		
		int array = 100;
		
		int[] numeros = new int[array];
		
	
		
		for(int cont = 0; cont<array; cont++) {
			numeros[cont] = cont;
			System.out.println(numeros[cont]);
		}

	}

}
