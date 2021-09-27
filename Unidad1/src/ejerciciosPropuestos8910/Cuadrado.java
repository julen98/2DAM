package ejerciciosPropuestos8910;

public class Cuadrado implements IFiguraGeometrica, IDibujable {
	double lado;

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
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
	public double CalculaArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public double CalculaPerimetro() {
		return lado + lado + lado + lado;
	}

}
