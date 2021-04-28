package application;

import java.util.Scanner;

import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		

		ContaCorrente cc = new ContaCorrente(1234, 1000.50f, true, 500);

		double dinheiro = sc.nextDouble();
		cc.depositar(dinheiro);

		cc.consultarSaldo();
		double saque = sc.nextDouble();
		cc.saque(saque);



		

		
		
		
	}

}
