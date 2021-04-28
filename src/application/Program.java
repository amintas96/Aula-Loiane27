package application;

import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {

		
		
	ContaCorrente cc = new ContaCorrente(1234, 1000.50f, false, 500);
		
		
	cc.saque(1050);
		
	}
	

}
