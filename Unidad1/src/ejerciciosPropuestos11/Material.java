package ejerciciosPropuestos11;

public class Material {
	protected String codi;
	protected String titol;
	
	public Material(String codi, String titol) {
		super();
		this.codi = codi;
		this.titol = titol;
	}
	
	public String getCodi() {
		return codi;
	}
	
	public void setCodi(String codi) {
		this.codi = codi;
	}
	
	public String getTitol() {
		return titol;
	}
	
	public void setTitol(String titol) {
		this.titol = titol;
	}
	
	public String mostrar() {
		return codi + ": " + titol;
	}
	
}
