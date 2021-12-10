/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.casouso;

/**
 *
 * @author Mari
 */
public class frm_punto_cu extends javax.swing.JInternalFrame {
        Integer casoDeUsoSinAjustar = 0;
        Integer cuSinAjustar = 0;
        Integer suma = 0;
    /**
     * Creates new form frm_punto_CU
     */
      public frm_punto_cu() {
        initComponents();
    }
     
    public frm_punto_cu(Integer uaw, Integer uucw) {
        initComponents();
        casoDeUsoSinAjustar = uaw;
        cuSinAjustar = uucw;
        txtUAW.setText(uaw.toString());
        txtUUCW.setText(uucw.toString());
    }

    public Integer getSuma() {
        return suma;
    }

    public void setSuma(Integer suma) {
        this.suma = suma;
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
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtUUCW = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtUAW = new javax.swing.JTextField();
        btnCalculo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Punto de Caso de Uso sin ajustar (UUCP)");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Punto de Caso de Uso sin ajustar (UCP):");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 48));

        jLabel21.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Factor de Peso de Actores sin ajustar (UAW) ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, 48));

        txtTotal.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 70, 50));

        txtUUCW.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtUUCW.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtUUCW, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 70, 50));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("+");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 50, 50));

        jLabel22.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("TOTAL");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, 48));

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("+");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 50, 50));

        jLabel24.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Factor de Peso de Actores sin ajustar (UAW) ");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 48));

        txtUAW.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtUAW.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtUAW, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 70, 50));

        btnCalculo.setBackground(new java.awt.Color(255, 255, 255));
        btnCalculo.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnCalculo.setText("Calcular");
        btnCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 133, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed

    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoActionPerformed
        suma = casoDeUsoSinAjustar + cuSinAjustar;
        txtTotal.setText(suma.toString());
    }//GEN-LAST:event_btnCalculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUAW;
    private javax.swing.JTextField txtUUCW;
    // End of variables declaration//GEN-END:variables
}
