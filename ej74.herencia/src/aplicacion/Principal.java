package aplicacion;

import dominio.*;

public class Principal{
	public static void main(String args[]){
		Concesionario concesionario = new Concesionario();
		VehiculoTurismo audi = new VehiculoTurismo("Audi", "A1", 20000, 7);
		VehiculoTurismo mercedes = new VehiculoTurismo("Mercedes", "Clase A", 50, 5);
		concesionario.add(audi);
		concesionario.add(mercedes);
		System.out.println(concesionario);
	}
}
