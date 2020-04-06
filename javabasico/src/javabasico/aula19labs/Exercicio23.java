package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A s�o pares. Se pelo menos um elemento do vetor n�o 
 * for par o processo de repeti��o para percorrer os elementos do vetor deve ser encerrado, como sugest�o: utilize uma vari�vel do tipo flag para atingir este prop�sito.
 */

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i <vetorA.length; i++) {
			System.out.println("Digite um valor para a posicao " + i);
			vetorA[i] = scan.nextInt(); 
			
			}
		
		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorA [i] + " ");
		}
		
		System.out.println("");
		
		for (int i=0 ; i < vetorA.length ; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.print("Par ");
			} else {
				break;
			}
		}	
}
}
	