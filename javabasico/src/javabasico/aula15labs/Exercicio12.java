
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 */

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informar quantidade de horas trabalhas: ");
		double hrTrabalhada = scan.nextDouble();
		System.out.println("Informar valor horas : ");
		double valorHr = scan.nextDouble();
		
		double irper;
		double ir;
		double inss;
		double fgts;
		double desconto;
		double salarioLiquido;
		double salario = hrTrabalhada * valorHr;
		
		if (salario <= 900) {
			
			irper = 0;
			ir = (salario * irper) / 100;
			inss = salario * 0.10;
			fgts = salario * 0.11;
			desconto = ir + inss;
			salarioLiquido = salario - desconto;
			
			System.out.println("Salario Bruto: " + salario);
			System.out.println("IR (" + irper + " %) :" + ir);
			System.out.println("INSS (10%) : " + inss);
			System.out.println("FGTS (11%) : " + fgts);
			System.out.println("total de desconto : " + desconto);
			System.out.println("salario liquido : " + salarioLiquido);
			
		} else if (salario < 1500) {
			
			irper = 5;
			ir = (salario * irper) / 100;
			inss = salario * 0.10;
			fgts = salario * 0.11;
			desconto = ir + inss;
			salarioLiquido = salario - desconto;
			
			System.out.println("Salario Bruto: " + salario);
			System.out.println("IR ( " + irper + " %) :" + ir);
			System.out.println("INSS (10%) : " + inss);
			System.out.println("FGTS (11%) : " + fgts);
			System.out.println("total de desconto : " + desconto);
			System.out.println("salario liquido : " + salarioLiquido);
			
			
		} else if ( salario < 2500) {
			
			irper = 10;
			ir = (salario * irper) / 100;
			inss = salario * 0.10;
			fgts = salario * 0.11;
			desconto = ir + inss;
			salarioLiquido = salario - desconto;
			
			System.out.println("Salario Bruto: " + salario);
			System.out.println("IR ( " + irper + " %) :" + ir);
			System.out.println("INSS (10%) : " + inss);
			System.out.println("FGTS (11%) : " + fgts);
			System.out.println("total de desconto : " + desconto);
			System.out.println("salario liquido : " + salarioLiquido);
			
		} else {
			
			irper = 20;
			ir = (salario * irper) / 100;
			inss = salario * 0.10;
			fgts = salario * 0.11;
			desconto = ir + inss;
			salarioLiquido = salario - desconto;
			
			System.out.println("Salario Bruto: " + salario);
			System.out.println("IR ( " + irper + " %) :" + ir);
			System.out.println("INSS (10%) : " + inss);
			System.out.println("FGTS (11%) : " + fgts);
			System.out.println("total de desconto : " + desconto);
			System.out.println("salario liquido : " + salarioLiquido);
			
			
		}
	
	}
	
}	