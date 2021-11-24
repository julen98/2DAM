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
			System.out.println(cambiar.getPath());
			String[] listado = cambiar.list();
			System.out.println();
			for (int i = 0; i < listado.length; i++) {
		        File comprobar = new File(cambiar + listado[i]);
		        if(comprobar.isDirectory()) {
		        	System.out.println((i+1) + ".- " + listado[i] + "\t<Directorio>");
		        } else {
		        	System.out.println((i+1) + ".- " + listado[i] + "\t" + cambiar.length());
		        }
			}
			
			System.out.println("Introduce un numero (-1 para acabar): ");
			n = teclado.nextInt();
			
			ArrayList<File> listFile = new ArrayList<File>();
			for(int i = 0; i < listado.length; i++) {
				listFile.add(new File("/" + listado[i]));
			}
			try {
			if (n >= 0 && n <= listado.length) {
				if (n == 0) {
					if (listFile.get(n).getParent() == null) {
					} else {
						ruta = listFile.get(n).getParent();
						System.out.println(listFile.get(n).getParent());
					}
				} else {
					
				}
				if(listFile.get(n-1).canRead()) {
					if(listFile.get(n-1).isDirectory()) {
						ruta = listado[n-1];
					} else {
					}
				} else {
					System.out.println("No tienes permiso para leer " + listFile.get(n-1));
				}
			} else {
				if (n != -1) 
					System.out.println("El numero introducido debe estar entre 0 y " + listado.length);
				else
					System.exit(1);
			}
			} catch (Exception e){
				e.printStackTrace();
			}
		} while (n != -1);
	}
}
