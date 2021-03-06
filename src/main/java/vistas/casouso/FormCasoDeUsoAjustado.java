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
public class FormCasoDeUsoAjustado extends javax.swing.JInternalFrame {
    Integer casoDeUsoSinAjustar;
    float factoresDeComplejidadTecnica;
    float factoresDeComplejidadAmbiental;
    float puntoDeCasoDeUsoAjustado;
    float total;
    
    public FormCasoDeUsoAjustado() {
        initComponents();
    }

    public FormCasoDeUsoAjustado(Integer casoDeUsoSinAjustar, float factoresDeComplejidadTecnica, float factoresDeComplejidadAmbiental) {
        initComponents();
        this.casoDeUsoSinAjustar = casoDeUsoSinAjustar;
        this.factoresDeComplejidadTecnica = factoresDeComplejidadTecnica;
        this.factoresDeComplejidadAmbiental = factoresDeComplejidadAmbiental;
        String text = String.valueOf(casoDeUsoSinAjustar);
        this.txtFieldUUCP.setText(text);
        text = Float.toString(this.factoresDeComplejidadTecnica);
        this.txtFieldTCF.setText(text);
        text = Float.toString(this.factoresDeComplejidadAmbiental);
        this.txtFieldEF.setText(text);
    }

    public float getPuntoDeCasoDeUsoAjustado() {
        return puntoDeCasoDeUsoAjustado;
    }

    public void setPuntoDeCasoDeUsoAjustado(float puntoDeCasoDeUsoAjustado) {
        this.puntoDeCasoDeUsoAjustado = puntoDeCasoDeUsoAjustado;
    }
    
    public float calcularUCP(){
        return casoDeUsoSinAjustar * factoresDeComplejidadTecnica * factoresDeComplejidadAmbiental;
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
        txtFieldUUCP = new javax.swing.JTextField();
        txtFieldTCF = new javax.swing.JTextField();
        txtFieldEF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFieldTotal = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Punto de Caso de uso ajustado (UCP)");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Punto de Caso de uso ajustado (UCP)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("UCP = UUCP  x  TCF   x   EF");

        txtFieldUUCP.setPreferredSize(new java.awt.Dimension(59, 29));

        txtFieldTCF.setPreferredSize(new java.awt.Dimension(59, 29));

        txtFieldEF.setPreferredSize(new java.awt.Dimension(59, 29));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("TOTAL =");

        txtFieldTotal.setPreferredSize(new java.awt.Dimension(59, 29));

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setPreferredSize(new java.awt.Dimension(80, 29));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(txtFieldUUCP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFieldTCF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFieldEF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(24, 24, 24)))))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldUUCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldTCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        System.out.println(evt);
        this.setPuntoDeCasoDeUsoAjustado(calcularUCP());
        this.txtFieldTotal.setText(Float.toString(this.getPuntoDeCasoDeUsoAjustado()));
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtFieldEF;
    private javax.swing.JTextField txtFieldTCF;
    private javax.swing.JTextField txtFieldTotal;
    private javax.swing.JTextField txtFieldUUCP;
    // End of variables declaration//GEN-END:variables
}
