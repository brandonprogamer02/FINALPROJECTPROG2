package clientes;

import administracion.DialogAdministracionModificarUsuario;
import basedatos.Seleccion;
import productos.*;
import java.awt.Point;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import login.*;

public class PanelClientes extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnNuevo = new RSMaterialComponent.RSButtonShape();
        btnModificar = new RSMaterialComponent.RSButtonShape();
        btnEliminar = new RSMaterialComponent.RSButtonShape();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new RSMaterialComponent.RSTableMetroCustom();
        txtBuscar = new RSMaterialComponent.RSTextFieldMaterial();
        labelIcon1 = new necesario.LabelIcon();
        cmbbxOrdenarPor = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(876, 408));
        setMinimumSize(new java.awt.Dimension(876, 408));
        setPreferredSize(new java.awt.Dimension(876, 408));

        jPanel1.setBackground(new java.awt.Color(81, 111, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblImage.setBackground(new java.awt.Color(81, 111, 244));
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes/client.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENTES");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes/person.png"))); // NOI18N

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
                .addGap(131, 131, 131)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(lblRol)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRol))
                .addContainerGap())
        );

        btnNuevo.setBackground(new java.awt.Color(81, 111, 244));
        btnNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevo.setText("Nuevo Cliente");
        btnNuevo.setFocusPainted(false);
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevo.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
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

        tablaClientes.setForeground(new java.awt.Color(81, 111, 244));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, "Harley Cooper", "Brandon Fernandez", null, null, null, null},
                {"3", "Carnicerias San Pedro S.A", "Carne", "libra", "Carne magra cerdo", "100", "40"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, "", null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Correo", "Ciudad", "Sector", "Calle", "Numero "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setBackgoundHead(new java.awt.Color(81, 111, 244));
        tablaClientes.setBackgoundHover(new java.awt.Color(255, 255, 255));
        tablaClientes.setColorBorderHead(new java.awt.Color(255, 255, 255));
        tablaClientes.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaClientes.setColorPrimaryText(new java.awt.Color(81, 111, 244));
        tablaClientes.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaClientes.setColorSecundaryText(new java.awt.Color(81, 111, 244));
        tablaClientes.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tablaClientes.setFontHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaClientes.setFontRowHover(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaClientes.setFontRowSelect(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaClientes.setGridColor(new java.awt.Color(81, 111, 244));
        tablaClientes.setRowHeight(30);
        tablaClientes.setSelectionBackground(new java.awt.Color(139, 159, 247));
        tablaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaClientes.setShowGrid(true);
        jScrollPane1.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setPreferredWidth(3);
            tablaClientes.getColumnModel().getColumn(1).setPreferredWidth(13);
            tablaClientes.getColumnModel().getColumn(3).setPreferredWidth(4);
            tablaClientes.getColumnModel().getColumn(5).setPreferredWidth(3);
            tablaClientes.getColumnModel().getColumn(6).setPreferredWidth(5);
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
        cmbbxOrdenarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Codigo", "Nombre", "Correo", "Ciudad", "Sector", "Calle", "Numero" }));
        cmbbxOrdenarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxOrdenarPorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText(" Ordenar Por");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbbxOrdenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbbxOrdenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );
    }//GEN-END:initComponents

    public PanelClientes() throws SQLException, ClassNotFoundException {
        initComponents();
        actualizarTablaClientes();

    }

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        DialogClientesGuardar f = new DialogClientesGuardar(VentanaLogin.ventana, true);
        f.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        int idSeleccionado = VentanaLogin.ventana.obtenerIdSeleccionado(this.tablaClientes);
        if (idSeleccionado == -1)
        {
            JOptionPane.showMessageDialog(null, "Debes Seleccionar un registro de la tabla");

        } else
        {
            try
            {
                DialogClientesModificar f = new DialogClientesModificar(VentanaLogin.ventana, true);
                f.setVisible(true);
            } catch (SQLException ex)
            {
                Logger.getLogger(PanelClientes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(PanelClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnModificarActionPerformed
    public String getOrdenarPor(String cadena) {
        switch (cadena)
        {
            case "Codigo":
                return "id";
            case "Nombre":
                return "nombre";
            case "Correo":
                return "correo";
            case "Ciudad":
                return "ciudad";
            case "Sector":
                return "sector";
            case "Calle":
                return "calle";
            case "Numero":
                return "numero_celular";
        }
        return "";
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (this.tablaClientes.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente!");
        } else
        {
            DialogClientesEliminar f = new DialogClientesEliminar(VentanaLogin.ventana, true);
            f.setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        try
        {
            this.actualizarTablaClientes();
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void cmbbxOrdenarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxOrdenarPorActionPerformed
        try
        {
            System.out.println("ENTRO CABRONES");
            this.actualizarTablaClientes();
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbbxOrdenarPorActionPerformed
    public void actualizarTablaClientes() throws SQLException, ClassNotFoundException {
        
        if (this.txtBuscar.getText().equals(""))
        {
            System.out.println("llego gente");
            String buscarPor = this.getOrdenarPor((String) this.cmbbxOrdenarPor.getSelectedItem());

            ArrayList<Object[]> lista = Seleccion.seleccionarClientesOrdenarPor(buscarPor);
            String[] columnas =
            {
                "ID", "Nombre", "Correo", "Ciudad", "Sector", "Calle", "Numero"
            };
            DefaultTableModel modeloClientes = new DefaultTableModel(new Object[][]
            
            {
            }, columnas);
            //modeloClientes.addRow(new Object[]{"3","f","f","f","f","f","f"});
            for (Object[] e : lista)
            {
                
                modeloClientes.addRow(e);
            }
            this.tablaClientes.setModel(modeloClientes);
        } else
        {
            System.out.println("VEINTE DISCO DE PLATINO POR LA REAL CERTIFICAU");
            String caracter = this.txtBuscar.getText();
            System.out.println("llego gente");
            String buscarPor = this.getOrdenarPor((String) this.cmbbxOrdenarPor.getSelectedItem());

            ArrayList<Object[]> lista = Seleccion.seleccionarClientesLike(caracter,buscarPor);
            String[] columnas =
            {
                "ID", "Nombre", "Correo", "Ciudad", "Sector", "Calle", "Numero"
            };
            DefaultTableModel modeloClientes = new DefaultTableModel(new Object[][]
            
            {
            }, columnas);
            
            for (Object[] e : lista)
            {
                
                modeloClientes.addRow(e);
            }
            this.tablaClientes.setModel(modeloClientes);
            
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape btnEliminar;
    public RSMaterialComponent.RSButtonShape btnModificar;
    public RSMaterialComponent.RSButtonShape btnNuevo;
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
    public RSMaterialComponent.RSTableMetroCustom tablaClientes;
    public RSMaterialComponent.RSTextFieldMaterial txtBuscar;
    // End of variables declaration//GEN-END:variables
}
