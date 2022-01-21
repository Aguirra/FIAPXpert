import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DesafioJokenpo {

	public static void main(String[] args) {

		JogoJokenpo();
	}

	public static void JogoJokenpo() {
		Random gerador = new Random();
		Scanner sc = new Scanner(System.in);
		
		int numeroGerado, numeroUsuario;
		String novaPartida;
		try {
			do {
				do {
					numeroGerado = gerador.nextInt(4);
				
				}while(numeroGerado == 0);

			System.out.println("----------------------------");
			System.out.println("      J O K E N P O         ");
			System.out.println("----------------------------");
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println("----------------------------");
			System.out.println("");
			System.out.println("Escolha um numero para Jogar");
			System.out.print("Qual a sua op��o: ");
			
			numeroUsuario = sc.nextInt();
			
			if (numeroUsuario != 1 && numeroUsuario != 2 && numeroUsuario != 3) {
				System.out.println("");
				System.out.println("----------------------------");
				System.out.println("Digite uma das op��es VALIDAS para Jogar !!");
				System.out.println("----------------------------");
				System.out.println("");
				JogoJokenpo();
			}
			
			ImpressaoSorteio(numeroUsuario, numeroGerado);

				System.out.println("");
				System.out.println(" Jogar Novamente?\n [S] para continuar.\n [N] para encerrar.");
				novaPartida = sc.next().toUpperCase();
			}while (novaPartida.contentEquals("S"));
			sc.close();

		}catch (InputMismatchException  error) {
			System.out.println("\nVoc� n�o pode Digitar Letras para Jogar!!!\nInicie o Jogo novamente!!!\n");
		}finally {
			System.out.println("");
			System.out.println("*** At� Mais!!!");
		}		
	}
	
	public static void ImpressaoSorteio (int valor1, int valor2) {
		if(valor1 == valor2){
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Empatou ***");
			System.out.println("");
			CorUsuario(valor1);
			CorMaquina(valor2);
			System.out.println("----------------------------");
		}else if(valor1 < valor2 && valor2 == 2){
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Voc� Perdeu :( ***");
			System.out.println("");
			CorUsuario(valor1);
			CorMaquina(valor2);
			System.out.println("----------------------------");
		}else if(valor1 < valor2 && valor2 < 3){
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Parab�ns Voc� � o Vencedor!!! :) ***");
			System.out.println("");
			CorUsuario(valor1);
			CorMaquina(valor2);
			System.out.println("----------------------------");
		}else if(valor1 < valor2 && valor2 == 3 && valor1 == 2){
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Voc� Perdeu :( ***");
			System.out.println("");
			CorUsuario(valor1);
			CorMaquina(valor2);
			System.out.println("----------------------------");
		}else if(valor1 < valor2 && valor2 == 1){
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Voc� Perdeu :( ***");
			System.out.println("");
			CorUsuario(valor1);
			CorMaquina(valor2);
			System.out.println("----------------------------");
		}else if(valor1 > valor2 && valor2 == 1 && valor1 == 2){
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Parab�ns Voc� � o Vencedor!!! :) ***");
			System.out.println("");
			CorUsuario(valor1);
			CorMaquina(valor2);
			System.out.println("----------------------------");
		}else if(valor1 > valor2 && valor2 == 1){
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Voc� Perdeu :( ***");
			System.out.println("");
			CorUsuario(valor1);
			CorMaquina(valor2);
			System.out.println("----------------------------");
		}
		else {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Parab�ns Voc� � o Vencedor!!! :) ***");
			System.out.println("");
			CorUsuario(valor1);
			CorMaquina(valor2);
			System.out.println("----------------------------");
		}
	}
	
	public static void CorUsuario(int valor1) {
		//SorteioUsuario
		switch (valor1) {
		case 1:
			System.out.println(" Voc� escolheu Pedra");
			break;
		case 2:
			System.out.println(" Voc� escolheu Papel");
			break;
		case 3:
			System.out.println(" Voc� escolheu Tesoura");
			break;
		}
	} 
	
	public static void CorMaquina(int valor1) {
		//SorteioMaquina
		switch (valor1) {
		case 1:
			System.out.println(" O Computador escolheu Pedra");
			break;
		case 2:
			System.out.println(" O Computador escolheu Papel");
			break;
		case 3:
			System.out.println(" O Computador escolheu Tesoura");
			break;
		}
	} 

}
