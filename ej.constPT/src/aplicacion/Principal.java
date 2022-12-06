package aplicacion;

import dominio.*;

public class Principal{
	public static void main(String args[]){
		Localidad geta = new Localidad("Getafe",500000);
		Localidad mad = new Localidad("Leganes", 400000);

		Municipio madsur = new Municipio("Madrid sur");

		madsur.addLocalidad(geta);
		madsur.addLocalidad(mad);

		Provincia madrid = new Provincia("Madrid");
		madrid.addProvincia(madsur);

		System.out.println(madrid);

		Localidad losC = new Localidad("Los Chorros",20000);
		Localidad palosG = new Localidad("Palos Grandes", 140000);

		Municipio sucre = new Municipio("Sucre");
		sucre.addLocalidad(losC);
		sucre.addLocalidad(palosG);

		Provincia caracas = new Provincia("Caracas");
		caracas.addProvincia(sucre);

		System.out.println(caracas);

	}

}

