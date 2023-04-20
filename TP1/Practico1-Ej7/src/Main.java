import classes.Empleado;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.arranque();
    }

    public static void arranque() {
        try {
            System.out.println(Empleado.fromString("apellido=Marquez,legajo=E001,aniosTrabajados=10"));
        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            System.out.println(Empleado.fromString(",apellido=Marquez,legajo=E001,aniosTrabajados=10"));
        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            System.out.println(Empleado.fromString("nombre=,apellido=Marquez,legajo=E001,aniosTrabajados=10"));
        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            System.out.println(Empleado.fromString("nombre=Pablo,apellido=Marquez,legajo=E001,aniosTrabajados=-10"));
        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            System.out.println(Empleado.fromString("nombre=Pablo,apellido=Marquez,legajo=E001,aniosTrabajados=10.1"));
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(Empleado.fromString("nombre=Pablo,apellido=Marquez,legajo=E001,aniosTrabajados=10"));


    }

}