package FiapLogica;

import java.util.Scanner;

public class LogicaCondicional {

	public static void main(String[] args) {
		//variaveis
		int idadeDoUsuario;
		
		//Objeto que captura o teclado do usu�rio 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a sua idade? ");
		idadeDoUsuario = sc.nextInt();
		
		//Verificar se o usuario � maior ou menor de idade
		if(idadeDoUsuario >= 18) {
			System.out.println("Voc� � maior de idade!!");
		}else {
			System.out.println("Voc� � menor de idade!!");
		}
		
	}

}
