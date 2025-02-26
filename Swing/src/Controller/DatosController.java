
package Controller;
import Model.Datos;
import java.util.ArrayList;
public class DatosController {
  
    private final ArrayList<Datos> Persona;

    // Constructor
    public DatosController() {
        this.Persona = new ArrayList<>();
    }

    // Método para agregar productos
    public String agregarPersona(String nombre, int precio, int cedula) {
        if (precio < 0 || cedula < 0) {
        return "Error: no pueden ser negativos.";
        }
        Datos persona = new Datos(nombre, precio, cedula);
        Persona.add(persona);
        return "Persona agregada correctamente.";
    }

    // Método para mostrar el listado de productos
    public String mostrarPersonas() {
        if (Persona.isEmpty()) {
            return "la lista esta vacia.";
        } 
         StringBuilder sb = new StringBuilder();
         for (Datos persona : Persona) {
         sb.append(persona.toString()).append("\n");
        }
        return sb.toString();
    }

    public String actualizarPersona(String nombre, String nuevoNombre, int nuevaEdad, int nuevaCedula) {
    for (Datos persona : Persona) {
        if (persona.getNombre().equalsIgnoreCase(nombre)) {
            persona.setNombre(nuevoNombre);
            persona.setEdad(nuevaEdad);
            persona.setCedula(nuevaCedula);
            return "Persona actualizada correctamente.";
        }
    }
    return "Persona no encontrada.";
}
    
    public String eliminarPersona(String nombre) {
        boolean eliminado = false;
        for (int i = 0; i < Persona.size(); i++) {
            if (Persona.get(i).getNombre().equalsIgnoreCase(nombre)) {
                Persona.remove(i);
                eliminado = true;
                return "Persona eliminada correctamente.";
            }
        }
        if (!eliminado) {
            return "Persona no encontrada.";
        }
        return null;
    }
}
  

