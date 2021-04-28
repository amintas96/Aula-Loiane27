package entities;

public class Pessoa {
	
	private String name;
	private String genero;
	private int idade;
	
	public Pessoa() {
		
	}

	public Pessoa(String name, String genero, int idade) {
		this.name = name;
		this.genero = genero;
		this.idade = idade;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void fazerNiver() {
		this.idade++;
		
	}
	

}
