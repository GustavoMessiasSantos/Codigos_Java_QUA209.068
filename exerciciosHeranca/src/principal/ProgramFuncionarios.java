package principal;

import java.util.Scanner;

import entities.Funcionarios;
import entities.FuncionariosChefia;

public class ProgramFuncionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionarios funcionarios = new Funcionarios();
		FuncionariosChefia fc = new FuncionariosChefia();
		
		System.out.println("Digite seu nome: ");
		fc.setNome(sc.nextLine());
		System.out.println("Digite seu cargo: ");
		fc.setCargo(sc.nextLine());
		System.out.println("Digite sua idade: ");
		fc.setIdade(sc.nextInt());
		System.out.println("Digite seu salario: ");
		fc.setSalario(sc.nextDouble());
		
		fc.informacoesFuncionario();
		
		sc.close();
		

}
	}
