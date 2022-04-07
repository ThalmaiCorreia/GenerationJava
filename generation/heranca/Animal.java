package br.com.generation.heranca;

public class Animal {

	private String nome;
	private int idade;
	private String especie;
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	void imprimir() {
		System.out.println(getEspecie());
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade() + (" anos"));
		System.out.print("Onomatopeia de som: ");
	}
	
		
}
