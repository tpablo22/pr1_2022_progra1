package dominio;

public class Persona{

	private String nombre;
	protected String apellido;
	protected String dirreccion;

	public persona(String nombre, String apellido, String direccion){
		nombre = nombre;
		apellido = apellido;
		direccion = direccion;
	
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public Stirng toString(){
		return nombre + edad;

