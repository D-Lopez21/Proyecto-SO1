/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Productores;

/**
 *
 * @author DIEGO_LOPEZ
 */
public class Ensambladores extends javax.swing.JFrame {

    public Ensambladores() {
        initComponents();
        this.setLocationRelativeTo(null);
        Valor_botones.setText(String.valueOf(Productores.botonesDisp1));
        Valor_pantallas.setText(String.valueOf(Productores.pantallasDisp1));
        Valor_pin.setText(String.valueOf(Productores.pinCargaDisp1));
        Valor_camara.setText(String.valueOf(Productores.camarasDisp1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ContarEnsambladores = new javax.swing.JButton();
        RestarEnsambladores = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Ensambladores = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Valor_pantallas = new javax.swing.JLabel();
        Valor_botones = new javax.swing.JLabel();
        Valor_pin = new javax.swing.JLabel();
        Valor_camara = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Ensambladores1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ensambladores de Teléfonos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Teléfonos ensamblados:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Historial de Teléfonos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pantallas Almacenadas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        ContarEnsambladores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ContarEnsambladores.setText("Contratar Ensamblador");
        ContarEnsambladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContarEnsambladoresActionPerformed(evt);
            }
        });
        getContentPane().add(ContarEnsambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        RestarEnsambladores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RestarEnsambladores.setText("Despedir Ensamblador");
        getContentPane().add(RestarEnsambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Regresar al menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("0");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("0");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        Ensambladores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ensambladores.setForeground(new java.awt.Color(255, 255, 255));
        Ensambladores.setText("0");
        getContentPane().add(Ensambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Botones Almacenados:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cámaras Almacenadas:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ensambladores:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pin de carga Almacenadas:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        Valor_pantallas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valor_pantallas.setForeground(new java.awt.Color(255, 255, 255));
        Valor_pantallas.setText("0");
        getContentPane().add(Valor_pantallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        Valor_botones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valor_botones.setForeground(new java.awt.Color(255, 255, 255));
        Valor_botones.setText("0");
        getContentPane().add(Valor_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        Valor_pin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valor_pin.setForeground(new java.awt.Color(255, 255, 255));
        Valor_pin.setText("0");
        getContentPane().add(Valor_pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        Valor_camara.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valor_camara.setForeground(new java.awt.Color(255, 255, 255));
        Valor_camara.setText("0");
        getContentPane().add(Valor_camara, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gasto generado:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        Ensambladores1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ensambladores1.setForeground(new java.awt.Color(255, 255, 255));
        Ensambladores1.setText("0");
        getContentPane().add(Ensambladores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoNico.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContarEnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContarEnsambladoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContarEnsambladoresActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Empresa1 empresa1 = new Empresa1(0);
    
    empresa1.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ensambladores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ensambladores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ensambladores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ensambladores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ensambladores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContarEnsambladores;
    private javax.swing.JLabel Ensambladores;
    private javax.swing.JLabel Ensambladores1;
    private javax.swing.JButton RestarEnsambladores;
    private javax.swing.JLabel Valor_botones;
    private javax.swing.JLabel Valor_camara;
    private javax.swing.JLabel Valor_pantallas;
    private javax.swing.JLabel Valor_pin;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
