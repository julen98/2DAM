package ejerciciosPropuestos567;

import java.util.Stack;

public class ListaStack {
	public static void main(String[] args) {
		Stack<String> palabras = new Stack<String>();
		palabras.push("Uno");
		palabras.push("Dos");
		palabras.push("Tres");
		palabras.insertElementAt("Dos y medio", 2);
		
		System.out.println("Antes de borrar: ");
        System.out.println(palabras);
		
		palabras.remove("Dos");
		
		System.out.println("");
		System.out.println("Despues de borrar: ");
		System.out.println(palabras);
	}
}
