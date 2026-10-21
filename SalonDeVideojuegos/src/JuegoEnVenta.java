
public class JuegoEnVenta extends Juego{
	
	//Atributos
	private double precio;
	private int numCopiasDispo;
	
	//Constructores
	public JuegoEnVenta() {
		super();
	
	}

	public JuegoEnVenta(String titulo, String fabricante, int anyo, double precio, int numCopiasDispo) {
		super(titulo, fabricante, anyo);
		this.precio = precio;
		this.numCopiasDispo = numCopiasDispo;
		
	}
	
	//Metodo vender
	public void vender() {
		if (numCopiasDispo > 0) {
			numCopiasDispo--;
		}
	}

	//Mostrar todos los datos
	@Override
	public String toString() {
		return super.toString() +
				"==========JuegoEnVenta============" + "\n" +
				"Precio: " + precio + "\n" +
				"Numero de copias disponibles: " + numCopiasDispo + "\n";
	}
	
	

}
