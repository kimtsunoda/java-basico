package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre o primeiro n�mero elevado ao segundo n�mero. N�o utilize a fun��o de pot�ncia da linguagem. 
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

