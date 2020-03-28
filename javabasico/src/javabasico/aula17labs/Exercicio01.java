package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.
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
				 System.out.println("A nota digitada � : " + nota);
			 } else {
				 System.out.println("Digite uma nota valida!");
			 }
			
		} while (!validar);
		
	} 
	
}
