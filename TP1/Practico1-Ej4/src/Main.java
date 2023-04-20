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

        Circulo circulo = new Circulo(4);
        Triangulo triangulo = new Triangulo(3, 4, 5);
        Rectangulo rectangulo = new Rectangulo(6, 8);
        Triangulo triangulo2 = new Triangulo(5, 7, 9);
        Circulo circulo2 = new Circulo(2);

        listaFiguras.add(circulo);
        listaFiguras.add(triangulo);
        listaFiguras.add(rectangulo);
        listaFiguras.add(triangulo2);
        listaFiguras.add(circulo2);

        for (FiguraGeometrica figura : listaFiguras) {
            System.out.println(figura.toString());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("Superficie: " + figura.calcularSuperficie());
            System.out.println();
        }
    }
}