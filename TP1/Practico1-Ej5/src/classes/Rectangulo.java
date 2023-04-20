package classes;

public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double x;
    private double y;

    public Rectangulo(double base, double altura, double x, double y) throws IllegalArgumentException {
        if (base < 0) {
            throw new IllegalArgumentException("El valor de la Base no puede ser negativo");
        }
        if (altura < 0) {
            throw new IllegalArgumentException("El valor de la Altrura no puede ser negativo");
        }
        if (x < 0) {
            throw new IllegalArgumentException("El valor de X no puede ser negativo");
        }
        if (y < 0) {
            throw new IllegalArgumentException("El valor de Y no puede ser negativo");
        }
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws IllegalArgumentException {
        if (base < 0) {
            throw new IllegalArgumentException("El valor de la Base no puede ser negativo");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws IllegalArgumentException {
        if (altura < 0) {
            throw new IllegalArgumentException("El valor de la Altrura no puede ser negativo");
        }
        this.altura = altura;
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
        return 2 * base + 2 * altura;
    }

    @Override
    public double calcularSuperficie() {
        return base * altura;
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
        return "Rectángulo de base " + base + " y altura " + altura;
    }
}