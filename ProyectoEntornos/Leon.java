package te;

/*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*
 * NOMBRE DEL AUTOR: JONE PANIAGUA ROSALES
 * ASIGNATURA: DAW I - PROGRAMACIÓN
 * TAREA ENTREGABLE - ANIMALES 
 * DESCRIPCIÓN DE LA CLASE: CLASE LEON. 
 * 							SUBCLASE. 
 * 							HIJA DE ANIMAL E IMPLEMENTA DEPREDADOR
 * FECHA: 28/03/2026
 *.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*/

public class Leon extends Animal implements Depredador {

	/**
	 * CONSTRUCTORA, HEREDA DE ANIMAL super() 
	 * @param nombre
	 * @param edad
	 * @param especie
	 */
	public Leon(String nombre, int edad, String especie) {
		super(nombre, edad, especie);
	}

	/**
	 * IMPLEMENTACION DEL MÉTODO CAZAR DE LA INTERFAZ DEPREDADOR
	 */
	@Override
	public void cazar(int energia) {
		if (energia <= 0) {
			System.out.println("No puede cazar sin energia.");
			return; 
		} else {
			System.out.println("Caza ejecutada correctamente.");
		}
	}

	/**
	 * observar()
	 * COMO EN ENUNCIADO DA LA OPCIÓN DE QUE SEA COMÚN PARA TODOS HE USADO 
	 * default EN ESE METODO
	 * ES UNA ELECCIÓN PERSONAL, APARTE DEL SYSO AÑADO MAS
	 */
	@Override
	public void observar() {
		Depredador.super.observar();
		System.out.println("Y se abalanza sobre ella.");
	}

	/**
	 * METODOS mover() y observar() HEREDADOS DE LA SUPERCLASE Animal
	 */
	@Override
	public void mover() {
		super.mover();
	}

	@Override
	public void respirar() {
		super.respirar();
	}
	
	
	

}
