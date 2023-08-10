import java.util.Scanner;

public class NomeVetor {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int quantidade = 0;
		
		System.out.println("Quantos nomes deseja cadastras? ");
		quantidade = sc.nextInt();
		sc.nextLine();
		
		
		String[] nomes = new String[quantidade];
		
		for(int cont =0; cont<nomes.length; cont++) {
			System.out.println("Digite o nome: ");
			nomes[cont] = sc.nextLine();
		}
		for(String nome : nomes){
			System.out.println(nome);
		}
		
		
		
		sc.close();

	}

}
