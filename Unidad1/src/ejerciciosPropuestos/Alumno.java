package ejerciciosPropuestos;

public class Alumno {
	
	String dni;
	String nombre;
	Aula aulaAsignada;
	
	public Alumno(String dni, String nombre, Aula aulaAsignada) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.aulaAsignada = aulaAsignada;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Aula getAulaAsignada() {
		return aulaAsignada;
	}

	public void setAulaAsignada(Aula aulaAsignada) {
		this.aulaAsignada = aulaAsignada;
	}
	
	
	
}
