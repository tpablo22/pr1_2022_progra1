package aplicacion;

import dominio.*;

public class Principal{
	public static void main(String args[]){
		Localidad boadilla = new Localidad("Boadilla",20000);
		/*Localidad boadilla = new Localidad();
		boadilla.setNombre("Boadilla");
		boadilla.setNumeroDeHabitantes(20000);*/

		Localidad alcorcon = new Localidad();
		alcorcon.setNombre("Alcorcon");
		alcorcon.setNumeroDeHabitantes(100);

		Municipio madrid = new Municipio();
		madrid.setNombre("Madrid");
		madrid.addLocalidad(boadilla);
		madrid.addLocalidad(alcorcon);

		Provincia comunidadMadrid = new Provincia();
		comunidadMadrid.setNombre("Comunidad de Madrid");
		comunidadMadrid.addMunicipio(madrid);
		System.out.println(comunidadMadrid);
	}
}
