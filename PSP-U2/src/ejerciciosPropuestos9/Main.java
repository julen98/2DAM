package ejerciciosPropuestos9;

import ejerciciosPropuestos6.Hilos;

public class Main {
	public static void main(String[] args) {
		Contador c = new Contador();
		for (int i = 1; i < 11; i++) {
			Hilos h = new Hilos(c, i);
			h.start();
		}
	}
}
