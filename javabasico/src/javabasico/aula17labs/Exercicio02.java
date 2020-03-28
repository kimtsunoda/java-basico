package javabasico.aula17labs;

import java.util.Scanner;

/**
 * @author Kim Tsunoda
 * Objetivo Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagemde erro e voltando a pedir as informações.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		boolean validar = false;
		
		do {
			System.out.println("Digite o nome do usuario:"); 
			 String usuario = scan.next();
			 System.out.println("Digite uma senha:"); 
			 String senha = scan.next();
			 
			 if (usuario.equalsIgnoreCase(senha)) {
				 
				 System.out.println("A senha nao pode ser a mesma que o nome de usuario!");
				 		
			 } else {
				 validar = true; 
				 System.out.println("Usuario cadastrado com sucesso!");
			 }
			
		} while (!validar);
		
	} 
	
}
