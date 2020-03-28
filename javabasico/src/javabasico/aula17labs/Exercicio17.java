package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 
 */ 

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero;
		int fatorial = 1;

		System.out.println("Digite um numero: ");
		numero = scan.nextInt();
		
		for (int i=numero; i>=1; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.println("o fatorial de " + numero + " é " + fatorial);
	}
			
}
