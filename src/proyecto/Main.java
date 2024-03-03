package proyecto;

import java.time.LocalDateTime;

import proyecto.clases.impl.*;

public class Main {
        public static void main(String[] args) {
                //Instancie eventos deportivos (carreras y torneos de fútbol)

                // Crear carrera
                Carrera carrera = new Carrera("Maraton", LocalDateTime.now(), "Madrid", 42.195);

                // Crear torneo de fútbol
                TorneoDeFutbol torneoFutbol = new TorneoDeFutbol("Liga de Campeones", LocalDateTime.now(), "Europa");


                // Crear participantes
                ParticipanteCarrera participante1 = new ParticipanteCarrera("12346789A", "Xavi", "Lopez Corrales", 30, 1200.0);
                ParticipanteCarrera participante2 = new ParticipanteCarrera("13345768K", "Lara", "Duarte Valencia", 29, 1400.0);
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

                // Añadir y eliminar jugadores de equipos
                Participante jugador1 = new Participante("20105481T", "Oliver ", "Atom",21);
                Participante jugador2 = new Participante("50217785F", "Marc", "Lenders",23);
                Participante jugador3 = new Participante("21507780L", "Benji", "Price",24);
                Participante jugador4 = new Participante("70200725N", "Tom", "Baker",21);
                Participante jugador5 = new Participante("03199225C", "James", "Derrick",26);
                Participante jugador6 = new Participante("70202415D", "Jason", "Derrick",26);

                if (equipo1.anadirJugador(jugador1)) {
                        System.out.println("Jugador añadido al equipo 1 correctamente.");
                } else {
                        System.out.println("No se pudo añadir el jugador al equipo 1.");
                }

                if (equipo1.eliminarJugador(jugador1)) {
                        System.out.println("Jugador eliminado del equipo 1 correctamente.");
                } else {
                        System.out.println("No se pudo eliminar el jugador del equipo 1.");
                }



                // Mostrar información de los eventos, participantes, equipos y jugadores
                System.out.println("Información de la Carrera:");
                System.out.println(carrera.toString());

                System.out.println("Información de los participantes:");
                System.out.println(participante1.toString());
                System.out.println(participante2.toString());
                System.out.println(participante3.toString());
                System.out.println(participante4.toString());


                System.out.println("Información del Torneo de Fútbol:");
                System.out.println(torneoFutbol.toString());

                System.out.println("Información de los jugadores:");
                System.out.println(jugador1.toString());
                System.out.println(jugador2.toString());
                System.out.println(jugador3.toString());
                System.out.println(jugador4.toString());
                System.out.println(jugador5.toString());
                System.out.println(jugador6.toString());

                // Determinar y mostrar el ganador de cada evento
                System.out.println("Ganador de la Carrera:");
                System.out.println(carrera.obtenerGanador());

                System.out.println("Ganador del Torneo de Fútbol:");
                System.out.println(torneoFutbol.obtenerGanador());

                // Mostrar la lista de equipos de mayor puntuación a menor puntuación


                // Método para ordenar los equipos por puntuación de mayor a menor



        }
}
