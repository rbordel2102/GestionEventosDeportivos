package proyecto.clases.impl;


import java.util.ArrayList;

public class Equipo implements Comparable<Equipo>{

    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public boolean anadirJugador(Participante jugador) {
        return jugadores.add(jugador);
    }
    public boolean eliminarJugador(Participante jugador) {
        return jugadores.remove(jugador);
    }

    @Override
    public String toString() {
        return "Equipo --> " + "nombre = " + nombre + ", jugadores = " + jugadores + ", puntos = " + puntos;
    }

    @Override
    public boolean equals(Object equipo) {
        if (equipo instanceof Equipo) { //Verifica si el equipo es una instancia de la clase Equipo.Si lo es, los compara.
            Equipo otroEquipo = (Equipo) equipo; //Otro equipo = Nos permite acceder a los métodos y atributos específicos de la clase Equipo
            return nombre.equals(otroEquipo.getNombre());// Compara los nombres de este equipo, si son iguales, el método devuelve true.
        }
        return false;
    }


    @Override
    public int compareTo(Equipo otroEquipo) {
        return Integer.compare(this.puntos, otroEquipo.puntos);
        // Devuelve un número entero que indica si el equipo actual tiene más puntos, menos puntos o los mismos puntos que el otro equipo.
    }

}
