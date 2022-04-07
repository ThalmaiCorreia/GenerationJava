package br.com.generation.classeobjeto;

public class Aviao {
	
	String modelo;
	String cia;
	int ano;
	int capacidade;
	
	void decolar() {
		System.out.println("Vamos decolar em alguns instantes.");
	}
	void arremeter() {
		System.out.println("Pista com pouca visibilidade, não foi possivel realizar o pouso.");
	}
	void pousar() {
		System.out.println("Pouso realizado com sucesso");
	}
	
}