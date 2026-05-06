package te;

/*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*
 * NOMBRE DEL AUTOR: JONE PANIAGUA ROSALES
 * ASIGNATURA: DAW I - PROGRAMACIÓN
 * TAREA ENTREGABLE - ANIMALES 
 * DESCRIPCIÓN DE LA CLASE: INTERFAZ DEPREDADOR. 
 * FECHA: 28/03/2026						
 *.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*/

public interface Depredador {
	
	// METODO QUE SIMYULA EL COMPORTAMIENTO DE CAZA
	default void cazar() {
		System.out.println("El depredador detecta la presa."); 
	}
	
	/**
	 * METODO observar() 
	 * EN ESTE CASO LO PONGO default EN VEZ DE public PORQUE AUNQUE HAY QUE
	 * IMPLEMENTAR EN LAS INTERFACES EL MÉTODO VACÍO, PUES SON ABSTRACTOS PORQUE SI
	 * Y NOS OBLIGA A ELLO, EN EL ENUNCIADO PONE QUE PUEDE TENER IMPLEMENTACIÓN COMÚN
	 * O SER SOBRECARGADO EN LA CLASE, Y HE DECIDIDO PONERLA COMÚN
	 */
	default void observar() {
		System.out.println("El depredador observa a su presa.");
	}

}
