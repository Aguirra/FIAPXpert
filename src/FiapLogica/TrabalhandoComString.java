package FiapLogica;

import java.util.Scanner;


public class TrabalhandoComString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String emailDoUsuario;
		
		System.out.println("*** Verificando String ***");
		
		//System.out.print("Digite um email:");
		//emailDoUsuario = sc.next();
		//sc.close();
		
		do {
			
			
			System.out.print("Digite um email:");
			emailDoUsuario = sc.next();
			
			if(emailDoUsuario.contains("@")) {
				System.out.println("Email válido para cadastro.");
			}else {
				System.out.println("Email inválido para cadastro.\nFavor digitar um Email Válido!!!");
			}
		
		}while(emailDoUsuario.contains("@") == false);
		sc.close();
	}
	
	

}
