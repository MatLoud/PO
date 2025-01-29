
package View;
import Model.Tarea;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
public class MainView extends JFrame {
    private JTextField txtNombre;
    private JTextArea txtDescripcion;
    private JTable tablaTareas;
    private DefaultTableModel modeloTabla;
    private JButton btnCrear, btnCompletado, btnPendiente, btnEliminar;

    public MainView() {
        configurarVista();
        initComponentes();
    }

    private void configurarVista() {
        setTitle("Gestor de Tareas");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponentes() {
        // Panel principal
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Cabecera
        JLabel lblTitulo = new JLabel("Bienvenido al Gestor de Tareas", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(lblTitulo, BorderLayout.NORTH);

        // Formulario
        JPanel panelForm = new JPanel(new GridLayout(0, 1, 5, 5));
        panelForm.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelForm.add(txtNombre);
        panelForm.add(new JLabel("Descripción:"));
        txtDescripcion = new JTextArea(3, 20);
        panelForm.add(new JScrollPane(txtDescripcion));
        
        // Tabla
        modeloTabla = new DefaultTableModel(
            new Object[]{"ID", "Nombre", "Descripción", "Estado"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        tablaTareas = new JTable(modeloTabla);
        JScrollPane scrollTabla = new JScrollPane(tablaTareas);
        
        // Botones
        JPanel panelBotones = new JPanel(new GridLayout(1, 4, 5, 5));
        btnCrear = new JButton("Crear");
        btnCompletado = new JButton("Marcar Completado");
        btnPendiente = new JButton("Marcar Pendiente");
        btnEliminar = new JButton("Eliminar");
        
        panelBotones.add(btnCrear);
        panelBotones.add(btnCompletado);
        panelBotones.add(btnPendiente);
        panelBotones.add(btnEliminar);

        // Ensamblar componentes
        panel.add(panelForm, BorderLayout.CENTER);
        panel.add(scrollTabla, BorderLayout.SOUTH);
        
        add(panel, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }
 // Getters y métodos de la vista
    public JButton getBtnCrear() { return btnCrear; }
    public JButton getBtnCompletado() { return btnCompletado; }
    public JButton getBtnPendiente() { return btnPendiente; }
    public JButton getBtnEliminar() { return btnEliminar; }
    
    public String getNombre() { return txtNombre.getText().trim(); }
    public String getDescripcion() { return txtDescripcion.getText().trim(); }
    
    public void limpiarFormulario() {
        txtNombre.setText("");
        txtDescripcion.setText("");
    }
    
    // Asegurar el tipo List<Tarea> con la importación correcta
    public void actualizarTabla(List<Tarea> tareas) {
        modeloTabla.setRowCount(0);
        for(Tarea t : tareas) {
            modeloTabla.addRow(new Object[]{
                t.getId(),
                t.getNombre(),
                t.getDescripcion(),
                t.isCompletada() ? "Completada" : "Pendiente"
            });
        }
    }
    
    public int obtenerIdSeleccionado() {
        int fila = tablaTareas.getSelectedRow();
        if(fila == -1) return -1;
        return (int) modeloTabla.getValueAt(fila, 0);
    }
    
    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}