package model;

import java.util.*;


public class Departamento {
	private String nombre;
	private ArrayList<Administrativo> administradores = new ArrayList<Administrativo>();
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<CarreraUniversitaria> carreras = new ArrayList<CarreraUniversitaria>();

	public String getNombre() {
		return this.nombre;
	}
}