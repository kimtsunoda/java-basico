package javabasico.aula20labs;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da coluna 7.
 */

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int [][] numerosAleatorios = new int [10][10];
		Random numeroRandom = new Random ();
		
		for (int i=0; i < numerosAleatorios.length ; i++ ) {
			for (int j=0; j < numerosAleatorios[i].length ; j++ ) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(10);
				}
			}
		
		int maior5 = 0;
		int menor5 = 10;
		
			for (int j=0; j < numerosAleatorios[5].length ; j++ ) {
				if (numerosAleatorios[5][j] > maior5) {
					maior5 = numerosAleatorios[5][j];
					}
				if (numerosAleatorios[5][j] < menor5) {
					menor5 = numerosAleatorios[5][j];
					}
			}
		
		int maior7 = 0;
		int menor7 = 10;
		
				for (int i=0; i < numerosAleatorios.length ; i++ ) {
					if (numerosAleatorios[i][7] > maior7) {
						maior7 = numerosAleatorios[i][7];
						}
					if (numerosAleatorios[i][7] < menor7) {
						menor7 = numerosAleatorios[i][7];
						}	
				}
		
		for (int i=0; i < numerosAleatorios.length ; i++ ) {
			for (int j=0; j < numerosAleatorios[i].length ; j++ ) {
					System.out.print(numerosAleatorios[i][j] + " ");
				}
				System.out.println(" ");
			}
		System.out.println(" ");
		System.out.println("Maior numero da linha 5: " + maior5 + " Menor numero da linha 5: " + menor5);
		System.out.println("Maior numero da coluna 7: " + maior7 + " Menor numero da coluna 7: " + menor7);
	}
}
	