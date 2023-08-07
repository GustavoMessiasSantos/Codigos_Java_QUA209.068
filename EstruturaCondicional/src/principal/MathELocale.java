package principal;


import java.util.Locale;
import java.util.Scanner;

public class MathELocale {

	public static void main(String[] args) {
		//atalho para importar bibliotecas ctrl + shift + o
		
		
		
	    //final Locale ponto = new Locale("en", "us");
		//função para usar o "." e não a "," em decimais
	    
	    Scanner leia = new Scanner(System.in);
		double altura = 0;
		double decimal = 10.3333333;
		
		//converter decimal para inteiro
		int numero = (int)decimal;
		
		
		//potencia
		System.out.println(Math.pow(2, 5));
		//maior numero entre 2 numeros ou variaveis
		System.out.println(Math.max(2, 10));
		//menor numero entre 2 numeros ou variaveis
		System.out.println(Math.min(2, 10));
		//obter a raiz quadrada
		System.out.println(Math.sqrt(16));
		//arredondar numeros
		System.out.println(Math.round(decimal));
		//numero Pi armazenado
		System.out.println(Math.PI);
		
		
		//formatação para casa decimal %.nf onde n é o número de casas
		System.out.printf("Resultado: %.2f\n" , decimal);
		
		System.out.println(numero);
		/*System.out.println("Entre com sua altura: ");
		altura = leia.useLocale(ponto).nextDouble();
		
		System.out.println("A altura digitada foi: " + altura);*/
		
		leia.close();
		
		
		

	}

}
