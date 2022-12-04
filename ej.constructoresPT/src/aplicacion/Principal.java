package aplicacion;

import dominio.*;

public class Principal{
	public static void main(String args[]){
	Localidad losChorros = new Localidad("Los Chorros", 50000);

	

	Municipio sucre = new Municipio("Sucre");
	
	sucre.addLocalidad(losChorros);

	System.out.println(sucre);
	
Localidad carcas = new Localidad("caracas", 1000000);
		Localidad miranda = new Localidad("miranda", 200000);

		Municipio granCaracas = new Municipio();
		granCaracas.setNombre("Gran Caracas");
		granCaracas.addLocalidad(carcas);
		granCaracas.addLocalidad(miranda);
		System.out.println(granCaracas);
	}

}

