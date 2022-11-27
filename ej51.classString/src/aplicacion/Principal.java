package aplicacion;

//import dominio.*;

public class Principal{
	public static void main(String args[]){
		if(args.length < 2){
			System.out.println("Introduce dos parámetros");
		} else {
			int resultado = args[0].compareTo(args[1]);
			if(resultado == 0){
				System.out.println("Los parámetros son iguales");
			} else {
				System.out.println("Los parámetros son diferentes");
			}
			System.out.println(args[0].compareTo(args[1]));
			if(args[0].equals(args[1])){
				System.out.println("Los parámetros son iguales");
			} else {
				System.out.println("Los parámetros son diferentes");
			}
			if(args[0].toUpperCase().equals(args[1].toUpperCase())){
				System.out.println("Son iguales ignorando may/min");
			} else {
				System.out.println("No son iguales ignorando may/min");
			}
			if(args[0].equalsIgnoreCase(args[1])){
				System.out.println("Son iguales ignorando may/min");
			} else {
				System.out.println("No son iguales ignorando may/min");
			}
			String string1 = "Hola";
			String string2 = new String("Hola");
			if(string1 ==string2){
				System.out.println("Los dos Strings son iguales");
			} else {
				System.out.println("Los dos Strings son diferentes");
			}
		}
	}
}
