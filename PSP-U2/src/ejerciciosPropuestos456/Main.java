package ejerciciosPropuestos456;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero del 1 al 10: ");
		int n = teclado.nextInt();
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(n);
		Primo p = new Primo(n);
		
		for (int i = 0; i <= p.n * 1000; i++) {
			Runnable worker = new Primo(i);
			executor.execute(worker);
		}
	}

}
