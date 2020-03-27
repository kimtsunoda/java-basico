
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
 */

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite um numero: ");
		int numero1 = scan.nextInt();
		System.out.println ("Digite outro numero: ");
		int numero2 = scan.nextInt();
		System.out.println ("Qual operacão deseja realizar? (+ - * ?)");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true ; 
		
		switch (operacao) {
		
		case "+" : resultado = numero1 + numero2; break;
		case "-" : resultado = numero1 - numero2; break;
		case "*" : resultado = numero1 * numero2; break;
		case "/" : resultado = numero1 / numero2; break;
		default : 
				System.out.println ("Operacao invalida");
				valida = false;
		}
			
		if (valida) {
			
			    System.out.println("Resultado " + resultado);
			
			    if (resultado >= 0)  {
			    	System.out.println("Resultado é positivo " );
			    } else {
			    	System.out.println("Resultado é negativo " );
			    }
			    
			    if (resultado % 2 == 0)  {
			    	System.out.println("Resultado é par " );
			    } else {
			    	System.out.println("Resultado é impar " );
			    } 
			    
		}
		
}	
		
}