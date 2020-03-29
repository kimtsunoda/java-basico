package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1. 
 */ 

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero;
		int divisivel = 0;
		
		System.out.println("Digite um numero: ");
		numero = scan.nextInt();
		
		for (int i=1; i<=numero; i++) {
			if (numero % i == 0) {
				divisivel ++;
			}
			
		}
		
		if (divisivel ==2) {
			System.out.println(numero + " é primo");
		}else {
			System.out.println(numero + " nao é primo");
		}
		

	}
			
}
