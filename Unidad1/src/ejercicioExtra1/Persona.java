package ejercicioExtra1;

public class Persona {
	private String nombre;
	private final String DNI;
	private int edad;
	private char sexo;
	private double peso, altura;
	
	public Persona() {
		DNI = generaDNI();
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.DNI = generaDNI();
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
	}
	
	public Persona(String nombre, int edad, char sexo, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = generaDNI();
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona(final Persona p) {
		this.nombre = p.nombre;
		this.edad = p.edad;
		this.sexo = p.sexo;
		this.DNI = p.DNI;
		this.peso = p.peso;
		this.altura = p.altura;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularIMC() {
		double formula = peso/(Math.pow(altura, 2));
		int resultado = 0;
		
		if (formula < 20) {
			resultado = -1;
		} else if (formula >= 20 && formula <= 25) {
			resultado = 0;
		} else {
			resultado = 1;
		}
		return resultado;
	}
	
	public boolean esMayorDeEdad() {
		boolean resultado = false;
		
		if (edad >= 18)
			resultado = true;
		else
			resultado = false;
		return resultado;
	}
	
	public char comprobarSexo (char sexo) {
		if (sexo != 'H' || sexo != 'M') {
			sexo = 'H';
			System.out.println("El sexo de " + nombre + " solo puede ser 'H' para Hombre y 'M' para Mujer");
		}
		return sexo;
		
	}

	@Override
	public String toString() {
		String s = "\nNombre: " + this.nombre;
		s += "\nEdad: " + this.edad;
		s += "\nDNI: " + this.DNI;
		s += "\nSexo: " + this.sexo;
		s += "\nPeso: " + this.peso;
		s += "\nAltura: " + this.altura;
		return s;
	}
	
	private final static String generaDNI() {
		double random = Math.random() * (99999999 - 10000000) + 10000000;
		int numDNI = (int)random;
		final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	    int resto;
        resto = numDNI % 23;
        String DNI = String.valueOf(numDNI) + letras[resto];
        return DNI;
	}
}
