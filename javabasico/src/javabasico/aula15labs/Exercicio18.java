
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar.
 */

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite um numero inteiro: ");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0 ) {
			
			System.out.println (numero + " � par");
			
		} else {
			
			System.out.println (numero + " � impar");
		}
		
			
}	
		
}