package javabasico.aula17labs;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os n�meros um ao lado do outro.
 */ 

public class Exercicio06 {

	public static void main(String[] args) {
		
		for (int i=1; i <=20; i++) {
			System.out.println(i);
		}
		
		for (int i=1; i <=20; i++) {
			System.out.print(i + " ");
		}
	}
		
	}
			