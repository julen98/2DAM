package ejerciciosPropuestos8910;

public class Triangulo implements IFiguraGeometrica, IDibujable {
	double ancho;
    double alto;

    public Triangulo(double ancho, double alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }
    
	@Override
	public void Dibujar() {
		System.out.println("\n----------------------------");
        System.out.println(Triangulo.class.getSimpleName() + ": ");
        System.out.println("----------------------------");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Perimetro: " + CalculaPerimetro());
        System.out.println("Area: " + CalculaArea());
	}

	@Override
	public double CalculaArea() {
		return ancho * alto / 2;
	}

	@Override
	public double CalculaPerimetro() {
		double hipotenusa = (double) Math.sqrt((ancho * ancho) + (alto * alto));

        return ancho + alto + hipotenusa;
        }


}
