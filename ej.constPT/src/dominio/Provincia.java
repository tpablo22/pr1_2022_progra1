package dominio;

import java.util.ArrayList;

public class Provincia{

	private String nombre;
	private ArrayList<Municipio> provincia = new ArrayList<>();

	public Provincia(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
        return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public ArrayList<Municipio> getProvincia(){
		return provincia;
	}
	public void setProvincia(ArrayList<Municipio> provincia){
		this.provincia = provincia;
	}
	public void addProvincia(Municipio provincias){
		provincia.add(provincias);
	}
	public int getNumeroDeHabitantes(){
		int sumaDG2 = 0;
		for(int i = 0; i < provincia.size(); i++){
			sumaDG2 += provincia.get(i).getNumeroDeHabitantes();
		}
		return sumaDG2;
	}
	public String toString(){
		String mensaje2 = nombre+nombre+ "tienen "+getNumeroDeHabitantes()+ " de habitantes"+"\n";

		for(int i = 0; i < provincia.size(); i++){
			mensaje2 = provincia.get(i)+"\n";
		}
		return mensaje2;
	}
}
