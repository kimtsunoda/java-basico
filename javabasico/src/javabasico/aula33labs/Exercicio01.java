package javabasico.aula33labs;

/**
 * @author Kim Tsunoda
 * Objetivo Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos para ligar,	desligar a lampada. Criando	todos os atributos
 * do tipo privado, métodos	getters e setters e construtores. Os métodos que serão utilizados pela classe de teste devem ser públicos.	
 * Se necessário, crie métodos privados	como auxiliares	para organizar melhor o	código	fonte	também.
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
