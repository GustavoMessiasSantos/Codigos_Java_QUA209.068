package principal;
import java.util.Scanner;

public class TimesDeFutebol {

	public static void main(String[] args) {
		// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
		// do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
		
		
		Scanner sc = new Scanner(System.in);
		
		// Passo 1 definir as variáveis do Algoritmo
		
		String time1;
		String time2;
		int gol1;
		int gol2;
		
		// Passo 2 entrada de dados do Algoritmo
		System.out.println("Escreva o nome do Primeiro time: ");
		time1 = sc.nextLine();
		System.out.println("Escreva o numero de gols do primeiro time:");
		gol1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Escreva o nome do segundo time: ");
		time2 = sc.nextLine();
		
		System.out.println("Escreva o numero de gols segundo time: ");
		gol2 = sc.nextInt();
		
		// Passo 3 estrutura condicional para definir o vencedor da partida!
		
		if(gol1>gol2) {
			System.out.println(time1 + " Venceu o " + time2 + " por " + gol1 + 'x' + gol2 );
		}else if(gol1 == gol2) {
			System.out.println(time1 + " x " + time2 + " Empataram em " + gol1 + 'x' + gol2);
		}else {
			System.out.println(time2 + " Venceu o " + time1 + " por " + gol2 + 'x' + gol1);
		}
		
		// Final do programa
		
		
		sc.close();


	}

}
