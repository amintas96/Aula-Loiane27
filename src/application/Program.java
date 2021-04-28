package application;

import java.util.Scanner;

import entities.ContaCorrente;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número da matrícula: ");
        int matricula = sc.nextInt();

        System.out.println("Qual o saldo vc vai entrar na conta? ");
        double saldo = sc.nextDouble();

        System.out.println("Poderá usar o checkEspecial? ");
        boolean checkEspecial = sc.nextBoolean();

        double limite = 0;

        if(checkEspecial) {

           limite = 500;

        }else{

            limite = 0;
        }

        ContaCorrente cc = new ContaCorrente(matricula, saldo,checkEspecial ,limite);

        double dinheiro = sc.nextDouble();
        cc.depositar(dinheiro);

        cc.consultarSaldo();
        double saque = sc.nextDouble();
        cc.saque(saque);


    }

}
