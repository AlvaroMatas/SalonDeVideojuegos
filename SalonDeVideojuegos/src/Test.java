
public class Test {

	public static void main(String[] args) {
		
		JuegoEnAlquiler ja1 = new JuegoEnAlquiler("Mario Bros", "Nintendo", 1986, 5, 10, 2);
		
		JuegoEnVenta jv1 = new JuegoEnVenta("Mario Bros", "Nintendo", 1986, 40, 10);
		JuegoEnVenta jv2 = new JuegoEnVenta("Mario Bros", "Nintendo", 1985, 35, 10);
		
		//Copia de juego en alquiler 
		JuegoEnAlquiler ja2 = new JuegoEnAlquiler(ja1);
		
		//Mostrar el numero total de juegos que hay en el salon
		System.out.println("Numero total de juegos que hay en el salón: " + Juego.getNumTotJuegos());
		
		//Alquilar ja1
		System.out.println("==========Alquilar ja1==========");
		ja1.alquilar();
		
		//Mostrar resultado de alquiler
		System.out.println(ja1);
		
		//Devolver ja1
		System.out.println("==========Devolver ja1==========");
		ja1.devolver();
		
		//Mostrar resultado de devolver
		System.out.println(ja1);
		
		//Comprobar si ja1 y jv1 son iguales y mostrar mensaje que lo indique
		System.out.println("==========Comprobando si ja1 y jv1 son iguales==========");
		
		if (ja1.equals(jv1)) {
			System.out.println("Los juegos ja1 y jv1 son iguales");
		}else {
			System.out.println("Los juegos ja1 y jv1 son diferente");
		}
		
		//Comprobar si ja1 y jv2 son iguales y mostrar mensaje que lo indique
		System.out.println("==========Comprobando si ja1 y jv2 son iguales==========");
		
		if (ja1.equals(jv2)) {
			System.out.println("Los juegos ja1 y jv2 son iguales");
		}else {
			System.out.println("Los juegos ja1 y jv2 son diferentes");
		}
		
		//Comparar jv1 y jv2 y muestra un mensaje que indique cuál es mayor, o si son iguales
		System.out.println("==========Comparando jv1 con jv2==========");
		
		if (jv1.compareTo(jv2) == 0) {
			System.out.println("Los juegos jv1 y jv2 son iguales");
		}else if (jv1.compareTo(jv2) < 0) {
			System.out.println("El juego jv2 es mayor que jv1");
		}else {
			System.out.println("El juego jv1 es mayor que jv2");
		}
		
		//Comparar ja1 y jv1 y muestra un mensaje que indique cuál es mayor, o si son iguales
		System.out.println("==========Comparando ja1 con jv1==========");
		
		if (ja1.compareTo(jv1) == 0) {
			System.out.println("Los juegos ja1 y jv1 son iguales");
		}else if (ja1.compareTo(jv1) < 0) {
			System.out.println("El juego jv1 es mayor que ja1");
		}else {
			System.out.println("El juego ja1 es mayor que jv1");
		}

	}

}
