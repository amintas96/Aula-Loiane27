package application;

import entities.Lampada;

public class Program {

	public static void main(String[] args) {

		
		
		Lampada lam = new Lampada("Renew", true);
		
		
		System.out.println("A lampada está ligada? " + lam.getLigada());
		
		lam.desligarLampada();
		System.out.println();
		lam.statusLampada();
		
	}
	

}
