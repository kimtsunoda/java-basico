package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor.
 */
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int soma=0;
		
		for (int i=0 ; i < vetorA.length ; i++ ) {
			System.out.println("Digite a posicao " + i + " do vetor A");
			vetorA [i] = scan.nextInt();
			
			soma += vetorA[i];
			
		}
		
		System.out.print("Vetor A ");
		
		for (int i=0 ; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Soma dos valores do vetor A: " + soma);
		
			}
			
	}		
