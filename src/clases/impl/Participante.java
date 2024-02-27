public class Participante {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Participante(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Participante --> " + "dni = " + dni  + ", nombre = " + nombre + ", apellidos = " + apellidos  + ", edad = " + edad;
    }

    // NO SE HACERLO
    @Override
    public boolean equals(Object participante) {
        return true;
    }
}

