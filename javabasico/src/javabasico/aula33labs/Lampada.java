package javabasico.aula33labs;

public class Lampada {
			private String tipo;
			private int potencia;
			private boolean ligada;
			
			
			public String getTipo() {
				return tipo;
			}

			public void setTipo(String tipo) {
				this.tipo = tipo;
			}

			public int getPotencia() {
				return potencia;
			}

			public void setPotencia(int potencia) {
				this.potencia = potencia;
			}

			public boolean isLigada() {
				return ligada;
			}

			public void setLigada(boolean ligada) {
				this.ligada = ligada;
			}

			public void ligar () {
			 setLigada(true);
			}
	
			void desligar () {
				setLigada(false);
			}
	
			void mostrarEstado () {
				if (isLigada()) {
					System.out.println("Lampada esta ligada!!!");
				} else {
					System.out.println("Lampada esta desligada!!!");
				}
			}
			
}		
