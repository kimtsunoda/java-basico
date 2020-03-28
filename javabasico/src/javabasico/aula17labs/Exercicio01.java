package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double nota;
		boolean validar = false;
		
		do {
			 System.out.println("Digite uma nota entre 0 e 10 :"); 
			 nota = scan.nextDouble();
			 
			 if (nota >= 0 && nota <= 10) {
				 validar = true;
				 System.out.println("A nota digitada é : " + nota);
			 } else {
				 System.out.println("Digite uma nota valida!");
			 }
			
		} while (!validar);
		
	} 
	
}
