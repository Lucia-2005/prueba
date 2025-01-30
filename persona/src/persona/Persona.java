package persona;
//Lucia castañera


public class Persona {
	// Atributos de edad y altura
	int edad;
	double altura;

	// Metodo main con dos objetos
	public static void main(String[] args) {
		// datos del primer objeto
		Persona obj1 = new Persona();
		obj1.edad = 30;
		obj1.altura = 1.75;

		// datos del segundo objeto
		Persona obj2 = new Persona();
		obj2.edad = 20;
		obj2.altura = 1.80;

		// Para imprimir los valores del primer objeto
		System.out.println("Obj1:");
		System.out.println("Edad = " + obj1.edad);
		System.out.println("Altura = " + obj1.altura);
		
		// Para imprimir los valores del segundo objeto
		System.out.println("Obj2:");
		System.out.println("Edad = " + obj2.edad);
		System.out.println("Altura = " + obj2.altura);
	}
}


