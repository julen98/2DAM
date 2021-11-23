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
		File f = new File("/");
		String[] listado = f.list();
		int n = 0;
		do {
			for (int i = 0; i < listado.length; i++) {
		        File comprobar = new File(f + listado[i]);
		        if(comprobar.isDirectory()) {
		        	System.out.println(i + ".- " + listado[i] + " (Directorio)");
		        } else {
		        	System.out.println(i + ".- " + listado[i] + " " + f.length());
		        }
				
				System.out.println("Introduce un numero (-1 para acabar): ");
				n = teclado.nextInt();
				
				if (n != -1) {
					File file = new File(listado[n]);
				} else {
					System.exit(1);
				}
		    }
		} while (n != -1);
	}
}
