
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 */

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite o tipo de combustivel: A- Alcool ou G-Gasolina: ");
		String combustivel = scan.next();
		System.out.println ("Digite a quantidade de combustivel: ");
		double quantidade = scan.nextDouble();
		double totalBruto = 0;
		double desconto = 0;
		double totalLiquido = 0;
		
		if (combustivel.equalsIgnoreCase("a")) {
			
			if (quantidade <= 20) {
				totalBruto = (quantidade * 1.9);
				desconto = totalBruto * 0.03;
				totalLiquido = totalBruto - desconto;
				System.out.println("Valor a Pagar : " + totalLiquido);
			} else if (quantidade > 20) {
				totalBruto = (quantidade * 1.9);
				desconto = totalBruto * 0.05;
				totalLiquido = totalBruto - desconto;
				System.out.println("Valor a Pagar : " + totalLiquido);
			}
		} else if (combustivel.equalsIgnoreCase("g")) {
			
			if (quantidade <= 20) {
				totalBruto = (quantidade * 2.5);
				desconto = totalBruto * 0.04;
				totalLiquido = totalBruto - desconto;
				System.out.println("Valor a Pagar : " + totalLiquido);
			} else if (quantidade > 20) {
				totalBruto = (quantidade * 2.5);
				desconto = totalBruto * 0.06;
				totalLiquido = totalBruto - desconto;
				System.out.println("Valor a Pagar : " + totalLiquido);
			}
		
}
	
}

}