package dominio;

import java.util.ArrayList;

public class Municipio{

	private String nombre;
	private ArrayList<Localidad> localidad = new ArrayList<>();

	public Municipio(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre(){
	return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Localidad> getLocalidad() {
		return localidad;
	}

	public void setLocalidad(ArrayList<Localidad> localidad) {
		this.localidad = localidad;
	}
	public void addLocalidad(Localidad localidades){
		localidad.add(localidades);
	}
	public int getNumeroDeHabitantes(){
		int sumaDHab = 0;

		for(int i = 0; i < localidad.size(); i++){
			sumaDHab += localidad.get(i).getNumeroDeHabitantes();
		}return sumaDHab;
	}
	public String toString(){
		String mensaje = nombre + " tiene "+ getNumeroDeHabitantes()+"habitantes\n";

		for(int i = 0; i < localidad.size() ; i++){
			mensaje += localidad.get(i)+"\n";
		}
		return mensaje;
	}

}


