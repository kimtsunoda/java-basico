package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o no intervalo compreendido por eles.
 */ 

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num1;
		int num2;
		int soma = 0;
		
		System.out.println("Digite um numero: ");
		num1 = scan.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = scan.nextInt();

		if (num1 < num2) {
			System.out.println("Relacao: ");
			for(int i =num1; i <= num2; i++ ) {
				System.out.println(i);
				soma += i;
			} 
			System.out.println("A soma � " + soma);
		}else if (num2 < num1) {
			System.out.println("Relacao: ");
				for(int i =num2; i <= num1; i++) {
					System.out.println(i);
					soma += i;
				}
				System.out.println("A soma � " + soma);
		}
	}
		
	}

