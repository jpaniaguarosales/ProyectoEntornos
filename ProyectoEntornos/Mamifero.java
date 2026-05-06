package te;

/*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*
 * NOMBRE DEL AUTOR: JONE PANIAGUA ROSALES
 * ASIGNATURA: DAW I - PROGRAMACIÓN
 * TAREA ENTREGABLE - ANIMALES 
 * DESCRIPCIÓN DE LA CLASE: CLASE MAMÍFERO. 
 * 							SUBCLASE.
 * 							HIJA DE ANIMAL Y MADRE DE OTRAS CLASES 
 * FECHA: 28/03/2026
 *.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*/


public abstract class Mamifero extends Animal {

	/**
	 * CONSTRUCTORA QUE HEREDA DE ANIMAL
	 * 
	 * @param nombre
	 * @param edad
	 * @param especie
	 */
	public Mamifero(String nombre, int edad, String especie) {
		super(nombre, edad, especie);
		
	}
	
	/**
	 * MÉTODO amamantar()
	 * CADA MAMÍFERO LO IMPLEMETA DISTINTO
	 */
	public abstract void amamantar(); 
	
	/**
	 * MÉTODO dormir()
	 * MÉTODO QUE SIMULA EL COMPORTAMIEBNTO DORMIR
	 * DE UN MAMÍFERO
	 */
	public void dormir() {
		System.out.println(this.nombre + " está durmiendo");
	}

}
