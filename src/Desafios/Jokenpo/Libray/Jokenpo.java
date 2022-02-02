package Desafios.Jokenpo.Libray;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
	Random gerador = new Random();
	Scanner sc = new Scanner(System.in);
	
	private int numeroGerado, numeroUsuario, quantidadesPartidas;
	private String novaPartida;

	private int pontosUsuario = 0, pontosMaquina = 0, partidas = 1;

	public void IniciarJokenpo() {

		do {

			System.out.println("----------------------------");
			System.out.println("      J O K E N P O         ");
			System.out.println("----------------------------");
			System.out.println("");
			System.out.print("Quantas partidas gostaria de Jogar: ");
			quantidadesPartidas = sc.nextInt(); // indica a quantidade de partidas solicitada pelo usuario **29/01/2022
			System.out.println("");

			// int partidas = 1;

			// rotina para jogar (determinada pelo usuario) **29/01/2022
			while (partidas <= quantidadesPartidas) {
				System.out.println("");
				System.out.println(">>> Partida: " + partidas);
				System.out.println("");
				System.out.println("----------------------------");
				System.out.println("1 - Pedra");
				System.out.println("2 - Papel");
				System.out.println("3 - Tesoura");
				System.out.println("----------------------------");
				System.out.println("");
				System.out.print("Qual a sua op��o: ");

				numeroUsuario = sc.nextInt();

				// ** Corrigir este metodo para validar a jogada do usu�rio
				ValidaJogadaUsuario(numeroUsuario);

				int totalPontos = ImpressaoSorteio(numeroUsuario, SorteioMaquina());

				PontosJogadores(totalPontos);
				ValidacaoPlacar();
				ChecagemFinalJogo();
				partidas++;
			}

			// informar o Usuario vencedor
			JogadorVencedor();

			System.out.println("");
			System.out.println(" Jogar Novamente? (S/N)");
			novaPartida = sc.next();
			pontosMaquina = 0;
			pontosUsuario = 0;
			partidas = 1;

		} while (novaPartida.equalsIgnoreCase("s"));
		sc.close();

		System.out.println("At� Mais!!!");

	}

	int ImpressaoSorteio(int valor1, int valor2) {
		// altera��o **30/01/2022
		if (valor1 == valor2) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Empatou ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 2;
		} else if (valor1 < valor2 && valor2 == 2) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Voc� Perdeu :( ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 1;
		} else if (valor1 < valor2 && valor2 < 3) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Parab�ns Voc� � o Vencedor!!! :) ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 0;
		} else if (valor1 < valor2 && valor2 == 3 && valor1 == 2) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Voc� Perdeu :( ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 1;
		} else if (valor1 < valor2 && valor2 == 1) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Voc� Perdeu :( ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 1;
		} else if (valor1 > valor2 && valor2 == 1 && valor1 == 2) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Parab�ns Voc� � o Vencedor!!! :) ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 0;
		} else if (valor1 > valor2 && valor2 == 1) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Voc� Perdeu :( ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 1;
		} else {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Parab�ns Voc� � o Vencedor!!! :) ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 0;
		}
	}

	void OpcaoJogoUsuario(int valor1) {
		// SorteioUsuario
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

	void OpcaoJogoMaquina(int valor1) {
		// SorteioMaquina
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

	int SorteioMaquina() {
		// sorteio maquina para jogar **29/01/2022
		do {
			numeroGerado = gerador.nextInt(4);
		} while (numeroGerado == 0);

		return numeroGerado;
	}

	void ValidaJogadaUsuario(int numeroUsuario) {
		if (numeroUsuario != 1 && numeroUsuario != 2 && numeroUsuario != 3) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("Digite uma das op��es VALIDAS para Jogar !!");
			System.out.println("----------------------------");
			System.out.println("");
		}
	}

	void PontosJogadores(int valorPontua��o) {
		// Regra para pontua��o
		/*
		 * Usuario tera valor igual a 0 Maquina tera valor igual a 1 Caso receber um
		 * valor diferente dos apontados teremos um impate e ser� feita uma nova jogada
		 * essa nova jogada ser� independente da partida
		 */
		System.out.println();
		System.out.println("**** P L A C A R ****");
		if (valorPontua��o == 0) {
			// System.out.println(">> O Usuario fez ponto");
			pontosUsuario++;
			System.out.println("|-------------------------|");
			System.out.println("| Usu�rio: " + pontosUsuario + " | Maquina: " + pontosMaquina + " |");
			System.out.println("|-------------------------|");
		} else if (valorPontua��o == 1) {
			// System.out.println(">> A maquina fez ponto");
			pontosMaquina++;
			System.out.println("|-------------------------|");
			System.out.println("| Usu�rio: " + pontosUsuario + " | Maquina: " + pontosMaquina + " |");
			System.out.println("|-------------------------|");
		} else {
			System.out.println("Usu�rio e Maquina Empatou");
			System.out.println("|-------------------------|");
			System.out.println("| Usu�rio: " + pontosUsuario + " | Maquina: " + pontosMaquina + " |");
			System.out.println("|-------------------------|");
			// se tiver um empate acresentar uma partida bonus //***30/01/2022
			// partidas--;
		}

	}

	void ValidacaoPlacar() {
		/*
		 * verificar a quantidade de rodadas para saber se o jogo ser� ou n�o encerrado
		 * exemplo.. quantidade de rodadas totais = 3 estamos na primeira jogada ..
		 * ent�o continua, mas se for a segunda jogada e um dos dois j� tiverem dois
		 * pontos finalizar ***30/01/2022
		 * 
		 * 
		 * 
		 * 
		 * if (quantidadesPartidas == 3) { quantidadeFinalJogo = quantidadesPartidas -
		 * partidas; if (quantidadeFinalJogo == 1 && pontosUsuario > pontosMaquina) {
		 * System.out.println("Fim de Jogo o Usu�rio � o VENCEDOR!!!"); partidas =
		 * quantidadesPartidas; } else if (quantidadeFinalJogo == 1 && pontosUsuario <
		 * pontosMaquina) { System.out.println("Fim de Jogo Maquina � o VENCEDOR!!!");
		 * partidas = quantidadesPartidas; } } else if (quantidadesPartidas > 3) {
		 * quantidadeFinalJogo = quantidadesPartidas - partidas; if (quantidadeFinalJogo
		 * == 1 && pontosUsuario > pontosMaquina) {
		 * System.out.println("Fim de Jogo o Usu�rio � o VENCEDOR!!!"); partidas =
		 * quantidadesPartidas; } else if (quantidadeFinalJogo == 1 && pontosUsuario <
		 * pontosMaquina) { System.out.println("Fim de Jogo Maquina � o VENCEDOR!!!");
		 * partidas = quantidadesPartidas; } }
		 * 
		 * 
		 * 
		 * int quantidadeFinalJogo = 0; quantidadeFinalJogo = (quantidadesPartidas -
		 * partidas);
		 * 
		 * if (pontosUsuario > pontosMaquina && quantidadeFinalJogo == 1) { partidas++;
		 * }else if (pontosUsuario < pontosMaquina && quantidadeFinalJogo == 1) {
		 * partidas++; }
		 */

		if (pontosUsuario == quantidadesPartidas) {
			System.out.println("Fim de Jogo o Usu�rio � o VENCEDOR!!!");
		} else if (pontosMaquina == quantidadesPartidas) {
			System.out.println("Fim de Jogo Maquina � o VENCEDOR!!!");
		}

		if (partidas == quantidadesPartidas) {
			if (pontosUsuario == pontosMaquina) {
				System.out.println();
				System.out.println("*** D E S E M P A T E ***");
				partidas--;
			}
		}
	}

	void JogadorVencedor() {
		if (pontosMaquina > pontosUsuario) {
			System.out.println();
			System.out.println("|------------------------------|");
			System.out.println("|*** Maquina � o Campe�o !!!***|");
			System.out.println("|------------------------------|");
		} else {
			System.out.println();
			System.out.println("|------------------------------|");
			System.out.println("|*** Usu�rio � o Campe�o !!!***|");
			System.out.println("|------------------------------|");
		}
	}

	void ChecagemFinalJogo() {
		// codigo para verificar se um jogador estiver com a pontua��o maior que a
		// metade de jogos encerrar a partida como vitorioso
		/**/

		int valorFaltantesPartidas = 0;
		valorFaltantesPartidas = quantidadesPartidas / 2;

		if (pontosUsuario > valorFaltantesPartidas) {
			partidas = pontosUsuario + quantidadesPartidas;
		} else if (pontosMaquina > valorFaltantesPartidas) {
			partidas = pontosMaquina + quantidadesPartidas;
		}

	}
}
