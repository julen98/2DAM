package ejercicioExtra2;

public class Trabajador {
	private String nombre = "", cargo = "", oficina = "";
	private int edad = 0, anyosExp = 0, sueldoMensual = 0, numPagas = 0;
	public Trabajador(String nombre, String cargo, String oficina, int edad, int anyosExp, int sueldoMensual, int numPagas) {
		super();
		this.nombre = nombre;
		this.cargo = cargo;
		this.oficina = oficina;
		this.edad = edad;
		this.anyosExp = anyosExp;
		this.sueldoMensual = sueldoMensual;
		this.numPagas = numPagas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getOficina() {
		return oficina;
	}
	
	public void setOficina(String oficina) {
		this.oficina = oficina;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getAnyosExp() {
		return anyosExp;
	}
	
	public void setAnyosExp(int anyosExp) {
		this.anyosExp = anyosExp;
	}
	
	public int getSueldoMensual() {
		return sueldoMensual;
	}
	
	public void setSueldoMensual(int sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	
	public int getNumPagas() {
		return numPagas;
	}
	
	public void setNumPagas(int numPagas) {
		this.numPagas = numPagas;
	}
	
	
}
