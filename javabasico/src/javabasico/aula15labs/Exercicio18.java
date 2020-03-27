
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
 */

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite um numero inteiro: ");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0 ) {
			
			System.out.println (numero + " é par");
			
		} else {
			
			System.out.println (numero + " é impar");
		}
		
			
}	
		
}