/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.paneles;

import hibernate.DAO.ObjectModelDAO;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelos.mapeos.Almacen;
import modelos.mapeos.InventarioTienda;
import util.JavaUtil;

/**
 *
 * @author Laura
 */
public class JPreduccionInventarioParticular extends javax.swing.JPanel {

    private List resultList;
    private List resultListAlmacen;
    private int pos;

    public JPreduccionInventarioParticular() {
        initComponents();
        SetCb();

        listadoProductosADescontar.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent lse) {
                if (!lse.getValueIsAdjusting()) {

                    pos = listadoProductosADescontar.getSelectedRow();
                    if (pos == -1) {
                        return;
                    }

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

        cb_Tiend_Inv_Part = new javax.swing.JComboBox();
        lb_Tiend = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadoProductosADescontar = new org.jdesktop.swingx.JXTable();
        btn_modfInventario = new javax.swing.JButton();

        lb_Tiend.setText("Tienda:");

        listadoProductosADescontar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO CON DESCUENTO", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listadoProductosADescontar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listadoProductosADescontarKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(listadoProductosADescontar);

        btn_modfInventario.setText("Actualizar Inventario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lb_Tiend)
                .addGap(55, 55, 55)
                .addComponent(cb_Tiend_Inv_Part, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btn_modfInventario)
                .addGap(80, 80, 80))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Tiend_Inv_Part, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Tiend)
                    .addComponent(btn_modfInventario))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SetCb() {
        resultListAlmacen = ObjectModelDAO.getResultQuery("FROM Almacen a order by a.idAlmacen asc");
        cb_Tiend_Inv_Part.removeAllItems();
        for (Object object : resultListAlmacen) {
            Almacen a = (Almacen) object;
            cb_Tiend_Inv_Part.addItem(a.getNombre());
        }
    }
    private void listadoProductosADescontarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listadoProductosADescontarKeyPressed

        Object codigoingresado = listadoProductosADescontar.getValueAt(pos, 0);
        Almacen almacenseleccionado = (Almacen) resultListAlmacen.get(cb_Tiend_Inv_Part.getSelectedIndex());

        String sql = "FROM InventarioTienda i WHERE i.inventarioTiendaPK.idProducto = " + codigoingresado
                + " AND i.inventarioTiendaPK.idAlmacen = " + almacenseleccionado.getIdAlmacen();
        resultList = ObjectModelDAO.getResultQuery(sql);

        InventarioTienda ivt = (InventarioTienda) resultList.get(0);
        int posOr = pos;

        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
//            ((DefaultTableModel) listadoProductosADescontar.getModel()).addRow(new Object[]{
//                codigoingresado,
//                ivt.getProducto().getDescripcion(),
//                ivt.getPrecioConDescuento(),
//                ivt.getCantidad()});
            ((DefaultTableModel) listadoProductosADescontar.getModel()).addRow(new Object[listadoProductosADescontar.getColumnCount()]);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listadoProductosADescontar.setValueAt(ivt.getProducto().getDescripcion().toString(), 0, 1);
            listadoProductosADescontar.setValueAt(ivt.getPrecioConDescuento().toString(), 0, 2);
        }
    }//GEN-LAST:event_listadoProductosADescontarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_modfInventario;
    private javax.swing.JComboBox cb_Tiend_Inv_Part;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Tiend;
    private org.jdesktop.swingx.JXTable listadoProductosADescontar;
    // End of variables declaration//GEN-END:variables
}
