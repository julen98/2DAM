package ejerciciosPropuestos11;

public class Llibre extends Material {
	
	String codi;
	String titol;
	String autor;
	int numPags;
	
	//Constructor
	public Llibre (String codi, String titol, String autor, int numPags) {
		super(codi, titol);
		this.autor = autor;
		this.numPags = numPags;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPags() {
		return numPags;
	}

	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}
	
	@Override
	public String mostrar() {
		String mostrar = "\nAutor: " + autor;
		mostrar += "\nNumero de paginas: " + numPags + "\n";
		return super.mostrar() + mostrar;
	}
	
}
