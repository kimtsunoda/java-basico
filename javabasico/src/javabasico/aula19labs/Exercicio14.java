package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.
 */
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int soma=0;
		int qtdeImpar=0;
		
		for (int i=0 ; i < vetorA.length ; i++ ) {
			System.out.println("Digite a posicao " + i + " do vetor A");
			vetorA [i] = scan.nextInt();
			
			if (vetorA[i] % 2 !=0) {
			soma += vetorA[i];
			qtdeImpar ++;
			}
		
			}
		
		double media = soma / qtdeImpar;
		
		System.out.print("Vetor A ");
		
		for (int i=0 ; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("");
		System.out.println("Media dos elementos impares: " + media);
		
	}		

}