package javabasico.aula20labs;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0-9. Ap�s isso determine o maior n�mero da matriz e a sua posi��o (linha, coluna).
 */
public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int [][] numerosAleatorios = new int [4][4];
		Random numeroRandom = new Random ();
		
		for (int i=0; i < numerosAleatorios.length ; i++ ) {
			for (int j=0; j < numerosAleatorios[i].length ; j++ ) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(9);
				}
			}
		
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		
		for (int i=0; i < numerosAleatorios.length ; i++ ) {
			for (int j=0; j < numerosAleatorios[i].length ; j++ ) {
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		for (int i=0; i < numerosAleatorios.length ; i++ ) {
			System.out.println(" ");
			for (int j=0; j < numerosAleatorios[i].length ; j++ ) {
					System.out.print(numerosAleatorios[i][j] + " ");
				}
		}
		System.out.println(" ");
		System.out.println("Maior numero da Matriz: " + maior + " esta na linha " + linha + " coluna " + coluna);
	}
}