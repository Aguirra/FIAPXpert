import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		//Cria��o dos objetos 
		Scanner teclado = new Scanner(System.in);
		//Vari�veis para utiliza��o da Aplica��o
		int valor1, valor2;
		int soma, subtracao, multiplicacao; 
		double divisao; 
		
		//Inicio para intera��o com usu�rio 
		System.out.println("*** Calculadora ***");
		System.out.println("Este sistema realizara o calculo matematico de dois numeros \nque for digitado no uso da aplicacao.");
		
		System.out.println("Digite o Primeiro Valor: ");
		valor1 = teclado.nextInt();
		
		System.out.println("Digite o Segundo Valor: ");
		valor2 = teclado.nextInt();
		
		//Encerrando a entrada do Obj teclado
		teclado.close();
		
		//Realizando os calculos para impress�o
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / (double) valor2;
		
		//Impress�o dos valores 
		System.out.println("O resultado da SOMA de " + valor1 + " e " + valor2 +" � igual a " + soma + ".");
		System.out.println("O resultado da Subtra��o de " + valor1 + " e " + valor2 +" � igual a " + subtracao + ".");
		System.out.println("O resultado da Multiplica��o de " + valor1 + " e " + valor2 +" � igual a " + multiplicacao + ".");
		System.out.println("O resultado da Divis�o de " + valor1 + " e " + valor2 +" � igual a " + divisao + ".");
		
		
	}

}
