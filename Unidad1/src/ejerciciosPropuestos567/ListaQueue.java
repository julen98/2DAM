package ejerciciosPropuestos567;

import java.util.LinkedList;
import java.util.Queue;

public class ListaQueue {
	public static void main(String[] args) {
		Queue<String> palabras = new LinkedList<String>();
		palabras.add("Uno");
		palabras.add("Dos");
		palabras.add("Tres");
		
		System.out.println("Antes de borrar: ");
        System.out.println(palabras);
		
		palabras.removeAll(palabras);
		palabras.add("Uno");
		palabras.add("Dos y medio");
		palabras.add("Tres");
		
		System.out.println("");
		System.out.println("Despues de borrar: ");
		System.out.println(palabras);
	}
}
