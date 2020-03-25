
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author newuser
 * Objetivo Faça um programa para a leitura de duas notas parciais de um aluno.O programa deve calcular a média alcançada por aluno e apresentar:
	A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
	A mensagem "Reprovado", se a média for menor do que sete;
	A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite uma nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite outra nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media == 10) {
			System.out.println("Media: "+ media + " Aprovado com distincao");
			
		} else if (media >= 7) {
			System.out.println("Media: "+ media + " Aprovado");
			
		} else {
			System.out.println("Media: "+ media + " Reprovado");
			
		}
			
	}

}
