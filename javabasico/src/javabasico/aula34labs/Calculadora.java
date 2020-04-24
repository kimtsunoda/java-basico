package javabasico.aula34labs;

public class Calculadora {
	
	public static int somar (int numero1, int numero2) {
		return numero1 + numero2 ;
	}
	
	public static int subtrair (int numero1, int numero2) {
		return numero1 - numero2 ;
	}
	
	public static int dividir (int numero1, int numero2) {
		return numero1 / numero2 ;
	}
	
	public static int multiplicar (int numero1, int numero2) {
		return numero1 * numero2 ;
	}
	
	public static int potencia (int numero1, int numero2) {
		 int total =1;
		
		 for (int i=1; i <= numero2 ; i++) {
			 	total *= numero1;
		 }
		 return total ;
	}
	
	public static void imprimirResultado (int num) {
		System.out.println (num);
	}
	
}