package te;

/*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*
 * NOMBRE DEL AUTOR: JONE PANIAGUA ROSALES
 * ASIGNATURA: DAW I - PROGRAMACIÓN
 * TAREA ENTREGABLE - ANIMALES 
 * DESCRIPCIÓN DE LA CLASE: CLASE ANIMAL. SUPERCLASE/ MADRE DE LA QUE HEREDARÁN LOS ANIMALES "CONCRETOS"
 * FECHA: 28/03/2026
 *.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*/

public abstract class Animal {
	// ATRIBUTOS
	protected String nombre;
	protected int edad;
	protected String especie;

	/**
	 * CONSTRUCTORA
	 * 
	 * @param String nombre
	 * @param int    edad
	 * @param String especie
	 */
	public Animal(String nombre, int edad, String especie) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;

	}
	
	/**
	 * METODO mover() 
	 * HACE QUE EL ANIMAL SE MUEVA
	 * PODRÍA SER IMPLEMENTADO DE MANERA GENERAL
	 */
	public void mover() {
		System.out.println(this.nombre + " esta moviendose sigilosamente");
	}
	
	/**
	 * METODO respirar()
	 * METODO GENERAL PARA TODOS LOS ANIMALES QUE SIMULA EL ACTO
	 * DE RESPIRAR
	 */
	public void respirar() {
		System.out.println(this.nombre + " está respirando");
	}

}
