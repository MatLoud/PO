
package Controller;
import Model.GestorTareas;
import View.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TareasController {
    private final GestorTareas modelo;
    private final MainView vista;

    public TareasController(GestorTareas modelo, MainView vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.getBtnCrear().addActionListener(crearTarea());
        vista.getBtnCompletado().addActionListener(Completado());
        vista.getBtnPendiente().addActionListener(Pendiente());
        vista.getBtnEliminar().addActionListener(Eliminar());
        actualizarVista();
    }

    private ActionListener crearTarea() {
        return (ActionEvent e) -> {
            String nombre = vista.getNombre();
            String descripcion = vista.getDescripcion();
            
            if(nombre.isEmpty()) {
                vista.mostrarError("El nombre de la tarea es obligatorio");
                return;
            }
            
            modelo.agregarTarea(nombre, descripcion);
            vista.limpiarFormulario();
            actualizarVista();
        };
    }

    private ActionListener Completado() {
        return (ActionEvent e) -> {
            int id = vista.obtenerIdSeleccionado();
            if(id == -1) {
                vista.mostrarError("Selecciona una tarea de la tabla");
                return;
            }
            modelo.Actualizar(id, true);
            actualizarVista();
        };
    }

    private ActionListener Pendiente() {
        return (ActionEvent e) -> {
            int id = vista.obtenerIdSeleccionado();
            if(id == -1) {
                vista.mostrarError("Selecciona una tarea de la tabla");
                return;
            }
            modelo.Actualizar(id, false);
            actualizarVista();
        };
    }

    private ActionListener Eliminar() {
        return (ActionEvent e) -> {
            int id = vista.obtenerIdSeleccionado();
            if(id == -1) {
                vista.mostrarError("Selecciona una tarea de la tabla");
                return;
            }
            modelo.eliminarTarea(id);
            actualizarVista();
        };
    }

    private void actualizarVista() {
        vista.actualizarTabla(modelo.listarTareas());
    }
}
//A dormir-MF