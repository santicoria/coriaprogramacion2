import clases.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Main m = new Main();
        m.arranque();

    }

    public static void arranque() {
        Set<Empleado> empleados = new HashSet<>();
        Empleado empleado1 = new Empleado("Juan", "Perez", 1234, 5);
        Empleado empleado2 = new Empleado("Maria", "Gonzalez", 5678, 3);
        Empleado empleado3 = new Empleado("Pedro", "Martinez", 9012, 8);
        Empleado empleado4 = new Empleado("Juan", "Perez", 1234, 5);
        Empleado empleado5 = new Empleado("Luis", "Gutierrez", 3456, 2);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);

        EmpleadoSet empleadoSet1 = new EmpleadoSet("Juan", "Paco", 1233, 4);
        EmpleadoSet empleadoSet2 = new EmpleadoSet("Maria", "Perez", 5677, 4);
        EmpleadoSet empleadoSet3 = new EmpleadoSet("Esteban", "Quito", 9013, 7);
        EmpleadoSet empleadoSet4 = new EmpleadoSet("Juan", "Paco", 1233, 4);

        empleados.add(empleadoSet1);
        empleados.add(empleadoSet2);
        empleados.add(empleadoSet3);
        empleados.add(empleadoSet4);

        System.out.println("Lista de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}