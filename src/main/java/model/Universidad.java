package model;

import java.util.*;

public class Universidad {

	private final ArrayList<Trabajador> trabajadores = new ArrayList<>();
	private final ArrayList<Facultad> facultades = new ArrayList<>();
	public List<Profesor> obtenerPNombre(String nombre) {
		ArrayList<Profesor> profesores = new ArrayList<>();
		for (Facultad facultad : this.facultades) {
			for(Departamento departamento : facultad.getDepartamentos())
				for(Profesor profesor : departamento.getProfesor())
					if(profesor.getNombre().equals(nombre)){
						profesores.add(profesor);
					}
		}
		return profesores;
	}

	public List<CarreraUniversitaria> obtenerCarreras(String nombre, String ubicacion) {
		ArrayList<CarreraUniversitaria> carreras = new ArrayList<>();
		for (Facultad facultad : this.facultades) {
			if (facultad.getNombre().equals(nombre) && facultad.getUbicacion().equals(ubicacion)){
				for (Departamento departamento : facultad.getDepartamentos()) {
					carreras.addAll(departamento.getCarreras());
				}
			}
		}
		return carreras;
	}
	public List<Profesor> obtenerPJornad(String horario){
		ArrayList<Profesor> profesores = new ArrayList<>();
		for (Facultad facultad : this.facultades) {
			for(Departamento departamento : facultad.getDepartamentos()){
				for(Profesor profesor : departamento.getProfesor()){
					if(profesor.getHorario().equals(horario)){
						profesores.add(profesor);
					}
				}
			}
		}
		return profesores;
	}
	public List<Profesor> obtenerProfesores () {
		ArrayList<Profesor> profesores = new ArrayList<>();
		for (Facultad facultad : this.facultades) {
			for(Departamento departamento : facultad.getDepartamentos()){
				profesores.addAll(departamento.getProfesor());
			}
		}
		return profesores;
	}
	public List<Administrativo> obtenerAdministrativos () {
		ArrayList<Administrativo> administrativos = new ArrayList<>();
		for (Facultad facultad : this.facultades) {
			for(Departamento departamento : facultad.getDepartamentos()){
				administrativos.addAll(departamento.getAdministradores());
			}
		}
		return administrativos;
	}
}