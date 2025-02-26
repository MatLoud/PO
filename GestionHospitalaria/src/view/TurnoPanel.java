
package view;

import controller.GestionTurnosController;
import model.Paciente;
import model.Turno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TurnoPanel extends JPanel {

    private GestionTurnosController controller;
    private JTextField txtPacienteId, txtFechaHora;
    private JTextArea areaTurnos;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public TurnoPanel(GestionTurnosController controller) {
        this.controller = controller;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Panel para asignar un nuevo turno
        JPanel panelAsignar = new JPanel(new FlowLayout());
        panelAsignar.setBorder(BorderFactory.createTitledBorder("Asignar Turno"));

        panelAsignar.add(new JLabel("ID Paciente:"));
        txtPacienteId = new JTextField(10);
        panelAsignar.add(txtPacienteId);

        panelAsignar.add(new JLabel("Fecha y Hora (yyyy-MM-dd HH:mm):"));
        txtFechaHora = new JTextField(16);
        panelAsignar.add(txtFechaHora);

        JButton btnAsignar = new JButton("Asignar");
        panelAsignar.add(btnAsignar);

        btnAsignar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                asignarTurno();
            }
        });

        add(panelAsignar, BorderLayout.NORTH);

        // Panel para mostrar la lista de turnos
        JPanel panelLista = new JPanel(new BorderLayout());
        panelLista.setBorder(BorderFactory.createTitledBorder("Lista de Turnos"));

        areaTurnos = new JTextArea(10, 40);
        areaTurnos.setEditable(false);
        panelLista.add(new JScrollPane(areaTurnos), BorderLayout.CENTER);

        JButton btnRefrescar = new JButton("Refrescar Lista");
        btnRefrescar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refrescarLista();
            }
        });
        panelLista.add(btnRefrescar, BorderLayout.SOUTH);

        add(panelLista, BorderLayout.CENTER);
    }

    private void asignarTurno() {
        String idPaciente = txtPacienteId.getText().trim();
        String fechaHoraStr = txtFechaHora.getText().trim();

        if (idPaciente.isEmpty() || fechaHoraStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
            return;
        }

        // Buscar paciente por su ID
        Paciente paciente = controller.buscarPaciente(idPaciente);
        if (paciente == null) {
            JOptionPane.showMessageDialog(this, "No se encontró paciente con ID: " + idPaciente);
            return;
        }

        // Parsear la fecha y hora
        LocalDateTime fechaHora;
        try {
            fechaHora = LocalDateTime.parse(fechaHoraStr, formatter);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Formato de fecha y hora incorrecto. Use yyyy-MM-dd HH:mm");
            return;
        }

        // Asignar el turno a través del controlador
        String resultado = controller.addTurno(paciente, fechaHora);
        JOptionPane.showMessageDialog(this, resultado);

        // Refrescar la lista de turnos en pantalla
        refrescarLista();
    }

    private void refrescarLista() {
        List<Turno> turnos = controller.getTurnosOrdenados();
        StringBuilder sb = new StringBuilder();
        for (Turno t : turnos) {
            sb.append(t.toString()).append("\n");
        }
        areaTurnos.setText(sb.toString());
    }
}
