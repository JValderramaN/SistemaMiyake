/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.paneles;

import clases.csv.CSVreader;
import util.JavaUtil;
import static util.JavaUtil.setTableCellAlignment;
import hibernate.DAO.ObjectModelDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelos.mapeos.Almacen;

import modelos.mapeos.Contacto;
import modelos.mapeos.Usuario;
import static util.JavaUtil.cons_seleccionar;

public class JPusuario extends javax.swing.JPanel {

    private int pos_tienda;

    private List tiendas;
    private int pos;
    private List resultListUsuarios;
    Almacen tienda;
    Usuario u;

    public JPusuario() {
        this(0);
    }

    public JPusuario(int tabCrud) {
        initComponents();
        cargarCB();

        setTableCellAlignment(JLabel.CENTER, tablaListadoUsuarios);
        setTableCellAlignment(JLabel.CENTER, tablaModfUser);
        setTableCellAlignment(JLabel.CENTER, tablaDeletContact);
        tablaListadoUsuarios.getTableHeader().setReorderingAllowed(false);
        tablaModfUser.getTableHeader().setReorderingAllowed(false);
        tablaDeletContact.getTableHeader().setReorderingAllowed(false);

        panelScrudContact.setSelectedIndex(tabCrud);

        tablaModfUser.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {

                    pos = tablaModfUser.getSelectedRow();
                    if (pos == -1) {
                        return;
                    }
                    Usuario u = (Usuario) resultListUsuarios.get(pos);
                    lb_id.setText(u.getIdUsuario().toString());
                    txtNombreUser.setText(u.getNombre());
                    txtClave.setText(u.getContrasena());
                    txtUserDescripcion.setText(u.getDescripcion());
                    
                    jComboBoxTipoUsuario1.addItem(u.getTienda());
                    
                    
                }
            }
        });

        tablaDeletContact.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {

                    if (tablaDeletContact.getSelectedRow() == -1) {
                        return;
                    }
                    pos = tablaDeletContact.getSelectedRow();

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

        panelScrudContact = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaListadoUsuarios = new org.jdesktop.swingx.JXTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaModfUser = new org.jdesktop.swingx.JXTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JTextField();
        txtUserDescripcion = new javax.swing.JTextField();
        bModfContact = new javax.swing.JButton();
        txtClave = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jComboBoxTipoUsuario1 = new javax.swing.JComboBox();
        cb_tienda1 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDeletContact = new org.jdesktop.swingx.JXTable();
        bDeletContact = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bCrearContac = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JTextField();
        txtDescripcionUsuario = new javax.swing.JTextField();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jComboBoxTipoUsuario = new javax.swing.JComboBox();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        cb_tienda = new javax.swing.JComboBox();
        clave = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(5, 5));

        panelScrudContact.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelScrudContactStateChanged(evt);
            }
        });

        tablaListadoUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Contacto", "Nombre", "Puesto", "Telefono 1", "Telefono 2", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaListadoUsuarios.setSortable(false);
        jScrollPane2.setViewportView(tablaListadoUsuarios);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1416622346_xmag.png"))); // NOI18N
        jLabel12.setText("Para realizar Busqueda: Haga Click en la tabla + CTRL F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        panelScrudContact.addTab("Consultar", jScrollPane1);

        jPanel3.setPreferredSize(new java.awt.Dimension(5, 352));
        jPanel3.setLayout(new java.awt.BorderLayout());

        tablaModfUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Puesto", "Telefono 1", "Telefono 2", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaModfUser.setSortable(false);
        jScrollPane4.setViewportView(tablaModfUser);

        jPanel3.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jLabel6.setText("ID:");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_almacen/responsable1.png"))); // NOI18N
        jLabel7.setText("Nombre Usuario:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_almacen/descripcion.png"))); // NOI18N
        jLabel8.setText("Descripcion");

        lb_id.setText("id Usuario");

        bModfContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415663100_edit-user.png"))); // NOI18N
        bModfContact.setText("Modificar");
        bModfContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModfContactActionPerformed(evt);
            }
        });

        txtClave.setText("jPasswordField1");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_almacen/1417576149_change_password.png"))); // NOI18N
        jLabel15.setText("Contraseña");

        jXLabel3.setText("Tienda");

        jXLabel4.setText("Tipo Usuario");

        jComboBoxTipoUsuario1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo 1", "Tipo 2", "Tipo 3", "Tipo 4" }));

        cb_tienda1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(cb_tienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_id))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtClave, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombreUser, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUserDescripcion, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(bModfContact)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lb_id))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(1, 1, 1)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipoUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_tienda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bModfContact, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.EAST);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1416622346_xmag.png"))); // NOI18N
        jLabel13.setText("Para realizar Busqueda: Haga Click en la tabla + CTRL F");
        jPanel3.add(jLabel13, java.awt.BorderLayout.PAGE_START);

        jScrollPane16.setViewportView(jPanel3);

        panelScrudContact.addTab("Modificar", jScrollPane16);

        jPanel4.setPreferredSize(new java.awt.Dimension(5, 5));

        tablaDeletContact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Puesto", "Telefono 1", "Telefono 2", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaDeletContact);

        bDeletContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415663088_delete-user.png"))); // NOI18N
        bDeletContact.setText("Eliminar");
        bDeletContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletContactActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1416622346_xmag.png"))); // NOI18N
        jLabel14.setText("Para realizar Busqueda: Haga Click en la tabla + CTRL F");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDeletContact)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bDeletContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jScrollPane17.setViewportView(jPanel4);

        panelScrudContact.addTab("Eliminar", jScrollPane17);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Descripcion:");

        jLabel5.setText("Contraseña");

        bCrearContac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1415663093_add-user.png"))); // NOI18N
        bCrearContac.setText("Crear Contacto");
        bCrearContac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearContacActionPerformed(evt);
            }
        });

        jXLabel1.setText("Tipo Usuario");

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo 1", "Tipo 2", "Tipo 3", "Tipo 4" }));

        jXLabel2.setText("Tienda");

        cb_tienda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        clave.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(txtDescripcionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_tienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(bCrearContac)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bCrearContac)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel2);

        panelScrudContact.addTab("Crear", jScrollPane5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelScrudContact, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelScrudContact, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cargarCB() {
        try {
            tiendas = ObjectModelDAO.getResultQuery("from Almacen a order by a.idAlmacen asc");
            cb_tienda.removeAllItems();
            cb_tienda.addItem(cons_seleccionar);
            for (Object object : tiendas) {
                Almacen a = (Almacen) object;
                cb_tienda.addItem(a.getNombre());
            }
            pos_tienda = -1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR ComBox : " + e);
            System.err.println("ERROR AL CARGAR ComBox : " + e);
        }

    }

    private void bCrearContacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearContacActionPerformed
        if (!txtNombreUsuario.getText().equals("") && !txtDescripcionUsuario.getText().equals("")) {
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro de crear el"
                    + " nuevo contacto con nombre : " + txtNombreUsuario.getText() + "?",
                    "Información", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                pos_tienda = this.cb_tienda.getSelectedIndex();
                Integer pos_tipo = this.jComboBoxTipoUsuario.getSelectedIndex();
                short t = pos_tipo.shortValue();
                if (pos_tienda != -1) {

                    tienda = (Almacen) tiendas.get(pos_tienda);
                    u = new Usuario();
                    u.setNombre(txtNombreUsuario.getText());
                    u.setDescripcion(txtDescripcionUsuario.getText());
                    u.setTipoUsuario(t);
                    u.setTienda(tienda.getIdAlmacen());
                    u.setContrasena(clave.getText());

                    Object saveObject = ObjectModelDAO.saveObject(u);
                    JOptionPane.showMessageDialog(null, "Creado Con Exito : " + saveObject);

                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
    }//GEN-LAST:event_bCrearContacActionPerformed

    private void bModfContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModfContactActionPerformed

        if (pos == -1 || txtNombreUser.getText().equals("") || txtUserDescripcion.getText().equals("")) {

            return;
        }

        String valor = tablaModfUser.getValueAt(tablaModfUser.getSelectedRow(), 0).toString();
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro de modificar la"
                + " el contacto " + valor + "?",
                "Información", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            try {
                pos_tienda = this.cb_tienda.getSelectedIndex();
                Integer pos_tipo = this.jComboBoxTipoUsuario.getSelectedIndex();
                short t = pos_tipo.shortValue();

                int pos1 = this.pos;
                Usuario u = (Usuario) resultListUsuarios.get(pos1);
                u.setNombre(txtNombreUser.getText());
                u.setDescripcion(txtUserDescripcion.getText());
                u.setContrasena(txtClave.getText());
                u.setTipoUsuario(t);
               // u.setTienda(tienda.getIdAlmacen());
                //Modificar
                ObjectModelDAO.updateObject(u);

                String sql = "FROM Usuario u order by u.idUsuario asc";
                resultListUsuarios = ObjectModelDAO.getResultQuery(sql);
                JavaUtil.displayResult(resultListUsuarios, tablaModfUser);
                tablaModfUser.setEditable(false);
                tablaModfUser.setRowSelectionInterval(pos1, pos1);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Mensaje:\n\t" + e.getMessage(),
                        "Error Update",
                        JOptionPane.ERROR_MESSAGE
                );
                Logger.getLogger(JPusuario.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_bModfContactActionPerformed

    private void bDeletContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletContactActionPerformed
        if (pos == -1) {
            return;
        }

        String valor = tablaDeletContact.getValueAt(tablaDeletContact.
                getSelectedRow(), tablaDeletContact.getSelectedColumn()).toString();
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el "
                + " Contacto " + tablaDeletContact.getValueAt(tablaDeletContact.getSelectedRow(), 1)
                + "?", "Información", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {

            ObjectModelDAO.deleteObject(resultListUsuarios.get(pos));
            String sql = "FROM Usuario u order by u.idUsuario asc";
            resultListUsuarios = ObjectModelDAO.getResultQuery(sql);
            JavaUtil.displayResult(resultListUsuarios, tablaDeletContact);
            pos = -1;
            tablaDeletContact.setEditable(false);
        }
    }//GEN-LAST:event_bDeletContactActionPerformed

    private void panelScrudContactStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelScrudContactStateChanged
        if (panelScrudContact.getSelectedIndex() == 0) {
            String sql = "FROM Usuario u order by u.idUsuario asc";
            List resultList = ObjectModelDAO.getResultQuery(sql);
            JavaUtil.displayResult(resultList, tablaListadoUsuarios);
            tablaListadoUsuarios.setEditable(false);
        }

        

        if (panelScrudContact.getSelectedIndex() == 1) {
            lb_id.setText("");
            txtNombreUser.setText("");
            txtUserDescripcion.setText("");
//            fieldTlfContact1.setText("");
//            fieldTlfContact2.setText("");
//            fieldEmailContact.setText("");
            String sql = "FROM Usuario u order by u.idUsuario asc";
            resultListUsuarios = ObjectModelDAO.getResultQuery(sql);
            JavaUtil.displayResult(resultListUsuarios, tablaModfUser);
            pos = -1;
            tablaModfUser.setEditable(false);

        }

        if (panelScrudContact.getSelectedIndex() == 2) {
            String sql = "FROM Usuario u order by u.idUsuario asc";
            resultListUsuarios = ObjectModelDAO.getResultQuery(sql);

            JavaUtil.displayResult(resultListUsuarios, tablaDeletContact);
            pos = -1;
            tablaDeletContact.setEditable(false);
        }
        if (panelScrudContact.getSelectedIndex() == 3) {
            txtNombreUsuario.setText("");
            txtDescripcionUsuario.setText("");

        }
    }//GEN-LAST:event_panelScrudContactStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrearContac;
    private javax.swing.JButton bDeletContact;
    private javax.swing.JButton bModfContact;
    private javax.swing.JComboBox cb_tienda;
    private javax.swing.JComboBox cb_tienda1;
    private javax.swing.JPasswordField clave;
    private javax.swing.JComboBox jComboBoxTipoUsuario;
    private javax.swing.JComboBox jComboBoxTipoUsuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private javax.swing.JLabel lb_id;
    private javax.swing.JTabbedPane panelScrudContact;
    private org.jdesktop.swingx.JXTable tablaDeletContact;
    private org.jdesktop.swingx.JXTable tablaListadoUsuarios;
    private org.jdesktop.swingx.JXTable tablaModfUser;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtDescripcionUsuario;
    private javax.swing.JTextField txtNombreUser;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtUserDescripcion;
    // End of variables declaration//GEN-END:variables

}
