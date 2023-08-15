package principal;

import java.util.Scanner;

public class ConvercaoDolares {

	public static void main(String[] args) {
		//Faça um programa que receba um valor em real e converta para dólares na cotação atual,
		//faça o inverso também;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do dinheiro: ");
		double dinheiro = sc.nextDouble();
		System.out.println("Escolha a opção D para dólar ou R para Real");
		char opcao = sc.next().charAt(0);
		
		if(Character.toUpperCase(opcao) == 'R') {
			System.out.printf("O valor convertido em Real é: %.2f R$", dolar_real(dinheiro));
		}else if(Character.toUpperCase(opcao) == 'D') {
			System.out.printf("O valor convetido em Dólar é: %.2f U$", real_dolar(dinheiro));
		}else {
			while(Character.toUpperCase(opcao) != 'D' && Character.toUpperCase(opcao) != 'R') {
				System.out.println("Escolha a opção D para dólar ou R para Real");
				opcao = sc.next().charAt(0);
			}
		}
		
		
		
		
		
		sc.close();

	}
	static double dolar_real(double dolar) {
		return dolar * 4.99;
	}
	static double real_dolar(double real) {
		return real/4.99;
	}

}
