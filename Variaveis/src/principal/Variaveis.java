package principal;

public class Variaveis {

	public static void main(String[] args) {

		int numero;
		numero = 10;
		double decimal = 10.50;

		int testeNumero = (int) 50.25;
		double testeNovoNumero = 10;

		// aspas duplas para strings
		String nome = "Gustavo Messias Santos";
		// aspas simples para char
		char sexo = 'M';
		// booleanos = valores verdadeiros ou falsos
		boolean verdadeiro = true;
		boolean falso = false;

		double peso = 100.00;
		int idade = 24;

		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(testeNumero);
		System.out.println(testeNovoNumero);
		System.out.println(nome);
		System.out.println(sexo);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.print("nome: ");
		System.out.println("Gustavo M");

		// para organizar o codigo usamos o:
		// ctrl + shift + f
		System.out.println("*****************************");
		System.out.print(
				"Meu nome �: " + nome + ", tenho " + idade + " anos de idade " + "e peso cerca de: " + peso + " kg");
		System.out.println(", Sou do sexo " + sexo);

	}

}
