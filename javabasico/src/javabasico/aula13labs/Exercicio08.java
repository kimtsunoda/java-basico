package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
 	sal�rio no referido m�s.
 */

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		double horaTrabalhada = scan.nextDouble();
		
		double salario = valorHora * horaTrabalhada;
		
		System.out.println("O Salario ser� " + salario);

	}

}
