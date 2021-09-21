package ejerciciosPropuestos;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Material> materiales = new ArrayList<Material>();
		
		Material m1 = new Material ("11AAA", "El vell i el mar");
		Material m2 = new Material ("22BBB", "El vell i el mar");
		Usuario user1 = new Usuario("pepi123", "123", "pepi123@gmail.com", 18, materiales);
		Usuario user2 = new Usuario(user1);
		
		usuarios.add(user1);
		usuarios.add(user2);
		
		user1.anadirMateriales(m1);
		user1.anadirMateriales(m2);
		
		for (Usuario u : usuarios) {
			System.out.println(u.mostrar());
		}
	}
}
