package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
 */ 

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;	
			
		for (int i=1; i <=5; i++) {
			System.out.println("Digite um numero: ");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior numero digitado � " + maior);
		
	}
		
		
	}
		
	
			