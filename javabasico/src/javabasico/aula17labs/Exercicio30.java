package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que ser� digitado pelo usu�rio, mas a tabuada n�o deve necessariamente iniciar em 1 e terminar em
 *  10, o valor inicial e final devem ser informados tamb�m pelo usu�rio, conforme exemplo abaixo:
 */ 

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int numero;
		int inicio;
		int fim;
		int tabuada;
		boolean validar = false;
		
		do {
			System.out.println("Digite um numero entre 1 e 10 : ");
			numero = scan.nextInt();
	
			if (numero >= 1 || numero <=10) {
				validar =true;
			} else {
				System.out.println("Digite um numero entre 1 e 10");
			}
			
		} while (!validar);
		
		validar = false;
		
		do {
			System.out.println("Comecar a tuabada por: ");
			inicio = scan.nextInt();
	
			if (inicio >= 1 || inicio <=10) {
				validar =true;
			} else {
				System.out.println("Digite um numero entre 1 e 10");
			}
			
		} while (!validar);

		validar = false;
		
		do {
			System.out.println("Terminar a tuabada em: ");
			fim = scan.nextInt();
	
			if (fim > inicio && fim <=10) {
				validar =true;
			} else {
				System.out.println("Digite um numero maior que " + inicio + (" e menor que 10") );
			}
			
		} while (!validar);
		
		System.out.println("Vou montar a tabuada de " +  numero + " come�ando em " + inicio + " e terminando em " + fim);
		
		
		for (int i =inicio ; i <= fim; i++ ) {
			tabuada = numero * i;
			 System.out.println (numero + " X " + i + " = " + tabuada);
			}
		
	}
		
	}



