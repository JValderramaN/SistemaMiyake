/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import hibernate.anotaciones.util.JavaUtil;
import static hibernate.anotaciones.util.JavaUtil.setTableCellAlignment;
import hibernate.anotaciones.util.ObjectModelDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelos.Ubicacion;

public class Pubicacion extends javax.swing.JPanel {

    private List resultList;
    private int pos;

    public Pubicacion() {
        initComponents();
        
        setTableCellAlignment(JLabel.CENTER,tablaConsultaUbicacion);
        setTableCellAlignment(JLabel.CENTER,tablaModificarUbicacion);
        setTableCellAlignment(JLabel.CENTER,tablaEliminarUbicacion);
        tablaConsultaUbicacion.getTableHeader().setReorderingAllowed(false);
        tablaConsultaUbicacion.getTableHeader().setReorderingAllowed(false);
        tablaConsultaUbicacion.getTableHeader().setReorderingAllowed(false);
        
         tablaModificarUbicacion.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {

                    pos = tablaModificarUbicacion.getSelectedRow();
                    if (pos == -1) {
                        return;
                    }
                    Ubicacion u = (Ubicacion) resultList.get(pos);
                    lb_numero.setText(u.getIdUbicacion().toString());
                    tf_pais1.setText(u.getPais());
                    tf_ciudad1.setText(u.getCiudad());
                    tf_direccion3.setText(u.getDireccion());
                }
            }
        });

        tablaEliminarUbicacion.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {

                    if (tablaEliminarUbicacion.getSelectedRow() == -1) {
                        return;
                    }
                    pos = tablaEliminarUbicacion.getSelectedRow();

                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelScrudUbic = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultaUbicacion = new org.jdesktop.swingx.JXTable();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_pais = new javax.swing.JTextField();
        crear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tf_ciudad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_direccion1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaModificarUbicacion = new org.jdesktop.swingx.JXTable();
        jPanel5 = new javax.swing.JPanel();
        modificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lb_numero = new javax.swing.JLabel();
        tf_direccion3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_pais1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_ciudad1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEliminarUbicacion = new org.jdesktop.swingx.JXTable();
        eliminar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(5, 5));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.X_AXIS));

        panelScrudUbic.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelScrudUbicStateChanged(evt);
            }
        });

        jPanel2.setPreferredSize(new java.awt.Dimension(5, 5));

        tablaConsultaUbicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Ubicación", "Pais", "Ciudad", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaConsultaUbicacion);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1416622346_xmag.png"))); // NOI18N
        jLabel15.setText("Para realizar Busqueda: Haga Click en la tabla + CTRL F");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelScrudUbic.addTab("Consultar", jPanel2);

        jPanel1.setPreferredSize(new java.awt.Dimension(5, 5));

        jLabel3.setText("Pais");

        tf_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_paisActionPerformed(evt);
            }
        });

        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415656550_Add.png"))); // NOI18N
        crear.setText("Crear Ubicación");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        jLabel6.setText("Ciudad");

        tf_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ciudadActionPerformed(evt);
            }
        });

        jLabel7.setText("Dirección 1");

        tf_direccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_direccion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(57, 57, 57)
                                    .addComponent(tf_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                        .addComponent(tf_direccion1))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(crear)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        panelScrudUbic.addTab("Crear", jPanel1);

        jPanel3.setPreferredSize(new java.awt.Dimension(5, 5));
        jPanel3.setLayout(new java.awt.BorderLayout());

        tablaModificarUbicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Ubicación", "Pais", "Ciudad", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaModificarUbicacion.setHorizontalScrollEnabled(true);
        jScrollPane2.setViewportView(tablaModificarUbicacion);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415416498_Circulation.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        jLabel5.setText("Número:");

        lb_numero.setText("numero");

        tf_direccion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_direccion3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Pais");

        tf_pais1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pais1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Ciudad");

        tf_ciudad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ciudad1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Dirección 1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_numero))
                    .addComponent(jLabel10)
                    .addComponent(tf_pais1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tf_direccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tf_ciudad1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lb_numero))
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_pais1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addGap(21, 21, 21)
                .addComponent(tf_ciudad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(tf_direccion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.EAST);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1416622346_xmag.png"))); // NOI18N
        jLabel16.setText("Para realizar Busqueda: Haga Click en la tabla + CTRL F");
        jPanel3.add(jLabel16, java.awt.BorderLayout.PAGE_START);

        panelScrudUbic.addTab("Modificar", jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(5, 5));

        tablaEliminarUbicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Ubicación", "Pais", "Ciudad", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaEliminarUbicacion);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415657185_remove-sign-32.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1416622346_xmag.png"))); // NOI18N
        jLabel17.setText("Para realizar Busqueda: Haga Click en la tabla + CTRL F");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(eliminar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        panelScrudUbic.addTab("Eliminar", jPanel4);

        add(panelScrudUbic);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_paisActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        if (!tf_pais.getText().equals("")) {

            if (JOptionPane.showConfirmDialog(this, "¿Está seguro de crear la"
                    + " nueva ubicación ?",
                    "Información", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                ObjectModelDAO.saveObject(new Ubicacion(
                        tf_pais.getText(),
                        tf_ciudad.getText(),
                        tf_direccion1.getText()
                ));

            }
        }
    }//GEN-LAST:event_crearActionPerformed

    private void tf_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ciudadActionPerformed

    private void tf_direccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_direccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_direccion1ActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (pos == -1 || tf_pais1.getText().equals("")) {
            return;
        }

        if (JOptionPane.showConfirmDialog(this, "¿Está seguro de modificar la"
                + " ubicación ?",
                "Información", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            try {
                int pos = this.pos;
                Ubicacion u = (Ubicacion) resultList.get(pos);
                u.setPais(tf_pais1.getText());
                u.setCiudad(tf_ciudad1.getText());
                u.setDireccion(tf_direccion3.getText());
                ObjectModelDAO.updateObject(u);

                String sql = "FROM Ubicacion u order by u.idUbicacion asc";
                resultList = ObjectModelDAO.getResultQuery(sql);
                JavaUtil.displayResult(resultList, tablaModificarUbicacion);
                tablaModificarUbicacion.setEditable(false);
                tablaModificarUbicacion.setRowSelectionInterval(pos, pos);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Mensaje:\n\t" + e.getMessage(),
                        "Error Update",
                        JOptionPane.ERROR_MESSAGE
                );
                Logger.getLogger(Pubicacion.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void tf_direccion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_direccion3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_direccion3ActionPerformed

    private void tf_pais1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pais1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pais1ActionPerformed

    private void tf_ciudad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ciudad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ciudad1ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (pos == -1) {
            return;
        }

        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar la"
                + " ubicación ?", "Información", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {

            ObjectModelDAO.deleteObject(resultList.get(pos));
            String sql = "FROM Ubicacion u order by u.idUbicacion asc";
            resultList = ObjectModelDAO.getResultQuery(sql);
            JavaUtil.displayResult(resultList, tablaEliminarUbicacion);
            pos = -1;
            tablaEliminarUbicacion.setEditable(false);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void panelScrudUbicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelScrudUbicStateChanged

        if (panelScrudUbic.getSelectedIndex() == 0) {
            String sql = "FROM Ubicacion u order by u.idUbicacion asc";
            resultList = ObjectModelDAO.getResultQuery(sql);

            JavaUtil.displayResult(resultList, tablaConsultaUbicacion);
            tablaConsultaUbicacion.setEditable(false);
        }

        if (panelScrudUbic.getSelectedIndex() == 1) {
            tf_pais.setText("");
            tf_ciudad.setText("");
            tf_direccion1.setText("");
        }

        if (panelScrudUbic.getSelectedIndex() == 2) {
            lb_numero.setText("");
            tf_pais1.setText("");
            tf_ciudad1.setText("");
            tf_direccion3.setText("");
            String sql = "FROM Ubicacion u order by u.idUbicacion asc";
            resultList = ObjectModelDAO.getResultQuery(sql);
            JavaUtil.displayResult(resultList, tablaModificarUbicacion);
            pos = -1;
            tablaModificarUbicacion.setEditable(false);

        }

        if (panelScrudUbic.getSelectedIndex() == 3) {
            String sql = "FROM Ubicacion u order by u.idUbicacion asc";
            resultList = ObjectModelDAO.getResultQuery(sql);

            JavaUtil.displayResult(resultList, tablaEliminarUbicacion);
            pos = -1;
            tablaEliminarUbicacion.setEditable(false);
        }
    }//GEN-LAST:event_panelScrudUbicStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_numero;
    private javax.swing.JButton modificar;
    private javax.swing.JTabbedPane panelScrudUbic;
    private org.jdesktop.swingx.JXTable tablaConsultaUbicacion;
    private org.jdesktop.swingx.JXTable tablaEliminarUbicacion;
    private org.jdesktop.swingx.JXTable tablaModificarUbicacion;
    private javax.swing.JTextField tf_ciudad;
    private javax.swing.JTextField tf_ciudad1;
    private javax.swing.JTextField tf_direccion1;
    private javax.swing.JTextField tf_direccion3;
    private javax.swing.JTextField tf_pais;
    private javax.swing.JTextField tf_pais1;
    // End of variables declaration//GEN-END:variables
}
