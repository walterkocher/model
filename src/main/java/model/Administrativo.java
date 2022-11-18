package model;

import java.util.*;

public class Administrativo extends Trabajador {

	public Administrativo(String nombre, String rut, String estadoCivil, String tituloP, String horario,String direccion) {
		super(nombre,rut, estadoCivil, tituloP, horario, direccion);
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}