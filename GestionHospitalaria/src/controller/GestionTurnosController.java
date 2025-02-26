
package controller;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Paciente;
import model.Turno;

public class GestionTurnosController {
     private List<Paciente> listaPacientes;
    private List<Turno> listaTurnos;
    
    public GestionTurnosController() {
        listaPacientes = new ArrayList<>();
        listaTurnos = new ArrayList<>();
    }
   // Gestión de Pacientes
    public void addPaciente(Paciente p) {
        listaPacientes.add(p);
    }
    
    public Paciente buscarPaciente(String identificacion) {
        for (Paciente p : listaPacientes) {
            if (p.getIdentificacion().equals(identificacion)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean eliminarPaciente(String identificacion) {
        Paciente paciente = buscarPaciente(identificacion);
        if (paciente != null) {
            listaPacientes.remove(paciente);
            return true;
        }
        return false;
    }
    
    // Gestión de Turnos
    public String addTurno(Paciente paciente, LocalDateTime fechaHora) {
        LocalDate fechaTurno = fechaHora.toLocalDate();
        boolean conflict = listaTurnos.stream().anyMatch(t -> 
            t.getPaciente().getIdentificacion().equals(paciente.getIdentificacion()) &&
            t.getFecha().equals(fechaTurno)
        );
        if (conflict) {
            return "El paciente ya tiene un turno ese día.";
        } else {
            Turno turno = new Turno(paciente, fechaHora);
            listaTurnos.add(turno);
            return "Turno asignado correctamente.";
        }
    }
    
    public List<Turno> getTurnosOrdenados() {
        return listaTurnos.stream()
                .sorted((t1, t2) -> t1.getFechaHora().compareTo(t2.getFechaHora()))
                .collect(Collectors.toList());
    } 
}