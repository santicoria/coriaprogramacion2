import classes.Empleado;
import classes.ListaGenerica;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.arranque();
    }

    public static void arranque() {
        Empleado empleado1 = new Empleado("Juan", "Perez", 1234, 5);
        Empleado empleado2 = new Empleado("Maria", "Gonzalez", 5678, 3);
        Empleado empleado3 = new Empleado("Pedro", "Martinez", 9012, 8);

        ListaGenerica listaGenerica = new ListaGenerica<Empleado>();

        listaGenerica.almacenarElementoEnPosicion(3, empleado1);

    }

}