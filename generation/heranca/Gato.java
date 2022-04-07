package br.com.generation.heranca;

public class Gato extends Animal{

	private String raca;
	
	void somGato() {
		System.out.println("Miiaau!");
	}
	
	void saltar() {
		System.out.println(getNome() + " salta.");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
