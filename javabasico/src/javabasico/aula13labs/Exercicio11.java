package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Faca um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
	a. o produto do dobro do primeiro com metade do segundo .
	b. a soma do triplo do primeiro com o terceiro.
	c. o terceiro elevado ao cubo.
 */

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int n1 = scan.nextInt();
		System.out.print("Digite outro numero inteiro: ");
		int n2 = scan.nextInt();
		System.out.print("Digite um numero real: ");
		double n3 = scan.nextDouble();
		
		int resultado1 = (n1*2) * (n2/2);
		double resultado2 = (n1*3) + n3;
		double resultado3 = Math.pow(n3, 3);
		
		System.out.println("o produto do dobro do primeiro com metade do segundo é " + resultado1);
		System.out.println("a soma do triplo do primeiro com o terceiro " + resultado2);
		System.out.println("o terceiro elevado ao cubo " + resultado3);

	}

}
