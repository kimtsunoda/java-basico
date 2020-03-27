
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo .As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
 */

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informar o salario: ");
		double salario = scan.nextDouble();
		
		double percentual;
		double aumento;
		double novosalario;
		
		if (salario <= 280) {
			
			percentual = 20;
			aumento = (salario * percentual) / 100;
			novosalario = salario + aumento;
			
			System.out.println("Salario antes do reajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: " + percentual);
			System.out.println("Valor de aumento: " + aumento);
			System.out.println("Novo Salario: " + novosalario);
			
		} else if (salario < 700) {
			
			percentual = 15;
			aumento = (salario * percentual) / 100;
			novosalario = salario + aumento;
			
			System.out.println("Salario antes do reajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: " + percentual);
			System.out.println("Valor de aumento: " + aumento);
			System.out.println("Novo Salario: " + novosalario);
			
		} else if ( salario < 1500) {
			
			percentual = 10;
			aumento = (salario * percentual) / 100;
			novosalario = salario + aumento;
			
			System.out.println("Salario antes do reajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: " + percentual);
			System.out.println("Valor de aumento: " + aumento);
			System.out.println("Novo Salario: " + novosalario);
		} else {
			
			percentual = 5;
			aumento = (salario * percentual) / 100;
			novosalario = salario + aumento;
			
			System.out.println("Salario antes do reajuste: " + salario);
			System.out.println("Percentual de aumento aplicado: " + percentual);
			System.out.println("Valor de aumento: " + aumento);
			System.out.println("Novo Salario: " + novosalario);
			
		}
	
	}
	
}	