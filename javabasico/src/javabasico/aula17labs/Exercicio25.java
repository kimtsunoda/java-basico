package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro informado pelo usuário.
 */ 

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String registroCompra;
		int qtdeProduto;
		String output;
		double preco;
		double total;
		double pago;
		double troco;
		
		boolean sair = false;
		
		do {
			System.out.println ("Deseja registrar uma nova compra? (S/N)");
			registroCompra = scan.next();
			
			if (registroCompra.equalsIgnoreCase("S")) {
				
				output = "Lojas Tabajara \n";
				
				System.out.println ("Digite a quantadade de produtos: ");
				qtdeProduto = scan.nextInt();
				
				total = 0;
				
				for (int i=1; i<= qtdeProduto; i++) {
					System.out.println ("Digite o preco de " + i + ":");
					preco = scan.nextDouble();
					output +=  "Produto " + i + " : R$ " + preco + "\n";
					total += preco;
				}
				
				output += "Total: R$ " + total + "\n";
				
				System.out.println ("Valor total " + total);
				
				System.out.println ("Digite o valor pago: " );
				pago = scan.nextDouble();
				
				output += "dinheiro: R$ " + pago + "\n";
				
				troco = pago - total;
				
				output += "troco: R$ " + troco;
				
				System.out.println(output);
				
				
			} else {
				sair = true;
			}
			
			
		}while (!sair);
		
	}
}