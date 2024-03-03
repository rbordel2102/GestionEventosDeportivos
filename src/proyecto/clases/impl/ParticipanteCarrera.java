package proyecto.clases.impl;

import proyecto.clases.impl.Participante;

public class ParticipanteCarrera extends Participante {
        private double tiempo;

        public ParticipanteCarrera(String dni, String nombre, String apellidos, int edad, double tiempo) {
            super(dni, nombre, apellidos, edad);
            this.tiempo = tiempo;
        }

        public double getTiempo() {
            return tiempo;
        }

        public void setTiempo(double tiempo) {
            this.tiempo = tiempo;
        }

        @Override
        public String toString() {
            return "Participante de la carrera -->"+ super.toString() + ", tiempo = " + tiempo;
        }
}
