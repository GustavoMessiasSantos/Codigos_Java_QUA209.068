package entities;

public class Numeros {

	public int A;
	public int B;
	public int C;

	public int EquacaoSegundoGrau(int A, int B, int C) {
		int delta = 0;
		int x1 = 0;
		
		delta = -(B*B) - 4 * A * C;
		x1 = (-B + delta)/2*A;
		return x1;
	
	}	


}