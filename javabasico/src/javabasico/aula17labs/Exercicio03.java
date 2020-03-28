package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que leia e valide as seguintes informações:
 */

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		boolean validar = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		do {
			System.out.println("Digite o nome :"); 
			nome = scan.next();
			 
			 if (nome.length()>=3) {
				 validar = true;
			 } else {
				 System.out.println("Nome precisa ter no minimo 3 letras");
			 }
		} while (!validar);
		
		validar = false;
		
		do {
			System.out.println("Digite a idade :"); 
			idade = scan.nextInt();
			 
			 if (idade >=0 && idade <=150) {
				 validar = true;
			 } else {
				 System.out.println("Digite a idade entre 0 e 150!");
			 }
		} while (!validar);
		
		validar = false;
		
		do {
			System.out.println("Digite o salario :"); 
			salario = scan.nextInt();
			 
			 if (salario >0) {
				 validar = true;
			 } else {
				 System.out.println("Digite um salario maior que 0!");
			 }
		} while (!validar);
		
		validar = false;
		
		do {
			System.out.println("Digite o sexo: (F ou M)"); 
			sexo = scan.next();
			 
			 if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") ) {
				 validar = true;
			 } else {
				 System.out.println("Digite F ou M !");
			 }
		} while (!validar);

		validar = false;
		
		do {
			System.out.println("Digite o estado civil: ( S - Solteiro(a), C - Casado(a), Viuvo(a), D - Divorciado(a))"); 
			estadoCivil = scan.next();
			 
			 if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d") ) {
				 validar = true;
			 } else {
				 System.out.println("Digite  S, C, V ou D !");
			 }
		} while (!validar);
	} 
	
}
