
package Model;

import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> tareas = new ArrayList<Tarea>();

    public void agregarTarea(Tarea nuevaTarea) {
        tareas.add(nuevaTarea);
    }

    public ArrayList<Tarea> listarTareas() {
        return tareas;
    }
    
    public int Dimencion()
    {
        return tareas.size();
    }

    public void eliminarTarea(int id) {
        tareas.removeIf(tarea -> tarea.getId() == id);
    }
}
