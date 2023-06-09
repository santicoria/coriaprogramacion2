package classes;

public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    @Override
    public double calcularSuperficie() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectángulo de base " + base + " y altura " + altura;
    }
}