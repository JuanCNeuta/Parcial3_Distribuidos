/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.Producto;
import servicios.ClienteServices;

/**
 *
 * @author JuanC
 */
public class FrmListarProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListarProductos
     */
    ArrayList<Producto> productos = new ArrayList<>();
    ClienteServices objClienteServices = new ClienteServices();

    private DefaultTableModel modelo;

    public FrmListarProductos() {
        initComponents();
        llenarListadoProductos();
        llenarTablaProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbActualizarTabla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar todos los productos");

        jbActualizarTabla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbActualizarTabla.setText("Actualizar tabla");
        jbActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarTablaActionPerformed(evt);
            }
        });

        jtableProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        jtableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Estado", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableProductos.setFocusable(false);
        jtableProductos.getTableHeader().setResizingAllowed(false);
        jtableProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableProductos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Listado de productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jbActualizarTabla)
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizarTabla)
                    .addComponent(jLabel1))
                .addContainerGap(296, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jbActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarTablaActionPerformed
        llenarListadoProductos();
        llenarTablaProductos();
    }//GEN-LAST:event_jbActualizarTablaActionPerformed

    private void llenarTablaProductos() {

        modelo = (DefaultTableModel) jtableProductos.getModel();
        int filas= modelo.getRowCount();
        
        for(int i = 0; i < filas; i++){
            modelo.removeRow(0);
        }

        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            modelo.addRow(new Object[]{
                producto.getCodigo(),
                producto.getNombre(),
                producto.getEstado(),
                producto.getValor()
            });
        }

    }

    private void llenarListadoProductos() {
        productos = objClienteServices.listarProductos();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizarTabla;
    private javax.swing.JTable jtableProductos;
    // End of variables declaration//GEN-END:variables
}
