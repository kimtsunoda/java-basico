package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * objetivo Faca a serie fibonacci do n-esimo termo.
 */ 

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Digite n-esimo termo: ");
		int termo = scan.nextInt();
	
		int primeiro = 1 ;
		int segundo =  1;
		int proximo;
		
		System.out.println (primeiro);
		System.out.println (segundo);
		
		for (int i=3; i <= termo; i++ ) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println (proximo);
			
		}
	}
		
	}

