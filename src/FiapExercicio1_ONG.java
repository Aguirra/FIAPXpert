import java.util.Scanner;

public class FiapExercicio1_ONG {

	public static void main(String[] args) {
		//Impressão para apresentação do exercicio
		/*
		 * Ocasionalmente a ONG para a qual você trabalha recebe doações em 
		 * dólar e precisa saber qual é o valor em reais. 
		 * Crie um programa que permita que o usuário digite o valor da doação em dólares, 
		 * coverta esse valor para reais e exiba o resultado na tela.
		 *
		 */
		
		System.out.println("*** FIAP XpertJava ***");
		System.out.println("Ocasionalmente a ONG para a qual você trabalha recebe doações em \n"
				+ "dólar e precisa saber qual é o valor em reais. \n"
				+ "Crie um programa que permita que o usuário digite o valor da doação em dólares,\n"
				+ "coverta esse valor para reais e exiba o resultado na tela.\n");
		
		//Criação de Objetos para uso na aplicação
		Scanner teclado = new Scanner(System.in);
		
		//Criação de variaveis 
		double valorDoacao, valorDolarCotacao, resultado;
		
		System.out.println("*** CONVERSOR DE MOEDAS ***");
		System.out.print("Digite o valor para a doação: ");
		valorDoacao = teclado.nextDouble();
		
		System.out.print("Informe o Valor atual do Dolar: ");
		valorDolarCotacao = teclado.nextDouble();
		
		//encerrando Leitor
		teclado.close();
		
		//realizando calculo
		resultado = valorDoacao * valorDolarCotacao;
		
		//Impressão para resultado
		System.out.println("O valor em Real da doação é : R$ " + String.format("%.2f", resultado));
		
	}

}
