package view;

import controller.GestionTurnosController;

import javax.swing.*;
import java.awt.*;

public class VentanaAdministracion extends JFrame {

    private static VentanaAdministracion instancia;
    private GestionTurnosController controller;

    // Constructor privado para el patrón Singleton
    private VentanaAdministracion() {
        super("Sistema de Gestión de Turnos Médicos");
        controller = new GestionTurnosController();
        initUI();
    }

    // Método estático para obtener la única instancia
    public static VentanaAdministracion getInstancia() {
        if (instancia == null) {
            instancia = new VentanaAdministracion();
        }
        return instancia;
    }

    private void initUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);

        // Se utiliza un JTabbedPane para separar la gestión de Pacientes y Turnos
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Pacientes", new PacientePanel(controller));
        tabbedPane.addTab("Turnos", new TurnoPanel(controller));

        add(tabbedPane, BorderLayout.CENTER);
    }
}
