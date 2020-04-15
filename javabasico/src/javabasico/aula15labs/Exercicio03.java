package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 *
 */

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o sexo (F ou M) : ");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Foi digitado F de Feminino");
		} else if (sexo.equalsIgnoreCase("m")){
			System.out.println("Foi digitado M de Masculino");
		}else {
			System.out.println("Sexo invalido");
			
		}
				
		

	}

}