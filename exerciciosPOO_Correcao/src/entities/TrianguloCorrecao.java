package entities;

public class TrianguloCorrecao {
	
	public int ladoA;
	public int ladoB;
	public int ladoC;
	
	public void obterTipoTriangulo() {
		if(ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Tri�ngulo Equil�tero");
		}else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.println("Tri�ngulo Is�celes");
		}else {
			System.out.println("Tri�ngulo Escaleno");
		}
	}

}
