package infractores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Infractores {
	private Map<String, Integer> infractores = new HashMap<String, Integer>();

	public void leerInfractores(String entrada) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("./src/infractores/infractores.in");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero

			String linea;
			while ((linea = br.readLine()) != null) {

				String[] datos = linea.split(" ");
				String patente = datos[0];
				Integer velocidad = Integer.parseInt(datos[1]);

				if (velocidad >= 80) {
					int cantidad = 1;
					if (infractores.containsKey(patente)) {
						cantidad = infractores.get(patente) + 1;
					}
					infractores.put(patente, cantidad);

				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

	public void escribirMultados(String salida) throws FileNotFoundException {

		PrintWriter pr = new PrintWriter(new File(salida));

		for (Entry<String, Integer> cu : infractores.entrySet()) {

			String linea =  "          " + cu.getKey() + " "  + cu.getValue() * 50000;

			pr.write(linea);

		}

		pr.close();

	}

	public static void main(String[] args) throws FileNotFoundException {
		Infractores inf = new Infractores();

		inf.leerInfractores("infractores.in");
		inf.escribirMultados("./src/infractores/infractores.out");

	}

}
