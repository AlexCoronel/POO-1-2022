package ejerciciosRepaso;

/*Escribir una funci�n consonantes que recibe una cadena de caracteres
  y devuelve la cadena que resulta de eliminar todas las vocales de la cadena recibida. Por ejemplo:
 consonantes("hola como estas"); // devuelve "hl cm sts"*/

public class Ejercicio_29 {

	public String consonante(String str) {

		String n1;

		n1 = str.replace("a", "");
		n1 = n1.replace("e", "");
		n1 = n1.replace("i", "");
		n1 = n1.replace("o", "");
		n1 = n1.replace("u", "");

		return n1;
	}

	String consonantes(String str) {

		String vocales = "aeiouAEIOU";
		String sinVocales = str;

		for (int i = 0; i < vocales.length(); i++) {
			sinVocales = sinVocales.replace(vocales.charAt(i), ' ');
		}
		return sinVocales;
	}

	public static void main(String[] args) {

		Ejercicio_29 a = new Ejercicio_29();

		System.out.println(a.consonantes("Holacomoestas"));

	}

}
