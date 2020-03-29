package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo:
 */ 

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero;
		double fatorial = 1;
		
		System.out.println ("Digite um numero inteiro: ");
		numero = scan.nextInt();
		
		System.out.println ("Fatorial de " + numero);
		System.out.print(numero + "! = " );
		
		for (int i=numero; i>1; i--) {
			System.out.print(i + ".");
			fatorial = fatorial * i;
		}
		
		System.out.print("1 = " + fatorial);
		
	}
		
	}
