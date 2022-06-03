/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Nicolas B
 */
public class Gestion_Jefe3 extends javax.swing.JFrame {
    private int dayDuration;
    public static String state;
    public static float money;
    private boolean stop;
    private Semaphore mutex;
    /**
     * Creates new form Gestion_Jefe3
     */
    public Gestion_Jefe3(int dayDuration, Semaphore mutex) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.dayDuration = dayDuration;
        this.state = "";
        this.money = 0;
        this.mutex = mutex;
    }
    
    public void run(){
        while(!this.stop){
            try{
                double chillTime = (dayDuration*1000) - (dayDuration*1000)/24;
                int salaryTime = 0;
                while (chillTime > 0) {
                    state = "Jugando Clash Royale";
                    this.Estado.setText(state);
                    Thread.sleep((dayDuration*15000)/1440);
                    state = "Revisando papeles";
                    this.Estado.setText(state);
                    Thread.sleep((dayDuration*15000)/1440);
                    chillTime -= (dayDuration*30000)/1440;
                    salaryTime++;
                    if ((salaryTime % 2) == 0) {
                        money += 7;
                        this.wonSalary.setText(Float.toString(money));
                    }
                }
                this.mutex.acquire();
                state = "Trabajando";
                this.Estado.setText(state);
                Thread.sleep((dayDuration*1000)/24);
                Empresa3.daysToDeliver--;
                Gestion_Gerente3.money += 180;
                Gestion_Gerente3.wonSalary.setText(Integer.toString((int) money));
                Empresa3.Dia_entrega.setText(Integer.toString(Empresa3.daysToDeliver));
                this.mutex.release();
            }catch(Exception e){
                
            }
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
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
        Estado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lostMoney = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        wonSalary = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Jefe");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Estado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        Estado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Estado.setText("Jugando Clash Royale");
        getContentPane().add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dias Laborales:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Descontado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        lostMoney.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lostMoney.setText("0");
        getContentPane().add(lostMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("0");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Salario ganado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 20));

        wonSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wonSalary.setText("0");
        getContentPane().add(wonSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoDiego2.gif"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, -40, 710, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Empresa3 empresa3 = new Empresa3();
    
    empresa3.setVisible(true);
    this.dispose();
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
            java.util.logging.Logger.getLogger(Gestion_Jefe3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_Jefe3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_Jefe3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_Jefe3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_Jefe3(0,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public static volatile javax.swing.JLabel lostMoney;
    public static volatile javax.swing.JLabel wonSalary;
    // End of variables declaration//GEN-END:variables
}
