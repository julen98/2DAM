package ejerciciosPropuestos567;

public class Producto {
	String cod;
	String desc;
	float precio;
	
	public Producto(String cod, String desc, float precio) {
		super();
		this.cod = cod;
		this.desc = desc;
		this.precio = precio;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return cod + ": " + desc + " (" + precio + "€)";
	}
}
