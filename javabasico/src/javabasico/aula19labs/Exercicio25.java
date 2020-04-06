package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: a) Bi deverá receber 1 quando Ai 
 * for par; b) Bi deverá receber 0 quando Ai for ímpar.
 */

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i <vetorA.length; i++) {
			System.out.println("Digite um valor para o vetor A posicao " + i);
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] %2 ==0) {
				vetorB[i] = vetorA[i] + 1;
			}else {
				vetorB[i] = vetorA[i];
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
		
}
}
	