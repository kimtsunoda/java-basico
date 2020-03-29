package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo .O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado 
 * para desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:
 */ 

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double valor;
		double total = 0;
		
		System.out.println ("Digite o valor do Pao: ");
		valor = scan.nextDouble();
		
		System.out.println ("Preco do Pao " + valor);
		System.out.println ("Panificadora Pao de Ontem Tabela de Preco ");
		
	for (int i=1; i<=50; i++) {
		
		total = valor * i;
		
		System.out.println (i + " - R$ " + total);
	}
		
	}
}