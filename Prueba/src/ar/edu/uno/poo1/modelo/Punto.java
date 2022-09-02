package ar.edu.uno.poo1.modelo;

public class Punto {

	private double x;
	private double y;

	public Punto() {
		this(3.0, 9.0);
	}

	public Punto(double xy) {
		this(xy, xy);
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setX(double unX) {
		this.x = unX;
	}

	public double getx() {
		return this.x;
	}

	public void setY(double unY) {
		this.x = unY;
	}

	public double gety() {
		return this.y;
	}

	// raiz cuadrada de suma de los cuadrado de sus catetos

	public double calcularDistancia(Punto p) {
		return Math.hypot(this.x - p.x, this.y - p.y);
	}
	
	public static double distancia(Punto p1, Punto p2) {
		return Math.hypot(p1.x - p2.x, p1.y - p2.y);
		
	}

}
