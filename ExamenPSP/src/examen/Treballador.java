package examen;

public class Treballador extends Thread {
	Tenda t;
	
	Treballador(String name, Tenda t) {
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
