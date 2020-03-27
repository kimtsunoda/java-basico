
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:

 */

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Escolha o tipo de Carne: ");
		System.out.println ("1 - File duplo ");
		System.out.println ("2 - Alcatra ");
		System.out.println ("3 - Picanha");
		int tipoCarne = scan.nextInt();
		
		System.out.println ("Digite a quantidade: ");
		int qtdeCarne = scan.nextInt();
		
		double precoCarne=0;
		
		if (tipoCarne == 1) {
			System.out.println(qtdeCarne + " kg - File duplo");
			
			if (qtdeCarne <5 ) {
				precoCarne = 4.9;
			} else {
				precoCarne = 5.8;
			}
		
		} else if (tipoCarne == 2) {
			System.out.println(qtdeCarne + " kg - Alcatra");
			
			if (qtdeCarne <5 ) {
				precoCarne = 5.9;
			} else {
				precoCarne = 6.8;
			}
		} else if (tipoCarne == 3) {
			System.out.println(qtdeCarne + " kg - Picanha");
			if (qtdeCarne <5 ) {
				precoCarne = 6.9;
			} else {
				precoCarne = 7.8;
			}
		}
		
		double total = qtdeCarne * precoCarne;
		System.out.println (qtdeCarne + "Kg * " + precoCarne + " = " + total );
		
		System.out.println ("Pagamento no cartao Tabajara? S(sim) ou N(Nao)" );
		String cartao = scan.next();
		
		if(cartao.equalsIgnoreCase("S")) {
			double desconto = (total/100)*5;
			System.out.println ("Desconto " + desconto );
			System.out.println ("Valor a pagar " + (total - desconto) );
		} else {
			System.out.println ("Valor a pagar " + total);
		}
		
	}
}
