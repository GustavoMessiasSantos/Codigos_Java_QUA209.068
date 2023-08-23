package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {
		//Fa�a um Programa que pergunte quanto voc� ganha por hora e o 
		//n�mero de horas trabalhadas no m�s. Calcule e mostre o total do 
		//seu sal�rio no referido m�s (sem descontos e impostos).
		
		Scanner leia = new Scanner(System.in);
		
		double horas;
		double salarioPorHora;
		double totalSalario;
		
		System.out.println("Quanto voc� ganha por hora?");
		horas = leia.nextDouble();
		System.out.println("Quantas horas voc� trabalhou essse m�s?");
		salarioPorHora = leia.nextDouble();
		
		totalSalario = horas*salarioPorHora;
		DecimalFormat formatador = new DecimalFormat ("0.00");
		
		System.out.println("Seu sal�rio esse m�s � de R$" + formatador.format(totalSalario));
		
		
		leia.close();

	}

}
