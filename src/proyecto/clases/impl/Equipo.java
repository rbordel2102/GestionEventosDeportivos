package proyecto.clases.impl;


import java.util.ArrayList;

public class Equipo implements Comparable{

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
    public boolean añadirJugador(Participante jugador) {
        return jugadores.add(jugador);
    }
    public boolean eliminarJugador(Participante jugador) {
        return jugadores.remove(jugador);
    }

    @Override
    public String toString() {
        //No está hecho
    }

    @Override
    public boolean equals(Object equipo) {
        if (this == equipo) return true;
        if (!(equipo instanceof Equipo)) return false;
        Equipo otroEquipo = (Equipo) equipo;
        return nombre.equals(otroEquipo.getNombre());
    } //Hay que repasarlo





    @Override
    public int compareTo(Equipo otroEquipo) {
        return Integer.compare(this.puntos, otroEquipo.getPuntos());
        // Devuelve un número entero que indica si el equipo actual tiene más puntos, menos puntos o los mismos puntos que el otro equipo.
    }
    //Hay que repasarlo
}
