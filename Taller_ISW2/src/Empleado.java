
public class Empleado extends Persona {

	static float sueldo;

	public Empleado(String nombre, int edad, double sueldo) {
		System.out.println("El empleado " + nombre + " tiene " + edad + " con un sueldo bruto de " + sueldo);

	}

	public static void calcular_salario_neto() {

		if (sueldo >= 200000) {
			System.out.println("");

		} else if (sueldo < 200000) {
			System.out.println("");

		}
	}

}
