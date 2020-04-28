package javabasico.aula34labs;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	uma	classe Calculadora que tenha os seguintes métodos: somar, subtrair, multiplicar, dividir (dois	números),
 * elevar à potência n.Desenvolva um programa para testar essa classe.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		
		 Calculadora.imprimirResultado(Calculadora.somar(1, 3));
		 
		 Calculadora.imprimirResultado(Calculadora.subtrair(10, 2));
		 
		 Calculadora.imprimirResultado(Calculadora.dividir(4, 2));
		 
		 Calculadora.imprimirResultado(Calculadora.multiplicar(5, 7));
		 
		 Calculadora.imprimirResultado(Calculadora.potencia(3, 3));
	}

}
