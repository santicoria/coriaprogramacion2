package classes;

import classes.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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
    public String toString() {
        return "Círculo de radio " + radio;
    }
}