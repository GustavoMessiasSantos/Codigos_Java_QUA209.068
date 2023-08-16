package principal;

import java.util.Scanner;

public class ConversorDeMoeda {

	public static void main(String[] args) {
		//Correção do exercício de ontem
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor em real" + " Para ser convertido em dólar:");
		
		double real = sc.nextDouble();
		
		System.out.printf("\nValor em dolar é: %.2f U$", converterParaDolar(real));
		
		System.out.println("\nEntre com o valor em dolar" + " Para ser convertido em real:");
		
		double dolar = sc.nextDouble();
		
		System.out.printf("\nO valor em real é: %.2f R$", converterParaReal(dolar));
		
		sc.close();

	}
	static double converterParaDolar(double real) {
		return real / 4.99;
	}
	static double converterParaReal(double dolar) {
		return dolar * 4.99;
	}


}
