
public class JuegoEnAlquiler extends Juego{
	
	//Atributos
	private double precio;
	private int numCopiasDispo;
	private int numDiasAlq;
	
	//Constructores
	public JuegoEnAlquiler() {
		super();
	}

	public JuegoEnAlquiler(String titulo, String fabricante,double precio, int numCopiasDispo, int numDiasAlq) {
		super(titulo);
		this.precio = precio;
		this.numCopiasDispo = numCopiasDispo;
		this.numDiasAlq = numDiasAlq;
	}
	
	
	
	

}
