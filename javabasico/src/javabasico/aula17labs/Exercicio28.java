package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. 
 * Faça um programa que peça um número inteiro e determine se ele é ou não um número primo
 */ 

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

	   int numero;
	   int primo =0;
	   
	   System.out.println("Digite um numero inteiro: ");
	   numero = scan.nextInt();
	   
	   for ( int i=1; i<=numero; i++) {
		   
		   if (numero % i == 0) {
			   primo++;			   
		   }
		   
	   }
	
	   if (primo ==2) {
		   System.out.println (numero + " é primo");
	   } else {
		   System.out.println (numero + " nao é primo");
	   }
		
	}
		
	}
