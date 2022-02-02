package br.com.fiap.aula27012022.switchs;

import java.util.Scanner;

public class TesteSwitch {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		System.out.print("Digite um numero Inteiro de 1 a 5: ");
		
		opcao = leitor.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu o numero 1!");
			break;
		case 2:
			System.out.println("Você escolheu o numero 2!");
			break;
		case 3:
			System.out.println("Você escolheu o numero 3!");
			break;
		case 4:
			System.out.println("Você escolheu o numero 4!");
			break;
		case 5:
			System.out.println("Você escolheu o numero 5!");
			break;
		default:
			System.out.println("Escolha errada! Finalizado no Default!");
			break;
		}
		
		leitor.close();
		System.out.println("Fim!");
		
	}

}
