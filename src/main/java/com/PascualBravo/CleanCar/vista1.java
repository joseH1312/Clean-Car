/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PascualBravo.CleanCar;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Johan Arboleda
 */
public class vista1 extends javax.swing.JFrame {

    /**
     * Creates new form vista1
     */
    public vista1() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon imgLogo = new ImageIcon("src\\main\\java\\Recursos\\logo.png");
        lblLogo.setIcon(new ImageIcon(imgLogo.getImage().getScaledInstance(100, 80, Image.SCALE_SMOOTH)));
        
        ImageIcon imgCar = new ImageIcon("src\\main\\java\\Recursos\\Imagen1.png");
        lblCarro.setIcon(new ImageIcon(imgCar.getImage().getScaledInstance(120, 90, Image.SCALE_SMOOTH)));
        
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
        btnEmpezarDia = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnFinalizarDia = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCarro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblnominDia = new javax.swing.JLabel();
        lblNombreadmin1 = new javax.swing.JLabel();
        lblNombreadmin2 = new javax.swing.JLabel();
        lblNombreadmin3 = new javax.swing.JLabel();
        lblNombreadmin4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 102, 102));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 246, 251));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 680));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpezarDia.setBackground(new java.awt.Color(0, 153, 204));
        btnEmpezarDia.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        btnEmpezarDia.setForeground(new java.awt.Color(0, 0, 0));
        btnEmpezarDia.setText("Empezar día");
        btnEmpezarDia.setBorder(null);
        jPanel1.add(btnEmpezarDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 270, 50));

        btnServicios.setBackground(new java.awt.Color(0, 153, 204));
        btnServicios.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(0, 0, 0));
        btnServicios.setText("Servicios");
        btnServicios.setBorder(null);
        jPanel1.add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, 280, 50));

        btnFinalizarDia.setBackground(new java.awt.Color(0, 153, 204));
        btnFinalizarDia.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        btnFinalizarDia.setForeground(new java.awt.Color(0, 0, 0));
        btnFinalizarDia.setText("Finalizar día");
        btnFinalizarDia.setBorder(null);
        jPanel1.add(btnFinalizarDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 600, 270, 50));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("logo");
        lblLogo.setToolTipText("");
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 80));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(246, 246, 251));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(lblCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 140, 50));

        jTable1.setBackground(new java.awt.Color(0, 153, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Juan Carlos Meza", "50.000", "2", "disponible", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre Trabajador", "Producido", "Carros lavados", "Estado", "Eliminar"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Nombre Trabajador");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Producido");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Carros lavados");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Estado");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Eliminar");
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 1220, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 110, 1370, 460));

        lblnominDia.setFont(new java.awt.Font("Eras Demi ITC", 3, 48)); // NOI18N
        lblnominDia.setForeground(new java.awt.Color(0, 0, 0));
        lblnominDia.setText("250.000");
        jPanel1.add(lblnominDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 250, 60));

        lblNombreadmin1.setFont(new java.awt.Font("Eras Demi ITC", 3, 18)); // NOI18N
        lblNombreadmin1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreadmin1.setText("Hora:");
        jPanel1.add(lblNombreadmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 60, 30));

        lblNombreadmin2.setFont(new java.awt.Font("Eras Demi ITC", 3, 36)); // NOI18N
        lblNombreadmin2.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreadmin2.setText("Nominda diaria:");
        jPanel1.add(lblNombreadmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 300, 60));

        lblNombreadmin3.setFont(new java.awt.Font("Eras Demi ITC", 3, 18)); // NOI18N
        lblNombreadmin3.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreadmin3.setText("00:00:00");
        jPanel1.add(lblNombreadmin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 250, 30));

        lblNombreadmin4.setFont(new java.awt.Font("Eras Demi ITC", 3, 18)); // NOI18N
        lblNombreadmin4.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreadmin4.setText("Nombre del administrador");
        jPanel1.add(lblNombreadmin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 250, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new vista1().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezarDia;
    private javax.swing.JButton btnFinalizarDia;
    private javax.swing.JButton btnServicios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreadmin1;
    private javax.swing.JLabel lblNombreadmin2;
    private javax.swing.JLabel lblNombreadmin3;
    private javax.swing.JLabel lblNombreadmin4;
    private javax.swing.JLabel lblnominDia;
    // End of variables declaration//GEN-END:variables
}
