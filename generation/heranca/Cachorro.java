package br.com.generation.heranca;

public class Cachorro extends Animal{

	private String raca;
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	void somCachorro() {
		System.out.println("Au Au Au!");
	}
	
	void correr() {
		System.out.println(getNome() + " corre.");
	}
	
}
