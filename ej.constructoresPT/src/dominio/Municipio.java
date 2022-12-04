package dominio;
import java.util.ArrayList;

public class Municipio{

	private String nombre;
	private ArrayList<Localidad> localidades = new ArrayList<>();

	public Municipio(String nombre){
		this.nombre = nombre;
	}
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
		int sumaDeHab = 0;
		for(int i= 0; i< localidades.size(); i++){
			sumaDeHab += localidades.get(i).getNumeroDeHabitantes();
		
		}return sumaDeHab;
	}
	public String toString(){
		String mensaje = nombre + " tiene "+ getNumeroDeHabitantes() + " habitantes";
		for(int i = 0; i < localidades.size();i++){
			mensaje += "\n"+localidades.get(i);
		}
		return mensaje;
	}
}

