package productos;

import basedatos.Seleccion;
import java.awt.Point;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.*;

public class PanelProductos extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        BtnNuevo = new RSMaterialComponent.RSButtonShape();
        btnModificar = new RSMaterialComponent.RSButtonShape();
        btnEliminar = new RSMaterialComponent.RSButtonShape();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new RSMaterialComponent.RSTableMetroCustom();
        txtBuscar = new RSMaterialComponent.RSTextFieldMaterial();
        labelIcon1 = new necesario.LabelIcon();
        cmbbxOrdenarPor = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(81, 111, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblImage.setBackground(new java.awt.Color(81, 111, 244));
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos/product.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCTOS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos/person.png"))); // NOI18N

        lblRol.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRol.setForeground(new java.awt.Color(255, 255, 255));
        lblRol.setText("ADMINISTRADOR");

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("admin02");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(109, 109, 109)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRol)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRol)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        BtnNuevo.setBackground(new java.awt.Color(81, 111, 244));
        BtnNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo.setText("Nuevo Producto");
        BtnNuevo.setFocusPainted(false);
        BtnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnNuevo.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        BtnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(81, 111, 244));
        btnModificar.setText("Modificar");
        btnModificar.setFocusPainted(false);
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(81, 111, 244));
        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusPainted(false);
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        tablaProductos.setForeground(new java.awt.Color(81, 111, 244));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, "Harley Cooper", "Brandon Fernandez", null, null, null, null, null},
                {"3", "Carnicerias San Pedro S.A", "Carne", "libra", "Carne magra cerdo", "100", "40", "0"},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, "", null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Proveedor", "Categoria", "Medida", "Producto", "Venta", "Compra", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setBackgoundHead(new java.awt.Color(81, 111, 244));
        tablaProductos.setBackgoundHover(new java.awt.Color(255, 255, 255));
        tablaProductos.setColorBorderHead(new java.awt.Color(255, 255, 255));
        tablaProductos.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaProductos.setColorPrimaryText(new java.awt.Color(81, 111, 244));
        tablaProductos.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaProductos.setColorSecundaryText(new java.awt.Color(81, 111, 244));
        tablaProductos.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tablaProductos.setFontHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaProductos.setFontRowHover(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaProductos.setFontRowSelect(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaProductos.setGridColor(new java.awt.Color(81, 111, 244));
        tablaProductos.setRowHeight(30);
        tablaProductos.setSelectionBackground(new java.awt.Color(139, 159, 247));
        tablaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProductos.setShowGrid(true);
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(3);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(13);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(4);
            tablaProductos.getColumnModel().getColumn(5).setPreferredWidth(3);
            tablaProductos.getColumnModel().getColumn(6).setPreferredWidth(3);
            tablaProductos.getColumnModel().getColumn(7).setPreferredWidth(3);
        }

        jPanel2.add(jScrollPane1);

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscar.setPlaceholder("Buscar");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        labelIcon1.setBackground(new java.awt.Color(81, 111, 244));
        labelIcon1.setForeground(new java.awt.Color(255, 255, 255));
        labelIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);

        cmbbxOrdenarPor.setForeground(new java.awt.Color(81, 111, 244));
        cmbbxOrdenarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Proveedor", "Categoria", "Medida", "Producto", "Venta", "Compra", "Stock" }));
        cmbbxOrdenarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxOrdenarPorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText(" Ordenar Por");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(cmbbxOrdenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(labelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelIcon1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbbxOrdenarPor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );
    }//GEN-END:initComponents

    public PanelProductos() {
        try
        {
            initComponents();
            actualizarTablaProductos();
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed

        try
        {
            DialogProductosGuardar f = new DialogProductosGuardar(VentanaLogin.ventana, true);
            f.setVisible(true);
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        try
        {

            int idSeleccionau = VentanaLogin.ventana.obtenerIdSeleccionado(this.tablaProductos);

            if (idSeleccionau == -1)
            {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un registro!");
            } else
            {

                DialogProductosModificar f = new DialogProductosModificar(VentanaLogin.ventana, true);

                f.setVisible(true);
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(this.tablaProductos.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(null, "Debes seleccinar un registro! ");
        }
        else
        {
            DialogProductosEliminar f = new DialogProductosEliminar(VentanaLogin.ventana, true);
            f.setVisible(true);
        }
            
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        try
        {
            this.actualizarTablaProductos();
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void cmbbxOrdenarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxOrdenarPorActionPerformed
        try
        {
            this.actualizarTablaProductos();
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbbxOrdenarPorActionPerformed

    public String getOrdenarPor(String cadena) {
        switch (cadena)
        {
            case "Codigo":
                return "productos.id";
            case "Proveedor":
                return "proveedores.nombre_compania";
            case "Categoria":
                return "categoria.nombre";
            case "Producto":
                return "productos.nombre";
            case "Medida":
                return "productos.medida";
            case "Venta":
                return "productos.precio_venta";
            case "Compra":
                return "productos.precio_compra";
            case "Stock":
                return "productos.stock";
        }
        return "";
    }

    public void actualizarTablaProductos() throws SQLException, ClassNotFoundException {
        if (this.txtBuscar.getText().equals(""))
        {
            String ordenarPor = this.getOrdenarPor((String) this.cmbbxOrdenarPor.getSelectedItem());
            ArrayList<Object[]> lista = Seleccion.seleccionarProductosOrdenarPor(ordenarPor);
            String[] columnas =
            {
                "ID", "Proveedor", "Categoria", "Producto", "Medida", "Venta", "Compra", "Stock"
            };
            DefaultTableModel modeloUsuario = new DefaultTableModel(new Object[][]
            {
            }, columnas);
            for (Object[] e : lista)
            {
                modeloUsuario.addRow(e);
            }
            this.tablaProductos.setModel(modeloUsuario);
        } else
        {
            String ordenarPor = this.getOrdenarPor((String) this.cmbbxOrdenarPor.getSelectedItem());
            String filtro = this.txtBuscar.getText();
            ArrayList<Object[]> lista = Seleccion.seleccionarProductosLike(filtro,ordenarPor);
            String[] columnas =
            {
                "ID", "Proveedor", "Categoria", "Producto", "Medida", "Venta", "Compra", "Stock"
            };
            DefaultTableModel modeloUsuario = new DefaultTableModel(new Object[][]
            {
            }, columnas);
            for (Object[] e : lista)
            {
                modeloUsuario.addRow(e);
            }
            this.tablaProductos.setModel(modeloUsuario);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape BtnNuevo;
    public RSMaterialComponent.RSButtonShape btnEliminar;
    public RSMaterialComponent.RSButtonShape btnModificar;
    public RSMaterialComponent.RSComboBoxMaterial cmbbxOrdenarPor;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public necesario.LabelIcon labelIcon1;
    public javax.swing.JLabel lblImage;
    public javax.swing.JLabel lblRol;
    public javax.swing.JLabel lblUser;
    public RSMaterialComponent.RSTableMetroCustom tablaProductos;
    public RSMaterialComponent.RSTextFieldMaterial txtBuscar;
    // End of variables declaration//GEN-END:variables
}
