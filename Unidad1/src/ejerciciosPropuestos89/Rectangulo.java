package ejerciciosPropuestos89;

public class Rectangulo extends Figuras {
	double ancho;
    double alto;
    
    public Rectangulo(double ancho, double alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

	@Override
	public void Dibujar() {
		System.out.println("\n----------------------------");
        System.out.println(Rectangulo.class.getSimpleName() + ": ");
        System.out.println("----------------------------");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Perimetro: " + CalculaPerimetro());
        System.out.println("Area: " + CalculaArea());
	}

	@Override
	public double CalculaArea() {
		return ancho * alto;
	}

	@Override
	public double CalculaPerimetro() {
		return alto + ancho + ancho + alto;
	}
}
