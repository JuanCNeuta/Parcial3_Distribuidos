/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Producto;
import servicios.ProductoServices;

/**
 *
 * @author William
 */
public class FrmCrearSubasta extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListarProductos
     */
    ArrayList<Producto> productos = new ArrayList<>();
    ProductoServices objProductoServices = new ProductoServices();

    private DefaultTableModel modelo;

    public FrmCrearSubasta() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gestión Subasta");

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
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtableProductos.setFocusable(false);
        jtableProductos.getTableHeader().setResizingAllowed(false);
        jtableProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableProductos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado de productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Gestion Subasta \"CREAR, CERRAR\"");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Codigo Producto:");

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Digite el codigo del producto que desea realizar gestión");

        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setText("Cerrar Subasta");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCrear.setText("Crear Subasta");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Actualizar Listado:");

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel2)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(btnActualizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed


        if (!txtCodigo.getText().isEmpty()) {
            Producto producto = new Producto();

            Boolean banCodigo = false;
            Boolean banSubasta = false;

            //Validar si hay un producto con esa id
            productos = objProductoServices.listarTodosProductos();
            for (Producto listaDeProduct : productos) {
                if (listaDeProduct.getCodigo() == Integer.valueOf(txtCodigo.getText())) {
                    banCodigo = true;
                    break;
                }
            }

            //Validar si hay otro producto en subasta
            //productos = objProductoServices.listarTodosProductos();
            for (Producto listaDeProduct : productos) {
                if (listaDeProduct.getEstado().equals("En subasta")) {
                    banSubasta = true;
                    break;
                }
            }

            if (banCodigo) {
                producto = objProductoServices.consultarProductoId(Integer.valueOf(txtCodigo.getText()));

                if (!producto.getEstado().equalsIgnoreCase("En subasta")) {

                    if (banSubasta) {
                        JOptionPane.showMessageDialog(this, "Ya existe una subasta, solo puede haber una a la vez, intente cerrando la subasta actual.");
                        txtCodigo.setText("");
                    } else {
                        Producto objProductoActualizado = objProductoServices.actualizarProductoSubasta(Integer.valueOf(txtCodigo.getText()),
                                "En subasta", producto);
                        if (objProductoActualizado != null) {
                            JOptionPane.showMessageDialog(this, "La subasta se ha creado correctamente.");
                            llenarListadoProductos();
                            llenarTablaProductos();
                            txtCodigo.setText("");
                        } else {
                            JOptionPane.showMessageDialog(this, "Problemas el crear la subasta, intente nuevamente.");
                            txtCodigo.setText("");
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "El producto ya se esta subastando, intente nuevamente.");
                    txtCodigo.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El codigo ingresado no pertenece a ningun producto, intente nuevamente.");
                txtCodigo.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo para poder empezar la subasta.");
        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        if (!txtCodigo.getText().isEmpty()) {
            Producto producto = new Producto();

            Boolean banCodigo = false;
            Boolean banSubasta = false;

            //Validar si hay un producto con esa id
            productos = objProductoServices.listarTodosProductos();
            for (Producto listaDeProduct : productos) {
                if (listaDeProduct.getCodigo() == Integer.valueOf(txtCodigo.getText())) {
                    banCodigo = true;
                    break;
                }
            }

            //Validar si hay otro producto en subasta
            //productos = objProductoServices.listarTodosProductos();
            for (Producto listaDeProduct : productos) {
                if (listaDeProduct.getEstado().equals("En subasta")) {
                    banSubasta = true;
                    break;
                }
            }

            if (!banSubasta) {
                JOptionPane.showMessageDialog(this, "No existen productos subastandose actualmente, no se puede realizar esta acción.");
                txtCodigo.setText("");
            } else {

                if (banCodigo) {
                    
                    producto = objProductoServices.consultarProductoId(Integer.valueOf(txtCodigo.getText()));

                    if (producto.getEstado().equalsIgnoreCase("En subasta")) {

                        Producto productoSubasta = new Producto();
                        productoSubasta = objProductoServices.consultarProductoEnSubasta();
                        Producto objProductoActualizado = objProductoServices.actualizarProductoSubasta(Integer.valueOf(txtCodigo.getText()),
                                "En oferta", productoSubasta);
                        if (objProductoActualizado != null) {
                            JOptionPane.showMessageDialog(this, "La subasta ha sido cerrada correctamente.");
                            llenarListadoProductos();
                            llenarTablaProductos();
                            txtCodigo.setText("");
                        } else {
                            JOptionPane.showMessageDialog(this, "Problemas al cerrar la subasta, intente nuevamente.");
                            txtCodigo.setText("");
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "El producto no se esta subastando, no se puede realizar esta acción, intente nuevamente.");
                        txtCodigo.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El codigo ingresado no pertenece a ningun producto, intente nuevamente.");
                    txtCodigo.setText("");
                    txtCodigo.requestFocus();
                }

            }

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo para iniciar la subasta.");
            txtCodigo.requestFocus();
        }


    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        llenarListadoProductos();
        llenarTablaProductos();
        JOptionPane.showMessageDialog(this, "Se ha actualizado el listado de productos disponibles.");
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void llenarTablaProductos() {

        modelo = (DefaultTableModel) jtableProductos.getModel();
        int filas = modelo.getRowCount();

        for (int i = 0; i < filas; i++) {
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
        productos = objProductoServices.listarTodosProductos();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableProductos;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
