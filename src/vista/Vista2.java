package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista2 extends javax.swing.JFrame {
    public Vista2() {
        initComponents();
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
            java.util.logging.Logger.getLogger(Vista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            setVisible(true);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHabit = new javax.swing.JLabel();
        lblNhabit = new javax.swing.JLabel();
        btnComida = new javax.swing.JButton();
        btnLimpieza = new javax.swing.JButton();
        btnRenta = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        lblComida = new javax.swing.JLabel();
        lblLimpieza = new javax.swing.JLabel();
        lblRenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        lblHabit.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblHabit.setText("Habitacion");

        lblNhabit.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblNhabit.setText("No.");

        btnComida.setBackground(new java.awt.Color(255, 153, 153));
        btnComida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnComida.setText("Comida al cuarto");
        btnComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComidaActionPerformed(evt);
            }
        });

        btnLimpieza.setBackground(new java.awt.Color(255, 153, 153));
        btnLimpieza.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLimpieza.setText("Limpieza");

        btnRenta.setBackground(new java.awt.Color(255, 153, 153));
        btnRenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRenta.setText("Renta de pelicula");

        lblNombre1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        lblComida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblLimpieza.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblRenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(lblHabit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNhabit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblLimpieza, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComida, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHabit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNhabit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComida)
                    .addComponent(lblComida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblLimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComida;
    private javax.swing.JButton btnLimpieza;
    private javax.swing.JButton btnRenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblComida;
    private javax.swing.JLabel lblHabit;
    private javax.swing.JLabel lblLimpieza;
    private javax.swing.JLabel lblNhabit;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblRenta;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnComida() {
        return btnComida;
    }

    public void setBtnComida(JButton btnComida) {
        this.btnComida = btnComida;
    }

    public JButton getBtnLimpieza() {
        return btnLimpieza;
    }

    public void setBtnLimpieza(JButton btnLimpieza) {
        this.btnLimpieza = btnLimpieza;
    }

    public JButton getBtnRenta() {
        return btnRenta;
    }

    public void setBtnRenta(JButton btnRenta) {
        this.btnRenta = btnRenta;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblComida() {
        return lblComida;
    }

    public void setLblComida(JLabel lblComida) {
        this.lblComida = lblComida;
    }

    public JLabel getLblHabit() {
        return lblHabit;
    }

    public void setLblHabit(JLabel lblHabit) {
        this.lblHabit = lblHabit;
    }

    public JLabel getLblLimpieza() {
        return lblLimpieza;
    }

    public void setLblLimpieza(JLabel lblLimpieza) {
        this.lblLimpieza = lblLimpieza;
    }

    public JLabel getLblNhabit() {
        return lblNhabit;
    }

    public void setLblNhabit(JLabel lblNhabit) {
        this.lblNhabit = lblNhabit;
    }

    public JLabel getLblNombre1() {
        return lblNombre1;
    }

    public void setLblNombre1(JLabel lblNombre1) {
        this.lblNombre1 = lblNombre1;
    }

    public JLabel getLblRenta() {
        return lblRenta;
    }

    public void setLblRenta(JLabel lblRenta) {
        this.lblRenta = lblRenta;
    }

}
