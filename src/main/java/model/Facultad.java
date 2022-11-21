package model;

import java.util.ArrayList;

public class Facultad {
	private final String nombre;
	private final String ubicacion;
	private final ArrayList<Departamento> departamentos = new ArrayList<>();
	public String getNombre() {
		return this.nombre;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}
	public Facultad(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}
}