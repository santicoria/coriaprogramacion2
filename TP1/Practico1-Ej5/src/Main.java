import classes.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Main m = new Main();
        m.arranque();

    }

    public static void arranque() {
        List<FiguraGeometrica> listaFiguras = new ArrayList<>();

        Circulo circulo = new Circulo(4, 12, 5);
        Triangulo triangulo = new Triangulo(3, 4, 5, 32, 58);
        Rectangulo rectangulo = new Rectangulo(6, 8, 5, 6);
        Triangulo triangulo2 = new Triangulo(5, 7, 9, 22, 36);
        Circulo circulo2 = new Circulo(2,18,32);

        try {
            circulo2.setRadio(-4);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
            circulo2.setRadio(4);
        }

        try {
            triangulo.setLado1(-3);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
            triangulo.setLado1(3);
        }

        try {
            triangulo.setLado2(-4);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
            triangulo.setLado2(4);
        }

        try {
            triangulo.setLado3(-5);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
            triangulo.setLado3(5);
        }

        try {
            rectangulo.setAltura(-8);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
            rectangulo.setAltura(8);
        }

        try {
            rectangulo.setBase(-6);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
            rectangulo.setBase(6);
        }

        try {
            circulo2.setX(-12);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
            circulo2.setX(12);
        }

        try {
            circulo2.setY(-5);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
            circulo2.setY(5);
        }



        listaFiguras.add(circulo);
        listaFiguras.add(triangulo);
        listaFiguras.add(rectangulo);
        listaFiguras.add(triangulo2);
        listaFiguras.add(circulo2);

        for (FiguraGeometrica figura : listaFiguras) {
            System.out.println(figura.toString());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("Superficie: " + figura.calcularSuperficie());
            System.out.println("Coordenada X: " + figura.obtenerCoordenadaX() + " - Coordenada Y: " + figura.obtenerCoordenadaY());
            System.out.println();
        }
    }
}