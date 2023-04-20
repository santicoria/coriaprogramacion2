package classes;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double x;
    private double y;

    public Triangulo(double lado1, double lado2, double lado3, double x, double y) throws IllegalArgumentException{
        if (lado1 < 0) {
            throw new IllegalArgumentException("El Lado 1 del triangulo no puede ser negativo.");
        }
        if (lado2 < 0) {
            throw new IllegalArgumentException("El Lado 2  del triangulo no puede ser negativo.");
        }
        if (lado3 < 0) {
            throw new IllegalArgumentException("El Lado 3 del triangulo no puede ser negativo.");
        }
        if (x < 0) {
            throw new IllegalArgumentException("El valor de X no puede ser negativo");
        }
        if (y < 0) {
            throw new IllegalArgumentException("El valor de Y no puede ser negativo");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.x = x;
        this.y = y;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws IllegalArgumentException {
        if (lado1 < 0) {
            throw new IllegalArgumentException("El Lado 1 del triangulo no puede ser negativo.");
        }
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) throws IllegalArgumentException {
        if (lado2 < 0) {
            throw new IllegalArgumentException("El Lado 2 del triangulo no puede ser negativo.");
        }
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) throws IllegalArgumentException {
        if (lado3 < 0) {
            throw new IllegalArgumentException("El Lado 3 del triangulo no puede ser negativo.");
        }
        this.lado3 = lado3;
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
        return lado1 + lado2 + lado3;
    }

    @Override
    public double calcularSuperficie() {
        double p = calcularPerimetro() / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
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
        return "Triángulo de lados " + lado1 + ", " + lado2 + ", " + lado3;
    }
}