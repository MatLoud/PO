
package View;

import Controller.DatosController;

/**
 *
 * @author Defolt
 */
public class Actualizar extends javax.swing.JInternalFrame {

    private DatosController datos;
    /**
     * Creates new form Actualizar
     */
    public Actualizar(DatosController datos) {
        this.datos = datos;
        initComponents();
        setClosable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nnombre = new javax.swing.JTextField();
        txt_nedad = new javax.swing.JTextField();
        txt_ncedula = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        lblerr = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel1.setText("ACTUALIZACION!!");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel2.setText("Nombre de quien actualizar:");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setText("Edad:");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel5.setText("Cedula:");

        txt_nedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nedadActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn1.setText("Actualizate");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar(evt);
            }
        });

        lblerr.setText("---");

        lbl.setText("---");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Volver(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(lblerr, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nnombre)
                                    .addComponent(txt_nedad)
                                    .addComponent(txt_ncedula))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addComponent(txt_nnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ncedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addGap(40, 40, 40)
                .addComponent(lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblerr, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nedadActionPerformed

    private void Actualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar
    String nombre = txt_nombre.getText().trim();
    String nnombre = txt_nnombre.getText().trim();
    String edadTexto = txt_nedad.getText().trim();
    String cedulaTexto = txt_ncedula.getText().trim();

    // Validar que los campos no estén vacíos
    if (nombre.isEmpty() || nnombre.isEmpty() || edadTexto.isEmpty() || cedulaTexto.isEmpty()) {
        lbl.setText("Error: Todos los campos son obligatorios.");
        return;
    }
    if (nombre.matches(".*\\d.*") || nnombre.matches(".*\\d.*")) { // Verifica si el nombre contiene números
        lblerr.setText("Error: El nombre no debe contener números.");
        return;
    }
    try {
        // Convertir los valores a enteros
        int edad = Integer.parseInt(edadTexto);
        int cedula = Integer.parseInt(cedulaTexto);

        // Validar que los valores sean positivos
        if (edad <= 0 || cedula <= 0) {
            lbl.setText("Error: Edad y cédula deben ser números positivos.");
            return;
        }
        // Llamar al método de actualización
        lbl.setText(datos.actualizarPersona(nombre, nnombre, edad, cedula));
            // Limpiar los campos después de agregar
            txt_nombre.setText("");
            txt_nnombre.setText("");
            txt_nedad.setText("");
            txt_ncedula.setText("");
    } catch (NumberFormatException e) {
        lbl.setText("Error: Edad y cédula deben ser números válidos.");
    }
    }//GEN-LAST:event_Actualizar

    private void jButton1Volver(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Volver
        this.dispose();
    }//GEN-LAST:event_jButton1Volver


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblerr;
    private javax.swing.JTextField txt_ncedula;
    private javax.swing.JTextField txt_nedad;
    private javax.swing.JTextField txt_nnombre;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
