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
				System.out.print("Qual a sua opção: ");

				numeroUsuario = sc.nextInt();

				// ** Corrigir este metodo para validar a jogada do usuário
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

		System.out.println("Até Mais!!!");

	}

	int ImpressaoSorteio(int valor1, int valor2) {
		// alteração **30/01/2022
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
			System.out.println("*** Você Perdeu :( ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 1;
		} else if (valor1 < valor2 && valor2 < 3) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Parabêns Você é o Vencedor!!! :) ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 0;
		} else if (valor1 < valor2 && valor2 == 3 && valor1 == 2) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Você Perdeu :( ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 1;
		} else if (valor1 < valor2 && valor2 == 1) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Você Perdeu :( ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 1;
		} else if (valor1 > valor2 && valor2 == 1 && valor1 == 2) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Parabêns Você é o Vencedor!!! :) ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 0;
		} else if (valor1 > valor2 && valor2 == 1) {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Você Perdeu :( ***");
			System.out.println("");
			OpcaoJogoUsuario(valor1);
			OpcaoJogoMaquina(valor2);
			System.out.println("----------------------------");
			return 1;
		} else {
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("*** Parabêns Você é o Vencedor!!! :) ***");
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
			System.out.println(" Você escolheu Pedra");
			break;
		case 2:
			System.out.println(" Você escolheu Papel");
			break;
		case 3:
			System.out.println(" Você escolheu Tesoura");
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
			System.out.println("Digite uma das opções VALIDAS para Jogar !!");
			System.out.println("----------------------------");
			System.out.println("");
		}
	}

	void PontosJogadores(int valorPontuação) {
		// Regra para pontuação
		/*
		 * Usuario tera valor igual a 0 Maquina tera valor igual a 1 Caso receber um
		 * valor diferente dos apontados teremos um impate e será feita uma nova jogada
		 * essa nova jogada será independente da partida
		 */
		System.out.println();
		System.out.println("**** P L A C A R ****");
		if (valorPontuação == 0) {
			// System.out.println(">> O Usuario fez ponto");
			pontosUsuario++;
			System.out.println("|-------------------------|");
			System.out.println("| Usuário: " + pontosUsuario + " | Maquina: " + pontosMaquina + " |");
			System.out.println("|-------------------------|");
		} else if (valorPontuação == 1) {
			// System.out.println(">> A maquina fez ponto");
			pontosMaquina++;
			System.out.println("|-------------------------|");
			System.out.println("| Usuário: " + pontosUsuario + " | Maquina: " + pontosMaquina + " |");
			System.out.println("|-------------------------|");
		} else {
			System.out.println("Usuário e Maquina Empatou");
			System.out.println("|-------------------------|");
			System.out.println("| Usuário: " + pontosUsuario + " | Maquina: " + pontosMaquina + " |");
			System.out.println("|-------------------------|");
			// se tiver um empate acresentar uma partida bonus //***30/01/2022
			// partidas--;
		}

	}

	void ValidacaoPlacar() {
		/*
		 * verificar a quantidade de rodadas para saber se o jogo será ou não encerrado
		 * exemplo.. quantidade de rodadas totais = 3 estamos na primeira jogada ..
		 * então continua, mas se for a segunda jogada e um dos dois já tiverem dois
		 * pontos finalizar ***30/01/2022
		 * 
		 * 
		 * 
		 * 
		 * if (quantidadesPartidas == 3) { quantidadeFinalJogo = quantidadesPartidas -
		 * partidas; if (quantidadeFinalJogo == 1 && pontosUsuario > pontosMaquina) {
		 * System.out.println("Fim de Jogo o Usuário é o VENCEDOR!!!"); partidas =
		 * quantidadesPartidas; } else if (quantidadeFinalJogo == 1 && pontosUsuario <
		 * pontosMaquina) { System.out.println("Fim de Jogo Maquina é o VENCEDOR!!!");
		 * partidas = quantidadesPartidas; } } else if (quantidadesPartidas > 3) {
		 * quantidadeFinalJogo = quantidadesPartidas - partidas; if (quantidadeFinalJogo
		 * == 1 && pontosUsuario > pontosMaquina) {
		 * System.out.println("Fim de Jogo o Usuário é o VENCEDOR!!!"); partidas =
		 * quantidadesPartidas; } else if (quantidadeFinalJogo == 1 && pontosUsuario <
		 * pontosMaquina) { System.out.println("Fim de Jogo Maquina é o VENCEDOR!!!");
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
			System.out.println("Fim de Jogo o Usuário é o VENCEDOR!!!");
		} else if (pontosMaquina == quantidadesPartidas) {
			System.out.println("Fim de Jogo Maquina é o VENCEDOR!!!");
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
			System.out.println("|*** Maquina é o Campeão !!!***|");
			System.out.println("|------------------------------|");
		} else {
			System.out.println();
			System.out.println("|------------------------------|");
			System.out.println("|*** Usuário é o Campeão !!!***|");
			System.out.println("|------------------------------|");
		}
	}

	void ChecagemFinalJogo() {
		// codigo para verificar se um jogador estiver com a pontuação maior que a
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
