
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo .Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
 */

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite a primeira nota:");
		double nota1 = scan.nextDouble();
		System.out.println ("Digite a segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if (media >=9 && media <= 10) {
			
			System.out.println("Nota 1: " + nota1 );
			System.out.println("Nota 2: " + nota2 );
			System.out.println("Media: " + media );
			System.out.println("Conceito: A ");
			System.out.println("Aprovado");
			
		} else if (media >=7.5 && media < 9) {
			
			System.out.println("Nota 1: " + nota1 );
			System.out.println("Nota 2: " + nota2 );
			System.out.println("Media: " + media );
			System.out.println("Conceito: B ");
			System.out.println("Aprovado");
			
		} else if (media >=6.0 && media < 7.5) {
			
			System.out.println("Nota 1: " + nota1 );
			System.out.println("Nota 2: " + nota2 );
			System.out.println("Media: " + media );
			System.out.println("Conceito: C ");
			System.out.println("Aprovado");
			
		} else if (media >=4.0 && media < 6) {
			
			System.out.println("Nota 1: " + nota1 );
			System.out.println("Nota 2: " + nota2 );
			System.out.println("Media: " + media );
			System.out.println("Conceito: D ");
			System.out.println("Reprovado");
			
		} else if (media >=0 && media < 4) {
			
			System.out.println("Nota 1: " + nota1 );
			System.out.println("Nota 2: " + nota2 );
			System.out.println("Media: " + media );
			System.out.println("Conceito: E ");
			System.out.println("Reprovado");
		
	}
	

	}
	
}
