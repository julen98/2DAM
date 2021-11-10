package ejerciciosPropuestos9;

public class Contador {
	int numAcumulado;

	public synchronized void random() {
		numAcumulado = 1;
		double r = Math.floor(Math.random() * 5000);
		int n = (int)r;
		if (n % 2 == 0)
			numAcumulado++;
		else
			numAcumulado--;
		System.out.println("Numero acumulado: " + numAcumulado + " - Numero random: " + n);
	}
}
