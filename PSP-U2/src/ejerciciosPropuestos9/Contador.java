package ejerciciosPropuestos9;

public class Contador {
	int numAcumulado;

	public int random() {
		numAcumulado = 5000;
		double r = Math.floor(Math.random() * numAcumulado);
		int n = (int)r;
		if (numAcumulado % 2 == 0)
			numAcumulado++;
		else
			numAcumulado--;
		return n;
	}
}
