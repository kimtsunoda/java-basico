
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
 *
 */

public class Exercicio01 {


	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = scan.nextInt();
		System.out.println("Digite outro numero: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("O maior numero digitado � " + n1);
		}else
			System.out.println("O maior numero digitado � " + n2);
	}

}