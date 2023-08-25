package principal;

import java.util.Scanner;

import entities.Funcionarios;
import entities.FuncionariosChefia;

public class ProgramFuncionarios {

	public static void main(String[] args) {
		Funcionarios dados = new FuncionariosChefia(); // Utilizando a subclasse Chefia
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do funcion�rio? ");
        dados.setFuncionario(sc.nextLine());
        System.out.println("Qual o cargo do funcion�rio? ");
        dados.setCargo(sc.nextLine().toUpperCase());
        System.out.println("Qual a idade do funcion�rio? ");
        dados.setIdade(sc.nextInt());
        System.out.println("Qual o sal�rio do funcion�rio?");
        dados.setSalario(sc.nextDouble());

        dados.dadosFuncionario();
		
		sc.close();
		

}
	}
