package aplicacion;

import dominio.*;

public class Principal{
	public static void main(String args[]){
		Libreta pablo = new Libreta();

		pablo.setNombre("pablo");
		pablo.setEdad(20);

		System.out.println(pablo);
	}
}
