package br.com.fiap.aula27012022.Looping;

import java.util.Scanner;

public class TesteWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu Nome: ");
		String nome = leitor.next();
		
		int contador = 0;
		
		while (contador < 10) {
			System.out.println(nome);
			contador ++;
		}
		
		leitor.close();
	}

}
