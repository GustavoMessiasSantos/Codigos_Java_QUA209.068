package principal;
import java.util.Scanner;

public class LitrosVendidos {

	public static void main(String[] args) {
		//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
		//seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
	    //que o preço do litro da gasolina é R$ 5,80 e o preço do litro do álcool é R$ 3,90. 
		
		
		Scanner sc = new Scanner(System.in);
		
		
		//Passo 1 entrada de dados;
		char combustivel;
		double litros;
		double totalPreco;
		
		//Passo 2 definir o que vai entrar nas variáveis;
		
		System.out.println("Decida qual combustivel você deseja:");
		combustivel = sc.next().charAt(0);
		System.out.println("Quantos litros deseja abastecer?");
		litros = sc.nextDouble();
		//Passo 3 estrutura de condição para definir o tipo e valor do combustivel
		if(Character.toUpperCase(combustivel) == 'G') {
			totalPreco = (double)litros * 5.80;
			System.out.println("O total do valor é = " + totalPreco + " R$");
		}else if(Character.toUpperCase(combustivel) == 'A') {
			totalPreco = (double)litros * 3.90;
			System.out.println("O total do valor é = " + totalPreco + " R$");
		}else {
			System.out.println("Você escolheu a opção errada!");
		}
		
		
		sc.close();

	}

}
