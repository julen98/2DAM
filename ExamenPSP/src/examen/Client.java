package examen;

public class Client extends Thread {
	Tenda t;
	
	Client(String name, Tenda t) {
		super(name);
		this.t = t;
	}
	
	@Override
	public void run() {
		while(true) {
			t.entrar(getName());
		}
	}
}
