package javabasico.aula33labs;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	uma classe para	representar	uma	l�mpada. Desenvolva	m�todos para ligar,	desligar a lampada. Criando	todos os atributos
 * do tipo privado, m�todos	getters e setters e construtores. Os m�todos que ser�o utilizados pela classe de teste devem ser p�blicos.	
 * Se necess�rio, crie m�todos privados	como auxiliares	para organizar melhor o	c�digo	fonte	tamb�m.
 */

public class Exercicio01 {
		public static void main (String []args) {
			Lampada lampada = new Lampada ();
			
			lampada.ligar();
			
			lampada.mostrarEstado();
			
			lampada.desligar();
			
			lampada.mostrarEstado();
		}
}
