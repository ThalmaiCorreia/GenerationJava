package br.com.generation.heranca;

public class Pato extends Animal{

	private String cor;
	
	void somPato() {
		System.out.println("Quaack! Quaack!");
	}
	void nadar() {
		System.out.println(getNome() + " nada.");
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
