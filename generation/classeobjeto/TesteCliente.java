package br.com.generation.classeobjeto;

public class TesteCliente {

	public static void main(String[] args) {
		
		MeuCliente cliente = new MeuCliente();
		MeuCliente cliente1 = new MeuCliente();
		
		cliente.nome = "José Colméia";
		cliente.cidade = "Jellystone";
		cliente.cpf = 234234598;
		cliente.telefone = 945824382;
		
		System.out.println("Nome do cliente: " + cliente.nome);
		System.out.println("Residente na cidade de " + cliente.cidade);
		System.out.println("Inscrito no cpf: " + cliente.cpf);
		System.out.println("Telefone: " + cliente.telefone);
		cliente.comprar();
		cliente.trocar();
		
		System.out.println("");
		
		cliente1.nome = "Margy Simpson";
		cliente1.cidade = "Springfield";
		cliente1.cpf = 234232343;
		cliente1.telefone = 848524382;
		
		System.out.println("Nome do cliente: " + cliente1.nome);
		System.out.println("Residente na cidade de " + cliente1.cidade);
		System.out.println("Inscrito no cpf: " + cliente1.cpf);
		System.out.println("Telefone: " + cliente1.telefone);
		cliente.comprar();
		cliente.trocar();
	}

}
