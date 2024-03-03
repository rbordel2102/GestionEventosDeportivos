# GESTION EVENTOS DEPORTIVOS

## Roberto Borrego Delgado
## Raquel Ardila Atienza 

### **Descripción del proyecto**
Descripción del proyecto dada por Raquel.

Este proyecto consiste en un sistema de gestión de eventos deportivos que permite almacenar 
y gestionar información sobre eventos, participantes y resultados.
Permite la creación de diferentes tipos de eventos deportivos, como carreras y torneos de fútbol, así como la inscripción de participantes y 
equipos, también se puede añadir y eliminar jugadores de los equipos, y obtener el ganador de cada evento. 
Además, se puede mostrar información detallada de los eventos, de los participantes, de los equipos y de los jugadores.

## **Sistema de Clases/Herencia/Interfaces Implementadas**
El proyecto está estructurado de la siguiente manera

**Una Interface:**
        Llamada -> 'Ganador': Define el método 'obtenerGanador()' para determinar al ganador de un evento deportivo.

**Clases:**
La clase 'Participante'-> Representa a un participante en un evento deportivo.
La clase 'ParticipanteCarrera'-> Representa a un participante en una carrera, esta clase hereda de 'Participante'.
La clase 'EventoDeportivo'-> Es una clase abstracta que representa un evento deportivo genérico, implementa la interfaz 'Ganador'.
La clase 'Carrera'-> Representa una carrera, esta clase hereda de 'EventoDeportivo'.
La clase 'TorneoDeFutbol'-> Representa un torneo de fútbol, esta clase hereda también de 'EventoDeportivo'.
La clase 'Equipo'-> Representa un equipo deportivo, se implementa de la interfaz 'Comparable'.


