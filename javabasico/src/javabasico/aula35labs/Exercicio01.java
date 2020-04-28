package javabasico.aula35labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	um	m�todo recursivo e est�tico	que	calcule	e retorne o	N-�simo	termo da sequ�ncia Fibonacci. Alguns n�meros desta sequ�ncia
 * s�o:	0, 1, 1, 2,	3, 5, 8, 13,21,	34,	55,	89...
 */

public class Exercicio01 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		int termo;
		
		do {
			System.out.println("Digite ate o termo que deseja viasualizar:");
			termo = scan.nextInt();

			if (termo <=0) {
				System.out.println("Digite um valor maior que 0");
			}
		} while (termo <=0);
		
		for (int i= 0; i < termo; i++ ) {
			System.out.print(FibonacciRecursivo.fibonacci(i) + " ");
		}
	}
}
