package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GastosMensais {

	public static void main(String[] args) {
		// Uma empresa tem gastos mensais e a cada 3 meses realiza um balanço para verificar a media de gastos dos 3 meses. 
		//Faça um programa que receba os valores de cada mês e imprima na tela o valor total gasto no período e a media dos 
		//gastos.

		Scanner leia = new Scanner(System.in);
		
		
		double gastoMensal1;
		double gastoMensal2;
		double gastoMensal3;
		double balanco3Meses;
		
		System.out.println("Digite o valor gasto no Mês 1: ");
		gastoMensal1 = leia.nextDouble();
		System.out.println("Digite o valor gasto no Mês 2: ");
		gastoMensal2 = leia.nextDouble();
		System.out.println("Digite o valor gasto no Mês 3: ");
		gastoMensal3 = leia.nextDouble();
		
		balanco3Meses = (gastoMensal1 + gastoMensal2 + gastoMensal3)/3;
		DecimalFormat formatador = new DecimalFormat ("0.00");
		System.out.println("O Balanço mensal é = R$" + formatador.format(balanco3Meses));
		
		leia.close();
		
		
		
		
	}

}
