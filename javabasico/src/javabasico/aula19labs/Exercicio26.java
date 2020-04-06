package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de forma��o: a) Ci dever� receber 
 * 1 quando Ai for maior que Bi; b) Ci dever� receber 0 quando Ai for igual a Bi; c) Ci dever� receber -1 quando Ai for menor que Bi.
 */

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i=0; i <vetorA.length; i++) {
			System.out.println("Digite um valor para o vetor A posicao " + i);
			vetorA[i] = scan.nextInt();
			
			System.out.println("Digite um valor para o vetor B posicao " + i);
			vetorB[i] = scan.nextInt();
			
			if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			}else if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] < vetorB[i]) {
				vetorC[i] = -1;
			}
			
			}
		
		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorA [i] + " ");
		}
		
		System.out.println("");

		System.out.print("Vetor B ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorB [i] + " ");
		}
		
		System.out.println("");

		System.out.print("Vetor C ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorC [i] + " ");
		}
		
}
}
	