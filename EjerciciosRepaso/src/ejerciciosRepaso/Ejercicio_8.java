package ejerciciosRepaso;

//Desarrollar una funci�n que muestre por pantalla los primeros n n�meros naturales
//considerando al 0 (cero) como primer n�mero natural, siendo n un valor que se pasa por par�metro.

public class Ejercicio_8 {

	static void PrimerosNaturales(int n) {

		for (int i = 0; i < n; i++) {
			
			// if (i < n - 1)
			// System.out.print(i + ",");
			// else
			// System.out.print(i);

			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		PrimerosNaturales(25);

	}

}
