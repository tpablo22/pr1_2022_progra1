package aplicacion;

import dominio.*;

public class Principal{
	public static void main(String args[]){
		Localidad boadilla = new Localidad("Boadilla",20000);
		/*Localidad boadilla = new Localidad();
		boadilla.setNombre("Boadilla");
		boadilla.setNumeroDeHabitantes(20000);*/

		Localidad alcorcon = new Localidad("alcolrcon", 1000);


		Municipio madrid = new Municipio();
		madrid.setNombre("Madrid");
		madrid.addLocalidad(boadilla);
		madrid.addLocalidad(alcorcon);

		Provincia comunidadMadrid = new Provincia();
		comunidadMadrid.setNombre("Comunidad de Madrid");
		comunidadMadrid.addMunicipio(madrid);
		//System.out.println(comunidadMadrid);

		Localidad carcas = new Localidad("caracas", 1000000);
		Localidad miranda = new Localidad("miranda", 200000);

		Municipio granCaracas = new Municipio();
		granCaracas.setNombre("Gran Caracas");
		granCaracas.addLocalidad(carcas);
		granCaracas.addLocalidad(miranda);
		System.out.println(granCaracas);

		/*Provincia dc = new Provincia();
		dc.setNombre("Comunidad distrito capital");
		dc.addMunicipio(granCaracas);

		System.out.println(granCaracas);

		*/
	}
}
