/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author DIEGO_LOPEZ
 */
public class Empresa1 extends javax.swing.JFrame {

    /**
     * Creates new form Empresa1
     */
    public Empresa1() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        Dias = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TlfVendidos = new javax.swing.JLabel();
        Produ_pantallas = new javax.swing.JButton();
        Produ_botones = new javax.swing.JButton();
        Produ_pin = new javax.swing.JButton();
        Produ_camara = new javax.swing.JButton();
        Salir1 = new javax.swing.JButton();
        Valor_pantallas = new javax.swing.JLabel();
        Valor_botones = new javax.swing.JLabel();
        Valor_pin = new javax.swing.JLabel();
        Valor_camara = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Ensambladores = new javax.swing.JButton();
        Jefe = new javax.swing.JButton();
        Gerente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Dia_entrega = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("iNico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dias Trabajados: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        Dias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Dias.setForeground(new java.awt.Color(255, 255, 255));
        Dias.setText("0");
        getContentPane().add(Dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefonos Vendidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        TlfVendidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TlfVendidos.setForeground(new java.awt.Color(255, 255, 255));
        TlfVendidos.setText("0");
        getContentPane().add(TlfVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        Produ_pantallas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Produ_pantallas.setText("Ver productores");
        Produ_pantallas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produ_pantallasActionPerformed(evt);
            }
        });
        getContentPane().add(Produ_pantallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        Produ_botones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Produ_botones.setText("Ver productores");
        Produ_botones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produ_botonesActionPerformed(evt);
            }
        });
        getContentPane().add(Produ_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        Produ_pin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Produ_pin.setText("Ver productores");
        Produ_pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produ_pinActionPerformed(evt);
            }
        });
        getContentPane().add(Produ_pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        Produ_camara.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Produ_camara.setText("Ver productores");
        Produ_camara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produ_camaraActionPerformed(evt);
            }
        });
        getContentPane().add(Produ_camara, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        Salir1.setBackground(new java.awt.Color(255, 0, 0));
        Salir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salir1.setForeground(new java.awt.Color(255, 255, 255));
        Salir1.setText("X");
        Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir1ActionPerformed(evt);
            }
        });
        getContentPane().add(Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

        Valor_pantallas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Valor_pantallas.setForeground(new java.awt.Color(255, 255, 255));
        Valor_pantallas.setText("0");
        getContentPane().add(Valor_pantallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        Valor_botones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Valor_botones.setForeground(new java.awt.Color(255, 255, 255));
        Valor_botones.setText("0");
        getContentPane().add(Valor_botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        Valor_pin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Valor_pin.setForeground(new java.awt.Color(255, 255, 255));
        Valor_pin.setText("0");
        getContentPane().add(Valor_pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        Valor_camara.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Valor_camara.setForeground(new java.awt.Color(255, 255, 255));
        Valor_camara.setText("0");
        getContentPane().add(Valor_camara, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pantallas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Botones");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pin de carga");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cámara");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        Ensambladores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ensambladores.setText("Ver ensambladores");
        Ensambladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnsambladoresActionPerformed(evt);
            }
        });
        getContentPane().add(Ensambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        Jefe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jefe.setText("Ver al Jefe");
        Jefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JefeActionPerformed(evt);
            }
        });
        getContentPane().add(Jefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        Gerente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Gerente.setText("Ver al gerente");
        Gerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenteActionPerformed(evt);
            }
        });
        getContentPane().add(Gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dias para la entrega: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dias sin accidentes: 4");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        Dia_entrega.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Dia_entrega.setForeground(new java.awt.Color(255, 255, 255));
        Dia_entrega.setText("0");
        getContentPane().add(Dia_entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoNico.gif"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Produ_pantallasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produ_pantallasActionPerformed
    Productor_Pantallas puente = new Productor_Pantallas();
    
    puente.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Produ_pantallasActionPerformed

    private void Produ_botonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produ_botonesActionPerformed
    Productor_Botones puente = new Productor_Botones();
    
    puente.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Produ_botonesActionPerformed

    private void Produ_pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produ_pinActionPerformed
    Productor_Pin puente = new Productor_Pin();
    
    puente.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Produ_pinActionPerformed

    private void Produ_camaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produ_camaraActionPerformed
    Productor_Camara puente = new Productor_Camara();
    
    puente.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_Produ_camaraActionPerformed

    private void Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir1ActionPerformed
    
        InterfazBase base = new InterfazBase();
    
        base.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Salir1ActionPerformed

    private void EnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnsambladoresActionPerformed
    Ensambladores puente = new Ensambladores();
    
    puente.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_EnsambladoresActionPerformed

    private void JefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JefeActionPerformed
    Gestion_Jefe puente = new Gestion_Jefe();
    
    puente.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_JefeActionPerformed

    private void GerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenteActionPerformed
    Gestion_Gerente puente = new Gestion_Gerente();
    
    puente.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_GerenteActionPerformed

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
            java.util.logging.Logger.getLogger(Empresa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empresa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empresa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empresa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresa1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dia_entrega;
    private javax.swing.JLabel Dias;
    private javax.swing.JButton Ensambladores;
    private javax.swing.JButton Gerente;
    private javax.swing.JButton Jefe;
    private javax.swing.JButton Produ_botones;
    private javax.swing.JButton Produ_camara;
    private javax.swing.JButton Produ_pantallas;
    private javax.swing.JButton Produ_pin;
    private javax.swing.JButton Salir1;
    private javax.swing.JLabel TlfVendidos;
    private javax.swing.JLabel Valor_botones;
    private javax.swing.JLabel Valor_camara;
    private javax.swing.JLabel Valor_pantallas;
    private javax.swing.JLabel Valor_pin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
