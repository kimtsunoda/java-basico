
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
 */

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro numero: ");
		int numero2 = scan.nextInt();
		System.out.println("Digite mais um numero: ");
		int numero3 = scan.nextInt();
		
		if (numero1 >= numero2 & numero1 >= numero3) {
			System.out.println("O maior numero � o 1 : " + numero1);
		} else if (numero2 > numero3) {
			System.out.println("O maior numero � o 2 : " + numero2);
		} else {
			System.out.println("O maior numero � o 3 : " + numero3);
		}
		
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.println("O menor numero � o 1 : " + numero1);
		} else if (numero2 <= numero3) {
			System.out.println("O menor numero � o 2 : " + numero2);
		} else {
			System.out.println("O menor numero � o 3 : " + numero3);
		}
	}

}
