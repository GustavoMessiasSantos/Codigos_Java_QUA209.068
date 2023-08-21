package principal;

import java.util.Scanner;

import entities.Carro;

public class ProgramCarro {

	public static void main(String[] args) {
		// 1) crie um programa que receba os dados de um carro com os seguintes
		// atributos:
		// modelo, ano, cor, motor, cambio e velocidade
		// e os métodos para aumentar e diminuir a velocidade; use scanner
		
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.println("Digite o modelo do carro: ");
		carro.setModelo(sc.nextLine());
		System.out.println("Digite a cor do carro: ");
		carro.setCor(sc.nextLine());
		System.out.println("Digite o cambio do carro: ");
		carro.setCambio(sc.nextLine());
		System.out.println("Digite agora o motor do carro: ");
		carro.setMotor(sc.nextLine());
		System.out.println("Digite o ano do carro: ");
		carro.setAno(sc.nextInt());
		carro.StatusCarro();
		
		System.out.println("Escolha A/F para acelerar ou freiar: ");
		carro.aceleracao = sc.next().charAt(0);
		carro.VelocidadeKMpH();
		while(Character.toUpperCase(carro.aceleracao) == 'A' || Character.toUpperCase(carro.aceleracao) == 'F') {
		System.out.println("Escolha A/F para acelerar ou freiar: ");
		carro.aceleracao = sc.next().charAt(0);
		carro.VelocidadeKMpH();
		}

		sc.close();

	}

}
