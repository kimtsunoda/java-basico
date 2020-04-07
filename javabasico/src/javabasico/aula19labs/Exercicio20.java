package javabasico.aula19labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) e a seguir armazene em vetor A com 20 elementos as seguintes conversões: 
 * A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
 */

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double[] vetorA = new double[10];
		double cotacaoDolar;
		
		System.out.println("Digite a cotacao do dolar: ");
		cotacaoDolar = scan.nextDouble();
		
		for (int i=0; i <vetorA.length; i++) {
			vetorA[i] = cotacaoDolar * i;
		}
		
		
		System.out.print("Vetor A ");
		for (int i=0 ; i < vetorA.length ; i++) {
			System.out.print(vetorA [i] + " ");
		}
		
	}
}