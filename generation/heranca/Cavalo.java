package br.com.generation.heranca;

public class Cavalo extends Animal {
	
	private String cor;
	
	
	void somCavalo() {
		System.out.println("Riiiinch !!");
	}
	
	void correr() {
		System.out.println(getNome() + " corre.");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
