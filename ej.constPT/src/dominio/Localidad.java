package dominio;

public class Localidad{

	private String nombre;
	private int numeroDeHabitantes;

	public Localidad(String nombre, int numeroDeHabitantes){
		this.numeroDeHabitantes = numeroDeHabitantes;
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
		}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public int getNumeroDeHabitantes(){
		return numeroDeHabitantes;
	}
	public void setNumeroDeHabitantes(int numeroDeHabitantes){
		this.numeroDeHabitantes = numeroDeHabitantes;
	}
	public String toString(){
		return nombre+" tiene: "+numeroDeHabitantes+" habitantes";
	}
}

