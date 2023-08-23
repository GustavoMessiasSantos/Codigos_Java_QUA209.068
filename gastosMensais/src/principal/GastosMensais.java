package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GastosMensais {

	public static void main(String[] args) {
		// Uma empresa tem gastos mensais e a cada 3 meses realiza um balan�o para verificar a media de gastos dos 3 meses. 
		//Fa�a um programa que receba os valores de cada m�s e imprima na tela o valor total gasto no per�odo e a media dos 
		//gastos.

		Scanner leia = new Scanner(System.in);
		
		
		double gastoMensal1;
		double gastoMensal2;
		double gastoMensal3;
		double balanco3Meses;
		
		System.out.println("Digite o valor gasto no M�s 1: ");
		gastoMensal1 = leia.nextDouble();
		System.out.println("Digite o valor gasto no M�s 2: ");
		gastoMensal2 = leia.nextDouble();
		System.out.println("Digite o valor gasto no M�s 3: ");
		gastoMensal3 = leia.nextDouble();
		
		balanco3Meses = (gastoMensal1 + gastoMensal2 + gastoMensal3)/3;
		DecimalFormat formatador = new DecimalFormat ("0.00");
		System.out.println("O Balan�o mensal � = R$" + formatador.format(balanco3Meses));
		
		leia.close();
		
		
		
		
	}

}
