package proyecto;

import java.time.LocalDateTime;

import proyecto.clases.impl.Equipo;
import proyecto.clases.impl.ParticipanteCarrera;
import proyecto.clases.impl.Carrera;
import proyecto.clases.impl.TorneoDeFutbol;

public class Main {
        public static void main(String[] args) {
                //Instancie eventos deportivos (carreras y torneos de fútbol)

                // Crear carrera
                Carrera carrera = new Carrera("Maraton", LocalDateTime.now(), "Madrid", 42.195);

                // Crear torneo de fútbol
                TorneoDeFutbol torneoFutbol = new TorneoDeFutbol("Liga de Campeones", LocalDateTime.now(), "Europa");


                // Crear participantes
                ParticipanteCarrera participante1 = new ParticipanteCarrera("12346789A", "Xavi", "Lopez Corrales", 30, 1200.0);
                ParticipanteCarrera participante2 = new ParticipanteCarrera("12345768K", "Lara", "Duarte Valencia", 29, 1400.0);
                ParticipanteCarrera participante3 = new ParticipanteCarrera("56689420P", "Guille", "Suarez Bohorquez", 25, 1170.0);
                ParticipanteCarrera participante4 = new ParticipanteCarrera("23487089B", "Becky", "Puerto Martin", 31, 1410.0);


                // Crear equipos
                Equipo equipo1 = new Equipo("Real Madrid");
                Equipo equipo2 = new Equipo("Barcelona");

                // Inscribir participantes y equipos
                carrera.inscribirParticipante(participante1);
                carrera.inscribirParticipante(participante2);
                carrera.inscribirParticipante(participante3);
                carrera.inscribirParticipante(participante4);

                torneoFutbol.inscribirEquipo(equipo1);
                torneoFutbol.inscribirEquipo(equipo2);






        }
}
