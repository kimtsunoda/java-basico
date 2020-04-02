package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a quantidade de pessoas 
 * que possuem idade superior a 35 anos. 
 */
public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int qtdeMaior35=0;

		for (int i=0 ; i < vetorA.length ; i++ ) {
			System.out.println("Digite um valor para a posicao " + i);
			vetorA [i] = scan.nextInt();
		
			if (vetorA[i] > 35) {
				qtdeMaior35 ++;
			}
		}

		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorA [i] + " ");
			
		}
		
		System.out.println (" ");
		System.out.println ("Qtde pessoas com mais de 35 anos " + qtdeMaior35);

}
}