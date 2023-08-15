package principal;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		/*
		 * 2) Faça um programa que receba o salario e a quantidade de venda total que o
		 * vendedor fez no mes, e calcule o salario do mês. Há também o desconto de 5%
		 * de inss e 11% de IRPF sobre o salario bruto.
		 * 
		 * Se o vendedor possui o total de venda acima de 20 mil no mês, ele recebe uma
		 * bonificação de 5% sobre o valor das vendas;
		 * 
		 * Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma
		 * bonificação de 3% no valor da venda;
		 * 
		 * Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma
		 * bonificação de 1% no valor da venda;
		 * 
		 * Se o valor não passar de 10 mil, imprima uma frase motivacional;
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		double salario = sc.nextDouble();
		System.out.println("Digite seu total de vendas: ");
		double vendas = sc.nextDouble();
		
		System.out.printf("Seu salario com descontos e bonus foram de: %.2f R$ \n", salario_e_vendas(salario, vendas));
		System.out.printf("Suas vendas foram de: %.2f R$ \n", vendas);
		

		sc.close();
	}
	static double salario_e_vendas(double salario, double vendas) {
		double descontoINSS = 0;
		double descontoIRPF = 0;
		double bonificacao = 0;
		
		descontoINSS = salario * 0.05;
		descontoIRPF = salario * 0.11;
		
		if(vendas>20000) {
			bonificacao = salario*0.05;
		}else if(vendas>=15000 && vendas<=20000) {
			bonificacao = salario*0.03;
		}else if(vendas>=10000 && vendas<=15000) {
			bonificacao = salario*0.01;
		}else {
			System.out.println("Tente novamente próximo mês acredito em você!");
		}
		
		return salario + bonificacao - (descontoINSS + descontoIRPF);
		
	}

	

}
