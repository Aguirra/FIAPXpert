package FiapLogica;

import java.util.Scanner;

public class LogicaCondicional {

	public static void main(String[] args) {
		//variaveis
		int idadeDoUsuario;
		
		//Objeto que captura o teclado do usuário 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		idadeDoUsuario = sc.nextInt();
		
		//Verificar se o usuario é maior ou menor de idade
		if(idadeDoUsuario >= 18) {
			System.out.println("Você é maior de idade!!");
		}else {
			System.out.println("Você é menor de idade!!");
		}
		
	}

}
