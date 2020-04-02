package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor.
 */
public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int par=0;
		int impar =0;		

		for (int i=0 ; i < vetorA.length ; i++ ) {
			System.out.println("Digite a posicao " + i + " do vetor A");
			vetorA [i] = scan.nextInt();
			
			if (vetorA[i] % 2 ==0) {
				par ++;
			}else {
				impar++;
			}
		
			}
		
		par = (par*100) / vetorA.length;
		impar =  (impar*100) / vetorA.length;
		
		System.out.print("Vetor A ");
		
		for (int i=0 ; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Percentual de elementos pares: " + par + " Percentual de elementos impares: " + impar );
	}		

}