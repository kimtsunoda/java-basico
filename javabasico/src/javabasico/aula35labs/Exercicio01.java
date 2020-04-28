package javabasico.aula35labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	um	método recursivo e estático	que	calcule	e retorne o	N-ésimo	termo da sequência Fibonacci. Alguns números desta sequência
 * são:	0, 1, 1, 2,	3, 5, 8, 13,21,	34,	55,	89...
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
