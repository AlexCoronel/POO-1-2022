package biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Biblioteca {

	private Libro[] libros;
	private int cantLibros;

//	1. Se construya a partir de la máxima cantidad de libros que puede contener.
	public Biblioteca(int maxCantidadDeLibros) {
		this.libros = new Libro[maxCantidadDeLibros];
	}

//	2. Se pueda consultar la cantidad de libros que contiene.
	public int cuantosLibros() {
		return this.cantLibros;
	}

//	3. Se pueda agregar un libro indicando su título, autor, Genero y cantidad de páginas, siempre y cuando haya
//
//	lugar en la Biblioteca. Los Generos literarios que le gustan a éste bibiotecario son: POESIA, CIENCIAFIC-
//	CION, AVENTURA, NOVELA, HISTORIA, INFANTILES.

	public boolean agregarLibro(String titulo, String autor, Genero genero, int paginas) {
		if (this.cantLibros < this.libros.length) {
			libros[cantLibros] = new Libro(titulo, autor, genero, paginas);
			cantLibros++;
			return true;
		}
		return false;
	}

//	4. Devuelva el título de un libro a partir de la posición.
	public String libroEnLaPosicion(int posicion) {
		if (posicion < 1 || posicion > this.cantLibros)
			throw new Error("Posicion fuera de los límites");
		return this.libros[posicion - 1].getTitulo();

	}

//	5. Devuelva el libro con más cantidad de páginas.
	public Libro libroConMasPaginas() {
		Libro max = libros[0];

		for (int i = 1; i < libros.length; i++) {
			if (libros[i].getPaginas() > max.getPaginas()) {
				max = libros[i];
			}
		}
		return max;
	}

//	6. Se pueda consultar cuantos libros hay de determinado autor.
	public int cuantosLibrosDelAutor(String autor) {
		int cont = 0;
		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getAutor().equals(autor)) {
				cont++;
			}
		}
		return cont;
		//
	}

//	7. Devuelva un arreglo con todos los Libros de un autor que se pasa por parámetro.
	public Libro[] librosDelAutor(String autor) {
		int contLibros = 0;
		int tam = this.cuantosLibrosDelAutor(autor);
		Libro[] librosDelAutor = new Libro[tam];

		for (Libro libro : libros) {
			if (libro.getAutor().equals(autor)) {
				librosDelAutor[contLibros] = libro;
				contLibros++;
			}

		}
		return librosDelAutor;
	}
//	8. Calcule el tiempo (en minutos) que llevaría leer todos los libros, asumiendo que se tarda 1 minuto por página.

	public int tiempoEnLeerTodosLosLibros() {
		int contMinutos = 0;
		for (Libro libro : libros) {
			contMinutos += libro.getPaginas();
		}
		return contMinutos;
	}

//	9. Informe por pantalla la cantidad de libros que hay por cada Genero literario.
	public void librosPorGeneroLiterario() {
		int contLibrosPoesia = 0;
		int contLibrosFiccion = 0;
		int contLibrosAventura = 0;
		int contLibrosNovela = 0;
		int contLibrosHistoria = 0;
		int contLibrosInfantiles = 0;

		for (Libro libro : libros) {
			if (libro.equals(libro.getGenero().POESIA))
				contLibrosPoesia++;
			if (libro.equals(libro.getGenero().CIENCIAFICCION))
				contLibrosFiccion++;
			if (libro.equals(libro.getGenero().CIENCIAFICCION))
				contLibrosAventura++;

		}
	}

	public static void main(String[] args) {
		Biblioteca biblio = new Biblioteca(3);

		biblio.agregarLibro("Star Wars", "LucasFilms", Genero.CIENCIAFICCION, 500);
		biblio.agregarLibro("Star Wars 2", "LucasFilms", Genero.CIENCIAFICCION, 600);

		System.out.println(biblio.cuantosLibros());

	}

}
