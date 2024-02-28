package clases.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo {
    private double distancia;

    public Carrera(String nombre, LocalDateTime fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }



    @Override
    public ArrayList<Participante> obtenerGanador() {
        return null;
    }

    @Override
    public Participante obtenerGanador() {
        Participante ganador = null;
        double menorTiempo = 0.0;

        for (int i = 0; i < participantes.size(); i++){
            Participante participante = participantes.get(i);
            if (participantes instanceof ParticipanteCarrera) { // tengo que acabarlo

            }
        }
        return ganador;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


}
