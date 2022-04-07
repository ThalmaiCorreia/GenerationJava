package br.com.generation.classeobjeto;

public class AviaoTeste {

	public static void main(String[] args) {

		Aviao aero = new Aviao();
		Aviao aero1 = new Aviao();
		
		aero.modelo ="Boeing 737 MAX";
		aero.cia = "Latam";
		aero.ano = 2002;
		aero.capacidade = 230;
		
		System.out.println("Aeronave modelo " + aero.modelo);
		System.out.println("Companhia aérea " + aero.cia);
		System.out.println("Fabricada no ano de " + aero.ano);
		System.out.println("Tem capacidade para " + aero.capacidade + " pessoas.");
		System.out.println("");
		
		aero.decolar();
		aero.pousar();
		
		System.out.println("");
		aero1.modelo ="Boeing 787";
		aero1.cia = "GOL";
		aero1.ano = 2000;
		aero1.capacidade = 335;
		
		System.out.println("Aeronave modelo " + aero1.modelo);
		System.out.println("Companhia aérea " + aero1.cia);
		System.out.println("Fabricada no ano de " + aero1.ano);
		System.out.println("Tem capacidade para " + aero1.capacidade + " pessoas.");
		System.out.println();
		
		aero1.decolar();
		aero1.arremeter();
		aero1.pousar();
	}
	

}
