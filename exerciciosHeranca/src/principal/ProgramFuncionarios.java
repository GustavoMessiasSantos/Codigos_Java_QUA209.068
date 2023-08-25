package principal;

import java.util.Scanner;

import entities.Funcionarios;
import entities.FuncionariosChefia;

public class ProgramFuncionarios {

	public static void main(String[] args) {
<<<<<<< HEAD
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
		
=======
	Dados dados = new Chefia(); // Utilizando a subclasse Chefia
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do funcionÃ¡rio? ");
        dados.setFuncionario(sc.nextLine());
        System.out.println("Qual o cargo do funcionÃ¡rio? ");
        dados.setCargo(sc.nextLine().toUpperCase());
        System.out.println("Qual a idade do funcionÃ¡rio? ");
        dados.setIdade(sc.nextInt());
        System.out.println("Qual o salÃ¡rio do funcionÃ¡rio?");
        dados.setSalario(sc.nextDouble());

        dados.dadosFuncionario();
>>>>>>> 38b6346ebf92a3bc00eb046060c981ce7e48883a

}
	}
