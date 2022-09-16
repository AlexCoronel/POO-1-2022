package biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BibliotecaTest {

	@Test
	public void bibliotecaNotNullTest() {
		Biblioteca biblio = new Biblioteca(5);
		assertNotNull(biblio);
	}

	@Test
	public void agregarLibroTest() {
		Biblioteca biblio = new Biblioteca(3);

		biblio.agregarLibro("Star Wars", "LucasFilms", Genero.CIENCIAFICCION, 500);
		biblio.agregarLibro("Star Wars 2", "LucasFilms", Genero.CIENCIAFICCION, 600);

		assertEquals(2, biblio.cuantosLibros());
	}

	@Test
	public void libroEnLaPosicionTest() {
		Biblioteca biblio = new Biblioteca(3);

		biblio.agregarLibro("Star Wars", "LucasFilms", Genero.CIENCIAFICCION, 500);
		biblio.agregarLibro("Star Wars 2", "LucasFilms", Genero.CIENCIAFICCION, 600);
		biblio.agregarLibro("Star Wars 3", "LucasFilms", Genero.CIENCIAFICCION, 700);

		assertEquals("Star Wars 2", biblio.libroEnLaPosicion(2));

	}

	@Test
	public void libroConMasPaginasTest() {
		Biblioteca biblio = new Biblioteca(3);

		biblio.agregarLibro("Star Wars", "LucasFilms", Genero.CIENCIAFICCION, 400);
		biblio.agregarLibro("Star Wars 2", "LucasFilms", Genero.CIENCIAFICCION, 500);
		biblio.agregarLibro("Star Wars 3", "LucasFilms", Genero.CIENCIAFICCION, 600);

		Libro esperado = new Libro("Star Wars 3", "LucasFilms", Genero.CIENCIAFICCION, 600);
		assertEquals(esperado, biblio.libroConMasPaginas());

	}

	@Test
	public void cuantosLibrosDelAutorTest() {
		Biblioteca biblio = new Biblioteca(2);

		biblio.agregarLibro("Star Wars", "LucasFilms", Genero.CIENCIAFICCION, 400);
		biblio.agregarLibro("Star Wars 2", "LucasFilms", Genero.CIENCIAFICCION, 500);

		Libro[] esperado = { new Libro("Star Wars", "LucasFilms", Genero.CIENCIAFICCION, 400),
				new Libro("Star Wars 2", "LucasFilms", Genero.CIENCIAFICCION, 500) };
		assertArrayEquals(esperado, biblio.librosDelAutor("LucasFilms"));

	}
	
	
		
	}


