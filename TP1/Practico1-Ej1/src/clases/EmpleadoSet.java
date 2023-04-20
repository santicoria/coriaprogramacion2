package clases;

public class EmpleadoSet extends Empleado {

    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmpleadoSet)) {
            return false;
        }
        EmpleadoSet empleadoSet = (EmpleadoSet) obj;
        return this.getLegajo() == empleadoSet.getLegajo();
    }

    @Override
    public int hashCode() {
        return this.getLegajo();
    }
}