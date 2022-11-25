package dominio;

public class VehiculoTurismo{
	private String marca;
	private String modelo;
	private float precio;
	
	public VehiculoTurismo(String marca, String modelo, float precio){
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public String toString(){
	return "marca: "marca+", modelo "+modelo+" "+precio ;
	}
	

}
