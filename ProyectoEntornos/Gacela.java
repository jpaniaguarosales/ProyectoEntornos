package te;

/*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*
 * NOMBRE DEL AUTOR: JONE PANIAGUA ROSALES
 * ASIGNATURA: DAW I - PROGRAMACIÓN
 * TAREA ENTREGABLE - ANIMALES 
 * DESCRIPCIÓN DE LA CLASE: CLASE GACELA. 
 * 							SUBCLASE- 
 * 							HIJA DE ANIMAL E IMPLEMENTA PRESA
 * FECHA: 28/03/2026
 *.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*/

public class Gacela extends Animal implements Presa {
	/**
	 * CONSTANTE QUE INDICA LA VELOCIDAD POR HORA DE LA GACELA
	 * HE CREADO UNA CONSTANTE PORQUE EL ENUNCIADO DICE QUE GACELA
	 * HUYE UTILIZANDO SU VELOCIDAD
	 */
	private final double KM_HORA = 90; 

	/**
	 * CONSTRUCTORA, HEREDA DE ANIMAL super() 
	 * @param nombre
	 * @param edad
	 * @param especie
	 */
	public Gacela(String nombre, int edad, String especie) {
		super(nombre, edad, especie);
	}
	
	/**
	 * MÉTODOS huir() y esconderse() 
	 * SE IMPLEMENTAN DE LA INTERFAZ Presa
	 */

	@Override
	public void huir() {
		System.out.println("La gacela huye de su depredador velozmente a " + KM_HORA);
	}

	@Override
	public void esconderse() {
		System.out.println(this.nombre + " se esconde entre la hierba amarilla para evitar\nser vista por su depredador.");
	}

	
	/**
	 * MÉTODOS mover() y observar() 
	 * HEREDADOS DE LA SUPERCLASE Animal
	 * EN ESTE CASO, TRAS HACER ALGUNA PRUEBA HE DECIDIDO SOBREESCRIBIR
	 * EL METODO mover()
	 */
	@Override
	public void mover() {
		System.out.println("La gacela se mueve agilmente, ajena a los depredadores.");
	}

	@Override
	public void respirar() {
		super.respirar();
	}
	
	
	
	

}
