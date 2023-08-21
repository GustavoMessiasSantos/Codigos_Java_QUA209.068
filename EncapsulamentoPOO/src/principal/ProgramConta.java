package principal;

import java.util.Scanner;

import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		conta.setTitular("Gustavo");
		//System.out.println("Nome do Titular: " + conta.getTitular());
		conta.setAgencia("2561-x");
		conta.setNumeroConta(6610);
		//conta.setSaldo(50.00); não funciona mais
		
		conta.depositar(800.00);

		conta.obterdaDadosBancarios();
		
		conta.sacar(500.00);
		
		conta.obterdaDadosBancarios();
		
		sc.close();

	}

}
