package finalfebrero22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Jugueteria {
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private Set<String> nombres = new TreeSet<String>();
	private Queue<Empleado> listaDeEspera = new ArrayDeque<Empleado>();

	public void agregarEmpleado(Empleado e) {
		empleados.add(e);
		agregarNombre(e);
	}

	public void agregarNombre(Empleado e) {
		nombres.add(e.getNombre());
	}

	public Empleado elegirEmpleadoAlAzar() {
		int index = (int) (Math.random() * empleados.size());

		return empleados.get(index);
	}

	public List<String> nombresDeNuevosJuguetes() {
		ArrayList<String> aux = new ArrayList<String>();

		for (String cadaUno : nombres) {
			if (!aux.contains(cadaUno)) {
				aux.add(cadaUno);
			}
		}
		return aux;
	}

	public void ponerEnListDeEspera(Empleado e) {

		listaDeEspera.add(e);

	}

	public void entregarEntradas() {
		for (Empleado cadaUno : listaDeEspera) {
			cadaUno.setEntradaEntregada(true);
			System.out.println(cadaUno);
		}
	}

	public void listarNombres(List<String> nombres) throws FileNotFoundException {

		PrintWriter pr = new PrintWriter(new File("./src/finalfebrero22/nombresDeJuguetes.out"));

		for (String cadaUno : nombres) {
			pr.println(cadaUno);
		}
		pr.close();
	}

	public static void main(String[] args) throws IOException {
		Jugueteria jet = new Jugueteria();
		Empleado Juan = new Empleado("Juan", "Perez");
		Empleado Ana = new Empleado("Ana", "Flyn");
		Empleado Jorge = new Empleado("Jorge", "Tais");
		Empleado Juan_1 = new Empleado("Juan", "Lab");
		jet.agregarEmpleado(Juan);
		jet.agregarEmpleado(Ana);
		jet.agregarEmpleado(Jorge);
		jet.agregarEmpleado(Juan_1);
		System.out.println(jet.elegirEmpleadoAlAzar());
		System.out.println(jet.nombresDeNuevosJuguetes());
		jet.ponerEnListDeEspera(Ana);
		jet.ponerEnListDeEspera(Juan);
		jet.ponerEnListDeEspera(Juan_1);
		jet.entregarEntradas();
		jet.listarNombres(jet.nombresDeNuevosJuguetes());

	}

}