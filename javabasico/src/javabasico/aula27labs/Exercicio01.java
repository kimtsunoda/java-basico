package javabasico.aula27labs;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	uma classe para	representar	uma	l�mpada. Desenvolva	m�todos para ligar,	desligar a lampada.
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
