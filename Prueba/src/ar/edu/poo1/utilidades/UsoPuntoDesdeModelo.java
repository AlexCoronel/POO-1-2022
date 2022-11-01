package ar.edu.poo1.utilidades;

import ar.edu.uno.poo1.modelo.Punto;

public class UsoPuntoDesdeModelo {

	public static void main(String[] args) {
		Punto p = new Punto();
		System.out.println(p.getX());
		p.setX(3.14);
		System.out.println(p.getX());
		Punto p2 = new Punto(9.8, Math.E);
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		Punto p3 = new Punto(6.0);
		System.out.println(p3.getX());
		System.out.println(p3.getY());
		Punto p0 = new Punto(0.0);
		Punto p4 = new Punto(3.0,4.0);
		System.out.println(p0.calcularDistancia(p4));
		double d = Punto.distancia(p0, p4);
		System.out.println(d);
		//
	}

}
