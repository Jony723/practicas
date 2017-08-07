/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.Cursos;
import controlador.c_Curso;
import controlador.tools.Utilitarios;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jony
 */
public class frmCurso extends javax.swing.JFrame {

    /**
     * Creates new form frmCurso
     */
    Utilitarios u;
    c_Curso control;

    public frmCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        control = new c_Curso();
        u = new Utilitarios();
        tblCursos.setModel(modeloT());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgCondicion = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbtActivo = new javax.swing.JRadioButton();
        rbtSuspendido = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        jScrollPanel = new javax.swing.JScrollPane();
        tblCursos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnVer = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GESTIÓN COLEGIO - CURSOS");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Cursos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 180, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Registrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre");
        jLabel1.setToolTipText("NOmbre o descripcion del curso");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Area");

        cboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Matematicas", "Ciencias", "Letras", "Deportes", "Recuperacion", "Vacacional", "Otros" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("CODIGO");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 102, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Condicion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel2.setOpaque(false);

        bgCondicion.add(rbtActivo);
        rbtActivo.setForeground(new java.awt.Color(204, 204, 204));
        rbtActivo.setSelected(true);
        rbtActivo.setText("Activo");
        rbtActivo.setOpaque(false);

        bgCondicion.add(rbtSuspendido);
        rbtSuspendido.setForeground(new java.awt.Color(204, 204, 204));
        rbtSuspendido.setText("Suspendido");
        rbtSuspendido.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtSuspendido)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtActivo)
                    .addComponent(rbtSuspendido))
                .addContainerGap())
        );

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 102, 153));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save (2).png"))); // NOI18N
        btnRegistrar.setMnemonic('R');
        btnRegistrar.setText("Registrar");
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addComponent(btnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 590, 150));

        jScrollPanel.setName(""); // NOI18N

        tblCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPanel.setViewportView(tblCursos);

        getContentPane().add(jScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 470, 310));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setOpaque(false);

        btnVer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVer.setForeground(new java.awt.Color(0, 102, 153));
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/150_glasses.png"))); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 102, 153));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_circle_double.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnOk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOk.setForeground(new java.awt.Color(0, 102, 153));
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ok.png"))); // NOI18N
        btnOk.setText("OK");
        btnOk.setEnabled(false);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 170, 220));

        btnInicio.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        btnInicio.setMnemonic('S');
        btnInicio.setText("INICIO");
        btnInicio.setToolTipText("Regresa al menú inicio");
        btnInicio.setBorder(null);
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 140, 60));

        lblFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/degradados-wallpapers-3.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if (u.menuI()) {
            this.dispose();
        }


    }//GEN-LAST:event_btnInicioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        u.Salir();
    }//GEN-LAST:event_formWindowClosing

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validar()) {
            Cursos curso = new Cursos();
            curso.setDescripcion(txtNombre.getText());
            curso.setCondicion(Condicion());
            curso.setArea(cboArea.getSelectedItem().toString());
            String mensaje = control.registrar(curso);
            JOptionPane.showMessageDialog(null, mensaje, "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        DefaultTableModel modelo = modeloT();
        Object[] columna = new Object[4];
        List<Object[]> listCursos = control.ListarCursos();

        for (Object[] datos : listCursos) {
            columna[0] = (datos[0]);
            columna[1] = (datos[1]);
            columna[2] = (datos[2]);
            columna[3] = (datos[3]);
            modelo.addRow(columna);

        }
        if (listCursos != null) {
            tblCursos.setModel(modelo);
            btnActualizar.setEnabled(true);
        }

    }//GEN-LAST:event_btnVerActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (tblCursos.getSelectedRowCount() == 1) {
            int fila = tblCursos.getSelectedRow();
            lblCodigo.setText(String.valueOf(tblCursos.getValueAt(fila, 0)));
            btnRegistrar.setEnabled(false);
            btnVer.setEnabled(false);
            btnVer.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un curso de la lista para actulizar datos", "AVISO", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (validar()) {
            String mensaje = null;
            Cursos curso = new Cursos();
            curso.setCodCurso(Integer.parseInt(lblCodigo.getText()));
            curso.setDescripcion(txtNombre.getText());
            curso.setCondicion(Condicion());
            curso.setArea(cboArea.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, mensaje, "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    ///metodos axiliares
    private String Condicion() {
        String condi = "Activo";
        if (rbtSuspendido.isSelected()) {
            condi = "Suspendido";
        }
        return condi;
    }

    private boolean validar() {
        boolean v = true;
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El curso a registrar debe tener un nombre");
            txtNombre.requestFocus();
            v = false;
        } else if (cboArea.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione una area de la lista");
            cboArea.requestFocus();
            v = false;
        }
        return v;
    }

    private DefaultTableModel modeloT() {
        DefaultTableModel m = new DefaultTableModel();
        m.addColumn("Codigo");
        m.addColumn("Nombre o Descripción");
        m.addColumn("Área");
        m.addColumn("Condición");
        return m;
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
            java.util.logging.Logger.getLogger(frmCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCondicion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JRadioButton rbtActivo;
    private javax.swing.JRadioButton rbtSuspendido;
    private javax.swing.JTable tblCursos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
