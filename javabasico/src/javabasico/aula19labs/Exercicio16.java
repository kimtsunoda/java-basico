package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
 * b) a quantidade de elementos armazenados no vetor que são iguais a 15; e c) a média dos elementos armazenados no vetor que são superiores a 15.
 */
public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int somaMenor15=0;
		int qtdeIgual15 =0;	
		int qtdeMaior15 =0;
		int somaMaior15 =0;

		for (int i=0 ; i < vetorA.length ; i++ ) {
			System.out.println("Digite um valor para a posicao " + i);
			vetorA[i] = scan.nextInt();
			
			if (vetorA[i] == 15) {
				qtdeIgual15++;
			} else if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			} else if (vetorA[i] > 15){
				qtdeMaior15++;
				somaMaior15 += vetorA[i];
			}

		}
		
		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorA [i] + " ");
		}
		
		System.out.println (" ");
		System.out.println ("Soma dos valores menor do que 15: " + somaMenor15);
		System.out.println ("Quantidade de valores iguais a 15: " + qtdeIgual15);
		System.out.println ("Media dos valores maior do que 15: " + (somaMaior15/qtdeMaior15));

}
}