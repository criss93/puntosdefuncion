/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.puntofuncion;
import classes.Complejidad;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sql.ConexionSql;
/**
 *
 * @author Mari
 */
public class FormAjuste extends javax.swing.JDialog {
    transient ArrayList<Complejidad> lista  = new ArrayList<>();
    transient ConexionSql con = new ConexionSql();
    Integer puntoDeFuncionSinAjustar = 0;
    /**
     * Creates new form ajuste
     */
    public FormAjuste(Integer fp){
        super ();
        initComponents();
        
        puntoDeFuncionSinAjustar = fp;
        txtFP.setText(fp.toString());
        con.conectar();
    
    }
    
    public FormAjuste(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        cmbInfluencia01 = new javax.swing.JComboBox<>();
        txtInfluencia01 = new javax.swing.JTextField();
        btnCalcularFactores = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbInfluencia02 = new javax.swing.JComboBox<>();
        txtInfluencia02 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbInfluencia03 = new javax.swing.JComboBox<>();
        txtInfluencia03 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbInfluencia04 = new javax.swing.JComboBox<>();
        txtInfluencia04 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbInfluencia05 = new javax.swing.JComboBox<>();
        txtInfluencia05 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbInfluencia06 = new javax.swing.JComboBox<>();
        txtInfluencia06 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbInfluencia07 = new javax.swing.JComboBox<>();
        txtVAF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbInfluencia08 = new javax.swing.JComboBox<>();
        cmbInfluencia09 = new javax.swing.JComboBox<>();
        cmbInfluencia10 = new javax.swing.JComboBox<>();
        cmbInfluencia11 = new javax.swing.JComboBox<>();
        cmbInfluencia12 = new javax.swing.JComboBox<>();
        cmbInfluencia13 = new javax.swing.JComboBox<>();
        cmbInfluencia14 = new javax.swing.JComboBox<>();
        txtInfluencia14 = new javax.swing.JTextField();
        txtInfluencia13 = new javax.swing.JTextField();
        txtInfluencia12 = new javax.swing.JTextField();
        txtInfluencia11 = new javax.swing.JTextField();
        txtInfluencia10 = new javax.swing.JTextField();
        txtInfluencia09 = new javax.swing.JTextField();
        txtInfluencia08 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtInfluencia07 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTDI = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPFA = new javax.swing.JTextField();
        txtFP = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbInfluencia01.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia01ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia01, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 120, 40));

        txtInfluencia01.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia01, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 70, 40));

        btnCalcularFactores.setBackground(new java.awt.Color(255, 255, 255));
        btnCalcularFactores.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnCalcularFactores.setText("Calcular");
        btnCalcularFactores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularFactoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcularFactores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, 50));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 670, 120, 40));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Influencia");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 40));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Valor de factor de ajuste (VAF):");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, 270, 48));

        jLabel1.setText("8 - Actualización on-line");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 200, 40));

        jLabel2.setText("1 - Comunicación de datos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 40));

        jLabel3.setText("2 - Funciones distribuidas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 40));

        cmbInfluencia02.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia02.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia02ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia02, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, 40));

        txtInfluencia02.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia02, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 70, 40));

        jLabel4.setText("3 - Rendimiento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 40));

        cmbInfluencia03.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia03.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia03ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia03, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 120, 40));

        txtInfluencia03.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia03, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 70, 40));

        jLabel5.setText("4 - Configuraciones fuertemente utilizadas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, 40));

        cmbInfluencia04.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia04.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia04ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia04, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 120, 40));

        txtInfluencia04.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia04.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia04, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 70, 40));

        jLabel6.setText("5 - Frecuencia de transacciones");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 40));

        cmbInfluencia05.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia05.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia05ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia05, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 120, 40));

        txtInfluencia05.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia05.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia05, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 70, 40));

        jLabel8.setText("6 - Entrada on-line de datos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 200, 40));

        cmbInfluencia06.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia06.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia06ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia06, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 120, 40));

        txtInfluencia06.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia06.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia06, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 70, 40));

        jLabel10.setText("7 - Diseño para la eficiencia de usuario final");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 260, 40));

        cmbInfluencia07.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia07.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia07ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia07, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 120, 40));

        txtVAF.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtVAF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtVAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, 70, 40));

        jLabel11.setText("9 - Procesos complejos");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 200, 40));

        jLabel13.setText("10 - Utilización en otros sistemas");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 200, 40));

        jLabel15.setText("11 - Facilidad de instalación");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 200, 40));

        jLabel16.setText("12 - Facilidad de operación");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 200, 40));

        jLabel17.setText("13 - Instalación de múltiples sitios");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 200, 40));

        jLabel18.setText("14 - Facilidad de cambio");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 200, 40));

        cmbInfluencia08.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia08.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia08ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia08, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 120, 40));

        cmbInfluencia09.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia09.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia09ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia09, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 120, 40));

        cmbInfluencia10.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia10ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 120, 40));

        cmbInfluencia11.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia11ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 120, 40));

        cmbInfluencia12.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia12ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, 120, 40));

        cmbInfluencia13.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia13ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 120, 40));

        cmbInfluencia14.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cmbInfluencia14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Baja", "Moderada", "Promedio", "Significativa", "Fuerte" }));
        cmbInfluencia14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInfluencia14ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbInfluencia14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 120, 40));

        txtInfluencia14.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 70, 40));

        txtInfluencia13.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, 70, 40));

        txtInfluencia12.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia12, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 70, 40));

        txtInfluencia11.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia11, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 70, 40));

        txtInfluencia10.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 180, 70, 40));

        txtInfluencia09.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia09.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia09, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 70, 40));

        txtInfluencia08.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia08.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia08, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 70, 40));

        jLabel19.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Influencia");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, 40));

        jLabel20.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Factor ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 139, 48));

        jLabel12.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Factor ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 139, 48));

        txtInfluencia07.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtInfluencia07.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtInfluencia07, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 70, 40));

        jLabel21.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Factor de complejidad total (TDI): ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, 48));

        txtTDI.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtTDI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtTDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 70, 40));

        jLabel22.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Punto de función ajustado (PFA):");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 280, 48));

        txtPFA.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtPFA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtPFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 70, 40));

        txtFP.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        txtFP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFPActionPerformed(evt);
            }
        });
        jPanel1.add(txtFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 70, 40));

        jLabel23.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Punto de función sin ajustar (FP):");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbInfluencia01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia01ActionPerformed
        try {              
              txtInfluencia01.setText(con.consultarInfluencia(cmbInfluencia01.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }//GEN-LAST:event_cmbInfluencia01ActionPerformed

    private void btnCalcularFactoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularFactoresActionPerformed
        
        Integer tdi = Integer.parseInt(txtInfluencia01.getText()) + Integer.parseInt(txtInfluencia02.getText())+ Integer.parseInt(txtInfluencia03.getText())
                + Integer.parseInt(txtInfluencia04.getText())+ Integer.parseInt(txtInfluencia05.getText())+ Integer.parseInt(txtInfluencia06.getText())
                + Integer.parseInt(txtInfluencia07.getText())+ Integer.parseInt(txtInfluencia08.getText())+ Integer.parseInt(txtInfluencia09.getText())
                + Integer.parseInt(txtInfluencia10.getText())+ Integer.parseInt(txtInfluencia11.getText())+ Integer.parseInt(txtInfluencia12.getText())
                + Integer.parseInt(txtInfluencia13.getText())+ Integer.parseInt(txtInfluencia14.getText());
        Float vaf = (float) (0.65 + (0.01 * tdi));
        Float pfa = puntoDeFuncionSinAjustar * vaf;        
        
        txtTDI.setText(tdi.toString());
        txtVAF.setText(vaf.toString());
        txtPFA.setText(pfa.toString());
        
    }//GEN-LAST:event_btnCalcularFactoresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbInfluencia02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia02ActionPerformed
        try {              
              txtInfluencia02.setText(con.consultarInfluencia(cmbInfluencia02.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia02ActionPerformed

    private void cmbInfluencia03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia03ActionPerformed
        try {              
              txtInfluencia03.setText(con.consultarInfluencia(cmbInfluencia03.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia03ActionPerformed

    private void cmbInfluencia04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia04ActionPerformed
        try {              
              txtInfluencia04.setText(con.consultarInfluencia(cmbInfluencia04.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia04ActionPerformed

    private void cmbInfluencia05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia05ActionPerformed
        try {              
              txtInfluencia05.setText(con.consultarInfluencia(cmbInfluencia05.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia05ActionPerformed

    private void cmbInfluencia06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia06ActionPerformed
        try {              
              txtInfluencia06.setText(con.consultarInfluencia(cmbInfluencia06.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia06ActionPerformed

    private void cmbInfluencia07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia07ActionPerformed
        try {              
              txtInfluencia07.setText(con.consultarInfluencia(cmbInfluencia07.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia07ActionPerformed

    private void cmbInfluencia08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia08ActionPerformed
        try {              
              txtInfluencia08.setText(con.consultarInfluencia(cmbInfluencia08.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia08ActionPerformed

    private void cmbInfluencia09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia09ActionPerformed
        try {              
              txtInfluencia09.setText(con.consultarInfluencia(cmbInfluencia09.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia09ActionPerformed

    private void cmbInfluencia10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia10ActionPerformed
        try {              
              txtInfluencia10.setText(con.consultarInfluencia(cmbInfluencia10.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia10ActionPerformed

    private void cmbInfluencia11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia11ActionPerformed
        try {              
              txtInfluencia11.setText(con.consultarInfluencia(cmbInfluencia11.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia11ActionPerformed

    private void cmbInfluencia12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia12ActionPerformed
        try {              
              txtInfluencia12.setText(con.consultarInfluencia(cmbInfluencia12.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia12ActionPerformed

    private void cmbInfluencia13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia13ActionPerformed
        try {              
              txtInfluencia13.setText(con.consultarInfluencia(cmbInfluencia13.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia13ActionPerformed

    private void cmbInfluencia14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInfluencia14ActionPerformed
        try {              
              txtInfluencia14.setText(con.consultarInfluencia(cmbInfluencia14.getSelectedItem().toString()));
         } catch (SQLException ex) {
             Logger.getLogger(FormPuntosDeFuncion.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_cmbInfluencia14ActionPerformed

    private void txtFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFPActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException  ex) {
            java.util.logging.Logger.getLogger(FormAjuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAjuste dialog = new FormAjuste(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularFactores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbInfluencia01;
    private javax.swing.JComboBox<String> cmbInfluencia02;
    private javax.swing.JComboBox<String> cmbInfluencia03;
    private javax.swing.JComboBox<String> cmbInfluencia04;
    private javax.swing.JComboBox<String> cmbInfluencia05;
    private javax.swing.JComboBox<String> cmbInfluencia06;
    private javax.swing.JComboBox<String> cmbInfluencia07;
    private javax.swing.JComboBox<String> cmbInfluencia08;
    private javax.swing.JComboBox<String> cmbInfluencia09;
    private javax.swing.JComboBox<String> cmbInfluencia10;
    private javax.swing.JComboBox<String> cmbInfluencia11;
    private javax.swing.JComboBox<String> cmbInfluencia12;
    private javax.swing.JComboBox<String> cmbInfluencia13;
    private javax.swing.JComboBox<String> cmbInfluencia14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFP;
    private javax.swing.JTextField txtInfluencia01;
    private javax.swing.JTextField txtInfluencia02;
    private javax.swing.JTextField txtInfluencia03;
    private javax.swing.JTextField txtInfluencia04;
    private javax.swing.JTextField txtInfluencia05;
    private javax.swing.JTextField txtInfluencia06;
    private javax.swing.JTextField txtInfluencia07;
    private javax.swing.JTextField txtInfluencia08;
    private javax.swing.JTextField txtInfluencia09;
    private javax.swing.JTextField txtInfluencia10;
    private javax.swing.JTextField txtInfluencia11;
    private javax.swing.JTextField txtInfluencia12;
    private javax.swing.JTextField txtInfluencia13;
    private javax.swing.JTextField txtInfluencia14;
    private javax.swing.JTextField txtPFA;
    private javax.swing.JTextField txtTDI;
    private javax.swing.JTextField txtVAF;
    // End of variables declaration//GEN-END:variables
}