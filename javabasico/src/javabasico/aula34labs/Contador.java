package javabasico.aula34labs;

public class Contador {

	 private static int cont;
	 
	 public Contador () {
		 cont++;
	 }
	 
	 public static void incrementar () {
		 cont++;
	 }
	 
	 public static void zerarContador () {
		 cont = 0;
	 }
	 
	 public static int retornarContador () {
		return cont;
	 }
	 
	 public static void imprimirContador () {
			System.out.println (retornarContador());
		 }
}
