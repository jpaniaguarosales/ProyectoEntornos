package te;

/*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*
 * NOMBRE DEL AUTOR: JONE PANIAGUA ROSALES
 * ASIGNATURA: DAW I - PROGRAMACIÓN
 * TAREA ENTREGABLE - ANIMALES 
 * DESCRIPCIÓN DE LA CLASE: CLASE BALLENA. 
 * 							SUBCLASE. 
 * 							HIJA DE MAMIFERO E IMPLEMENTA PRESA
 * 							EN ESTE CASO, LA HERENCIA DE LA SUPERCLASE ANIMAL QUE HEREDA MAMIFERO TAMBIEN
 * 							LA HEREDA LA CLASE BALLENA.
 * FECHA: 28/03/2026
 *.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*/

public class Ballena extends Mamifero implements Presa {

	/**
	 * CONSTRUCTORA, HEREDA DE MAMIFERO, QUE A SU VEZ HEREDA DE ANIMAL 
	 * @param nombre
	 * @param edad
	 * @param especie
	 */
	public Ballena(String nombre, int edad, String especie) {
		super(nombre, edad, especie);
	}

	/**
	 * METODO HEREDADO DE MAMIFERO
	 * ESTE METODO ES ABSTRACTO EN LA CLASE "MADRE" Y SE IMPLEMENTARÍA EN
	 * CADA HIJA ESPECIFICAMENTE 
	 */
	@Override
	public void amamantar() {
		System.out.println("Las ballenas amamantan a sus crías bajo el agua,\nexpulsando leche desde sus glándulas mamarias\nhacia la boca de la cría.");
		System.out.println();
		System.out.println("La leche es muy espesa y rica en grasa,\npara que no se disperse en el agua.");
	}
	
	/**
	 * MÉTODO dormir() HEREDADO DE Mamifero
	 * AUNQUE EN EL ENUNCIADO NO PONGA QUE BALLENA HEREDA dormir() 
	 * HE DECIDIDO IMPLEMENTARLO PARA SOBREESCRIBIRLO PORQUE LAS BALLENAS
	 * DUERMEN DE MANERA ESPECIAL
	 */
	@Override
	public void dormir() {
		System.out.println("Las ballenas " + this.especie + ", ");
		System.out.println("duermen con solo la mitad del cerebro a la vez,\nmientras la otra permanece activa para poder respirar.");
		System.out.println("De esa forma suben a la superficie a tomar aire mientras descansan.");
	}
	

	/**
	 * MÉTODOS mover() y respirar() HEREDADOS DE ANIMAL
	 * EL METODO RESPIRAR LO VOY A SOBREESCRIBIR PARA ESPECIFICAR
	 * QUE LO HACE BAJO EL AGUA
	 */
	@Override
	public void mover() {
		System.out.println("La gran ballena " + this.nombre + " se mueve en el océano. 🐋 ");
	}

	@Override
	public void respirar() {
		System.out.println(this.nombre + " respira aire en la superficie,\nguardando el suficiente para bajar al agua.");
	}
	
	/**
	 * METODOS huir() y esconderse()
	 * IMPLEMENTAN LA INTERFAZ PRESA Y SE SOBREESCRIBEN EN CADA CLASE
	 */
	@Override
	public void huir() {
		System.out.println(this.nombre + " huye alejandose rápidamente o protegiendose formando grupos.");
	}

	@Override
	public void esconderse() {
		System.out.println("Las ballenas: '" + this.especie + "', se  esconden nadando a gran profundidad.");
	}
	

}
