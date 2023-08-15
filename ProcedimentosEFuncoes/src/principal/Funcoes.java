package principal;

public class Funcoes {

	public static void main(String[] args) {
		/*
		 * Funções representam um processamento ou processo;
		 * o que identifica uma função são os parenteses
		 * System.out.println() é um exemplo de função/procedimento;		 *
		 */
		mostrarMensagem();
		mostrarMensagemComParametro(24);
		System.out.println(calcular());
		int recebeCalcular = calcular();
		System.out.println("Recebeu: " + recebeCalcular);
		
		System.out.println("Resultado da soma: " + soma(10, 20));
		
		
		int x = 10;
		int y = 100;	
		
		System.out.println("Nova soma: " + soma(x, y));
		
		int a = 50;;
		int b = 50;
		
		System.out.println("Nova soma: " + soma(b, a));

	}
	
	static void mostrarMensagem() {
		System.out.println("Minha primeira função");
	}
	static void mostrarMensagemComParametro(int idade) {
		System.out.println("Minha idade é: " + idade);
	}
	static int calcular() {
		int x = 10;
		int y = 5;
		return x + y;
	}
	static int soma(int x, int y) {
	return x + y;
	}

}
