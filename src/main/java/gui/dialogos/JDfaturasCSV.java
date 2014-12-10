/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.dialogos;

import clases.csv.CSVreader;
import clases.csv.Factura;
import clases.csv.InventarioDiario;
import clases.csv.Producto;
import java.io.File;
import java.util.Map;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import util.JavaUtil;

/**
 *
 * @author Usuario
 */
public class JDfaturasCSV extends javax.swing.JDialog {

    private InventarioDiario ivtDiario = null;

    public InventarioDiario getIvtDiario() {
        return ivtDiario;
    }

    public JDfaturasCSV(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        listaFacturas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {
                    int i = listaFacturas.getSelectedIndex();
                    Vector<String> header = new Vector<>();
                    header.add("Código");
                    header.add("Tipo");
                    header.add("Precio");
                    header.add("Cantidad");
                    Vector<Object> data = new Vector<>();
                    if (i != -1 && ivtDiario != null) {
                        transaccion.setText(String.valueOf(ivtDiario.getFacturas().get(i).getTransaccion()));
                        usuario.setText(ivtDiario.getFacturas().get(i).getUsuario());
                        estado.setText(String.valueOf(ivtDiario.getFacturas().get(i).getEstado()));
                        numero.setText(String.valueOf(ivtDiario.getFacturas().get(i).getNumero()));
                        impresora.setText(String.valueOf(ivtDiario.getFacturas().get(i).getImpresora()));
                        modificado.setText(ivtDiario.getFacturas().get(i).getUsuarioModif());
                        cedula.setText(ivtDiario.getFacturas().get(i).getCedulaModif());
                        facToConIva.setText(JavaUtil.dosDecimales.format(ivtDiario.getFacturas().get(i).getTotalConIva()).replace(",", "."));
                        facToSinIva.setText(JavaUtil.dosDecimales.format(ivtDiario.getFacturas().get(i).getTotalSinIva()).replace(",", "."));
                        for (Map.Entry<Producto, Integer> entry : ivtDiario.getFacturas().get(i).getProductos().entrySet()) {
                            Producto p = entry.getKey();
                            Vector<Object> subdata = new Vector<>();
                            subdata.add(p.getCodigo());
                            subdata.add(p.getTipo());
                            subdata.add(JavaUtil.dosDecimales.format(p.getPrecio()).replace(",", "."));
                            subdata.add(entry.getValue());
                            data.add(subdata);
                        }
                    } else {
                        transaccion.setText("");
                        usuario.setText("");
                        estado.setText("");
                        numero.setText("");
                        impresora.setText("");
                        modificado.setText("");
                        cedula.setText("");
                        facToConIva.setText("");
                        facToSinIva.setText("");
                    }
                    tabla.setModel(new DefaultTableModel(data, header));
                }
            }
        });

    }

    private void cargarInformacion() {
        this.texto.setText(ivtDiario.toString());
        fecha.setText(ivtDiario.getFecha());
        totalConIva.setText(JavaUtil.dosDecimales.format(ivtDiario.getTotalConIva()));
        totalSinIva.setText(JavaUtil.dosDecimales.format(ivtDiario.getTotalSinIva()));
        DefaultListModel dlm = new DefaultListModel();
        for (Factura fa : ivtDiario.getFacturas()) {
            dlm.addElement(fa.getNumero());
        }
        listaFacturas.setModel(dlm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filesc = new javax.swing.JFileChooser();
        filesc.setCurrentDirectory(new java.io.File("C:\\Users\\Usuario\\Documents\\PASANTIA"));

        filesc.setDialogTitle("Seleccione un archivo");
        tabpanel = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFacturas = new org.jdesktop.swingx.JXList();
        jPanel2 = new javax.swing.JPanel();
        PanelDatos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        transaccion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        lbusuario = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        lbusuariomodif = new javax.swing.JLabel();
        modificado = new javax.swing.JLabel();
        lbusuariomodif2 = new javax.swing.JLabel();
        facToSinIva = new javax.swing.JLabel();
        lbestado = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        impresoralb = new javax.swing.JLabel();
        impresora = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        lbusuariomodif1 = new javax.swing.JLabel();
        lbusuariomodif3 = new javax.swing.JLabel();
        facToConIva = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new org.jdesktop.swingx.JXTable();
        PanelCab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalSinIva = new javax.swing.JLabel();
        totalConIva = new javax.swing.JLabel();
        seleccionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ruta = new javax.swing.JLabel();
        PanelLado = new javax.swing.JPanel();
        imprimirFac = new javax.swing.JButton();
        imprimirInv = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();

        filesc.setCurrentDirectory(new java.io.File("C:\\Users\\Usuario\\Documents\\PASANTIA\\prueba"));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalle de Facturas");
        setMinimumSize(new java.awt.Dimension(50, 60));
        setPreferredSize(new java.awt.Dimension(680, 500));

        tabpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        tabpanel.addTab("Texto", null, jScrollPane1, "");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Facturas"));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(100, 150));

        listaFacturas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listaFacturas);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.WEST);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabel5.setText("Transacción");

        transaccion.setText(" ");
        transaccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Número");

        numero.setText(" ");
        numero.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbusuario.setText("Usuario");

        usuario.setText(" ");
        usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbusuariomodif.setText("Modificación por");

        modificado.setText(" ");
        modificado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbusuariomodif2.setText("Total sin IVA");

        facToSinIva.setText(" ");
        facToSinIva.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbestado.setText("Estado");

        estado.setText(" ");
        estado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        impresoralb.setText("Impresora");

        impresora.setText(" ");
        impresora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cedula.setText(" ");
        cedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbusuariomodif1.setText("Cédula");

        lbusuariomodif3.setText("Total con IVA");

        facToConIva.setText(" ");
        facToConIva.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbusuariomodif2)
                            .addComponent(lbestado))
                        .addGap(27, 27, 27)
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estado, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(facToSinIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbusuariomodif)
                            .addComponent(lbusuario)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transaccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelDatosLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel6))
                        .addGroup(PanelDatosLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(impresoralb))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbusuariomodif1)))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbusuariomodif3)))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facToConIva, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(cedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(impresora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(transaccion)
                    .addComponent(numero)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbusuario)
                    .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(impresoralb)
                        .addComponent(impresora)
                        .addComponent(usuario)))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbusuariomodif)
                    .addComponent(modificado)
                    .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbusuariomodif1)
                        .addComponent(cedula)))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbusuariomodif2)
                    .addComponent(facToSinIva)
                    .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbusuariomodif3)
                        .addComponent(facToConIva)))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbestado)
                    .addComponent(estado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(PanelDatos);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setToolTipText("Flecha hacia abajo para agregar renglón. Doble click en Fecha para agregar fecha");
        tabla.setEditable(false);
        tabla.setSortable(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tabla);

        jPanel2.add(jScrollPane4);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        tabpanel.addTab("Lista", jPanel1);

        getContentPane().add(tabpanel, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Fecha");

        fecha.setText(" ");
        fecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Total sin IVA");

        totalSinIva.setText(" ");
        totalSinIva.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        totalConIva.setText(" ");
        totalConIva.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_almacen/1417901536_internt_web_technology-02-16.png"))); // NOI18N
        seleccionar.setText("Cargar Archivo de Factura");
        seleccionar.setToolTipText("Para cálculo de factura");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        jLabel3.setText("Total con IVA");

        ruta.setText(" ");

        javax.swing.GroupLayout PanelCabLayout = new javax.swing.GroupLayout(PanelCab);
        PanelCab.setLayout(PanelCabLayout);
        PanelCabLayout.setHorizontalGroup(
            PanelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCabLayout.createSequentialGroup()
                        .addComponent(seleccionar)
                        .addGap(18, 18, 18)
                        .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCabLayout.createSequentialGroup()
                        .addGroup(PanelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(PanelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalConIva, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalSinIva, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCabLayout.setVerticalGroup(
            PanelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totalSinIva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalConIva))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        getContentPane().add(PanelCab, java.awt.BorderLayout.NORTH);

        imprimirFac.setText("Imprimir Factura");
        imprimirFac.setToolTipText("Actualiza el Inventario de la Tienda");
        imprimirFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirFacActionPerformed(evt);
            }
        });

        imprimirInv.setText("Imprimir Inventario Diario");
        imprimirInv.setToolTipText("Actualiza el Inventario de la Tienda");
        imprimirInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirInvActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar Inventario");
        actualizar.setToolTipText("Actualiza el Inventario de la Tienda");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLadoLayout = new javax.swing.GroupLayout(PanelLado);
        PanelLado.setLayout(PanelLadoLayout);
        PanelLadoLayout.setHorizontalGroup(
            PanelLadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imprimirInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imprimirFac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelLadoLayout.setVerticalGroup(
            PanelLadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imprimirFac)
                .addGap(18, 18, 18)
                .addComponent(imprimirInv)
                .addGap(18, 18, 18)
                .addComponent(actualizar)
                .addGap(18, 18, 18)
                .addComponent(aceptar)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        getContentPane().add(PanelLado, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        actualizar.setEnabled(false);
    }//GEN-LAST:event_actualizarActionPerformed

    private void imprimirInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirInvActionPerformed

    private void imprimirFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirFacActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed

        if (filesc.getChoosableFileFilters().length > 1) {
            filesc.removeChoosableFileFilter(filesc.getChoosableFileFilters()[1]);
        }

        filesc.setFileFilter(new FileNameExtensionFilter("Archivos csv! ", "csv"));

        int returnVal = filesc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = filesc.getSelectedFile();
            CSVreader csvReader = new CSVreader(file.getAbsolutePath());
            ruta.setText(file.getAbsolutePath());
            ivtDiario = csvReader.procesCSV();
            cargarInformacion();
        }
    }//GEN-LAST:event_seleccionarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        dispose();
    }//GEN-LAST:event_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(JDfaturasCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDfaturasCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDfaturasCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDfaturasCSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDfaturasCSV dialog = new JDfaturasCSV(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel PanelCab;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PanelLado;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton actualizar;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel facToConIva;
    private javax.swing.JLabel facToSinIva;
    private javax.swing.JLabel fecha;
    private javax.swing.JFileChooser filesc;
    private javax.swing.JLabel impresora;
    private javax.swing.JLabel impresoralb;
    private javax.swing.JButton imprimirFac;
    private javax.swing.JButton imprimirInv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbestado;
    private javax.swing.JLabel lbusuario;
    private javax.swing.JLabel lbusuariomodif;
    private javax.swing.JLabel lbusuariomodif1;
    private javax.swing.JLabel lbusuariomodif2;
    private javax.swing.JLabel lbusuariomodif3;
    private org.jdesktop.swingx.JXList listaFacturas;
    private javax.swing.JLabel modificado;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel ruta;
    private javax.swing.JButton seleccionar;
    private org.jdesktop.swingx.JXTable tabla;
    private javax.swing.JTabbedPane tabpanel;
    private javax.swing.JTextArea texto;
    private javax.swing.JLabel totalConIva;
    private javax.swing.JLabel totalSinIva;
    private javax.swing.JLabel transaccion;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

}
