package aplicacion;
import java.util.ArrayList;
import dominio.*;
//import dominio.*;

public class Principal{
	public static void main(String args[]){
		ArrayList<Persona> lista = new ArrayList<Perosna>();
		lista.add(new Perosna("pepe","perez","c/sol"));
		lista.add(new Alumno("Pablo","li","c/Dos",12));
		lista.add(new Profesor("PAloma","Centenera","c/sal","programacion I"));
		Perosna p = new Internacional("PA","Torres","C/cam",6,"VENEcolandia");
		lista.add(p);

		for(Persona p: lista){
			System.out.println(p.detClass()+" "+p+"\n");
			

	}
}
