package proyecto.clases.impl;

import proyecto.clases.impl.EventoDeportivo;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo {
    private double distancia;

    public Carrera(String nombre, LocalDateTime fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }



    //Esto hay que repasarlo
    @Override
    public ArrayList<Participante> obtenerGanador() {
        ArrayList<Participante> ganadores = new ArrayList<>();
        double menorTiempo = 0.0; // Inicializamos con 0.0

        for (int i = 0; i < participantes.size(); i++) { // Bucle for que recorre la lista de participantes.
            Participante participante = participantes.get(i); // Obtenemos el participante en la posición i
            if (participante instanceof ParticipanteCarrera) { // Verificar si es una instancia de ParticipanteCarrera
                // Accedemos directamente al tiempo
                double tiempo = ((ParticipanteCarrera) participante).getTiempo(); // Obtenemos el tiempo del participante
                if (tiempo < menorTiempo) {
                    ganadores.clear(); // Limpiar la lista si encontramos un tiempo menor
                    menorTiempo = tiempo;
                    ganadores.add(participante); // Agregar al nuevo ganador
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

}
