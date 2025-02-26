
package Controller;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.GestorTareas;
import View.GestorView;

public class TareaController {
    GestorTareas gestortarea;
    GestorView vista;
    

    public TareaController(GestorTareas gestortarea, GestorView vista) {
        this.gestortarea = gestortarea;
        this.vista = vista;
    }
}
