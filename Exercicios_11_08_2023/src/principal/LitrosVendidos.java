package principal;
import java.util.Scanner;

public class LitrosVendidos {

	public static void main(String[] args) {
		//Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel (codificado da
		//seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
	    //que o pre�o do litro da gasolina � R$ 5,80 e o pre�o do litro do �lcool � R$ 3,90. 
		
		
		Scanner sc = new Scanner(System.in);
		
		
		//Passo 1 entrada de dados;
		char combustivel;
		double litros;
		double totalPreco;
		
		//Passo 2 definir o que vai entrar nas vari�veis;
		
		System.out.println("Decida qual combustivel voc� deseja:");
		combustivel = sc.next().charAt(0);
		System.out.println("Quantos litros deseja abastecer?");
		litros = sc.nextDouble();
		//Passo 3 estrutura de condi��o para definir o tipo e valor do combustivel
		if(Character.toUpperCase(combustivel) == 'G') {
			totalPreco = (double)litros * 5.80;
			System.out.println("O total do valor � = " + totalPreco + " R$");
		}else if(Character.toUpperCase(combustivel) == 'A') {
			totalPreco = (double)litros * 3.90;
			System.out.println("O total do valor � = " + totalPreco + " R$");
		}else {
			System.out.println("Voc� escolheu a op��o errada!");
		}
		
		
		sc.close();

	}

}
