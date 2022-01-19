import java.util.Scanner;

public class FiapExercicio2_ONG {
	
	//Criação de variaveis 
	public static int kmInicial, kmChegadaPosto;
	public static double litrosAbastecidos, mediaKmPorLitro;
	
	
	public static void main(String[] args) {
		 //int kmInicial, kmChegadaPosto;
	     //double litrosAbastecidos, mediaKmPorLitro;
		
		//Criação de Objetos para uso na aplicação
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE CONSUMO");
		System.out.print("Por favor, informe quantos quilometros o marcador indicava no início da viagem: ");
		kmInicial = teclado.nextInt();
		
		System.out.print("Por favor, informe quantos quilometros o marcador indicava na chegada ao posto: ");
		kmChegadaPosto = teclado.nextInt();
		
		System.out.print("Por favor, informe quantos litros de gasolina foram reabastecidos: ");
		litrosAbastecidos = teclado.nextDouble();
		
		//encerrando Leitor
		teclado.close();
		
		//realizando calculo		
		mediaKmPorLitro = (kmChegadaPosto - kmInicial) / litrosAbastecidos;
				
		
		//Impressão para resultado
		System.out.println("Nessa viagem o veículo consumiu " + String.format("%.2f", mediaKmPorLitro) + " Km/L");

	
	}

}
