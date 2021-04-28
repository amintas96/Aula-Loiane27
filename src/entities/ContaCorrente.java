package entities;

public class ContaCorrente {

	private int numero;
	private double saldo;
	private boolean statusEspecial;
	private int limite;

	public ContaCorrente(int numero, double saldo, boolean statusEspecial, int limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.statusEspecial = statusEspecial;
		this.limite = limite;
	}

	public ContaCorrente() {

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatusEspecial() {
		return statusEspecial;
	}

	public void setStatusEspecial(boolean statusEspecial) {
		this.statusEspecial = statusEspecial;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public void saque(double saque) {
		if (this.saldo > 0) {

			this.setSaldo(this.getSaldo() - saque);

			System.out.println("Saldo atual ficou de " + this.getSaldo());

		} else if (this.saldo <= 0 && this.statusEspecial == true) {

			this.saldo += limite;

			System.out.println("O limite para saque é de " + getSaldo());
		} else {
			System.out.println("Sem limite para saque!");
		}

	}

	public void depositar(double dinheiro) {

		this.saldo += dinheiro;
		System.out.println("Saldo atual ficou de " + this.getSaldo());

	}

	public void checkEspecial() {
		if (this.saldo < 0 && this.statusEspecial == true) {

			System.out.println("Esta usando check Especial e o saldo atual é de " + this.getSaldo());
		} else {
			System.out.println("Não está usando Check Especial");
		}

	}

}
