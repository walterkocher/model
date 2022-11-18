package model;

import java.util.ArrayList;
import model.Departamento;

public class Facultad {
	private String nombre;
	private String ubicacion;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public String getNombre() {
		return this.nombre;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}
}