package entities;

public class TrianguloCorrecao {
	
	public int ladoA;
	public int ladoB;
	public int ladoC;
	
	public void obterTipoTriangulo() {
		if(ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Triângulo Equilátero");
		}else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.println("Triângulo Isóceles");
		}else {
			System.out.println("Triângulo Escaleno");
		}
	}

}
