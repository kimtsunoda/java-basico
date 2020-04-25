package javabasico.aula34labs;

public class Fatorial {
	   
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
