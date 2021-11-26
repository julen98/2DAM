package examen;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Tenda {
	ArrayList<String> comandas = new ArrayList<String>();
	ArrayList<String> listaRepartidores = new ArrayList<String>();
	private Semaphore s1 = new Semaphore(0);
	private Semaphore s2 = new Semaphore(1);
	private Semaphore s3 = new Semaphore(2);
	private Semaphore s4 = new Semaphore(3);
	
	
	public void trabajar(String treballador) {
		try {
			System.out.println(treballador + " esta esperando comandas");
			s1.acquire();
			System.out.println(treballador + " esta preparando la comanda de " + this.comandas.get(0));
			s2.release();
			int max = 15, min = 10;
			int r = (int)Math.floor(Math.random()*(max-min+1)+min);
			Thread.sleep(r*1000);
			s3.acquire();
			System.out.println(treballador + " - Comandas de " + comandas.get(0) + " lista para enviar.");
			listaRepartidores.add(comandas.get(0));
			System.out.println(treballador + " - Comandas preparadas para enviar: " + listaRepartidores.size());
			comandas.remove(0);
			System.out.println(treballador + " - Comandas pendientes: " + comandas.size());
			s1.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void entrar(String cliente) {
		Random random = new Random();
		try {
			Thread.sleep((random.nextInt(12)+1)*1000);
			s2.acquire();
			comandas.add(cliente);
			System.out.println(cliente + " ha hecho una comanda - Comandas pendientes: " + comandas.size());
			s1.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void repartir(String repartidor) {
		try {
			s3.release();
			System.out.println(repartidor + " esta enviando la comanda de " + comandas.get(0));
			int max = 40, min = 25;
			int r = (int)Math.floor(Math.random()*(max-min+1)+min);
			Thread.sleep(r*1000);
			System.out.println(repartidor + " - Comanda de " + comandas.get(0) + " entregada");
			s4.acquire();
			listaRepartidores.remove(0);
			s4.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
