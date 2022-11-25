package aplicacion;

//import dominio.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Principal{
	public static void main(String args[]){
		try{
			FileWriter fw = new FileWriter("fichero.txt");
			fw.write("Contenido del fichero");
			fw.close();
		}catch(IOException e){
			System.out.println("Algo ha fallado al intentar escribir el fichero");
		}
		System.out.println("Se ha escrito el fichero");
		String nombreFichero = "fichero1.txt";
		File fichero = new File(nombreFichero);
		try{
			Scanner sc = new Scanner(fichero);
			while(sc.hasNext()){
				System.out.println(sc.next());
			}
			sc.close();
		} catch(FileNotFoundException e){
			System.out.println("Archivo " + nombreFichero + " no encontrado");
		}
	}
}
