package dominio;

import java.util.ArrayList;

public class Provincia{
	private ArrayList<Municipio> municipios = new ArrayList();
	private String nombre;

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public ArrayList<Municipio> getMunicipios(){
		return municipios;
	}

	public void setMunicipios(ArrayList<Municipio> municipios){
		this.municipios = municipios;
	}

	public void addMunicipio(Municipio municipio){
		municipios.add(municipio);
	}

	public int getNumeroDeHabitantes(){
		int habitantesProvincia = 0;
		for(int i = 0; i < municipios.size(); i++){
			Municipio mun = municipios.get(i);
			int numeroHabitantesMunicipio = mun.getNumeroDeHabitantes();
			habitantesProvincia += numeroHabitantesMunicipio;
		}
		return habitantesProvincia;
	}

	public String toString(){
		String mensaje = nombre + " tiene " + getNumeroDeHabitantes() + " habitantes, entre los municipios:";
		for (int i = 0; i < municipios.size(); i++){
			mensaje += "\n" + municipios.get(i);
		}
		return mensaje;
	}
}
