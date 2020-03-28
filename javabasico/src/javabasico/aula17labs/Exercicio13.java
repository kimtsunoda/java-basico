package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem. 
 */ 

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int base;
		int expoente;
		
		
		System.out.println("Digite a base: ");
		base = scan.nextInt();
		
		int total= base;
		
		System.out.println("Digite o expoente: ");
		expoente = scan.nextInt();
		
		for (int i=2; i <= expoente; i++) {
			total = total * base;
		}
		
		System.out.println(total);
	}
		
	}

