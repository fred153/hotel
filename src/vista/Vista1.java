package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista1 extends javax.swing.JFrame {

    public Vista1() {
        initComponents();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            setVisible(true);
            }
        });
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblIdenti = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        lblNhabi = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtIdenti = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnAsignar = new javax.swing.JButton();
        lblNhab1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnRetirar = new javax.swing.JButton();
        lblServicios = new javax.swing.JLabel();
        txtNhabi = new javax.swing.JTextField();
        btnHabi = new javax.swing.JButton();
        lblReH = new javax.swing.JLabel();
        txtReH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblTitulo.setText("Hotel de hilbert");

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        lblTitulo2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTitulo2.setText("Ingreso de Cliente");

        lblNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNombre.setText("Nombre:");

        lblIdenti.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblIdenti.setText("Identificacion:");

        lblTel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTel.setText("Telefono:");

        lblTitulo3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTitulo3.setText("Asignacion de habitacion");

        lblNhabi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNhabi.setText("Numero de habitacion");

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtIdenti.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtIdenti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentiActionPerformed(evt);
            }
        });

        txtTel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnAsignar.setBackground(new java.awt.Color(255, 102, 102));
        btnAsignar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        lblNhab1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblTitulo2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNhabi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(lblNhab1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblIdenti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(txtIdenti)
                                    .addComponent(txtNombre))))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdenti)
                    .addComponent(txtIdenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnAsignar)
                .addGap(18, 18, 18)
                .addComponent(lblTitulo3)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNhabi)
                    .addComponent(lblNhab1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        btnRetirar.setBackground(new java.awt.Color(102, 102, 255));
        btnRetirar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRetirar.setText("Retirar Cliente y mover Residentes");

        lblServicios.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblServicios.setText("Servicios de habitacion No.");

        txtNhabi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNhabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNhabiActionPerformed(evt);
            }
        });

        btnHabi.setBackground(new java.awt.Color(102, 102, 255));
        btnHabi.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnHabi.setText("Ir a la habitacion");

        lblReH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblReH.setText("Habitacion No.");

        txtReH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtReH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnHabi))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRetirar)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNhabi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblReH, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtReH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhabi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(lblTitulo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void txtIdentiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentiActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void txtNhabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNhabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNhabiActionPerformed

    private void txtReHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReHActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnHabi;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIdenti;
    private javax.swing.JLabel lblNhab1;
    private javax.swing.JLabel lblNhabi;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblReH;
    private javax.swing.JLabel lblServicios;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JTextField txtIdenti;
    private javax.swing.JTextField txtNhabi;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtReH;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAsignar() {
        return btnAsignar;
    }

    public void setBtnAsignar(JButton btnAsignar) {
        this.btnAsignar = btnAsignar;
    }

    public JButton getBtnHabi() {
        return btnHabi;
    }

    public void setBtnHabi(JButton btnHabi) {
        this.btnHabi = btnHabi;
    }

    public JButton getBtnRetirar() {
        return btnRetirar;
    }

    public void setBtnRetirar(JButton btnRetirar) {
        this.btnRetirar = btnRetirar;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }
    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JLabel getLblIdenti() {
        return lblIdenti;
    }

    public void setLblIdenti(JLabel lblIdenti) {
        this.lblIdenti = lblIdenti;
    }

    public JLabel getLblNhab1() {
        return lblNhab1;
    }

    public void setLblNhab1(JLabel lblNhab1) {
        this.lblNhab1 = lblNhab1;
    }

    public JLabel getLblNhabi() {
        return lblNhabi;
    }

    public void setLblNhabi(JLabel lblNhabi) {
        this.lblNhabi = lblNhabi;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblServicios() {
        return lblServicios;
    }

    public void setLblServicios(JLabel lblServicios) {
        this.lblServicios = lblServicios;
    }

    public JLabel getLblTel() {
        return lblTel;
    }

    public void setLblTel(JLabel lblTel) {
        this.lblTel = lblTel;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblTitulo2() {
        return lblTitulo2;
    }

    public void setLblTitulo2(JLabel lblTitulo2) {
        this.lblTitulo2 = lblTitulo2;
    }

    public JLabel getLblTitulo3() {
        return lblTitulo3;
    }

    public void setLblTitulo3(JLabel lblTitulo3) {
        this.lblTitulo3 = lblTitulo3;
    }

    public JTextField getTxtIdenti() {
        return txtIdenti;
    }

    public void setTxtIdenti(JTextField txtIdenti) {
        this.txtIdenti = txtIdenti;
    }

    public JTextField getTxtNhabi() {
        return txtNhabi;
    }

    public void setTxtNhabi(JTextField txtNhabi) {
        this.txtNhabi = txtNhabi;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtTel() {
        return txtTel;
    }

    public void setTxtTel(JTextField txtTel) {
        this.txtTel = txtTel;
    }

    public JLabel getLblReH() {
        return lblReH;
    }

    public void setLblReH(JLabel lblReH) {
        this.lblReH = lblReH;
    }

    public JTextField getTxtReH() {
        return txtReH;
    }

    public void setTxtReH(JTextField txtReH) {
        this.txtReH = txtReH;
    }

}
