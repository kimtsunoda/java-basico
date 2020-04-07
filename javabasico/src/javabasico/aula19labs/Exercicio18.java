package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a menor e a maior idades e 
 * suas respectivas posições. 
 */
public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int menorIdade= Integer.MAX_VALUE;
		int maiorIdade= Integer.MIN_VALUE;
		int menorIdadePosicao = 0;
		int maiorIdadePosicao = 0;
		
		for (int i=0 ; i < vetorA.length ; i++ ) {
			System.out.println("Digite um valor para a posicao " + i);
			vetorA [i] = scan.nextInt();
		
			if (vetorA[i] > maiorIdade) {
				maiorIdade = vetorA[i];
				maiorIdadePosicao = i;
			}  
			
			if (vetorA[i] < menorIdade) {
				menorIdade = vetorA[i];
				menorIdadePosicao = i;
			}
		}

		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorA [i] + " ");
			
		}
		
		System.out.println (" ");
		System.out.println ("A menor Idade é " + menorIdade + " e esta na posicao " + menorIdadePosicao);
		System.out.println ("A maior Idade é " + maiorIdade + " e esta na posicao " + maiorIdadePosicao);
}
}