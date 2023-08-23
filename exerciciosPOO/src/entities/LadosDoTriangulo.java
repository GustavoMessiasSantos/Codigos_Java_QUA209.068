package entities;

public class LadosDoTriangulo {
	
	public int A;
	public int B;
	public int C;
	
	public void tipoTriangulo() {
		if(A + B > C && A + C > B && B + C > A) {
			if(A == B && A == C) {
				System.out.println("Equilatero");
			}else if(A == B || A == C || B == C) {
				System.out.println("Isoceles");
			}else {
				System.out.println("Escaleno");
			}
		}else {
			System.out.println("Os três lados não formam triângulo");
		}
	}

}
