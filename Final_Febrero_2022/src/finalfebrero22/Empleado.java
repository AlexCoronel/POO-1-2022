package finalfebrero22;

public class Empleado {
	private String nombre;
	private String apellido;
	private boolean entradaEntregada = false;

	public Empleado(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	

	public boolean isEntradaEntregada() {
		return entradaEntregada;
	}

	public void setEntradaEntregada(boolean entradaEntregada) {
		this.entradaEntregada = entradaEntregada;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", entradaEntregada=" + entradaEntregada + "]";
	}

	
	
	

}
