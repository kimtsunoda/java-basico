package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a quantidade de n�meros pares e a quantidade de n�meros impares. 
 */ 

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero;
		int par = 0;
		int impar = 0;
		
		for(int i=1; i<=10; i++) {
			
				System.out.println("Digite um numero inteiro: ");
				numero = scan.nextInt();
				
				if (numero % 2 ==0) {
					par ++;
				} else  {
					impar ++;
				}
				
		}
	
		System.out.println("Foram digitados: " + par + " par(es)");
		System.out.println("Foram digitados: " + impar + " impar(es)");
	}
		
	}

