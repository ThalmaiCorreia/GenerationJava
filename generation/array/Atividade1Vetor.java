/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
package br.com.generation.array;

import java.util.Scanner;

public class Atividade1Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int [5];
		int i, maior = 0;
		
		for(i = 0; i < 5; i++) {
		System.out.println("Digite um número: ");
			vetor [i] = leia.nextInt();
			if( i == 0) {
				 maior = vetor[0];
			}
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println("\nO maior número é o " + maior);
		
		leia.close();
	}

}
