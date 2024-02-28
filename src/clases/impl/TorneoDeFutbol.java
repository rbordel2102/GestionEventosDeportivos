package clases.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo {
    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {
        return null;
    }
    public boolean inscribirEquipo(Equipo equipo) {
        if (!equipos.contains(equipo)) { // Verifica si equipo ya está presente en la lista equipos, al tener "!" niega esta evaluación, por lo que la condición se cumple si equipo no está en la lista.
            equipos.add(equipo); // Si el equipo no está inscrito, entonces se añade el equipo al ArrayList.
            return true; // indica que el equipo se ha añadido correctamente al torneo.
        }
        return false; // indica que no se ha añadido ningún equipo al torneo porque ya estaba inscrito
    }

    //Aun quedan cosas por repasar
}