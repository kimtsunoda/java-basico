package javabasico.aula17labs;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que imprima na tela apenas os n�meros �mpares entre 1 e 50.
 */ 

public class Exercicio09 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 50; i++) {

			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
		
	}
			