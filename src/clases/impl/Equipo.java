package clases.impl;

import java.util.ArrayList;

public class Equipo {

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


    public String toString() {
        //No está acabado
    }

    @Override
    public boolean equals(Object equipo) {
        //No está acabado
    }

    public int compareTo(Equipo equipo) {
        //No está acabado
    }

}
