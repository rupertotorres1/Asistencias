/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencias;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rup
 */
public class FrameTomarLista extends javax.swing.JFrame {

    /**
     * Creates new form FrameTomarLista
     */
    public FrameTomarLista() {
        initComponents();
        try {
            //llena las ComboBoxes de la frame con los nombres de alumnos y proyectos
            AsistenciasGUI.SelectNameFromSQL("asistenciasrobot.Alumnos", comboListaAlumnos);
            AsistenciasGUI.SelectNameFromSQL("asistenciasrobot.Proyectos", comboListaProyectos);
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciasGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboListaAlumnos = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboListaProyectos = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboListaHoras = new javax.swing.JComboBox();
        btnListaFalta = new javax.swing.JButton();
        btnListaAsistencia = new javax.swing.JButton();
        btnListaRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(83, 209, 254));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(83, 209, 254));

        jLabel1.setFont(new java.awt.Font("Droid Sans", 0, 24)); // NOI18N
        jLabel1.setText("Tomar Lista");

        jLabel2.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        comboListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboListaAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel3.setText("Proyecto");

        jLabel4.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel4.setText("Horas");

        comboListaHoras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.0", "0.5", "1.0", "1.5", "2.0", "2.5", "3.0", "3.5", "4.0", "4.5", "5.0", "5.5", "6.0", "6.5", "7.0" }));

        btnListaFalta.setBackground(new java.awt.Color(255, 0, 0));
        btnListaFalta.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        btnListaFalta.setForeground(new java.awt.Color(1, 1, 1));
        btnListaFalta.setText("Falta");
        btnListaFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaFaltaActionPerformed(evt);
            }
        });

        btnListaAsistencia.setBackground(new java.awt.Color(68, 34, 196));
        btnListaAsistencia.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        btnListaAsistencia.setForeground(new java.awt.Color(1, 1, 1));
        btnListaAsistencia.setText("Asistencia");
        btnListaAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAsistenciaActionPerformed(evt);
            }
        });

        btnListaRegresar.setText("Regresar");
        btnListaRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboListaAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboListaProyectos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboListaHoras, 0, 253, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnListaFalta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnListaAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListaRegresar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboListaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboListaProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboListaHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaFalta)
                    .addComponent(btnListaAsistencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnListaRegresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboListaAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboListaAlumnosActionPerformed

    private void btnListaRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaRegresarActionPerformed
        //cierra la frame al picar "regresar"
        dispose();
    }//GEN-LAST:event_btnListaRegresarActionPerformed

    private void btnListaFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaFaltaActionPerformed
        /**Cuando se pica el boton de falta, se le agrega una falta a las
         * faltas que tenia el alumno. Si no se selecciono un alumno, se 
         * muestra un mensaje sobre eso. El alumno del que ya se tomo lista
         * es retirado de la ComboBox con el nombre de los alumnos (y solo
         * aparecera otra vez al volver a tomar lista).
         */
        if ((String)comboListaAlumnos.getSelectedItem()==null){
            JOptionPane.showMessageDialog(null, "No hay alumno seleccionado");
        }
        else {
        String sql = "UPDATE asistenciasrobot.Alumnos SET faltas=faltas+1 WHERE name=?";
            try {
                PreparedStatement ps = AsistenciasGUI.conn.prepareStatement(sql);
                ps.setString(1, (String)comboListaAlumnos.getSelectedItem());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Falta");
                comboListaAlumnos.removeItem(comboListaAlumnos.getSelectedItem());
            }
            catch (SQLException | HeadlessException e){
            }
        }
    }//GEN-LAST:event_btnListaFaltaActionPerformed

    private void btnListaAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAsistenciaActionPerformed
        /**Este metodo es muy parecido al del boton de falta, solo que aqui tiene
         * que estar seleccionado el alumno y el proyecto para poder poner asistencia,
         * y cuando se toma, se le suma una asistencia y las horas ingresadas, y se 
         * pone el proyecto ingresado como el ultimo proyecto en el que trabajo el
         * alumno en sus datos.
         */
        if (((String)comboListaAlumnos.getSelectedItem()==null)||((String)comboListaProyectos.getSelectedItem()==null)){
            JOptionPane.showMessageDialog(null, "No hay alumno y/o proyecto seleccionado");
        }
        else{
        String sql = "UPDATE asistenciasrobot.Alumnos SET" +
        " totalhoras=totalhoras + ?, totalasistencias=totalasistencias+1, proyecto= ? WHERE name=?";
            try {
                PreparedStatement ps = AsistenciasGUI.conn.prepareStatement(sql);
                ps.setFloat(1, Float.valueOf((String)comboListaHoras.getSelectedItem()));
                ps.setString(2, (String)comboListaProyectos.getSelectedItem());
                ps.setString(3, (String)comboListaAlumnos.getSelectedItem());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Asistencia");
                comboListaAlumnos.removeItem(comboListaAlumnos.getSelectedItem());
            }
            catch (SQLException | HeadlessException e){
            }
        }
    }//GEN-LAST:event_btnListaAsistenciaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrameTomarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTomarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTomarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTomarLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTomarLista().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListaAsistencia;
    private javax.swing.JButton btnListaFalta;
    private javax.swing.JButton btnListaRegresar;
    private javax.swing.JComboBox comboListaAlumnos;
    private javax.swing.JComboBox comboListaHoras;
    private javax.swing.JComboBox comboListaProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
