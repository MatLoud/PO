/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.TareaController;
import Model.GestorTareas;
import Model.Tarea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author HP
 */
public class GestorView extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    GestorTareas gestortarea = new GestorTareas();
    ArrayList<Tarea> listatarea = new ArrayList<Tarea>();
    
        public int id;
        public String nombre;
        public String descripcion;
        public String estado;
    
    
    public GestorView() {
        initComponents();
        this.setTitle("REGISTRO DE ALUMNOS");
        this.setSize(1000, 520);
        this.setLocationRelativeTo(null);
        model.addColumn("ID");
        model.addColumn("NOMBRE");
        model.addColumn("DESCRIPCION");
        model.addColumn("ESTADO");
        tbl_TABLA.setModel(model);
    }
    
    public void Agregar ()
    {
        try {
            id = Integer.parseInt(txt_ID.getText());
            nombre = txt_NOMBRE.getText();
            descripcion = txa_DESCRIPCION.getText();
            estado = txt_ESTADO.getText();
            if(id>0)
            {
                if(nombre.matches("[a-zA-Z]+"))
                {
                   if(descripcion.matches("[a-zA-Z]+"))
                   {
                         if(estado.equalsIgnoreCase("si"))
                         {
                             boolean verificador = true;
                            Tarea tarea = new Tarea(id, nombre, descripcion,verificador);
                            gestortarea.agregarTarea(tarea);
                         }
                         if(estado.equalsIgnoreCase("no"))
                         {
                             boolean verificador = false;
                             Tarea tarea = new Tarea(id, nombre, descripcion,verificador);
                            gestortarea.agregarTarea(tarea);
                         }
                   }
                }
            }
            /*
            tarea.setId(Integer.parseInt(txt_ID.getText()));
            tarea.setNombre(txt_NOMBRE.getText());
            tarea.setDescripcion(txa_DESCRIPCION.getText());
            tarea.setCompletada(Boolean.parseBoolean(txt_ESTADO.getText()));
            listatarea.add(tarea);
            */
            txt_ID.setText("");
            txt_NOMBRE.setText("");
            txt_ESTADO.setText("");
            txa_DESCRIPCION.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"ERROR AL AGREGAR ALUMNO");
        }
    }
    
    public void mostrar()
    {
        while(model.getRowCount()>0)
        {
            model.removeRow(0);
        }
        for (Tarea tarea : gestortarea.listarTareas()) {
            Object objecto [] = new Object[4];
            objecto[0]=tarea.getId();
            objecto[1]=tarea.getNombre();
            objecto[2]=tarea.getDescripcion();
            objecto[3]=tarea.getCompletada();
            model.addRow(objecto);
        }
        
        tbl_TABLA.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_NOMBRE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_ESTADO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_DESCRIPCION = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_TABLA = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GESTOR DE TAREAS");

        jLabel2.setText("ID");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("DESCRIPCION");

        jLabel5.setText("COMPLETADO");

        txa_DESCRIPCION.setColumns(20);
        txa_DESCRIPCION.setRows(5);
        jScrollPane1.setViewportView(txa_DESCRIPCION);

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGAR(evt);
            }
        });

        jButton2.setText("LISTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTAR(evt);
            }
        });

        jButton3.setText("ACTUALIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZAR(evt);
            }
        });

        jButton4.setText("ELIMINAR");

        tbl_TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "ESTADO"
            }
        ));
        jScrollPane3.setViewportView(tbl_TABLA);

        Contenedor.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(txt_ID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(txt_NOMBRE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(txt_ESTADO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Contenedor.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(txt_NOMBRE)
                                .addComponent(txt_ESTADO)
                                .addComponent(txt_ID)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AGREGAR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGAR
        // TODO add your handling code here:
        Agregar();
    }//GEN-LAST:event_AGREGAR

    private void LISTAR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTAR
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_LISTAR

    private void ACTUALIZAR(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZAR
        // TODO add your handling code here:
        String Nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL USUARIO A ACTUALIZAR EL ESTADO ");
        String Estado = JOptionPane.showInputDialog("INGRESE EL ESTADO (SI/NO)");
        for (Tarea tarea : gestortarea.listarTareas()) {
            Object objecto [] = new Object[4];
            if((objecto[1]=tarea.getNombre()).equals(Nombre))
            {
                if(Estado.equalsIgnoreCase("si"))
                {
                    boolean verificador = true;
                    objecto[0]=tarea.getId();
                    objecto[1]=tarea.getNombre();
                    objecto[2]=tarea.getDescripcion();
                    objecto[3] = verificador;
                    model.addRow(objecto);
                }
                if(Estado.equalsIgnoreCase("no"))
                {
                    boolean verificador = false;
                    objecto[0]=tarea.getId();
                    objecto[1]=tarea.getNombre();
                    objecto[2]=tarea.getDescripcion();
                    objecto[3] = verificador;
                    model.addRow(objecto);
                }
            }
            tbl_TABLA.setModel(model);
        }
    }//GEN-LAST:event_ACTUALIZAR
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_TABLA;
    private javax.swing.JTextArea txa_DESCRIPCION;
    private javax.swing.JTextField txt_ESTADO;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_NOMBRE;
    // End of variables declaration//GEN-END:variables
}
