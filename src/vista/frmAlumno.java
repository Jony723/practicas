/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.tools.*;
import javax.swing.JOptionPane;
import controlador.c_Alumno;
import Modelo.Alumno;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jony
 */
public class frmAlumno extends javax.swing.JFrame {

    public Utilitarios util;
    public c_Alumno control;
    public Alumno alm;
    /**
     * Creates new form frmAlumno
     */
    public frmAlumno() {
        initComponents();
        this.setLocationRelativeTo(null);
        util=new Utilitarios();
        util.validar("n", txtCodigo);
        util.validar("L", txtNombre);
        util.validar("L", txtAPaterno);
        util.validar("L", txtAMaterno);
        this.txtCodigo.setDocument(new Limitador(txtCodigo, 8));
        this.txtNombre.setDocument(new Limitador(txtNombre, 30));
        this.txtAPaterno.setDocument(new Limitador(txtAPaterno, 15));
        this.txtAMaterno.setDocument(new Limitador(txtAMaterno, 15));
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtgEstado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAPaterno = new javax.swing.JTextField();
        txtAMaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dchFechaNac = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        rbtActivo = new javax.swing.JRadioButton();
        rbtRetirado = new javax.swing.JRadioButton();
        rbtCulminado = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalles = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        cboBuscar = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnOk = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GESTIÓN COLEGIO - ALUMNO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Alumnos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 160, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombres");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Apellido Paterno");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Apellido Mateno");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtNombre.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        txtAPaterno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        txtAMaterno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Fecha de Nacimiento");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel2.setOpaque(false);

        rbtgEstado.add(rbtActivo);
        rbtActivo.setForeground(new java.awt.Color(204, 204, 204));
        rbtActivo.setSelected(true);
        rbtActivo.setText("Activo");
        rbtActivo.setOpaque(false);

        rbtgEstado.add(rbtRetirado);
        rbtRetirado.setForeground(new java.awt.Color(204, 204, 204));
        rbtRetirado.setText("Retirado");
        rbtRetirado.setOpaque(false);

        rbtgEstado.add(rbtCulminado);
        rbtCulminado.setForeground(new java.awt.Color(204, 204, 204));
        rbtCulminado.setText("Culminado");
        rbtCulminado.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtActivo)
                .addGap(18, 18, 18)
                .addComponent(rbtRetirado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(rbtCulminado)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtActivo)
                    .addComponent(rbtRetirado)
                    .addComponent(rbtCulminado))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 102, 153));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save (2).png"))); // NOI18N
        btnRegistrar.setMnemonic('R');
        btnRegistrar.setText("Registrar");
        btnRegistrar.setToolTipText("Registrar alumno");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo))
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dchFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dchFechaNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1110, 180));

        tblDetalles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombres", "Apellido Pat.", "Apellido Mat.", "Fecha Nac.", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetalles.setOpaque(false);
        jScrollPane1.setViewportView(tblDetalles);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 1110, 270));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel3.setOpaque(false);

        cboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Por Numero DNI", "Por Apellido Paterno" }));
        cboBuscar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboBuscarItemStateChanged(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 102, 153));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/view.png"))); // NOI18N
        btnBuscar.setMnemonic('B');
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("busca los alumnos de acuerdo a los criterios establecidos");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 500, 80));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setOpaque(false);

        btnOk.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnOk.setForeground(new java.awt.Color(0, 102, 153));
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ok.png"))); // NOI18N
        btnOk.setMnemonic('O');
        btnOk.setText("Ok");
        btnOk.setToolTipText("Grabar los cambios en el alumno seleccionado");
        btnOk.setEnabled(false);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 102, 153));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_circle_double.png"))); // NOI18N
        btnModificar.setMnemonic('M');
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 102, 153));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash_can1.png"))); // NOI18N
        btnEliminar.setMnemonic('E');
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnOk)
                    .addComponent(btnEliminar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 580, 70));

        btnInicio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 130, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/degradados-wallpapers-3.jpg"))); // NOI18N
        lblFondo.setText("jLabel1");
        lblFondo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1162, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
       
    
    
    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
          Character c=evt.getKeyChar();
        switch(this.cboBuscar.getSelectedIndex()){
          case 0:
              evt.consume();
              getToolkit().beep();
              JOptionPane.showMessageDialog(null, "selecione una opción de busqueda");
              break;
          case 1:
              if(Character.isLetter(c)){
                evt.consume();
                getToolkit().beep();
                }
                          
              break;
          case 2:
              if(Character.isDigit(c)){
                evt.consume();
                getToolkit().beep();
                } 
               
              break;
        }
       
        
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       control.cerrarAlumno();
        util.Salir();
    }//GEN-LAST:event_formWindowClosing

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       if(verificar()){
           alm=new Alumno();
           alm.setCodAlumno(txtCodigo.getText());
           alm.setNombres(txtNombre.getText());
           alm.setApaterno(txtAPaterno.getText());
           alm.setAmaterno(txtAMaterno.getText());
           alm.setFechaNac(dchFechaNac.getDate());
           alm.setEstado(getEstado());
           control=new c_Alumno();
           control.Registrar_alumno(alm);
           Limpiar(1);
       }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    Limpiar(2);
        control=new c_Alumno();
        DefaultTableModel modelo=null;
        switch(cboBuscar.getSelectedIndex()){
            case 1:
                modelo=control.busquedaAlumno(1, this.txtBuscar.getText());
                
                break;
            case 2:
                modelo=control.busquedaAlumno(2,this.txtBuscar.getText());
                break;
        }
        this.tblDetalles.setModel(modelo);
        this.txtBuscar.selectAll();
        this.txtBuscar.requestFocus();
        if(tblDetalles.getRowCount()>0){
            btnModificar.setEnabled(true);
            btnEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cboBuscarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboBuscarItemStateChanged
       this.txtBuscar.setText(null);
    }//GEN-LAST:event_cboBuscarItemStateChanged

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        switch(cboBuscar.getSelectedIndex()){
            case 1:
      
         if(txtBuscar.getText().length()>8){
            String texto = this.txtBuscar.getText(); // Capturamos texto digitado
            texto = texto.substring(0, texto.length() - 1); // Descartar la ultima tecla ingresada
            this.txtBuscar.setText(texto);
            // Mensaje de error
        } 
         break;
            case 2:
                if(txtBuscar.getText().length()>15){
            String texto = this.txtBuscar.getText(); // Capturamos texto digitado
            texto = texto.substring(0, texto.length() - 1); // Descartar la ultima tecla ingresada
            this.txtBuscar.setText(texto);
            // Mensaje de error
        } break;
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(tblDetalles.getSelectedRowCount()>1){
            JOptionPane.showMessageDialog(null,"Selecione un alumno para modificar");
        }else{
             int fila=tblDetalles.getSelectedRow();
             String id=(String) tblDetalles.getValueAt(fila, 0);
             txtCodigo.setText(id);
             btnOk.setEnabled(true);
             
             btnModificar.setEnabled(false);
             btnEliminar.setEnabled(false);
             btnRegistrar.setEnabled(false);
             }
       
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      
        if(tblDetalles.getSelectedRowCount()!=1){
            JOptionPane.showMessageDialog(null,"Selecione solo un alumno para Eliminar");
        }else{
           Alumno a=new Alumno();
             int fila=tblDetalles.getSelectedRow();
             a.setCodAlumno((String.valueOf(tblDetalles.getValueAt(fila, 0)))) ;
             a.setNombres((String.valueOf(tblDetalles.getValueAt(fila, 1)))) ;
             a.setApaterno((String.valueOf(tblDetalles.getValueAt(fila, 2)))) ;
             a.setAmaterno((String.valueOf(tblDetalles.getValueAt(fila, 3)))) ;
             a.setEstado((String.valueOf(tblDetalles.getValueAt(fila, 4)))) ;
             a.setFechaNac(Date.valueOf(tblDetalles.getValueAt(fila, 5).toString()));
             int eleccion=JOptionPane.showConfirmDialog(null, "¿Desea ELIMINAR el alumno? "+ a.getCodAlumno(), "ELIMINAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
             if(eleccion==JOptionPane.YES_OPTION){
                 control.Eliminar(a);
             }
             }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
       if(verificar()){
           alm=new Alumno();
           alm.setCodAlumno(txtCodigo.getText());
           alm.setNombres(txtNombre.getText());
           alm.setApaterno(txtAPaterno.getText());
           alm.setAmaterno(txtAMaterno.getText());
           alm.setFechaNac(dchFechaNac.getDate());
           alm.setEstado(getEstado());
           control=new c_Alumno();
           control.Actualizar(alm);
           Limpiar(1);
           Limpiar(2);
           btnRegistrar.setEnabled(true);
           btnOk.setEnabled(false);
       }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        int eleccion=JOptionPane.showConfirmDialog(null, "¿Desea regresaral inicio", "INICIO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
             if(eleccion==JOptionPane.YES_OPTION){
                FrmInicio i=new FrmInicio();
                i.setVisible(true);
                control.cerrarAlumno();
                this.dispose();
             }
    }//GEN-LAST:event_btnInicioActionPerformed

    public boolean verificar(){
    boolean v=false;
    if(txtCodigo.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Ingrese DNI de alumno a registrar");
        txtCodigo.requestFocus();
    }else if(txtNombre.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Ingrese los nombres del alumno a registrar");
        txtCodigo.requestFocus();
    }else if(txtAPaterno.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Ingrese apellido paterno del alumno");
        txtAPaterno.requestFocus();
    }else if(txtAMaterno.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Ingrese apellido materno del alumno");
    }else{
        v=true;
    }
    
    return v;
}
    
    public String getEstado(){
        String e="Activo";
        if(this.rbtCulminado.isSelected()) e="Culminado";
        if(this.rbtRetirado.isSelected())e="Retirado";
        return e;
    }
    
    public void Limpiar(int x){
        switch(x){
            case 1:
                util.LimpiarTxt(jPanel1);
                rbtActivo.setSelected(true);
            break;
            case 2:
                tblDetalles.removeAll();
                btnModificar.setEnabled(false);
                btnEliminar.setEnabled(false);
            break;
                
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(frmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboBuscar;
    private com.toedter.calendar.JDateChooser dchFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JRadioButton rbtActivo;
    private javax.swing.JRadioButton rbtCulminado;
    private javax.swing.JRadioButton rbtRetirado;
    private javax.swing.ButtonGroup rbtgEstado;
    private javax.swing.JTable tblDetalles;
    private javax.swing.JTextField txtAMaterno;
    private javax.swing.JTextField txtAPaterno;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
