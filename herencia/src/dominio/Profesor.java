package dominio;

public class Profesor extends Persona{

	protected String materia;
	public profsor(String n, Stirng a,String d, String m){
		Super(n,a,d);
		materia = m
	}
	public String toString(){
		return super.toString()+" materia: "+materia;

}
