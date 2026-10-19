
public class Juego {

	//Atributos
	private String titulo = "Sin titulo";
	private String fabricante = "Desconocido";
	private int anyo = 1970;
	private int numTotJuegos = 0;
	
	//Getters y setters
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
		this.anyo = anyo;
	}

	public int getNumTotJuegos() {
		return numTotJuegos;
	}
	
	//Constructores
	public Juego() {
		super();
		
		numTotJuegos++;
	}


	public Juego(String titulo, String fabricante, int anyo) {
		super();
		this.titulo = titulo;
		this.fabricante = fabricante;
		this.anyo = anyo;
		
		numTotJuegos++;
	}
	
	
	
	
}
