package model;
public class Profesor extends Trabajador {

	public Profesor(String nombre, String rut, String estadoCivil, String tituloP, String horario ,String direccion) {
		super(nombre,rut, estadoCivil, tituloP, horario, direccion);
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}