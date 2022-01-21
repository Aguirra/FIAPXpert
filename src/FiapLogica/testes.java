package FiapLogica;

import java.util.Scanner;

public class testes {

	public static void main(String[] args) {
		//JogarNovamente();

	}
	public static void JogarNovamente() {
		Scanner entrada = new Scanner(System.in);
		String novaPartida;
		try {
			do {
				
				System.out.println("");
				System.out.println("Jogar Novamente?\n[S] para continuar.\n[N] para encerrar.");
				novaPartida = entrada.next().toUpperCase();
			}while (novaPartida.contentEquals("S"));
			entrada.close();
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
