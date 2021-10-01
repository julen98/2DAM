package ejerciciosPropuestos89;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenar {
	public static void main(String[] args) {
		ArrayList<Figuras> figuras = new ArrayList<Figuras>();
		figuras.add(new Circulo(5));
		figuras.add(new Cuadrado(5));
		figuras.add(new Rectangulo(5, 5));
		figuras.add(new Triangulo(5, 5));
		
		Collections.sort(figuras);
		
		for (Figuras f : figuras) {
			f.Dibujar();
		} 
	}
}
