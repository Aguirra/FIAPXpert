package CalculoCorporal;

import java.util.Scanner;

public class CalculoCorporalPessoa {
	//objetos
	Scanner teclado = new Scanner(System.in);
	
	//variaveis
	private String nomeUsuario, sexoUsuario;
	private boolean masculino = true;
	private double pesoPessoa, alturaPessoa, resultadoImc, pesoIdeal;
	
	//Interação com Usuario
	public void InteracaoComUsuario() {
		
		System.out.println("*** Calculo de IMC ***");
		System.out.print("\nInforme seu Nome: ");
		nomeUsuario = teclado.next(); 
		
		System.out.print("Informe seu Sexo, [M] Masculino - [F] Feminino   ");
		sexoUsuario = teclado.next().toUpperCase();
		
		if (sexoUsuario.contains("F")) {
			masculino = false;
		}
		
		System.out.print("Informe seu Peso: ");
		pesoPessoa = teclado.nextDouble();
		System.out.print("Informe sua Altura: ");
		alturaPessoa = teclado.nextDouble();
		
		teclado.close();
		
		for (int i = 0; i < 20; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println(RetornarIMC(CalcularImc(pesoPessoa, alturaPessoa)));
		System.out.println(RetonaPesoIdeal(alturaPessoa));
	}
	
	//calculo do IMC 
	public double CalcularImc (double peso, double altura) {
		return resultadoImc = peso / (altura * altura);
	}
	
	//Tabela IMC - Classificação para adultos acima de 20 anos.
	public String RetornarIMC (double valor) {

		String texto = nomeUsuario + " você esta ";
		String texto2 = "\nSeu IMC é " + String.format("%.2f", valor) + " Kg";
		
		if(valor < 18.5) {
			return texto + "Abaixo do Peso" + texto2;
			//return "Você esta Abaixo do Peso \nSeu IMC é " + String.format("%.2f", valor) + " Kg";
		}else if (valor >= 18.5 && valor <= 24.9) {
			return texto + "o Peso Normal" + texto2;
			//return "Você esta com o Peso Normal \nSeu IMC é " + String.format("%.2f", valor) + " Kg";
		}else if (valor >= 25.0 && valor <= 29.9){
			return texto + "com Pré-obesidade" + texto2;
			//return "Você esta com Pré-obesidade \nSeu IMC é " + String.format("%.2f", valor) + " Kg";
		}else if (valor >= 30.0 && valor <= 34.9) {
			return texto + "com Obesidade Grau 1" + texto2;
			//return "Você esta com Obesidade Grau 1 \nSeu IMC é " + String.format("%.2f", valor) + " Kg";
		}else if (valor >= 35.0 && valor <= 39.9) {
			return texto + "com Obesidade Grau 2" + texto2;
			//return "Você esta com Obesidade Grau 2 \nSeu IMC é " + String.format("%.2f", valor) + " Kg";
		}else {
			return texto + "com Obesidade Grau 3" + texto2;
			//return "Você esta com Obesidade Grau 3 \nSeu IMC é " + String.format("%.2f", valor) + " Kg";
		}
	}

	//Calculo de Peso ideal 
	public String RetonaPesoIdeal (double valor) {
		
		/*	IMC desejado (homens): (22 kg/m²)
			IMC desejado (mulheres): (21 kg/m²)
			https://www.drnutricao.com.br/Antropometria/calcular-peso-ideal
		*/
		
		if (masculino) {
			pesoIdeal = 22  * (valor * valor);
			return "Seu Peso ideal é " + String.format("%.2f",pesoIdeal) + " kg";
			
		}else {
			pesoIdeal = 21  * (valor * valor);
			return "Seu Peso ideal é " + String.format("%.2f",pesoIdeal) + " kg";
		}
	}
}
