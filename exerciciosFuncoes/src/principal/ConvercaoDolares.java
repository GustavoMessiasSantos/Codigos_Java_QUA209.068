package principal;

import java.util.Scanner;

public class ConvercaoDolares {

	public static void main(String[] args) {
		//Fa�a um programa que receba um valor em real e converta para d�lares na cota��o atual,
		//fa�a o inverso tamb�m;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do dinheiro: ");
		double dinheiro = sc.nextDouble();
		System.out.println("Escolha a op��o D para d�lar ou R para Real");
		char opcao = sc.next().charAt(0);
		
		if(Character.toUpperCase(opcao) == 'R') {
			System.out.printf("O valor convertido em Real �: %.2f R$", dolar_real(dinheiro));
		}else if(Character.toUpperCase(opcao) == 'D') {
			System.out.printf("O valor convetido em D�lar �: %.2f U$", real_dolar(dinheiro));
		}else {
			while(Character.toUpperCase(opcao) != 'D' && Character.toUpperCase(opcao) != 'R') {
				System.out.println("Escolha a op��o D para d�lar ou R para Real");
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
