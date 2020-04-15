package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Faca um Programa que peça dois números e imprima a soma.
 */

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n1 = scan.nextInt();
		System.out.println("Digite outro numero: ");
		int n2 = scan.nextInt();
		int soma = n1 + n2;
		
		System.out.println("A soma de " + n1 + " e " + n2 + " é " + soma);

	}

}
