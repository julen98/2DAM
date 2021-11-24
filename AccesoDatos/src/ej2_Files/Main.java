package ej2_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main  {
	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String ruta = "";
		int n = 0;
		do {
			File cambiar = new File("/" + ruta);
			String[] listado = cambiar.list();
			System.out.println(cambiar.getPath());
			System.out.println();
			for (int i = 0; i < listado.length; i++) {
		        File comprobar = new File(cambiar + listado[i]);
		        if(comprobar.isDirectory()) {
		        	System.out.println((i+1) + ".- " + listado[i] + " (Directorio)");
		        } else {
		        	System.out.println((i+1) + ".- " + listado[i] + " " + cambiar.length());
		        }
			}
			
			System.out.println("Introduce un numero (-1 para acabar): ");
			n = teclado.nextInt();
			
			ArrayList<File> listFile = new ArrayList<File>();
			for(int i = 0; i < listado.length; i++) {
				listFile.add(new File("/" + listado[i]));
			}
			
			if (n == 0) {
				ruta = "";
			} if (n == -1) {
				System.exit(1);
			} else {
				if(listFile.get(n).isDirectory()) {
					ruta = listado[n];
				} else {
					System.out.println("No se puede navegar hacia un archivo.");
				}
			}
		} while (n != -1);
	}
}
