package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
 */ 

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double populacaoA ;
		double populacaoB ;
		double taxaA ;
		double taxaB ;
		int qtdeAno = 0;
		String pergunta;
		
		boolean validar= false;
		boolean repetir= false;
		
		do { 
			System.out.println ("Digite a populacao de A: ");
			populacaoA = scan.nextDouble();
			
			if (populacaoA > 0){
				validar = true;
			}else {
				System.out.println ("Digite um valor maior do que 0 ");
			}
			
			}while (!validar);
			
			validar = false;
		
			do { 
				System.out.println ("Digite a populacao de B: ");
				populacaoB = scan.nextDouble();
				
				if (populacaoB > 0 && populacaoB > populacaoA){
					validar = true;
				}else {
					System.out.println ("Digite um valor maior do que 0  e maior que populacao A: " + populacaoA);
				}	
			
				} while (!validar);
		
			validar = false;
			
			do { 
				System.out.println ("Digite a taxa de crescimento de A: ");
				taxaA= scan.nextDouble();
				
				if (taxaA > 0 ){
					validar = true;
				}else {
					System.out.println ("Digite um valor maior do que 0 ");
				}	
			
				} while (!validar);
			
			validar = false;
			
			do { 
				System.out.println ("Digite a taxa de crescimento de B: ");
				taxaB= scan.nextDouble();
				
				if (taxaB > 0 && taxaB < taxaA ){
					validar = true;
				}else {
					System.out.println ("Digite um valor maior do que 0 e menor que taxa A: " + taxaA);
				}	
			
			while (populacaoA < populacaoB) {
				
				populacaoA += ((populacaoA/100)* taxaA);
				populacaoB += ((populacaoB/100)* taxaB);
				qtdeAno++;
			}
			
			System.out.println ("Populacao A: " + populacaoA);
			System.out.println ("Populacao B: " + populacaoB);
			System.out.println ( qtdeAno + " anos para a populacao de A igualar ou ultrapassar B ");
		
		}while (repetir);
			
		}
		
	}
			