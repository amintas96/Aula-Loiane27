package entities;

public class Lampada {

	private String marca;
	private boolean ligada;

	public Lampada(String marca, boolean ligada) {
		this.marca = marca;
		this.ligada = ligada;
	}

	public Lampada() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean getLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligarLampada() {

		this.ligada = true;
	}

	public void desligarLampada() {
		this.ligada = false;

	}

	public void statusLampada() {
		System.out.println("A lampada está " + this.getLigada());
		System.out.println("A marca da lampada é " + this.getMarca());
	}

	@Override
	public String toString() {
		return "Lampada [marca=" + marca + ", ligada=" + ligada + "]";
	}

}
