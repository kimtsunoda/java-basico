package javabasico.aula27labs;

public class Lampada {
			String tipo;
			int potencia;
			
			boolean ligada;
			
			void ligar () {
				ligada = true;
			}
			
			void desligar () {
				ligada = false;
			}
			
			void mostrarEstado () {
				if (ligada) {
					System.out.println("Lampada esta ligada");
				} else {
					System.out.println("Lampada esta desligada");
				}
			}
			
}
