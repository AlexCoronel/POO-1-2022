package finaljulio22;

public class Libro {
	private String titulo;
	private String autor;
	private int paginas;
	private Genero genero;
	
	public Libro(String titulo, String autor, int paginas, Genero genero) {
		this.titulo=titulo;
		this.autor=autor;
		this.paginas=paginas;
		this.genero=genero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getPaginas() {
		return paginas;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public String toString() {
		return "Libro: " + titulo + " |" + " Autor: " + autor + " |" + " Paginas: " + paginas + " |" + " Genero: " + genero + " ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + paginas;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (genero != other.genero)
			return false;
		if (paginas != other.paginas)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	

}
