package ejerciciosRepaso;

/*Escribir una función que calcule la suma de los múltiplos de 3 o 5,
   mayores o iguales que 0 y menores que un parámetro n.
 
Por ejemplo la llamada:

	sumaMultiplos(10); // devuelve 23 (3+5+6+9)
	sumaMultiplos(16); // devuelve 60 (3+5+6+9+10+12+15)*/

public class Ejercicio_9 {

	static void SumaMultiplos(int n) {

		int suma = 0;

		for (int i = 0; i < n; i++) {

			if ((i % 3 == 0) || (i % 5 == 0)) {

				suma += i;
			}

			System.out.println(suma);
		}
	}

	public static void main(String[] args) {

		SumaMultiplos(10);
		//SumaMultiplos(16);
		//SumaMultiplos(20);

	}

}
