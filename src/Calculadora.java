import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		//Criação dos objetos 
		Scanner teclado = new Scanner(System.in);
		//Variáveis para utilização da Aplicação
		int valor1, valor2;
		int soma, subtracao, multiplicacao; 
		double divisao; 
		
		//Inicio para interação com usuário 
		System.out.println("*** Calculadora ***");
		System.out.println("Este sistema realizara o calculo matematico de dois numeros \nque for digitado no uso da aplicacao.");
		
		System.out.println("Digite o Primeiro Valor: ");
		valor1 = teclado.nextInt();
		
		System.out.println("Digite o Segundo Valor: ");
		valor2 = teclado.nextInt();
		
		//Encerrando a entrada do Obj teclado
		teclado.close();
		
		//Realizando os calculos para impressão
		soma = valor1 + valor2;
		subtracao = valor1 - valor2;
		multiplicacao = valor1 * valor2;
		divisao = valor1 / (double) valor2;
		
		//Impressão dos valores 
		System.out.println("O resultado da SOMA de " + valor1 + " e " + valor2 +" é igual a " + soma + ".");
		System.out.println("O resultado da Subtração de " + valor1 + " e " + valor2 +" é igual a " + subtracao + ".");
		System.out.println("O resultado da Multiplicação de " + valor1 + " e " + valor2 +" é igual a " + multiplicacao + ".");
		System.out.println("O resultado da Divisão de " + valor1 + " e " + valor2 +" é igual a " + divisao + ".");
		
		
	}

}
