package model;

import java.util.*;

public class Universidad {
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<Facultad> facultades = new ArrayList<Facultad>();

	public List<Profesor> obtenerPNombre(String nombre) {
		ArrayList<Profesor> profesor = new ArrayList<>();
		for(Facultad facultad: this.facultades){
			for(Departamento departamento: this.departamentos){
				for(Profesor profesor: this.profesores){
					if
				}

			}
		}
	}

	public List<CarreraUniversitaria> obtenerCarreras() {
		throw new UnsupportedOperationException();
	}

	public List<Profesor> obtenerPJornada(String horario) {
		throw new UnsupportedOperationException();
	}

	public List<Profesor> obtenerProfesores() {
		throw new UnsupportedOperationException();
	}

	public List<Administrativo> obtenerAdministrativos() {
		throw new UnsupportedOperationException();
	}
}