package classes;

public class Circulo implements FiguraGeometrica {
    private double radio;
    private double x;
    private double y;

    public Circulo(double radio, double x, double y) throws IllegalArgumentException {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio del círculo no puede ser negativo.");
        }
        if (x < 0) {
            throw new IllegalArgumentException("El valor de X no puede ser negativo");
        }
        if (y < 0) {
            throw new IllegalArgumentException("El valor de Y no puede ser negativo");
        }
        this.radio = radio;
        this.x = x;
        this.y = y;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El valor de Radio no puede ser negativo");
        }
        this.radio = radio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("El valor de X no puede ser negativo");
        }
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) throws IllegalArgumentException {
        if (y < 0) {
            throw new IllegalArgumentException("El valor de Y no puede ser negativo");
        }
        this.y = y;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public double obtenerCoordenadaX() {
        return x;
    }

    @Override
    public double obtenerCoordenadaY() {
        return y;
    }

    @Override
    public String toString() {
        return "Círculo de radio " + radio;
    }
}