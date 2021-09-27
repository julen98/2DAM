package ejerciciosPropuestos8910;

public class Circulo implements IFiguraGeometrica, IDibujable {
	
	double radio;

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }
	
	@Override
	public void Dibujar() {
		System.out.println("\n----------------------------");
        System.out.println(Circulo.class.getSimpleName() + ": ");
        System.out.println("----------------------------");
        System.out.println("Radio: " + radio);
        System.out.println("Perimetro: " + CalculaPerimetro());
        System.out.println("Area: " + CalculaArea());
	}

	@Override
	public double CalculaArea() {
        return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double CalculaPerimetro() {
        return 2 * Math.PI * radio;
	}
}
