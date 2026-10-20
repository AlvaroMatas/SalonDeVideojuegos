
public class JuegoEnAlquiler extends Juego{
	
	//Atributos
	private double precio;
	private int numCopiasDispo;
	private int numDiasAlq;
	private static int numJuegEnAlq = 0;
	
	//Constructores
	public JuegoEnAlquiler() {
		super();
		
		numJuegEnAlq++;
	}

	public JuegoEnAlquiler(String titulo, String fabricante, int anyo , double precio, int numCopiasDispo, int numDiasAlq) {
		super(titulo, fabricante, anyo);
		this.precio = precio;
		this.numCopiasDispo = numCopiasDispo;
		this.numDiasAlq = numDiasAlq;
		
		numJuegEnAlq++;
	}
	
	//Constructor de copia
	public JuegoEnAlquiler(JuegoEnAlquiler otro) { //JuegoEnAlquiler juego2 = new JuegoEnAlquiler(juego1); copia el juego 2 con los atributos del 1
		super(otro.getTitulo(), otro.getFabricante(), otro.getAnyo());
		this.precio = otro.precio;
		this.numCopiasDispo = otro.numCopiasDispo;
		this.numDiasAlq = otro.numDiasAlq;
		
		numJuegEnAlq++;
	}
	
	

}
