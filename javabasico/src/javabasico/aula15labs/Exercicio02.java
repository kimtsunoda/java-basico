
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author kim tsunoda
 * objetivo Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
 *
 */

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = scan.nextInt();
		
		if (n1 >= 0) {
			System.out.println("O numero digitado � positivo");
		}else
			System.out.println("O numero digitado � negativo");
		
	
		
	}

}
