package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero:");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro numero:");
		int numero2 = scan.nextInt();
		System.out.println("Digite mais um numero:");
		int numero3 = scan.nextInt();
		
		if (numero1 <= numero2 && numero1 <= numero3 && numero2<= numero3 ) {
			System.out.println (numero3 + " - " + numero2 + " - " + numero1);
		} else if (numero2<= numero1 && numero2 <= numero3 && numero1<= numero3 ) {
			System.out.println (numero3 + " - " + numero1 + " - " + numero2);
		} else if (numero2<= numero1 && numero2 <= numero3 && numero3<= numero1 ) {
			System.out.println (numero1 + " - " + numero3 + " - " + numero2);
		} else if (numero3<= numero1 && numero3 <= numero2 && numero2<= numero1 ) {
			System.out.println (numero1 + " - " + numero2 + " - " + numero3);
		} else if (numero1<= numero2 && numero1 <= numero3 && numero3<= numero2 ) {
			System.out.println (numero2 + " - " + numero3 + " - " + numero1);
		} else {
			System.out.println (numero2 + " - " + numero1 + " - " + numero3);
		}
		
	}

}
