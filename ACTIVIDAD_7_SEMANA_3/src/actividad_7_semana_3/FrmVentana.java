/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_7_semana_3;

/**
 *
 * @author laex2
 */
public class FrmVentana extends javax.swing.JFrame {

    /**
     * Creates new form FrmVentana
     */
    public FrmVentana() {
        initComponents();
        
        
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAdy = new javax.swing.JTextField();
        txtOpu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtResu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        txtAdy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdyActionPerformed(evt);
            }
        });
        getContentPane().add(txtAdy);
        txtAdy.setBounds(60, 60, 110, 30);
        getContentPane().add(txtOpu);
        txtOpu.setBounds(290, 60, 110, 30);

        jLabel1.setText("Inserte el cateto adyacente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 150, 30);

        jLabel2.setText("Inserte el cateto opuesto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 20, 140, 30);

        jLabel3.setText("La hipotenusa es:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 240, 120, 30);

        txtResu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResuActionPerformed(evt);
            }
        });
        getContentPane().add(txtResu);
        txtResu.setBounds(240, 240, 220, 40);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 150, 130, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdyActionPerformed

    private void txtResuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Double Ady = Double.parseDouble(txtAdy.getText());
        Double Opu = Double.parseDouble(txtOpu.getText());
        
        Double Resu = (((Ady*Ady)+(Opu*Opu)));
        Double hipo = Math.sqrt(Resu);
        txtResu.setText(String.valueOf(hipo));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAdy;
    private javax.swing.JTextField txtOpu;
    private javax.swing.JTextField txtResu;
    // End of variables declaration//GEN-END:variables
}