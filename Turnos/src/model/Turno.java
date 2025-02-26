
package model;

import java.util.Date;
import java.util.TimeZone;

public class Turno {
 public Paciente paciente;
 public Medico medico;
 public Date fecha;
 public TimeZone hora;
 public String observacion;

    public Turno(Paciente paciente, Medico medico, Date fecha, TimeZone hora, String observacion) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
        this.observacion = observacion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TimeZone getHora() {
        return hora;
    }

    public void setHora(TimeZone hora) {
        this.hora = hora;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
 
 
}
