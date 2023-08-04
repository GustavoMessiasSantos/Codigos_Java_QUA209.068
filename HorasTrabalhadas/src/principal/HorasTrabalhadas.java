package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {
		//Faça um Programa que pergunte quanto você ganha por hora e o 
		//número de horas trabalhadas no mês. Calcule e mostre o total do 
		//seu salário no referido mês (sem descontos e impostos).
		
		Scanner leia = new Scanner(System.in);
		
		double horas;
		double salarioPorHora;
		double totalSalario;
		
		System.out.println("Quanto você ganha por hora?");
		horas = leia.nextDouble();
		System.out.println("Quantas horas você trabalhou essse mês?");
		salarioPorHora = leia.nextDouble();
		
		totalSalario = horas*salarioPorHora;
		DecimalFormat formatador = new DecimalFormat ("0.00");
		
		System.out.println("Seu salário esse mês é de R$" + formatador.format(totalSalario));
		
		
		leia.close();

	}

}
