package principal;

import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();
		
		pessoa.setNome("Gustavo");
		pessoa.setAltura(1.80);
		pessoa.setCpf("000.000.000-00");
		pessoa.setGenero("Masculino");
		pessoa.setIdade(19);
		
		System.out.println(pessoa);
		System.out.println("\n***************************\n");
		System.out.println("Dados Pessoais do Trabalhador Empresa");
		
		funcionario.setNome("Gustavo");
		funcionario.setAltura(1.80);
		funcionario.setCpf("000.000.000-00");
		funcionario.setGenero("Masculino");
		funcionario.setIdade(19);
		funcionario.setSalario(1200.00);
		funcionario.setEmpresa("Feira da Parangaba");
		System.out.println(funcionario);
		System.out.println("\n***************************");

	}

}
