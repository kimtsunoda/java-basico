package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os elementos pares 
 * de A e nas posições  restantes do vetor B armazene os elementos de A que são ímpares.
 */

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int posB =0;
		
		for (int i=0; i <vetorA.length; i++) {
			System.out.println("Digite um valor para o vetor A posicao " + i);
			vetorA[i] = scan.nextInt();
		}
			
		for (int i=0 ; i < vetorA.length ; i++) {
				if (vetorA[i] % 2 ==0) {
					vetorB [posB] = vetorA[i];
					posB ++;
				}
			}
		
		for (int i=0 ; i < vetorA.length ; i++) {
			if (vetorA[i] % 2 !=0) {
				vetorB [posB] = vetorA[i];
				posB ++;
			}
		}
		
		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorA [i] + " ");
		}
		
		System.out.println("");

		System.out.print("Vetor B ");
		for (int i=0 ; i < posB ; i++) {
			System.out.print(vetorB [i] + " ");
		}
		
}
}
	