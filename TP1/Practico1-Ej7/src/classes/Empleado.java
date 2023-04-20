package classes;

public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;
    private int aniosTrabajados;

    // Constructor
    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    public static Empleado fromString(String input) throws IllegalArgumentException {
        String[] fields = input.split(",\s|\s,|,");
        String nombre = null;
        String apellido = null;
        String legajo = null;
        int aniosTrabajados = 0;

        if (fields.length < 4) {
            throw new IllegalArgumentException("Faltan campos.");
        }
        try {
            for (String field : fields) {
                String[] parts = field.split("=");
                if (parts[0].equalsIgnoreCase("nombre")) {
                    nombre = parts[1];
                } else if (parts[0].equalsIgnoreCase("apellido")) {
                    apellido = parts[1];
                } else if (parts[0].equalsIgnoreCase("legajo")) {
                    legajo = parts[1];
                } else if (parts[0].equalsIgnoreCase("aniosTrabajados")) {
                    try {
                        if(Integer.parseInt(parts[1]) < 0) {
                            throw new IllegalArgumentException("El valor de años trabajados debe ser positivo");
                        }
                        aniosTrabajados = Integer.parseInt(parts[1]);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Los años trabajados deben ser un número entero");
                    }
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Faltan datos.");
        }


        if (nombre == null || apellido == null || legajo == null || aniosTrabajados == 0) {
            throw new IllegalArgumentException("Faltan datos.");
        }

        return new Empleado(nombre, apellido, legajo, aniosTrabajados);
    }


    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                ", años trabajados=" + aniosTrabajados +
                '}';
    }
}
