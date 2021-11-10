package ejerciciosPropuestos6;

import ejerciciosPropuestos9.Contador;

public class Hilos extends Thread {
	int num;
	Contador c;
	
	public Hilos(Contador c, int num) {
		this.c = c;
		this.num = num;
	}
	
	@Override
	public synchronized void run() {
		c = new Contador();
		c.random();
	}
}
