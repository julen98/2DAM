
package ejercicioExtra1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		int edad, peso, altura;
		char sexo;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Persona p1;
		Persona p2 = new Persona();
		
		//Entradas scanner
		System.out.println("Introduce el nombre: ");
		nombre = teclado.nextLine();
		
		System.out.println("Introduce el edad: ");
		edad = teclado.nextInt();
		
		System.out.println("Introduce el sexo: ");
		sexo = teclado.next().charAt(0);
		
		System.out.println("Introduce el peso: ");
		peso = teclado.nextInt();
		
		System.out.println("Introduce el altura: ");
		altura = teclado.nextInt();
		
		p1 = new Persona(nombre, edad, sexo, peso, altura);
		
		//Setters
		p2.setNombre(nombre);
		p2.setEdad(edad);
		p2.setSexo(p2.comprobarSexo(sexo));

		Persona p3 = new Persona(p2);
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);

		for (Persona p : personas) {
			System.out.println(p.toString());
			mostrarMayoriaEdad(p);
			mostrarPeso(p);
		}
	}

	public static void mostrarPeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case 0:
                System.out.println(p.getNombre() + " esta en su peso ideal");
                break;
            case -1:
                System.out.println(p.getNombre() + " esta por debajo de su peso ideal");
                break;
            case 1:
                System.out.println(p.getNombre() + " esta por encima de su peso ideal");
                break;
        }
    }
	
	public static void mostrarMayoriaEdad(Persona p) {
		 
        if (p.esMayorDeEdad()) {
            System.out.println(p.getNombre() + " es mayor de edad");
        } else {
            System.out.println(p.getNombre() + " no es mayor de edad");
        }
    }
 
}
