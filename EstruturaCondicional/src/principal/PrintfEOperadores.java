package principal;

public class PrintfEOperadores {

	public static void main(String[] args) {
		
		
		String nome = "Gustavo Messias";
		int idade = 24;
		double altura = 1.80;
		boolean verdadeiro = true;
		boolean falso = false;
		
		
		//para o tipo char usa %c
		System.out.printf("%s, tem %d anos, e sua altura �: %.2f\n", nome, idade, altura);
		
		/*operadores de compara��o
		 * > maior que
		 * < menor que
		 * >= maior ou igual a
		 * <= menor ou igual a
		 * != diferente
		 * == igual
		 */
		
		/*operadores l�gicos
		 *&& significa E
		 *|| significa OU
		 *! siginifica nega��o 
		 */
		// se == if
		// else == senao
		if(verdadeiro || falso) {
			System.out.println(10);
		}else {
			System.out.println(20);
		}
		
		char opcao = 's';
		int idade2 = 18;
		String diaSemana = "Sexta";
		
		// um unico if � uma estrutura simples
		//if e else tem uma estrutura composa
		// if else � uma estrutura em cadeia
		//podemos ter estruturas detro de cada if / if else
		
		if(opcao == 's' && idade2 >= 18) 
		{
			System.out.println("Pode entrar na festa!");
		}
		else 
		{
			System.out.println("Volta pra casa!");
		}
		
		
		if(diaSemana.equals("Segunda")) {

			System.out.println("Segunda-feira");
		}
		else if(diaSemana.equals("terca")) 
		{
			System.out.println("Ter�a-Feira");
		}
		else if(diaSemana.equals("Sexta")) 
		{
			System.out.println("Sexta-feira");
		}
		else 
		{
		System.out.println("N�o corresponde a um dia da semana!");
	}
		
		int diasSemana = 7;
		
		
		switch (diasSemana) {
		case  1:
			System.out.println("Domingo");
			break;
		case  2:
			System.out.println("Segunda");
			break;
		case  3:
			System.out.println("Ter�a");
			break;
		case  4:
			System.out.println("Quarta");
			break;
		case  5:
			System.out.println("Quinta");
			break;
		case  6:
			System.out.println("Sexta");
			break;
		case  7:
			System.out.println("S�bado");
			break;

		default:
			System.out.println("N�o corresponde a um dia da semana!");
			break;
		}
		
		
		
		
		
		
		
  }

}
