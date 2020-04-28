package javabasico.aula34labs;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	uma classe chamada Contador, que tem um	atributo estático que é	incrementado sempre	que	a classe for instanciada. 
 * Crie	métodos	para zerar,	incrementar	e retornar o valor do contador. Desenvolva um programa para	testar essa	classe.
 */

public class Exercicio01 {

	public static void main(String[] args) {
		
		 Contador.imprimirContador();
		 
		 Contador.incrementar();
		 
		 Contador.imprimirContador();
		 
		 Contador.incrementar();
		 
		 Contador.imprimirContador();
		 
		 Contador.zerarContador();
		 
		 Contador.imprimirContador();
		 
	}

}
