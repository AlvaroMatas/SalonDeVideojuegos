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
	
	//Saber si dos juegos son iguales si tienen igual el titulo, fabricante y año
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		//Si el obj NO es un objeto de tipo juego devuelve false
		if (!(obj instanceof Juego)) { //instanceof responde a la pregunta “¿este objeto es de este tipo?” y devuelve true o false
			return false;
		}
		
		Juego otro = (Juego) obj; //Trata el objeto como Juego para poder usar el .anyo, .titulo etc
		
		return this.titulo.equals(otro.titulo) && this.fabricante.equals(otro.fabricante) && this.anyo == otro.anyo;
	}

	@Override
	public int compareTo(Juego o) { /*
									 * Un juego es menor que otro si su título es menor. A igual título, si su
									 * fabricante es menor. A igual título y fabricante, si su año es menor.
									 */

		int resultadoComparación = this.titulo.compareTo(o.titulo);
		int resultado = 0;
		
		if (resultadoComparación != 0) {
			resultado = resultadoComparación;
		} else if (resultadoComparación == 0) {
			int comparacionFabr = this.fabricante.compareTo(o.fabricante);

			if (comparacionFabr != 0) {
				resultado = comparacionFabr;
			}

		}else {
			resultado = Integer.compare(this.anyo, o.anyo);
		}
		
		return resultado;
	}

}
