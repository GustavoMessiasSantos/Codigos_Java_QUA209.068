package principal;
import java.util.Scanner;

public class DescontoCombustiveis {

	public static void main(String[] args) {
		//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		//até 20 litros, desconto de 3% por litro Álcool
		//acima de 20 litros, desconto de 5% por litro
		//até 20 litros, desconto de 4% por litro Gasolina
		//acima de 20 litros, desconto de 6% por litro
		
		Scanner sc = new Scanner(System.in);
		
		
		// Passo 1 definir as váriáveis.
		
		int opcao;
	    int litros;
	    double descontos;
	    
	    // passo 2 entrada de dados
	    
	    System.out.println("Escolha opção 1 para Álcool e opção 2 para Gasolina");
	    opcao = sc.nextInt();
	    System.out.println("Quantos litros você abasteceu?");
	    litros = sc.nextInt();
	    
	    //Passo 3 estrutura de condição para definir os descontos
	    if(opcao == 1 && litros>0 && litros<=20) {
	    	descontos = litros * 0.03;
	    	System.out.println("Seu desconto foi de: " + descontos + "% no preço do Álcool");
	    }else if(opcao == 1 && litros>20) {
	    	descontos = litros * 0.05;
	    	System.out.println("Seu desconto foi de: " + descontos + "% no preço do Álcool");
	    }else if (opcao == 2 && litros>0 && litros<=20) {
	    	descontos = litros * 0.04;
	    	System.out.println("Seu desconto foi de: " + descontos + "% no preço da Gasolina");
	    }else if (opcao == 2 && litros>20) {
	    	descontos = litros * 0.06;
	    	System.out.printf("Seu desconto foi de: %.2f no preço da Gasolina\n", descontos);
	    }else {
	    	System.out.println("Você digitou algo errado!");
	    }
		//Final do algoritmo
		
		sc.close();
		

	}

}
