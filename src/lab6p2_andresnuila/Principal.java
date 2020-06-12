package lab6p2_andresnuila;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        DefaultComboBoxModel cm = (DefaultComboBoxModel) cb_Raza.getModel();
        cm.addElement("Humano");
        cm.addElement("Amanto");
        cb_Raza.setModel(cm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        añadirSerVivo = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_newName = new javax.swing.JTextField();
        tf_newAños = new javax.swing.JTextField();
        tf_NewPlaneta = new javax.swing.JTextField();
        js_poder = new javax.swing.JSpinner();
        cb_Raza = new javax.swing.JComboBox<>();
        jb_Crear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        m_CrearUniverso = new javax.swing.JMenu();
        mi_crearUniverso = new javax.swing.JMenuItem();
        mi_AñadirSeresVivos = new javax.swing.JMenuItem();
        mi_cargarU = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mi_modSV = new javax.swing.JMenuItem();
        mi_elimSV = new javax.swing.JMenuItem();

        jLabel1.setText("Nombre");

        jLabel2.setText("Años");

        jLabel3.setText("Planeta");

        jLabel4.setText("Raza");

        jLabel5.setText("Poder");

        js_poder.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jb_Crear.setText("CREAR");
        jb_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_CrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout añadirSerVivoLayout = new javax.swing.GroupLayout(añadirSerVivo.getContentPane());
        añadirSerVivo.getContentPane().setLayout(añadirSerVivoLayout);
        añadirSerVivoLayout.setHorizontalGroup(
            añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(añadirSerVivoLayout.createSequentialGroup()
                .addGroup(añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(añadirSerVivoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addGroup(añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_newName)
                            .addComponent(tf_newAños)
                            .addComponent(tf_NewPlaneta)
                            .addComponent(js_poder, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(cb_Raza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(añadirSerVivoLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jb_Crear)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        añadirSerVivoLayout.setVerticalGroup(
            añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(añadirSerVivoLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_newName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_newAños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_NewPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(añadirSerVivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(js_poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addComponent(jb_Crear)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Universo");

        m_CrearUniverso.setText("Crear Universo");

        mi_crearUniverso.setText("Crear");
        mi_crearUniverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_crearUniversoActionPerformed(evt);
            }
        });
        m_CrearUniverso.add(mi_crearUniverso);

        mi_AñadirSeresVivos.setText("Añadir Seres Vivos");
        mi_AñadirSeresVivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_AñadirSeresVivosActionPerformed(evt);
            }
        });
        m_CrearUniverso.add(mi_AñadirSeresVivos);

        jMenu1.add(m_CrearUniverso);

        mi_cargarU.setText("Cargar Universo");
        jMenu1.add(mi_cargarU);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Seres Vivos");

        mi_modSV.setText("Modificar Ser vivo");
        jMenu2.add(mi_modSV);

        mi_elimSV.setText("Eliminar Ser Vivos");
        jMenu2.add(mi_elimSV);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_crearUniversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_crearUniversoActionPerformed
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay seres vivos creados, no se puede crear Universo");
        }
    }//GEN-LAST:event_mi_crearUniversoActionPerformed

    private void mi_AñadirSeresVivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_AñadirSeresVivosActionPerformed
        añadirSerVivo.setModal(true);
        añadirSerVivo.pack();
        añadirSerVivo.setLocationRelativeTo(this);
        añadirSerVivo.setVisible(true);
    }//GEN-LAST:event_mi_AñadirSeresVivosActionPerformed

    private void jb_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_CrearMouseClicked
        Ser_Vivo sv = new Ser_Vivo(tf_newName.getText(), tf_newAños.getText(),
                tf_NewPlaneta.getText(), cb_Raza.getSelectedItem().toString(),
                Integer.parseInt(js_poder.getValue().toString()));
        lista.add(sv);
        JOptionPane.showMessageDialog(this, "CREADO EXITOSAMENTE");

    }//GEN-LAST:event_jb_CrearMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog añadirSerVivo;
    private javax.swing.JComboBox<String> cb_Raza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jb_Crear;
    private javax.swing.JSpinner js_poder;
    private javax.swing.JMenu m_CrearUniverso;
    private javax.swing.JMenuItem mi_AñadirSeresVivos;
    private javax.swing.JMenuItem mi_cargarU;
    private javax.swing.JMenuItem mi_crearUniverso;
    private javax.swing.JMenuItem mi_elimSV;
    private javax.swing.JMenuItem mi_modSV;
    private javax.swing.JTextField tf_NewPlaneta;
    private javax.swing.JTextField tf_newAños;
    private javax.swing.JTextField tf_newName;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Ser_Vivo> lista = new ArrayList();
}
