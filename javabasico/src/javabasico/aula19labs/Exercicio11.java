package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo . Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos armazenados neste vetor que são pares.
 */
public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int primo;
		int qtdePrimo=0;
		
		for (int i=0 ; i < vetorA.length ; i++ ) {
			System.out.println("Digite a posicao " + i + " do vetor A");
			vetorA [i] = scan.nextInt();
			
			primo = 0;
			
			for (int j=1; j<= vetorA[i]; j++) {
	
				if (vetorA[i] % j ==0) {
					primo ++;	
				}
			}
			
			if (primo ==2) {
				qtdePrimo ++;
			}
			
			}
		
			System.out.print("Vetor A ");
			
			for (int i=0 ; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
			}
			
			System.out.println("");
			System.out.println("Quantidade de primos no vetor A: " + qtdePrimo);
	}		
}