package entities;

public class Carro {

	private String modelo;
	private int ano;
	private String cor;
	private String motor;
	private String cambio;
	private int velocidade;
	public char aceleracao;

	public void VelocidadeKMpH() {
		if (Character.toUpperCase(aceleracao) == 'A') {
			velocidade += 10;
			System.out.println(velocidade + "Km/h");
		} else if (Character.toUpperCase(aceleracao) == 'F') {
			velocidade -= 10;
			System.out.println(velocidade + "Km/h");
		}
	}

	public void StatusCarro() {
		System.out.println(modelo);
		System.out.println(cor);
		System.out.println(motor);
		System.out.println(cambio);
		System.out.println(ano);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocide) {
		this.velocidade = velocide;
	}

}
