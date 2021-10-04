package ejerciciosPropuestos11;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Material> materiales = new ArrayList<>();
		
		Llibre l1 = new Llibre ("11AAA", "El vell i el mar", "Cervantes", 550);
		Llibre l2 = new Llibre ("22BBB", "El vell i el mar", "Pepe Alvarez", 455);
		Llibre l3 = new Llibre ("33CCC", "El vell i el mar", "Cervantes", 550);
		Llibre l4 = new Llibre ("44DDD", "El vell i el mar", "Pepe Alvarez", 455);
		Pelicula p1 = new Pelicula ("55EEE", "Avengers: Endgame", "Marvel", 2019);
		Usuario user1 = new Usuario("pepi123", "123", "pepi123@gmail.com", 18, materiales);
		Usuario user2 = new Usuario(user1);
		
		usuarios.add(user1);
		usuarios.add(user2);
		
		user1.anadirMateriales(l1);
		user1.anadirMateriales(l2);
		user1.anadirMateriales(p1);
		user2.anadirMateriales(l3);
		user2.anadirMateriales(l4);
		
		for (Usuario u : usuarios) {
			System.out.println(u.mostrar());
		}
	}
}
