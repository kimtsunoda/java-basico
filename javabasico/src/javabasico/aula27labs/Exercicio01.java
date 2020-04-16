package javabasico.aula27labs;

public class Exercicio01 {
		public static void main (String []args) {
			Lampada lampada = new Lampada ();
			
			lampada.ligar();
			
			lampada.mostrarEstado();
			
			lampada.desligar();
			
			lampada.mostrarEstado();
		}
}
