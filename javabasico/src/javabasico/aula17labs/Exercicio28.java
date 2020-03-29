package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Os n�meros primos possuem v�rias aplica��es dentro da Computa��o, por exemplo na Criptografia. Um n�mero primo � aquele que � divis�vel apenas por um e por ele mesmo. 
 * Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo
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
		   System.out.println (numero + " � primo");
	   } else {
		   System.out.println (numero + " nao � primo");
	   }
		
	}
		
	}
