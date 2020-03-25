package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
 	salário no referido mês.
 */

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		double horaTrabalhada = scan.nextDouble();
		
		double salario = valorHora * horaTrabalhada;
		
		System.out.println("O Salario será " + salario);

	}

}
