package gestionhospitalaria;

import view.VentanaAdministracion;

import javax.swing.SwingUtilities;

public class GestionHospitalaria {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Obtiene la instancia única de la ventana principal
            VentanaAdministracion ventana = VentanaAdministracion.getInstancia();
            ventana.setSize(1280, 720);
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
        });
    }
}
