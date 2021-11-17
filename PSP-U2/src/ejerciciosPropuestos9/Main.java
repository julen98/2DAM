package ejerciciosPropuestos9;

public class Main {
	public static void main(String[] args) {
		Contador c = new Contador();
		for (int i = 1; i <= 10; i++) {
			Operar o = new Operar("Hilo " + i, c);
			o.start();
		}
	}
}
