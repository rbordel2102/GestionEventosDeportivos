package proyecto;

import java.time.LocalDateTime;

import proyecto.clases.impl.ParticipanteCarrera;
import proyecto.clases.impl.Carrera;

public class Main {
        public static void main(String[] args) {
        // Crear participantes
        ParticipanteCarrera participante1 = new ParticipanteCarrera("123456789A", "Xavi", "Lopez", 30, 1200.0);
        ParticipanteCarrera participante2 = new ParticipanteCarrera("123457689K", "Lara", "Duarte", 29, 1400.0);


        }// Crear carrera
        Carrera carrera = new Carrera("Maratón Ciudad", LocalDateTime.now(), "Ciudad Central", 42.195);

        // Crear equipos


        // Crear torneo de fútbol

        // Añadir y eliminar jugadores de equipos

        // Mostrar información de los equipos después de añadir y eliminar jugadores

        // Mostrar información de los eventos deportivos



}