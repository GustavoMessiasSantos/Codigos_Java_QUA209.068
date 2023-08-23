package entities;

public class Terreno {
	
	public double comprimento;
	public double largura;
	public double area;
	
	public double metroQuadrado(double comprimento, double largura, double area) {
			area = comprimento * largura;
			return area;
	}
	
	

}
