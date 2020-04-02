package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser araiz quadrada do respectivo elemento 
 * de A, ou seja: B[i] = sqrt(A[i]). 
 */
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double [vetorA.length];
		
		for (int i=0 ; i < vetorA.length ; i++ ) {
			System.out.println("Digite a posicao " + i + " do vetor A");
			vetorA [i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
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
