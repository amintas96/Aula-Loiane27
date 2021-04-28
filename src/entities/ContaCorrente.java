package entities;

public class ContaCorrente {

	private int numero;
	private double saldo;
	private boolean statusEspecial;
	private double limite;

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

	public double getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public void saque(double saque) {
		if (this.saldo > 0 && this.statusEspecial == false) {

			if (this.saldo < saque) {

				System.out.println("impossivel realizar saque");

			} else {

				this.saldo -= saque;

				System.out.println("Saldo atual � de " + this.getSaldo());
			}

		} else if (this.statusEspecial == true) {

			this.saldo += limite;

			if (saque > this.saldo) {

				System.out.println("Impossivel realizar o saque, pois o limite � de  " + this.getSaldo());

			} else {

				this.setSaldo(this.getSaldo() - saque);
				System.out.println("Foi realizado o saque de " + saque + " e o saldo remanecente ficou de " + this.getSaldo()); 
			}

		}
			

		}

	

	public void depositar(double dinheiro) {

		this.saldo += dinheiro;
		System.out.println("Saldo atual ficou de " + this.getSaldo());

	}

	public void checkEspecial() {
		if (this.saldo < 0 && this.statusEspecial == true) {

			this.saldo += this.limite;

			System.out.println("Esta usando check Especial e o saldo atual � de " + this.getSaldo());
		} else {

			System.out.println("N�o est� usando Check Especial");
		}

	}

	public void consultarSaldo() {

		if (this.statusEspecial == true) {

			System.out.print("O saldo � de " + this.getSaldo() + " por�m voc� possui o limite no check especial de "
					+ this.getLimite());
			this.saldo += limite;
			System.out.println();

			System.out.print(", tornando seu limite de " + this.getSaldo());
		} else {

			System.out.println("Saldo atual � de " + this.getSaldo());
		}

	}

}
