
package model;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Turno {
    private Paciente paciente;
    private LocalDateTime fechaHora;
    
    public Turno(Paciente paciente, LocalDateTime fechaHora) {
        this.paciente = paciente;
        this.fechaHora = fechaHora;
    }
    
    public Paciente getPaciente() { return paciente; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public LocalDate getFecha() { return fechaHora.toLocalDate(); }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "Turno - Paciente: " + paciente.getNombre() + " (ID: " + paciente.getIdentificacion() + "), Fecha y Hora: " + fechaHora.format(formatter);
    }  
}
