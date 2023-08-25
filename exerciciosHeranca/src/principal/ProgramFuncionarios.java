package principal;

import java.util.Scanner;

import entities.Funcionarios;
import entities.FuncionariosChefia;

public class ProgramFuncionarios {

	public static void main(String[] args) {
		Funcionarios dados = new FuncionariosChefia(); // Utilizando a subclasse Chefia
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do funcionário? ");
        dados.setFuncionario(sc.nextLine());
        System.out.println("Qual o cargo do funcionário? ");
        dados.setCargo(sc.nextLine().toUpperCase());
        System.out.println("Qual a idade do funcionário? ");
        dados.setIdade(sc.nextInt());
        System.out.println("Qual o salário do funcionário?");
        dados.setSalario(sc.nextDouble());

        dados.dadosFuncionario();
		
		sc.close();
		

}
	}
