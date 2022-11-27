package dominio;
import java.util.ArrayList;

public class Municipio{
	private String nombre;
	private ArrayList<Localidad> localidades = new ArrayList<>();

	public String getNombre(){
		return nombre;
		}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public ArrayList<Localidad> getLocalidades(){
		return localidades;
	}

	public void setLocalidades(ArrayList<Localidad> localidades){
		this.localidades = localidades;
	}

	public void addLocalidad(Localidad localidad){
		localidades.add(localidad);
	}
	public int getNumeroDeHabitantes(){
		int sumaHabitantes = 0;
		for(int i = 0; i < localidades.size(); i++){
			//Localidad localidad = localidades.get(i);
			//sumaHabitantes += localidades.getNumeroDeHabitantes();
			sumaHabitantes += localidades.get(i).getNumeroDeHabitantes();
		}
		return sumaHabitantes;
	}
	public String toString(){
		String mensaje = nombre + " tiene " + getNumeroDeHabitantes() + " habitantes, con las siguientes localidades:\n";
		for(int i = 0; i < localidades.size(); i++){
			mensaje += localidades.get(i) + "\n";
		}
		return mensaje;
	}
}
