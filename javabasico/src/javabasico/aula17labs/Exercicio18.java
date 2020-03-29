package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo. Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1. 
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
			System.out.println(numero + " � primo");
		}else {
			System.out.println(numero + " nao � primo");
		}
		

	}
			
}
