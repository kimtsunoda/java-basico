package javabasico.aula17labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Um funcion�rio de uma empresa recebe aumento salarial anualmente.Sabe-se que: Esse funcion�rio foi contratado em 1995, com sal�rio inicial de R$ 1.000,00;
 * a. Em 1996 recebeu aumento de 1,5% sobre seu sal�rio inicial;
 * b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. Fa�a um programa que determine o sal�rio atual desse funcion�rio. 
 * Ap�sconcluir isto, altere o programa permitindo que o usu�rio digite o sal�rio inicial do funcion�rio
 */ 

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double salario;
		double aumento = 1.5;
		
		System.out.println("Digite o salario em 1995 :");
		salario = scan.nextDouble();
		
		DecimalFormat format = new DecimalFormat ("###,###.##");
		
		salario = salario + ((salario /100) * aumento);
		
		for (int i =1997; i < 2020; i++) {
			aumento += aumento;
		
			salario += ((salario/100) * aumento);
			
			System.out.println(i + " = " +  format.format(salario) + " - " + aumento + " %");
		}
		
	
	}
			 
	}



