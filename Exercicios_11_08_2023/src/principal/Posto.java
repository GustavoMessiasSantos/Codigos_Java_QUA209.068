package principal;
import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		/*
		 * ) Um posto está vendendo combustíveis com a seguinte tabela de descontos: até
		 * 20 litros, desconto de 3% por litro Álcool acima de 20 litros, desconto de 5%
		 * por litro
		 * 
		 * até 20 litros, desconto de 4% por litro Gasolina acima de 20 litros, desconto
		 * de 6% por litro
		 * 
		 * Escreva um algoritmo que leia o número de litros vendidos e o tipo de
		 * combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e
		 * imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
		 * gasolina é R$ 5,80 e o preço do litro do álcool é R$ 3,90.
		 */
		
		
		// criar variaveis para receber os valores dos combustiveis
		
		//Scanner para fazer a leitura dos dados que o usuário vai inserir
		Scanner sc = new Scanner(System.in);
		
		//criar variaveis para receber os valores dos combustiveis
		double valorGasolina = 5.80;
		double valorAlcool = 3.90;
		
		// criar uma variavel para receber a quantidade de litros
		double quantidadeDeLitros = 0;
		
		//variavel para receber qual o tipo do combustivel
		char tipoCombustivel;
		
		//variavel total a pagar ja com o desconto
		double totalAPagar = 0;
		
		//pedir para o usuario digitar a quantidade de litros
		//qual o tipo do combustivel, para saber o valor total a ser pago
		//validação para que o usuário não digite um combustivel invalido
		do {
		System.out.print("Entre com o combustivel (A/G): ");
		tipoCombustivel = sc.next().charAt(0);
		}while(Character.toUpperCase(tipoCombustivel) != 'G' && Character.toUpperCase(tipoCombustivel) != 'A');
		
		//atualizar o valor da variavel para UpperCase, igual no bloco while
		tipoCombustivel = Character.toUpperCase(tipoCombustivel);
		
		// pedir a quantidade de litros que foram abastecidos
		//validar a quantidade de litros, não pode ser zero nem negativo
		do {
		System.out.print("Quantos litros foram abastecidos? ");
		quantidadeDeLitros= sc.nextDouble();
		}while(quantidadeDeLitros <= 0);
		
		//fazer o calculo do desconto com base na quantidade de litros que foi abastecido e o tipo do combustivel
		if(tipoCombustivel == 'G') {
			if(quantidadeDeLitros<=20) {
				totalAPagar = (quantidadeDeLitros * valorGasolina);
				totalAPagar =  totalAPagar - (totalAPagar * 0.04);
				System.out.print("Total a Pagar com o desconto = " + totalAPagar);
			}else {
				totalAPagar = (quantidadeDeLitros * valorGasolina);
				totalAPagar =  totalAPagar - (totalAPagar * 0.06);
				System.out.print("Total a Pagar com o desconto = " + totalAPagar);
			}
		}if(tipoCombustivel == 'A') {
			if(quantidadeDeLitros<=20) {
				totalAPagar = (quantidadeDeLitros * valorAlcool);
				totalAPagar =  totalAPagar - (totalAPagar * 0.03);
				System.out.print("Total a Pagar com o desconto = " + totalAPagar);
			}else {
				totalAPagar = (quantidadeDeLitros * valorAlcool);
				totalAPagar =  totalAPagar - (totalAPagar * 0.05);
				System.out.print("Total a Pagar com o desconto = " + totalAPagar);
			}
		}
		
		
		
		sc.close();

	}

}
