package dominio;

public class VehiculoTurismo{
	private String marca;
	private String modelo;
	private int precioBase;
	private int numeroPlazas;
	
	public VehiculoTurismo(String marca, String modelo, int precioBase, int numeroPlazas){
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.numeroPlazas = numeroPlazas;
	}

	public String getMarca(){
		return marca;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getModelo(){
		return modelo;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public int getPrecioBase(){
		return precioBase;
	}

	public void setPrecioPase(int precioBase){
		this.precioBase = precioBase;
	}

	public int getPrecioFinal(){
		int precioFinal = precioBase;
		if(numeroPlazas > 5){
			precioFinal += 0.1 * precioBase * (numeroPlazas - 5);
		}
		return precioFinal;
	}

	public String toString(){
		return marca + ", " + modelo + ", " + numeroPlazas + " plazas, con precio base de " + precioBase + "€ y precio final de " + getPrecioFinal() + "€";
	}
}
