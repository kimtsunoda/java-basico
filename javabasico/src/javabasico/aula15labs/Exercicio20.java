package javabasico.aula15labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
 */

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Telefonou para a v�tima? (S OU N)");
		String resposta1 = scan.next();
		System.out.println ("Esteve no local do crime? (S OU N)");
		String resposta2 = scan.next();
		System.out.println ("Mora perto da v�tima? (S OU N)");
		String resposta3 = scan.next();
		System.out.println ("Devia para a v�tima? (S OU N)");
		String resposta4 = scan.next();
		System.out.println ("\"J� trabalhou com a v�tima? (S OU N)");
		String resposta5 = scan.next();
		
		int cont = 0;
		
		if (resposta1.equalsIgnoreCase("s")){
			cont ++;
		}
		
		if (resposta2.equalsIgnoreCase("s")){
			cont ++;
		}
		
		if (resposta3.equalsIgnoreCase("s")){
			cont ++;
		}
		
		if (resposta4.equalsIgnoreCase("s")){
			cont ++;
		}
		
		if (resposta5.equalsIgnoreCase("s")){
			cont ++;
		}
		
		if (cont == 2){
			System.out.println("Suspeita");
		} else if (cont == 3 || cont == 4 ){
			System.out.println("Cumplice");
		} else if (cont == 5){
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}
		
}	
		
}