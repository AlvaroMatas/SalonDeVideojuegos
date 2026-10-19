import java.time.LocalDate;

public abstract class Juego implements Comparable<Juego> {

	// Atributos
	private String titulo = "Sin titulo";
	private String fabricante = "Desconocido";
	private int anyo = 1970;
	private static int numTotJuegos = 0;

	// Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = comprobarAnyo(anyo);
	}

	public int getNumTotJuegos() {
		return numTotJuegos;
	}

	// Constructores
	public Juego() {
		super();

		numTotJuegos++;
	}

	public Juego(String titulo, String fabricante, int anyo) {
		super();
		this.titulo = titulo;
		this.fabricante = fabricante;
		this.anyo = comprobarAnyo(anyo);

		numTotJuegos++;
	}

	// Comprobar que año de juego sea superior a 1970 y que no supere el año actual
	private int comprobarAnyo(int anyo) {
		LocalDate fechaActuaLocalDate = LocalDate.now();
		int anyoActual = fechaActuaLocalDate.getYear();

		if (anyo > anyoActual || anyo < 1970) {
			return anyo = 1970;
		} else {
			return anyo = anyo;
		}
	}

	// Devolver datos del juego
	@Override
	public String toString() {
		return "==========Juego==========" + "\n" + "Titulo: " + titulo + "\n" + "Fabricante: " + fabricante + "\n"
				+ "Año: " + anyo + "\n";
	}

	@Override
	public int compareTo(Juego o) { /*
									 * Un juego es menor que otro si su título es menor. A igual título, si su
									 * fabricante es menor. A igual título y fabricante, si su año es menor.
									 */

		int resultadoComparación = this.titulo.compareTo(o.titulo);

		if (resultadoComparación != 0) {
			return resultadoComparación;
		} else if (resultadoComparación == 0) {
			int comparacionFabr = this.fabricante.compareTo(o.fabricante);

			if (comparacionFabr != 0) {
				return comparacionFabr;
			}

		}
		return Integer.compare(this.anyo, o.anyo);
	}

}
