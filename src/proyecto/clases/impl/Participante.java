package proyecto.clases.impl;

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


    @Override
    public boolean equals(Object participante) { // Sobrescribiendo el método equals()
        if (participante instanceof Participante) { // verifica si el objeto es una instancia de la clase Participante.
            Participante otroParticipante = (Participante) participante;
            return this.dni.equals(otroParticipante.getDni());// comparamos el DNI del objeto actual con el DNI del otro participante. Si los DNIs son iguales, este método devuelve true.
        }
        return false; //Si los DNIs son diferentes, devuelve false.
    }
}

