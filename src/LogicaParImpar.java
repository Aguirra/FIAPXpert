import java.util.Scanner;

public class LogicaParImpar {

	public static void main(String[] args) {
		//Objeto que captura o teclado do usu�rio 
		Scanner sc = new Scanner(System.in);
		
		//Cria��o de variaveis
		int primeiroValor, resultado;
		
		//Apresenta��o de conteudo *Intera��o com o usuario*
		System.out.println("*** Descobrir valor Par ou Impar ***");
		System.out.print("Digite um numero: ");
		
		//receber informa��o do usuario 
		primeiroValor = sc.nextInt();
		
		//Finaliza��o de captura de dados 
		sc.close();
		
		//formula para verificar Impar/Par
		resultado = primeiroValor % 2;
		
		//condi��o para verifica��o 
		if (resultado > 0) {
			System.out.println("Impar");
		}else {
			System.out.println("Par");
		}
		

	}

}
