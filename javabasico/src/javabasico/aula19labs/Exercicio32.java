package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.
 */

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[5];
		
		for (int i=0; i <vetorA.length; i++) {
			System.out.println("Digite um valor para o vetor A posicao " + i);
			vetorA[i] = scan.nextInt();
		}
			
		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorA [i] + " ");
		}
		
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.println("\n" + "Tabuada do " + vetorA[i]);
			for (int j=1; j <=10; j++ ) {
				System.out.println(vetorA[i] + " X " + j + " = " + (vetorA[i] * j));
			}
		}
}
}
	