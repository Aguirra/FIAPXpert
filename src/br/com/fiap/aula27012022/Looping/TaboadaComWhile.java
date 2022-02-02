package br.com.fiap.aula27012022.Looping;

import java.util.Scanner;

public class TaboadaComWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("*** Taboada ***");
		
		System.out.print("Escolha o numero Multiplicando: ");
		int numeroMultiplicando = leitor.nextInt();
		
		System.out.print("Escolha o numero Multiplicador: ");
		int numeroMultiplicador = leitor.nextInt();
		
		int contador = 0;
		
		System.out.println("");
		while (contador <= numeroMultiplicador) {
			System.out.println(numeroMultiplicando + " x " + contador + " = " + (contador*numeroMultiplicando));
			contador ++;
		}
		
		
		

	}

}
