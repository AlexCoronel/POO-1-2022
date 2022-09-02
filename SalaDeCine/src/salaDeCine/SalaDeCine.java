package salaDeCine;

public class SalaDeCine {

	private boolean[][] sala;
	private int cantidadDeButacas;

	public SalaDeCine(int butacas, int filas) {

		this.sala = new boolean[filas][butacas];
	}

	public boolean estaOcupada(int fila, int asiento) {
		return this.sala[fila][asiento];
	}

	public void ocuparButaca(int fila, int asiento) {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[0].length; j++) {
				if (!this.estaOcupada(fila, asiento)) {
					if (i == fila && j == asiento) {
						sala[i][j] = true;
						this.cantidadDeButacas++;
					}
				}
			}
		}
	}

	public void mostrarCine() {
		for (boolean[] asientos : sala) {
			for (int j = 0; j < sala[0].length; j++) {
				System.out.print(asientos[j] + " ");

			}
			System.out.println(" ");
		}
	}

	public int cantidadDeButacasOcupadas() {
		return this.cantidadDeButacas;
	}

	boolean hayEspacioPara(int cantidadDePersonas) {
		return true;
	}

	public static void main(String[] args) {

		SalaDeCine sala = new SalaDeCine(8, 5);

		sala.ocuparButaca(0, 0);
		sala.ocuparButaca(2, 5);
		sala.ocuparButaca(2, 2);
		sala.ocuparButaca(2, 2);
		sala.ocuparButaca(0, 0);
		sala.ocuparButaca(0, 0);
		sala.ocuparButaca(0, 7);
		

		sala.mostrarCine();

		System.out.println(sala.cantidadDeButacas);

	}

}
