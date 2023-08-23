package principal;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// fazer uma matriz 4x5 para inserir nome e as 4 notas do aluno, não precisa mostrar a média.
		
		Scanner sc = new Scanner(System.in);
		
		String[][] alunos = new String[4][5];
		
		/*alunos[0][0] = "Gustavo";
		alunos[0][1] = "10";
		alunos[0][2] = "8";
		alunos[0][3] = "7.75";
		alunos[0][4] = "8";
		
		alunos[1][0] = "Robson";
		alunos[1][1] = "10";
		alunos[1][2] = "6";
		alunos[1][3] = "7.75";
		alunos[1][4] = "7";
		
		alunos[2][0] = "Jose";
		alunos[2][1] = "9";
		alunos[2][2] = "8";
		alunos[2][3] = "6";
		alunos[2][4] = "6";
		
		alunos[3][0] = "Debora";
		alunos[3][1] = "9";
		alunos[3][2] = "9";
		alunos[3][3] = "9";
		alunos[3][4] = "5";*/
		
		
		
		for(int i = 0; i<alunos.length; i++) {
			for(int j = 0; j<alunos[i].length; j++) {
				if(j == 0) {
					System.out.print("Digite o nome do aluno: ");
					alunos[i][j] = sc.nextLine();
				}else {
					System.out.printf("Digite a %d nota do aluno: ", (j));
					alunos[i][j] = sc.nextLine();
				}
				
			}
			System.out.println();
		}
		for(int i = 0; i<alunos.length; i++) {
			for(int j = 0; j<alunos[i].length; j++) {
				System.out.print(alunos[i][j] + "\t");
				}
			System.out.println();
			}
		
		sc.close();

	}

}
