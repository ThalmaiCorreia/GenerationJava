package br.com.generation.heranca;

public class TesteAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Marley");
		cachorro.setIdade(2);
		cachorro.setEspecie("Cachorro");
		cachorro.setRaca("Golden");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("P� de pano");
		cavalo.setIdade(3);
		cavalo.setEspecie("Cavalo");
		cavalo.setCor("Preto");
		
		Gato gato = new Gato();
		gato.setNome("Tom");
		gato.setIdade(1);
		gato.setEspecie("Gato");
		gato.setRaca("Siam�s");
		
		Pato pato = new Pato();
		pato.setNome("Donald");
		pato.setIdade(5);
		pato.setEspecie("Pato");
		pato.setCor("Branco");
		
		cachorro.imprimir();
		cachorro.somCachorro();
		System.out.println(cachorro.getNome() + " � da ra�a " + cachorro.getRaca());
		cachorro.correr();
		System.out.println();
		cavalo.imprimir();
		cavalo.somCavalo();
		System.out.println(cavalo.getNome() + " � " + cavalo.getCor());
		cavalo.correr();
		System.out.println();
		gato.imprimir();
		gato.somGato();
		System.out.println(gato.getNome() + " � da ra�a " + gato.getRaca());
		gato.saltar();
		System.out.println();
		pato.imprimir();
		pato.somPato();
		System.out.println(pato.getNome() + " � " + pato.getCor());
		pato.nadar();
		
	}

}
