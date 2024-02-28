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
        Participante ganador = null; // Se inicializa la variable ganador como null, esta variable se utilizará para almacenar al participante ganador.
        double menorTiempo = 0.0; // Se inicializa la variable con un valor de 0.0

        for (int i = 0; i < participantes.size(); i++){ //Bucle for que recorre la lista de participantes.
            Participante participante = participantes.get(i);// Obtenemos el participante en la posición i
            if (participante instanceof ParticipanteCarrera) { // Verificamos si es una instancia de ParticipanteCarrera
                double tiempo = ((ParticipanteCarrera) participantes.get(i)).getTiempo(); //Devuelve el elemento de la lista en la posición i y obtiene el tiempo del participante en esa posición.
                if (tiempo < menorTiempo) { // Compara el tiempo del participante actual con el menor tiempo registrado hasta ahora.
                    menorTiempo = tiempo; // Actualiza el menor tiempo registrado.
                    ganador = participante; // Actualizamos el participante ganador
                }
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
