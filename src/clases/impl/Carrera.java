package clases.impl;

import clases.impl.EventoDeportivo;
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
        ArrayList<Participante> ganadores = new ArrayList<>();
        double menorTiempo = 0.0; // Se inicializa la variable con un valor de 0.0

        for (int i = 0; i < participantes.size(); i++) { //Bucle for que recorre la lista de participantes.
            Participante participante = participantes.get(i);// Obtenemos el participante en la posición i
            if (participante instanceof ParticipanteCarrera) { // Verificar si es una instancia de ParticipanteCarrera
                if (ParticipanteCarrera.getTiempo() < menorTiempo) {
                    ganadores.clear(); // Limpiar la lista si encontramos un tiempo menor
                    menorTiempo = ParticipanteCarrera.getTiempo();
                    ganadores.add(ParticipanteCarrera); // Agregar al nuevo ganador
                } else if (ParticipanteCarrera.getTiempo() == menorTiempo) {
                    ganadores.add(ParticipanteCarrera); // Si hay empate, agregar también al ganador
                }
            }

        }
        return ganadores;
    }



    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    //Repasar bien esta clase
}
