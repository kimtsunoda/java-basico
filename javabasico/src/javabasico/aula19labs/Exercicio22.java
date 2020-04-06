package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar um programa 
 * que determine o percentual de números 0's e 1's existentes no vetor A.
 */

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int qtdeZero = 0;
		int qtdeUm = 0;
		
		for (int i=0; i <vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 1);
			
			if (vetorA[i] ==1) {
				qtdeUm ++;
			} if (vetorA[i] ==0) {
				qtdeZero ++;
			}
			
		}
		
		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorA [i] + " ");
		}
		
		System.out.println("");
		System.out.println("Percentual de 0 " + (qtdeZero *100)/ vetorA.length);
		System.out.println("Percentual de 1 " + (qtdeUm *100)/ vetorA.length);
		
}
}