import classes.Empleado;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

        Map<String, Empleado> mapaEmpleado = new HashMap<>();

        for (Empleado empleado : empleados) {
            mapaEmpleado.put(empleado.getApellido()+","+empleado.getNombre(), empleado);
        }

        for(Map.Entry<String, Empleado> entrada : mapaEmpleado.entrySet()) {
            String clave = entrada.getKey();
            Empleado empleado = entrada.getValue();
            System.out.println("La clave es: " + clave + " - El empleado es: " + empleado);
        }

    }
}