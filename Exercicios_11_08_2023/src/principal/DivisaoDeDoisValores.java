package principal;
import java.util.Scanner;

public class DivisaoDeDoisValores {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler 2 valores e se algum dos valores for zero n�o aceite, deve ser lido
		//um novo valor, imprimir o resultado da divis�o do primeiro valor lido pelo segundo valor lido. 
		//(utilize a estrutura de repeti��o que mais se adeque).
		
		
		Scanner sc = new Scanner(System.in);
		
		//passo 1 definir as vari�veis
		double valor1=0;
		double valor2=0;
		double divisao;
		
		//passo 2 montar a estrutura de repeti��o e condicional para fazer a divisao dos valores;
		do{
			System.out.print("Digite um valor: ");
			valor1 = sc.nextDouble();
			System.out.print("Digite um outro valor: ");
			valor2 = sc.nextDouble();
			divisao = valor1/valor2;
			if(valor2 == 0) {
				System.out.println("N�o existe divis�o por 0");
				break;
			}
		// passo 3 mostrar o resultado;	
			System.out.println("O resultado da divis�o �: " + divisao);
			
		}while(valor1>0 && valor2>0);
		// fim do algoritmo
		
		sc.close();
		
		

	}

}
