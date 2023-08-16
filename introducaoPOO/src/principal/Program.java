package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		//Conceito de carros
		//caracteristicas(atributos)
		//exemplo de comportamentos acelerar, freiar, ascender farois...
		//comportamentos(metodos/função)
		//classes tem muitos recursos como:
		//sobrecarga de metodos e construtores
		//4 pilares podem ser aplicados
		//entities(entidades do sistema) de acordo com a modelagem de negocios:
		//carro, pessoa, endereço....
		//services: clienteServices, E-mail services...
		//controllers
		//utilitarias: Math
		//classe é um molde para o objeto
		
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		Carro carroPopular = new Carro();
		
		carro.modelo = "celta";
		carro.ano = "2010";
		carro.placa = "xpt-2023";
		carro.cor = "azul";
		
		carroPopular.modelo = "gol";
		carroPopular.cor = "cor";
		
		/*carroPopular.ano = sc.nextLine();
		
		System.out.println(carro.ano);
		System.out.println(carroPopular.ano);*/
		
		System.out.println(carro.acelerar);
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		
		System.out.println(carro.acelerar);
		carro.acelerar = 10;
		
		System.out.println(carro.acelerar);
	}

}
