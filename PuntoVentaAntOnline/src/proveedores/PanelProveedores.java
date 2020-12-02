package proveedores;

import basedatos.Seleccion;
import productos.*;
import java.awt.Point;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.*;

public class PanelProveedores extends javax.swing.JPanel {

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
        tablaProveedores = new RSMaterialComponent.RSTableMetroCustom();
        txtBuscar = new RSMaterialComponent.RSTextFieldMaterial();
        labelIcon1 = new necesario.LabelIcon();
        cmbbxOrdenarPor = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(876, 408));
        setMinimumSize(new java.awt.Dimension(876, 408));

        jPanel1.setBackground(new java.awt.Color(81, 111, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblImage.setBackground(new java.awt.Color(81, 111, 244));
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedores/supplier.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROVEEDORES");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnNuevo.setBackground(new java.awt.Color(81, 111, 244));
        BtnNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo.setText("Nuevo Proveedor");
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

        tablaProveedores.setForeground(new java.awt.Color(81, 111, 244));
        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProveedores.setBackgoundHead(new java.awt.Color(81, 111, 244));
        tablaProveedores.setBackgoundHover(new java.awt.Color(255, 255, 255));
        tablaProveedores.setColorBorderHead(new java.awt.Color(255, 255, 255));
        tablaProveedores.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaProveedores.setColorPrimaryText(new java.awt.Color(81, 111, 244));
        tablaProveedores.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaProveedores.setColorSecundaryText(new java.awt.Color(81, 111, 244));
        tablaProveedores.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tablaProveedores.setFontHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaProveedores.setFontRowHover(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaProveedores.setFontRowSelect(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaProveedores.setGridColor(new java.awt.Color(81, 111, 244));
        tablaProveedores.setRowHeight(30);
        tablaProveedores.setSelectionBackground(new java.awt.Color(139, 159, 247));
        tablaProveedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProveedores.setShowGrid(true);
        jScrollPane1.setViewportView(tablaProveedores);
        if (tablaProveedores.getColumnModel().getColumnCount() > 0) {
            tablaProveedores.getColumnModel().getColumn(0).setPreferredWidth(3);
            tablaProveedores.getColumnModel().getColumn(1).setPreferredWidth(13);
            tablaProveedores.getColumnModel().getColumn(3).setPreferredWidth(4);
            tablaProveedores.getColumnModel().getColumn(5).setPreferredWidth(3);
            tablaProveedores.getColumnModel().getColumn(6).setPreferredWidth(3);
            tablaProveedores.getColumnModel().getColumn(7).setPreferredWidth(3);
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
        cmbbxOrdenarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nombre Contacto", "Nombre Compania", "Ciudad", "Sector", "Calle", "Numero Identificativo" }));
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbbxOrdenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelIcon1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cmbbxOrdenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );
    }//GEN-END:initComponents

    public PanelProveedores() throws SQLException, ClassNotFoundException {
        initComponents();
        actualizarTablaProveedores();

    }

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed

        DialogProveedoresGuardar f = new DialogProveedoresGuardar(VentanaLogin.ventana, true);
        f.setVisible(true);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        PanelProveedores f = (PanelProveedores) VentanaLogin.ventana.getPanelActual();
        int idSeleccionau = VentanaLogin.ventana.obtenerIdSeleccionado(f.tablaProveedores);
        if (idSeleccionau == -1)
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un registro!");
        } else
        {
            try
            {
                DialogProveedoresModificar f2 = new DialogProveedoresModificar(VentanaLogin.ventana, true);
                f2.setVisible(true);
            } catch (SQLException ex)
            {
                Logger.getLogger(PanelProveedores.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(PanelProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(this.tablaProveedores.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un proveedor");
        }else{
        DialogProveedoresEliminar f = new DialogProveedoresEliminar(VentanaLogin.ventana, true);
        f.setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        try
        {
            this.actualizarTablaProveedores();
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelProveedores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void cmbbxOrdenarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxOrdenarPorActionPerformed
        try
        {
            this.actualizarTablaProveedores();
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelProveedores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbbxOrdenarPorActionPerformed
    public void actualizarTablaProveedores() throws SQLException, ClassNotFoundException {
        if (this.txtBuscar.getText().equals(""))
        {
            String ordenarPor = this.getOrdenarPor((String) this.cmbbxOrdenarPor.getSelectedItem());
            ArrayList<Object[]> lista = Seleccion.seleccionarProveedoresOrdenarPor(ordenarPor);
            String[] columnas =
            {
                "ID", "Nombre", "Compañia", "Ciudad", "Sector", "Calle", "Num Identificador"
            };
            DefaultTableModel modeloUsuario = new DefaultTableModel(new Object[][]
            {
            }, columnas);
            for (Object[] e : lista)
            {
                modeloUsuario.addRow(e);
            }
            this.tablaProveedores.setModel(modeloUsuario);
        }
        else
        {
            
            String ordenarPor = this.getOrdenarPor((String) this.cmbbxOrdenarPor.getSelectedItem());
            String caracter = this.txtBuscar.getText();
            ArrayList<Object[]> lista = Seleccion.seleccionarProveedoresLike(caracter,ordenarPor);
            String[] columnas =
            {
                "ID", "Nombre", "Compañia", "Ciudad", "Sector", "Calle", "Num Identificador"
            };
            DefaultTableModel modeloUsuario = new DefaultTableModel(new Object[][]
            {
            }, columnas);
            for (Object[] e : lista)
            {
                modeloUsuario.addRow(e);
            }
            this.tablaProveedores.setModel(modeloUsuario);
            
        }

    }

    public String getOrdenarPor(String cadena) {
        switch (cadena)
        {
            case "ID":
                return "id";
            case "Nombre Contacto":
                return "nombre_contacto";
            case "Nombre Compania":
                return "nombre_compania";
            case "Ciudad":
                return "ciudad";
            case "Sector":
                return "sector";
            case "Calle":
                return "calle";
            case "Numero Identificativo":
                return "numero_identificativo";
        }
        return "";
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
    public RSMaterialComponent.RSTableMetroCustom tablaProveedores;
    public RSMaterialComponent.RSTextFieldMaterial txtBuscar;
    // End of variables declaration//GEN-END:variables
}
