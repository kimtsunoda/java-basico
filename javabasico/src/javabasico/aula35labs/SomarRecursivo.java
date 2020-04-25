package javabasico.aula35labs;

public class SomarRecursivo {
		
	public static int somar (int num) {
		
		if (num == 1) {
			return 1;
		}
		
		return num + somar (num-1);
	}
}
