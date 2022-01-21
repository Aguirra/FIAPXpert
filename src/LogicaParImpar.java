import java.util.Scanner;

public class LogicaParImpar {

	public static void main(String[] args) {
		//Objeto que captura o teclado do usuário 
		Scanner sc = new Scanner(System.in);
		
		//Criação de variaveis
		int primeiroValor, resultado;
		
		//Apresentação de conteudo *Interação com o usuario*
		System.out.println("*** Descobrir valor Par ou Impar ***");
		System.out.print("Digite um numero: ");
		
		//receber informação do usuario 
		primeiroValor = sc.nextInt();
		
		//Finalização de captura de dados 
		sc.close();
		
		//formula para verificar Impar/Par
		resultado = primeiroValor % 2;
		
		//condição para verificação 
		if (resultado > 0) {
			System.out.println("Impar");
		}else {
			System.out.println("Par");
		}
		

	}

}
