package proyecto;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.Scanner;


import proyecto.clases.impl.*;

public class Main {
        public static void main(String[] args) {
                // Definición de las listas de equipos y jugadores
                ArrayList<Equipo> listaDeEquipos = new ArrayList<>();
                ArrayList<Participante> listaDeJugadores = new ArrayList<>();

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



                // Añadir participantes a la lista de jugadores
                listaDeJugadores.add(jugador1);
                listaDeJugadores.add(jugador2);
                listaDeJugadores.add(jugador3);
                listaDeJugadores.add(jugador4);
                listaDeJugadores.add(jugador5);
                listaDeJugadores.add(jugador6);

                // Añadir equipos a la lista de equipos
                listaDeEquipos.add(equipo1);
                listaDeEquipos.add(equipo2);

                // Inscribir participantes y equipos
                carrera.inscribirParticipante(participante1);
                carrera.inscribirParticipante(participante2);
                carrera.inscribirParticipante(participante3);
                carrera.inscribirParticipante(participante4);

                torneoFutbol.inscribirEquipo(equipo1);
                torneoFutbol.inscribirEquipo(equipo2);

                int opcion = 0;
                do {
                        System.out.println("Menú de gestión de equipos:");
                        System.out.println("1. Añadir jugador a equipo");
                        System.out.println("2. Eliminar jugador de equipo");
                        System.out.println("3. Salir");
                        System.out.print("Seleccione una opción: ");
                        Scanner scan = new Scanner(System.in);
                        opcion = scan.nextInt();
                        scan.nextLine();

                        switch (opcion) {
                                case 1:
                                        System.out.println("Añadir jugador a equipo");
                                        System.out.print("Ingrese el nombre del jugador: ");
                                        String nombreJugador = scan.nextLine();
                                        System.out.print("Ingrese el nombre del equipo: ");
                                        String nombreEquipo = scan.nextLine();

                                        for (int i = 0; i < listaDeJugadores.size(); i++) {
                                                Participante participante = listaDeJugadores.get(i);
                                                if (participante.getNombre().equalsIgnoreCase(nombreJugador)) {
                                                        for (int j = 0; j < listaDeEquipos.size(); j++) {
                                                                Equipo equipo = listaDeEquipos.get(j);
                                                                if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {
                                                                        if (equipo.anadirJugador(participante)) {
                                                                                System.out.println("Jugador añadido exitosamente al equipo.");
                                                                        } else {
                                                                                System.out.println("No se puede añadir el jugador al equipo.");
                                                                        }
                                                                        break;
                                                                }
                                                        }
                                                        break;
                                                }
                                        }
                                        break;

                                case 2:
                                        System.out.println("Eliminar jugador de equipo");
                                        System.out.print("Ingrese el nombre del jugador: ");
                                        String nombreJugadorEliminar = scan.nextLine();
                                        System.out.print("Ingrese el nombre del equipo: ");
                                        String nombreEquipoEliminar = scan.nextLine();

                                        for (int i = 0; i < listaDeEquipos.size(); i++) {
                                                Equipo equipo = listaDeEquipos.get(i);
                                                if (equipo.getNombre().equalsIgnoreCase(nombreEquipoEliminar)) {
                                                        for (int j = 0; j < equipo.getJugadores().size(); j++) {
                                                                Participante participante = equipo.getJugadores().get(j);
                                                                if (participante.getNombre().equalsIgnoreCase(nombreJugadorEliminar)) {
                                                                        if (equipo.eliminarJugador(participante)) {
                                                                                System.out.println("Jugador eliminado exitosamente del equipo.");
                                                                        } else {
                                                                                System.out.println("No se pudo eliminar el jugador del equipo.");
                                                                        }
                                                                        break;
                                                                }
                                                        }
                                                        break;
                                                }
                                        }
                                        break;

                                case 3:
                                        System.out.println("Saliendo del programa...");
                                        break;

                                default:
                                        System.out.println("Opción inválida. Por favor, intente de nuevo.");
                        }
                } while (opcion != 3);



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

                System.out.println("Información de los equipos:");
                System.out.println(equipo1.toString());
                System.out.println(equipo2.toString());

                // Determinar y mostrar el ganador de cada evento
                System.out.println("Ganador de la Carrera:");
                System.out.println(carrera.obtenerGanador());

                System.out.println("Ganador del Torneo de Fútbol:");
                System.out.println(torneoFutbol.obtenerGanador());



                // Método para ordenar los equipos por puntuación de mayor a menor
                System.out.println("Lista de equipos ordenados por puntuación:");
                ArrayList<Equipo> equiposOrdenados = new ArrayList<>();
                for (int i = 0; i < equiposOrdenados.size(); i++) {
                        double ordenacionPorPuntos = 0.0;
                        if(ordenacionPorPuntos > equiposOrdenados.get(i).getPuntos()){
                                System.out.println(equiposOrdenados.toString());
                        }

                }



        }
}