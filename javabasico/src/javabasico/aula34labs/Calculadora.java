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
	
public static int fatorial(int num) {
		
		if (num ==0) {
			return 1;
		}
		
		int total = 1;
		for (int i = num ; i > 1 ; i--) {
		
		total *= i;
		}
		
		return total;
		
	}
	
	public static void imprimirTotal (int num, int fatorial) {
		
		System.out.print (num + "!= " );
		
		for (int i = num; i > 1 ; i--) {
			System.out.print (i + " X " );
		}
		
		System.out.print ("1 = " + fatorial );
	}
	
}