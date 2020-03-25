package javabasico.aula13labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo: Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê: salário bruto, quanto pagou ao INSS, quanto pagou ao sindicato, o salário líquido, calcule os descontos e o salário líquido, conforme a tabela
abaixo:
 */

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		double horaTrabalhada = scan.nextDouble();
		
		double salarioBruto = valorHora * horaTrabalhada;
		double ir = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double totalDesconto = ir + inss + sindicato;
		double salarioLiquido = salarioBruto - totalDesconto;
		
		
		System.out.println("O Salario Bruto é " + salarioBruto);
		System.out.println("Pagou de INSS " + inss);
		System.out.println("Pagou de Sindicato " + sindicato);
		System.out.println("Pagou de IR " + ir);
		System.out.println("Total de desconto " + totalDesconto);
		System.out.println("O Salario liquido é " + salarioLiquido);

	}

}
