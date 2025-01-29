
package proyectofinal;

import Controller.TareasController;
import Model.GestorTareas;
import View.MainView;
import javax.swing.SwingUtilities;

public class ProyectoFinal {

    public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
            GestorTareas modelo = new GestorTareas();
            MainView vista = new MainView();
            TareasController controlador = new TareasController(modelo, vista);
            vista.setVisible(true);
        });
    }
    
}
