package principal;

public class Diagonal {

	public static void main(String[] args) {
		// fazer uma matriz 3x3 ou 4x4, imprimir os numeros da diagonal dessa matriz;

		int matriz[][] = new int[4][4];

		int contador = 10;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = contador;
				if (i == j) {
					System.out.print(contador);
				} else {
					System.out.print("\t");
				}
			}
			contador++;
			System.out.println();
		}

	}
}