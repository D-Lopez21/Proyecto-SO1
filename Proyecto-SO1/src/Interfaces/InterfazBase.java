/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Ensamblador;
import Clases.Gerente;
import Clases.Jefe;
import Clases.Lectura;
import Clases.ProdBotones;
import Clases.ProdCamaras;
import Clases.ProdPantallas;
import Clases.ProdPinCarga;

/**
 *
 * @author DIEGO_LOPEZ
 */
public class InterfazBase extends javax.swing.JFrame {
    
    private Lectura readData;
    
    //Productores de la empresa 1
    private ProdBotones prodB1[];
    private ProdCamaras prodC1[];
    private ProdPantallas prodP1[];
    private ProdPinCarga prodPC1[];
    //Ensamblador empresa 1
    private Ensamblador ensE1[];
    //Jefe y Gerente empresa 1
    private Jefe jE1;
    private Gerente gE1;
    
    //Productores de la empresa 2
    private ProdBotones prodB2[];
    private ProdPantallas prodP2[];
    private ProdCamaras prodC2[];
    private ProdPinCarga prodPC2[];
    //Ensamblador empresa 2
    private Ensamblador ensE2[];
    //Jefe y Gerente empresa 1
    private Jefe jE2;
    private Gerente gE2;
    
    //Productores de la empresa 3
    private ProdBotones prodB3[];
    private ProdCamaras prodC3[];
    private ProdPantallas prodP3[];
    private ProdPinCarga prodPC3[];
    //Ensamblador empresa 3
    private Ensamblador ensE3[];
    //Jefe y Gerente empresa 1
    private Jefe jE3;
    private Gerente gE3;
    
    /**
     * Creates new form IntefazBase
     */
    public InterfazBase() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.readData = new Lectura();
        readData.readJson();
        
        //Creacion de productores empresa 1
        this.prodB1[0] = new ProdBotones(readData.getMaxStorages(), readData.getDailyProds(), readData.getDaysToDeliver(), readData.getDayDuration(), 1);
        this.prodC1[0] = new ProdCamaras(readData.getMaxStorages(), readData.getDailyProds(), readData.getDaysToDeliver(), readData.getDayDuration(), 1);
        this.prodP1[0] = new ProdPantallas(readData.getMaxStorages(), readData.getDailyProds(), readData.getDaysToDeliver(), readData.getDayDuration(), 1);
        this.prodPC1[0] = new ProdPinCarga(readData.getMaxStorages(), readData.getDailyProds(), readData.getDaysToDeliver(), readData.getDayDuration(), 1);

        //Creacion de ensamblador empresa 1
        this.ensE1[0] = new Ensamblador(readData.getMaxStorages(), readData.getDailyProds(), readData.getDaysToDeliver(), readData.getDayDuration(), 1);

        //Creacion de jefe y gerente empresa 1
        this.jE1 = new Jefe(readData.getDaysToDeliver(), readData.getDayDuration(), 1);
        this.gE1 = new Gerente(readData.getDaysToDeliver(), readData.getDayDuration(), 1);
        
        //Creacion de productores empresa 2
        this.prodB2[0] = new ProdBotones(readData.getMaxStorages(), readData.getDailyProds2(), readData.getDaysToDeliver(), readData.getDayDuration(), 2);
        this.prodC2[0] = new ProdCamaras(readData.getMaxStorages(), readData.getDailyProds2(), readData.getDaysToDeliver(), readData.getDayDuration(), 2);
        this.prodP2[0] = new ProdPantallas(readData.getMaxStorages(), readData.getDailyProds2(), readData.getDaysToDeliver(), readData.getDayDuration(), 2);
        this.prodPC2[0] = new ProdPinCarga(readData.getMaxStorages(), readData.getDailyProds2(), readData.getDaysToDeliver(), readData.getDayDuration(), 2);
        
        //Creacion de ensamblador empresa 2
        this.ensE2[0] = new Ensamblador(readData.getMaxStorages(), readData.getDailyProds2(), readData.getDaysToDeliver(), readData.getDayDuration(), 2);

        //Creacion de jefe y gerente empresa 2
        this.jE2 = new Jefe(readData.getDaysToDeliver(), readData.getDayDuration(), 2);
        this.gE2 = new Gerente(readData.getDaysToDeliver(), readData.getDayDuration(), 2);
        
        //Creacion de productores empresa 3
        this.prodB3[0] = new ProdBotones(readData.getMaxStorages(), readData.getDailyProds(), readData.getDaysToDeliver(), readData.getDayDuration(), 3);
        this.prodC3[0] = new ProdCamaras(readData.getMaxStorages(), readData.getDailyProds(), readData.getDaysToDeliver(), readData.getDayDuration(), 3);
        this.prodP3[0] = new ProdPantallas(readData.getMaxStorages(), readData.getDailyProds(), readData.getDaysToDeliver(), readData.getDayDuration(), 3);
        this.prodPC3[0] = new ProdPinCarga(readData.getMaxStorages(), readData.getDailyProds(), readData.getDaysToDeliver(), readData.getDayDuration(), 3);
        
        //Creacion de ensamblador empresa 3
        this.ensE3[0] = new Ensamblador(readData.getMaxStorages(), readData.getDailyProds(), readData.getDaysToDeliver(), readData.getDayDuration(), 2);

        //Creacion de jefe y gerente empresa 3
        this.jE3 = new Jefe(readData.getDaysToDeliver(), readData.getDayDuration(), 3);
        this.gE3 = new Gerente(readData.getDaysToDeliver(), readData.getDayDuration(), 3);
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
        Salir1 = new javax.swing.JButton();
        Estadisticas = new javax.swing.JButton();
        Empresa1 = new javax.swing.JButton();
        Empresa2 = new javax.swing.JButton();
        Empresa3 = new javax.swing.JButton();
        fondobase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Bienvenido al congreso de empresas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        Salir1.setBackground(new java.awt.Color(255, 0, 0));
        Salir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salir1.setForeground(new java.awt.Color(255, 255, 255));
        Salir1.setText("X");
        Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir1ActionPerformed(evt);
            }
        });
        getContentPane().add(Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, -1));

        Estadisticas.setText("Estadisticas");
        getContentPane().add(Estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 150, -1));

        Empresa1.setText("Empresa 1");
        Empresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Empresa1ActionPerformed(evt);
            }
        });
        getContentPane().add(Empresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, 40));

        Empresa2.setText("Empresa 2");
        Empresa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Empresa2ActionPerformed(evt);
            }
        });
        getContentPane().add(Empresa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 150, 40));

        Empresa3.setText("Empresa 3");
        Empresa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Empresa3ActionPerformed(evt);
            }
        });
        getContentPane().add(Empresa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 150, 40));

        fondobase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02d7b2072c41a1cd5b4237c49ce2754c.jpg"))); // NOI18N
        getContentPane().add(fondobase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Empresa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Empresa2ActionPerformed
    Empresa2 empresa2 = new Empresa2(0);
    
    empresa2.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_Empresa2ActionPerformed

    private void Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Salir1ActionPerformed

    private void Empresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Empresa1ActionPerformed
    
    Empresa1 empresa1 = new Empresa1();
    
    empresa1.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_Empresa1ActionPerformed

    private void Empresa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Empresa3ActionPerformed
    Empresa3 empresa3 = new Empresa3();
    
    empresa3.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_Empresa3ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Empresa1;
    private javax.swing.JButton Empresa2;
    private javax.swing.JButton Empresa3;
    private javax.swing.JButton Estadisticas;
    private javax.swing.JButton Salir1;
    private javax.swing.JLabel fondobase;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
