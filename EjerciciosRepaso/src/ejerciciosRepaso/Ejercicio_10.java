package ejerciciosRepaso;

//Se ingresa un valor num�rico por consola, determinar e informar si se trata de un n�mero primo o no.

public class Ejercicio_10 {

	static boolean esPrimo(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(esPrimo(6));
		System.out.println(esPrimo(5));
		

	}

}
