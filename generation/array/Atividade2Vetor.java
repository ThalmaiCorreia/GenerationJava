package br.com.generation.array;

import java.util.Scanner;

public class Atividade2Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int[] dado = new int[10];
		int mediaAri, maiorPont = 0, repetMaior = 0, i, total = 0;
		
		for(i = 0; i<10; i++) {
			System.out.println("Digite um número: ");
			dado[i] = leia.nextInt();
			total+=dado[i];
			if (i == 0) {
				maiorPont = dado[0];
				
			}
			if (dado[i] > maiorPont) {
				maiorPont = dado[i];
				repetMaior=0;
			}
			if(dado[i] == maiorPont) {
				repetMaior+=1;
			}
		}
			mediaAri = total/i;
			System.out.println("Os números do dado foram: ");
			for(i = 0; i<10; i++) {
				System.out.print(" " + dado[i]);
			}
			System.out.println("\nA média aritimética dos valores é " + mediaAri + ".");
			System.out.print("A maior pontuação foi " + maiorPont);
			if(repetMaior > 1) {
			System.out.print(" e repetiu " + repetMaior + " vezes.");
			}
			else {
				System.out.print(" e repetiu " + repetMaior + " vez.");
			}
			leia.close();	
			}
		
	}


