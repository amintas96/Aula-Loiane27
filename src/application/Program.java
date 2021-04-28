package application;

import java.util.Scanner;

import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		double dinheiro = sc.nextDouble();
		 double saque = sc.nextDouble();

		ContaCorrente cc = new ContaCorrente(1234, 1000.50f, true, 0);

		cc.depositar(dinheiro);
		cc.saque(saque);

	}

}
