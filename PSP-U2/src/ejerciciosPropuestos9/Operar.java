package ejerciciosPropuestos9;

public class Operar extends Thread {
	int num;
	Contador c;
	
	public Operar(String nombre, Contador c) {
		super(nombre);
		this.c = c;
	}
	
	@Override
	public synchronized void run() {
		c.random(this.getName());
	}
}
