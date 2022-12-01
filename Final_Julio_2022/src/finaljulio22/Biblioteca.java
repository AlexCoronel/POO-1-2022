package finaljulio22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
	private ArrayList<Libro> libros;

	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
	}

	public int cuantosLibros() {
		return this.libros.size();
	}

	public boolean agregarLibro(String titulo, String autor, int paginas, Genero genero) {
		libros.add(new Libro(titulo, autor, paginas, genero));
		return true;
	}

	public List<Libro> librosDelGenero(Genero genero) {
		ArrayList<Libro> aux = new ArrayList<Libro>();

		for (Libro cadaUno : libros) {
			if (cadaUno.getGenero().equals(genero)) {
				aux.add(cadaUno);
			}
		}
		return aux;
	}

	public Libro libroConMasPaginas() {
		Libro maxPaginas = libros.get(0);
		int cont = 0;
		for (Libro cadaUno : libros) {
			if (cadaUno.getPaginas() > maxPaginas.getPaginas()) {
				maxPaginas = libros.get(cont);
			}
			cont++;
		}
		return maxPaginas;
	}

	public int cuantosLibrosDelAutor(String autor) {
		int cont = 0;
		for (Libro cadaUno : libros) {
			if (cadaUno.getAutor().equals(autor)) {
				cont++;
			}
		}
		return cont;
	}

	public List<Libro> librosDelAutor(String autor) {
		ArrayList<Libro> aux = new ArrayList();

		for (Libro cadaUno : libros) {
			if (cadaUno.getAutor().equals(autor)) {
				aux.add(cadaUno);
			}
		}
		return aux;
	}

	public Map<Genero, Integer> librosPorGenero() {
		Map<Genero, Integer> aux = new HashMap();

		for (Libro cadaUno : libros) {
			if (aux.containsKey(cadaUno.getGenero())) {
				aux.put(cadaUno.getGenero(), aux.get(cadaUno.getGenero()) + 1);

			} else {
				aux.put(cadaUno.getGenero(), 1);
			}

		}
		return aux;
	}

	public static void main(String[] args) {
		Biblioteca biblio = new Biblioteca();

		biblio.agregarLibro("Harry postre", "JK", 2000, Genero.FICCION);
		biblio.agregarLibro("MIKE TYSON", "DON KING", 2500, Genero.POESIA);
		biblio.agregarLibro("Harry pasta", "JK", 1500, Genero.FICCION);
		biblio.agregarLibro("ROCKO", "MODERN'S LIFE", 4000, Genero.FICCION);

		System.out.println(biblio.cuantosLibros());
		System.out.println(biblio.librosDelGenero(Genero.FICCION));
		System.out.println(biblio.libroConMasPaginas());
		System.out.println(biblio.cuantosLibrosDelAutor("JK"));
		System.out.println(biblio.librosDelAutor("JK"));
		System.out.println(biblio.librosPorGenero());
	}

}
