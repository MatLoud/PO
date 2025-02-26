package view;

import controller.GestionTurnosController;
import model.Paciente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PacientePanel extends JPanel {

    private GestionTurnosController controller;
    private JTextField txtNombre, txtEdad, txtIdentificacion, txtBuscar;
    private JTextArea areaResultados;

    public PacientePanel(GestionTurnosController controller) {
        this.controller = controller;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Panel para registrar pacientes
        JPanel panelFormulario = new JPanel(new GridLayout(4, 2));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Registrar Paciente"));

        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panelFormulario.add(txtEdad);

        panelFormulario.add(new JLabel("Identificación:"));
        txtIdentificacion = new JTextField();
        panelFormulario.add(txtIdentificacion);

        JButton btnRegistrar = new JButton("Registrar");
        panelFormulario.add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarPaciente();
            }
        });

        add(panelFormulario, BorderLayout.NORTH);

        // Panel para buscar y eliminar pacientes
        JPanel panelBusqueda = new JPanel(new BorderLayout());
        panelBusqueda.setBorder(BorderFactory.createTitledBorder("Buscar/Eliminar Paciente"));

        JPanel panelBuscar = new JPanel(new FlowLayout());
        panelBuscar.add(new JLabel("Identificación:"));
        txtBuscar = new JTextField(10);
        panelBuscar.add(txtBuscar);

        JButton btnBuscar = new JButton("Buscar");
        panelBuscar.add(btnBuscar);

        JButton btnEliminar = new JButton("Eliminar");
        panelBuscar.add(btnEliminar);

        panelBusqueda.add(panelBuscar, BorderLayout.NORTH);

        areaResultados = new JTextArea(5, 30);
        areaResultados.setEditable(false);
        panelBusqueda.add(new JScrollPane(areaResultados), BorderLayout.CENTER);

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarPaciente();
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarPaciente();
            }
        });

        add(panelBusqueda, BorderLayout.CENTER);
    }

    private void registrarPaciente() {
        String nombre = txtNombre.getText().trim();
        String edadStr = txtEdad.getText().trim();
        String identificacion = txtIdentificacion.getText().trim();

        if (nombre.isEmpty() || edadStr.isEmpty() || identificacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        int edad;
        try {
            edad = Integer.parseInt(edadStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La edad debe ser un número.");
            return;
        }

        Paciente paciente = new Paciente(nombre, edad, identificacion);
        controller.addPaciente(paciente);

        JOptionPane.showMessageDialog(this, "Paciente registrado.");
        txtNombre.setText("");
        txtEdad.setText("");
        txtIdentificacion.setText("");
    }

    private void buscarPaciente() {
        String identificacion = txtBuscar.getText().trim();
        if (identificacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la identificación para buscar.");
            return;
        }

        Paciente paciente = controller.buscarPaciente(identificacion);
        if (paciente != null) {
            areaResultados.setText("Paciente encontrado:\n" + paciente.toString());
        } else {
            areaResultados.setText("No se encontró paciente con la identificación: " + identificacion);
        }
    }

    private void eliminarPaciente() {
        String identificacion = txtBuscar.getText().trim();
        if (identificacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la identificación para eliminar.");
            return;
        }

        boolean eliminado = controller.eliminarPaciente(identificacion);
        if (eliminado) {
            JOptionPane.showMessageDialog(this, "Paciente eliminado.");
            areaResultados.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró paciente con la identificación: " + identificacion);
        }
    }
}
