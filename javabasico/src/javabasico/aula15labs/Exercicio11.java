
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo .As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
 */

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informar o salario : ");
		double salario = scan.nextDouble();
		
		if (salario <= 280) {
			
			double percentual = 20;
			double aumento = (salario * percentual) / 100;
			double novosalario = salario + aumento;
			
			System.out.println("Salario antes do reajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: " + percentual);
			System.out.println("Valor de aumento: " + aumento);
			System.out.println("Novo Salario: " + novosalario);
			
		} else if (salario < 700) {
			
			double percentual = 15;
			double aumento = (salario * percentual) / 100;
			double novosalario = salario + aumento;
			
			System.out.println("Salario antes do reajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: " + percentual);
			System.out.println("Valor de aumento: " + aumento);
			System.out.println("Novo Salario: " + novosalario);
			
		} else if ( salario < 1500) {
			
			double percentual = 10;
			double aumento = (salario * percentual) / 100;
			double novosalario = salario + aumento;
			
			System.out.println("Salario antes do reajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: " + percentual);
			System.out.println("Valor de aumento: " + aumento);
			System.out.println("Novo Salario: " + novosalario);
		} else {
			
			double percentual = 5;
			double aumento = (salario * percentual) / 100;
			double novosalario = salario + aumento;
			
			System.out.println("Salario antes do reajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: " + percentual);
			System.out.println("Valor de aumento: " + aumento);
			System.out.println("Novo Salario: " + novosalario);
			
		}
	
	}
	
}	