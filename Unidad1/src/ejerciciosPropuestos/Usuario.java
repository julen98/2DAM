package ejerciciosPropuestos;

import java.util.ArrayList;

public class Usuario {
	
	String username;
	private String password;
	String email;
	int edad;
	ArrayList<Material> materiales;
	
	public Usuario(String username, String password, String email, int edad, ArrayList<Material> materiales) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.edad = edad;
		this.materiales = materiales;
	}
	
	public Usuario(final Usuario u) {
		this.username = u.username;
		this.password = u.password;
		this.email = u.email;
		this.edad = u.edad;
		this.materiales = u.materiales;
	}
	
	public void anadirMateriales(Material e) {
		materiales.add(e);
	}
	
	public void eliminarMateriales(Material e) {
		materiales.remove(e);
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarMateriales() {
		for (Material m : materiales) {
			System.out.println(m.mostrar());
		}
	}
	
	public String mostrar() {
		String mostrar = "Nombre usuario: " + username;
		mostrar += "\nEmail: " + email;
		mostrar += "\nEdad: " + edad + "\n";
		System.out.println("Materiales: ");
		mostrarMateriales();
		return mostrar;
	}
	
}
