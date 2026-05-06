package te;

/*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*
 * NOMBRE DEL AUTOR: JONE PANIAGUA ROSALES
 * ASIGNATURA: DAW I - PROGRAMACIÓN
 * TAREA ENTREGABLE - ANIMALES 
 * DESCRIPCIÓN DE LA CLASE: INTERFAZ PRESA. 
 * 	FECHA: 28/03/2026						
 *.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*/


public interface Presa {
	
	/**
	 * SIMULA LA HUIDA DE LA PRESA Y CADA PRESA TIENE QUE IMPLEMENTAR COMO HUYE
	 */
	public void huir(); 
	
	/**
	 * SIMULA EL COMPORTAMIENTO DE ESCONDERSE DE UN DEPREDADOR Y VARÍA SEGÚN LA ESPECIE
	 */
	public void esconderse(); 

}
