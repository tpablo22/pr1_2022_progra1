package dominio;

import java.util.ArrayList;

public class Concesionario{
	ArrayList<VehiculoTurismo> catalogo = new ArrayList<>();

	public void add(VehiculoTurismo vehiculo){
		catalogo.add(vehiculo);
	}

	public int calcularPrecioTotal(){
		int precioTotal = 0;
		for(VehiculoTurismo vehiculo: catalogo){
			precioTotal += vehiculo.getPrecioFinal();
		}
		return precioTotal;
	}

	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("El precio total de los vehículos es: " + calcularPrecioTotal()+"\n");
		mensaje.append("Hay los siguientes coches en el concesionario:\n");
		for(VehiculoTurismo vehiculo: catalogo){
			mensaje.append(vehiculo + "\n");
		}
		return mensaje.toString();
	}
}
