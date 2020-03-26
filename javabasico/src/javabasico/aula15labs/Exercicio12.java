
package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 */

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informar quantidade de horas trabalhas : ");
		double hrTrabalhada = scan.nextDouble();
		System.out.println("Informar valor horas : ");
		double valorHr = scan.nextDouble();
		
		double salario = hrTrabalhada * valorHr;
		
		if (salario <= 900) {
			
			double irper = 0;
			double ir = (salario * irper) / 100;
			double inss = salario * 0.10;
			double fgts = salario * 0.11;
			double desconto = ir + inss;
			double salarioLiquido = salario - desconto;
			
			System.out.println("Salario Bruto: " + salario);
			System.out.println("IR (" + irper + " %) :" + ir);
			System.out.println("INSS (10%) : " + inss);
			System.out.println("FGTS (11%) : " + fgts);
			System.out.println("total de desconto : " + desconto);
			System.out.println("salario liquido : " + salarioLiquido);
			
		} else if (salario < 1500) {
			
			double irper = 5;
			double ir = (salario * irper) / 100;
			double inss = salario * 0.10;
			double fgts = salario * 0.11;
			double desconto = ir + inss;
			double salarioLiquido = salario - desconto;
			
			System.out.println("Salario Bruto: " + salario);
			System.out.println("IR ( " + irper + " %) :" + ir);
			System.out.println("INSS (10%) : " + inss);
			System.out.println("FGTS (11%) : " + fgts);
			System.out.println("total de desconto : " + desconto);
			System.out.println("salario liquido : " + salarioLiquido);
			
			
		} else if ( salario < 2500) {
			
			double irper = 10;
			double ir = (salario * irper) / 100;
			double inss = salario * 0.10;
			double fgts = salario * 0.11;
			double desconto = ir + inss;
			double salarioLiquido = salario - desconto;
			
			System.out.println("Salario Bruto: " + salario);
			System.out.println("IR ( " + irper + " %) :" + ir);
			System.out.println("INSS (10%) : " + inss);
			System.out.println("FGTS (11%) : " + fgts);
			System.out.println("total de desconto : " + desconto);
			System.out.println("salario liquido : " + salarioLiquido);
			
		} else {
			
			double irper = 20;
			double ir = (salario * irper) / 100;
			double inss = salario * 0.10;
			double fgts = salario * 0.11;
			double desconto = ir + inss;
			double salarioLiquido = salario - desconto;
			
			System.out.println("Salario Bruto: " + salario);
			System.out.println("IR ( " + irper + " %) :" + ir);
			System.out.println("INSS (10%) : " + inss);
			System.out.println("FGTS (11%) : " + fgts);
			System.out.println("total de desconto : " + desconto);
			System.out.println("salario liquido : " + salarioLiquido);
			
			
		}
	
	}
	
}	