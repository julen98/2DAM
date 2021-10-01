package ejerciciosPropuestos89;

public abstract class Figuras implements IFiguraGeometrica, IDibujable, Comparable<Figuras> {
	int lado, altura, radio;
	
	Figuras () {
		
	}
	
	@Override
	public void Dibujar() {
		System.out.println("\n----------------------------");
        System.out.println(Cuadrado.class.getSimpleName() + ": ");
        System.out.println("----------------------------");
        System.out.println("Lado: " + lado);
        System.out.println("Perimetro: " + CalculaPerimetro());
        System.out.println("Area: " + CalculaArea());
	}

	@Override
	public int compareTo(Figuras f) {
		return (int)this.CalculaArea() - (int)f.CalculaArea();
	}
}
