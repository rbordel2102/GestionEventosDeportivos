package clases.impl;

import clases.api.Ganador;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {
        protected String nombre;
        protected LocalDateTime fecha;
        protected String lugar;
        protected ArrayList<Participante> participantes;

    public EventoDeportivo(String nombre, LocalDateTime fecha, String lugar) {
            this.nombre = nombre;
            this.fecha = fecha;
            this.lugar = lugar;
            this.participantes = new ArrayList<>();
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public LocalDateTime getFecha() {
            return fecha;
        }

        public void setFecha(LocalDateTime fecha) {
            this.fecha = fecha;
        }

        public String getLugar() {
            return lugar;
        }

        public void setLugar(String lugar) {
            this.lugar = lugar;
        }

        public ArrayList<Participante> getParticipantes() {
            return participantes;
        }

        public boolean inscribirParticipante(Participante participante) {
            return participantes.add(participante);
        }

    public abstract ArrayList<Participante> obtenerGanador(); // CReo que esto hay que cambiarlo
    /*
    @Override
    public abstract Participante obtenerGanador();
     */
}

