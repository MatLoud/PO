
package Model;
import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
   private ArrayList<Tarea> tareas = new ArrayList<>();
    private int ultimoId = 0;

    public void agregarTarea(String nombre, String descripcion) {
        ultimoId++;
        tareas.add(new Tarea(ultimoId, nombre, descripcion));
    }
    
    // Cambiar el tipo de retorno a List<Tarea>
    public List<Tarea> listarTareas() {
        return new ArrayList<>(tareas);
    }
    
    public void Actualizar(int id, boolean completada) {
        for(Tarea t : tareas) {
            if(t.getId() == id) {
                t.setCompletada(completada);
                break;
            }
        }
    }
    
    public void eliminarTarea(int id) {
        tareas.removeIf(t -> t.getId() == id);
    }
}