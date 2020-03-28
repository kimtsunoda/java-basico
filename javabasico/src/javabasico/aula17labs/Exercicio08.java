package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que leia 5 números e informe a soma e a média dos números.
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
		
		System.out.println("A soma é " + soma);
		System.out.println("A media é " + media);
		
		 
	}
		
	}
			