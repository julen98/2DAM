package examen;

public class MenjarRapid {
	public static void main(String[] args) {
		Tenda t = new Tenda();
		
		for (int i = 0; i < 2; i++)
			new Treballador("Treballador " + i, t).start();
		
		for (int i = 0; i < 1; i++)
			 new Repartidor("Repartidor " + i, t).start();
		
		for (int i = 0; i < 5; i++)
			new Client("Client " + i, t).start();
	}
}