
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo .Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa 
 * Noite!" ou "Valor Inv�lido!", conforme o caso.
 */

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual turno voc� estuda? M-matutino ou V-Vespertino ou N- Noturno? ");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("m")) {
			System.out.println ("Bom dia!");
		} else if(turno.equalsIgnoreCase("v")) {
			System.out.println ("Boa tarde!");
		} else if(turno.equalsIgnoreCase("n")) {
			System.out.println ("Boa noite!");
		} else {
			System.out.println ("Valor Invalido!");
		}
		
	}
}