package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros.
 */ 

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num;
		int soma = 0;	
			
		for (int i=1; i <=5; i++) {
			System.out.println("Digite um numero: ");
			num = scan.nextInt();
			
			soma += num; 
			
			}
		
		double media = soma / 5;
		
		System.out.println("A soma � " + soma);
		System.out.println("A media � " + media);
		
		 
	}
		
	}
			