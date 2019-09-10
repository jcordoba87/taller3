
public class Cliente extends Persona {

	public Cliente(String nombre, int edad, String nombre_empresa, int telefono_de_contacto) {
		System.out.println("El cliente " + nombre + " tiene " + edad + " trabaja en " + nombre_empresa + " contacto " + telefono_de_contacto);
	}

	String nombre_empresa = "";
	int telefono_de_contacto = 0;

}
