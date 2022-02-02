package Desafios.Jokenpo;

import Desafios.Jokenpo.Libray.Jokenpo;

public class Jogar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jokenpo jokenpo = new Jokenpo();
		try {
			jokenpo.IniciarJokenpo();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
