import java.util.Scanner;

public class FiapExercicio1_ONG {

	public static void main(String[] args) {
		//Impress�o para apresenta��o do exercicio
		/*
		 * Ocasionalmente a ONG para a qual voc� trabalha recebe doa��es em 
		 * d�lar e precisa saber qual � o valor em reais. 
		 * Crie um programa que permita que o usu�rio digite o valor da doa��o em d�lares, 
		 * coverta esse valor para reais e exiba o resultado na tela.
		 *
		 */
		
		System.out.println("*** FIAP XpertJava ***");
		System.out.println("Ocasionalmente a ONG para a qual voc� trabalha recebe doa��es em \n"
				+ "d�lar e precisa saber qual � o valor em reais. \n"
				+ "Crie um programa que permita que o usu�rio digite o valor da doa��o em d�lares,\n"
				+ "coverta esse valor para reais e exiba o resultado na tela.\n");
		
		//Cria��o de Objetos para uso na aplica��o
		Scanner teclado = new Scanner(System.in);
		
		//Cria��o de variaveis 
		double valorDoacao, valorDolarCotacao, resultado;
		
		System.out.println("*** CONVERSOR DE MOEDAS ***");
		System.out.print("Digite o valor para a doa��o: ");
		valorDoacao = teclado.nextDouble();
		
		System.out.print("Informe o Valor atual do Dolar: ");
		valorDolarCotacao = teclado.nextDouble();
		
		//encerrando Leitor
		teclado.close();
		
		//realizando calculo
		resultado = valorDoacao * valorDolarCotacao;
		
		//Impress�o para resultado
		System.out.println("O valor em Real da doa��o � : R$ " + String.format("%.2f", resultado));
		
	}

}
