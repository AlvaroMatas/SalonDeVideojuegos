
public class Test {

	public static void main(String[] args) {
		
		JuegoEnAlquiler ja1 = new JuegoEnAlquiler("Mario Bros", "Nintendo", 1986, 5, 10, 2);
		
		JuegoEnVenta jv1 = new JuegoEnVenta("Mario Bros", "Nintendo", 1986, 40, 10);
		JuegoEnVenta jv2 = new JuegoEnVenta("Mario Bros", "Nintendo", 1985, 35, 10);
		
		//Copia de juego en alquiler 
		JuegoEnAlquiler ja2 = new JuegoEnAlquiler(ja1);
		
		//Mostrar el numero total de juegos que hay en el salon
		System.out.println("Numero total de juegos que hay en el salón: " + Juego.getNumTotJuegos());

	}

}
