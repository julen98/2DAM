package examen;

public class Repartidor extends Thread {
	Tenda t;
	
	Repartidor(String name, Tenda t) {
		super(name);
		this.t = t;
	}
	
	@Override
	public void run() {
		while(true) {
			t.trabajar(getName());
		}
	}
}
