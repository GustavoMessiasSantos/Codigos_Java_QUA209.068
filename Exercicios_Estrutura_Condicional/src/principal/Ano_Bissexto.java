package principal;

import java.util.Scanner;

public class Ano_Bissexto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int ano;
		
		ano = leia.nextInt();
		
		if(ano%4 == 0) {
			System.out.println("O ano � bissexto!");
		}else {
			System.out.println("O ano n�o � bissexto!");
		}
		
		
		leia.close();
		
		

	}

}
