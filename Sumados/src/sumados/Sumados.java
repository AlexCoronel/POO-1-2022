package sumados;

public class Sumados {

	static void sumar() {

		int suma = 0;

		for (int i = 0; i < 1000; i++) {

			suma += i;

			System.out.println(suma);

		}
	}

	public static void main(String[] args) {

		Sumados.sumar();

	}

}
