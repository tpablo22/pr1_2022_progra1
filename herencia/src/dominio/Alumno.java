package dominio;

public class Alumno extends Persona{

	protected int numCreditos;
	public Alumno(String n; String a; String d, int nc){
		super(n,a,d);
		numCreditos = nc;
	}
	public String toString(){
		return super.toString()+" creditos matriculados: "+numCreditos
