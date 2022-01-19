import java.util.Scanner;

public class FiapExercicio2_ONG {
	
	//Cria��o de variaveis 
	public static int kmInicial, kmChegadaPosto;
	public static double litrosAbastecidos, mediaKmPorLitro;
	
	
	public static void main(String[] args) {
		 //int kmInicial, kmChegadaPosto;
	     //double litrosAbastecidos, mediaKmPorLitro;
		
		//Cria��o de Objetos para uso na aplica��o
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE CONSUMO");
		System.out.print("Por favor, informe quantos quilometros o marcador indicava no in�cio da viagem: ");
		kmInicial = teclado.nextInt();
		
		System.out.print("Por favor, informe quantos quilometros o marcador indicava na chegada ao posto: ");
		kmChegadaPosto = teclado.nextInt();
		
		System.out.print("Por favor, informe quantos litros de gasolina foram reabastecidos: ");
		litrosAbastecidos = teclado.nextDouble();
		
		//encerrando Leitor
		teclado.close();
		
		//realizando calculo		
		mediaKmPorLitro = (kmChegadaPosto - kmInicial) / litrosAbastecidos;
				
		
		//Impress�o para resultado
		System.out.println("Nessa viagem o ve�culo consumiu " + String.format("%.2f", mediaKmPorLitro) + " Km/L");

	
	}

}
