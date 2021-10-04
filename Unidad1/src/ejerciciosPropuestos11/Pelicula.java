package ejerciciosPropuestos11;

public class Pelicula extends Material {
	String autor;
	int anio;
	
	public Pelicula(String codi, String titol, String autor, int anio) {
		super(codi, titol);
		this.autor = autor;
		this.anio = anio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	public String mostrar() {
		return super.mostrar() + "\nAutor: " + this.autor + "\nAño: " + this.anio;
	}
	
}
