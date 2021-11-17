package ejerciciosPropuestos9;

public class Contador {
	int numAcumulado;
	
	public Contador () {
		this.numAcumulado = 0;
	}
	
	synchronized public void random(String nombre) {
		double r = Math.floor(Math.random() * 5000);
		int n = (int)r;
		System.out.println(nombre + " - Numero acumulado antes: " + numAcumulado + " - Random: " + n);

		if (n % 2 == 0)
			numAcumulado = numAcumulado + n;
		else
			numAcumulado = numAcumulado - n;
		System.out.println(nombre + " - Numero acumulado despues: " + numAcumulado);
	}
}
