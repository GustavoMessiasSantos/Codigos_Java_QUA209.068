package principal;

import java.util.Scanner;

public class SexoDaPessoa {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 char sexo;
		 System.out.println("Digite seu sexo: ");
		 sexo = leia.next().charAt(0);
		 
		 if(Character.toLowerCase(sexo) == 'm') {
			 System.out.println("O sexo escolhido foi Masculino");
			 }else if(Character.toLowerCase(sexo) == 'f') {
			 System.out.println("O sexo escolhido foi Feminino");
			 }else {
			 System.out.println("Você escolheu a opção errada!");
			 }
		 
		 leia.close();
		
		

	}

}
