package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B dever�ser o respectivo elemento de A 
 * multiplicado por sua posi��o (ou �ndice), ou seja: B[i] = A[i] * i.
 */
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0 ; i < vetorA.length ; i++ ) {
			System.out.println("Digite a posicao " + i + " do vetor A");
			vetorA [i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * i;
			}
		
		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B ");
		for (int i=0 ; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
