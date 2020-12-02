package administracion;

import RSMaterialComponent.RSTableMetroCustom;
import basedatos.Insercion;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JPopupMenu;
import login.VentanaLogin;
import basedatos.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelAdministracion extends javax.swing.JPanel {

    public ButtonGroup reportes = new ButtonGroup();
    public JPopupMenu popu;

    public PanelAdministracion() throws SQLException, ClassNotFoundException {
        initComponents();
        popu = new JPopupMenu();
        actualizarTablaCategoria();
        crearCarpetaReportes();
        this.checkCompra.setActionCommand("compra");
        this.checkVenta.setActionCommand("venta");
        
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        tabbledPane = new javax.swing.JTabbedPane();
        PanelCategoria = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCategoria = new RSMaterialComponent.RSTableMetroCustom();
        btnCatModificar = new RSMaterialComponent.RSButtonShape();
        btnCatAgregar = new RSMaterialComponent.RSButtonShape();
        btnCatEliminar = new RSMaterialComponent.RSButtonShape();
        txtCatCategoria = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel8 = new javax.swing.JLabel();
        PanelUsuario = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuario = new RSMaterialComponent.RSTableMetroCustom();
        btnUsuarioAgregar = new RSMaterialComponent.RSButtonShape();
        btnUsuarioModificar = new RSMaterialComponent.RSButtonShape();
        btnUsuarioEliminar = new RSMaterialComponent.RSButtonShape();
        txtBuscar = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel9 = new javax.swing.JLabel();
        PanelReportes = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rSButtonShape6 = new RSMaterialComponent.RSButtonShape();
        txtDesde = new RSMaterialComponent.RSTextFieldMaterial();
        txtHasta = new RSMaterialComponent.RSTextFieldMaterial();
        btnDesde = new RSMaterialComponent.RSButtonShape();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGenerarReporte = new RSMaterialComponent.RSButtonShape();
        btnHasta = new RSMaterialComponent.RSButtonShape();
        checkCompra = new RSMaterialComponent.RSCheckBoxMaterial();
        checkVenta = new RSMaterialComponent.RSCheckBoxMaterial();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(876, 408));
        setMinimumSize(new java.awt.Dimension(876, 408));
        setPreferredSize(new java.awt.Dimension(876, 408));

        jPanel1.setBackground(new java.awt.Color(81, 111, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(834, 68));

        lblImage.setBackground(new java.awt.Color(81, 111, 244));
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion/settings.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRACION");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion/person.png"))); // NOI18N

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
                .addGap(76, 76, 76)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRol)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRol)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbledPane.setForeground(new java.awt.Color(81, 111, 244));
        tabbledPane.setFocusCycleRoot(true);
        tabbledPane.setFocusable(false);
        tabbledPane.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        PanelCategoria.setBackground(new java.awt.Color(255, 255, 255));
        PanelCategoria.setFocusCycleRoot(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 111, 244), 2));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        tablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCategoria.setBackgoundHead(new java.awt.Color(81, 111, 244));
        tablaCategoria.setBackgoundHover(new java.awt.Color(81, 111, 244));
        tablaCategoria.setBorderHead(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(43, 80, 241)));
        tablaCategoria.setBorderRows(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(43, 80, 241)));
        tablaCategoria.setColorBorderRows(new java.awt.Color(43, 80, 241));
        tablaCategoria.setColorPrimaryText(new java.awt.Color(43, 80, 241));
        tablaCategoria.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaCategoria.setColorSecundaryText(new java.awt.Color(43, 80, 241));
        tablaCategoria.setGridColor(new java.awt.Color(43, 80, 241));
        tablaCategoria.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tablaCategoria.setShowGrid(true);
        jScrollPane1.setViewportView(tablaCategoria);

        jPanel5.add(jScrollPane1);

        btnCatModificar.setBackground(new java.awt.Color(81, 111, 244));
        btnCatModificar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        btnCatModificar.setText("Modificar");
        btnCatModificar.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnCatModificar.setFocusPainted(false);
        btnCatModificar.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnCatModificar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnCatModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCatModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatModificarActionPerformed(evt);
            }
        });

        btnCatAgregar.setBackground(new java.awt.Color(81, 111, 244));
        btnCatAgregar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        btnCatAgregar.setText("Agregar");
        btnCatAgregar.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnCatAgregar.setFocusPainted(false);
        btnCatAgregar.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnCatAgregar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnCatAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCatAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatAgregarActionPerformed(evt);
            }
        });

        btnCatEliminar.setBackground(new java.awt.Color(81, 111, 244));
        btnCatEliminar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        btnCatEliminar.setText("Eliminar");
        btnCatEliminar.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnCatEliminar.setFocusPainted(false);
        btnCatEliminar.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnCatEliminar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnCatEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCatEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatEliminarActionPerformed(evt);
            }
        });

        txtCatCategoria.setForeground(new java.awt.Color(81, 111, 244));
        txtCatCategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCatCategoria.setPlaceholder("Nombre de la Categoria");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion/backend.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCatModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCatAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCatEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(txtCatCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCatModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCatCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelCategoriaLayout = new javax.swing.GroupLayout(PanelCategoria);
        PanelCategoria.setLayout(PanelCategoriaLayout);
        PanelCategoriaLayout.setHorizontalGroup(
            PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategoriaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelCategoriaLayout.setVerticalGroup(
            PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbledPane.addTab(" Categoria", new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion/categoria.png")), PanelCategoria); // NOI18N

        PanelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        PanelUsuario.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 111, 244), 2));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Usuario", "Constraseña", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuario.setBackgoundHead(new java.awt.Color(81, 111, 244));
        tablaUsuario.setBackgoundHover(new java.awt.Color(81, 111, 244));
        tablaUsuario.setBorderHead(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(43, 80, 241)));
        tablaUsuario.setBorderRows(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(43, 80, 241)));
        tablaUsuario.setColorBorderRows(new java.awt.Color(43, 80, 241));
        tablaUsuario.setColorPrimaryText(new java.awt.Color(43, 80, 241));
        tablaUsuario.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaUsuario.setColorSecundaryText(new java.awt.Color(43, 80, 241));
        tablaUsuario.setGridColor(new java.awt.Color(43, 80, 241));
        tablaUsuario.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tablaUsuario.setShowGrid(true);
        jScrollPane2.setViewportView(tablaUsuario);

        jPanel8.add(jScrollPane2);

        btnUsuarioAgregar.setBackground(new java.awt.Color(81, 111, 244));
        btnUsuarioAgregar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        btnUsuarioAgregar.setText("Nuevo");
        btnUsuarioAgregar.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnUsuarioAgregar.setFocusPainted(false);
        btnUsuarioAgregar.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnUsuarioAgregar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnUsuarioAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUsuarioAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioAgregarActionPerformed(evt);
            }
        });

        btnUsuarioModificar.setBackground(new java.awt.Color(81, 111, 244));
        btnUsuarioModificar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        btnUsuarioModificar.setText("Modificar");
        btnUsuarioModificar.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnUsuarioModificar.setFocusPainted(false);
        btnUsuarioModificar.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnUsuarioModificar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnUsuarioModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUsuarioModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioModificarActionPerformed(evt);
            }
        });

        btnUsuarioEliminar.setBackground(new java.awt.Color(81, 111, 244));
        btnUsuarioEliminar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        btnUsuarioEliminar.setText("Borrar");
        btnUsuarioEliminar.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnUsuarioEliminar.setFocusPainted(false);
        btnUsuarioEliminar.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnUsuarioEliminar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnUsuarioEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUsuarioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioEliminarActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBuscar.setPlaceholder("Buscar");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("FILTRAR POR NOMBRE");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsuarioAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(btnUsuarioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUsuarioAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuarioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbledPane.addTab(" Usuarios", new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion/user.png")), PanelUsuario, ""); // NOI18N

        PanelReportes.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 111, 244), 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        rSButtonShape6.setBackground(new java.awt.Color(81, 111, 244));
        rSButtonShape6.setText("Generar Reporte");
        rSButtonShape6.setBackgroundHover(new java.awt.Color(81, 111, 244));
        rSButtonShape6.setFocusPainted(false);
        rSButtonShape6.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonShape6.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        rSButtonShape6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtDesde.setEditable(false);
        txtDesde.setForeground(new java.awt.Color(81, 111, 244));
        txtDesde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDesde.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDesde.setPlaceholder("Introduce fecha");

        txtHasta.setEditable(false);
        txtHasta.setForeground(new java.awt.Color(81, 111, 244));
        txtHasta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHasta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHasta.setPlaceholder("Introduce fecha");

        btnDesde.setBackground(new java.awt.Color(81, 111, 244));
        btnDesde.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        btnDesde.setText("...");
        btnDesde.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnDesde.setFocusPainted(false);
        btnDesde.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDesde.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnDesde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDesde.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnDesde.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnDesde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesdeMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Desde");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Hasta");

        btnGenerarReporte.setBackground(new java.awt.Color(81, 111, 244));
        btnGenerarReporte.setText("Generar");
        btnGenerarReporte.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnGenerarReporte.setFocusPainted(false);
        btnGenerarReporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerarReporte.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnGenerarReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        btnHasta.setBackground(new java.awt.Color(81, 111, 244));
        btnHasta.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null));
        btnHasta.setText("...");
        btnHasta.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnHasta.setFocusPainted(false);
        btnHasta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnHasta.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnHasta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHasta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnHasta.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnHasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHastaMouseClicked(evt);
            }
        });

        reportes.add(checkCompra);
        checkCompra.setForeground(new java.awt.Color(81, 111, 244));
        checkCompra.setText("Compra");
        checkCompra.setFocusPainted(false);
        checkCompra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        reportes.add(checkVenta);
        checkVenta.setForeground(new java.awt.Color(81, 111, 244));
        checkVenta.setText("Venta");
        checkVenta.setFocusPainted(false);
        checkVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSButtonShape6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(checkCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(checkVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButtonShape6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(btnHasta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(86, 86, 86))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelReportesLayout = new javax.swing.GroupLayout(PanelReportes);
        PanelReportes.setLayout(PanelReportesLayout);
        PanelReportesLayout.setHorizontalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelReportesLayout.setVerticalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReportesLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbledPane.addTab(" Reportes", new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion/reporte.png")), PanelReportes); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbledPane)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbledPane)
                .addGap(7, 7, 7))
        );
    }//GEN-END:initComponents

    private void btnUsuarioAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioAgregarActionPerformed

        DialogAdministracionAgregarUsuario f = new DialogAdministracionAgregarUsuario(VentanaLogin.ventana, true);
        f.setVisible(true);
    }//GEN-LAST:event_btnUsuarioAgregarActionPerformed

    private void btnUsuarioModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioModificarActionPerformed
        int idSeleccionado = VentanaLogin.ventana.obtenerIdSeleccionado(this.tablaUsuario);
        if (idSeleccionado == -1)
        {
            JOptionPane.showMessageDialog(null, "Debes Seleccionar un registro de la tabla");

        } else
        {

            DialogAdministracionModificarUsuario f = new DialogAdministracionModificarUsuario(VentanaLogin.ventana, true);
            f.setVisible(true);
        }
    }//GEN-LAST:event_btnUsuarioModificarActionPerformed

    private void btnUsuarioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioEliminarActionPerformed
        int idSeleccionado = VentanaLogin.ventana.obtenerIdSeleccionado(this.tablaUsuario);
        if (idSeleccionado == -1)
        {
            JOptionPane.showMessageDialog(null, "Debes Seleccionar un registro de la tabla");

        } else if (idSeleccionado == 1)
        {
            JOptionPane.showMessageDialog(null, "No puedes eliminar el usuario por default");
        } else
        {
            DialogAdministracionEliminarUsuario f = new DialogAdministracionEliminarUsuario(VentanaLogin.ventana, true);
            f.setVisible(true);
        }
    }//GEN-LAST:event_btnUsuarioEliminarActionPerformed

    private void btnDesdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesdeMouseClicked
        PanelCalendario calendario = null;
        try
        {
            calendario = new PanelCalendario("Fecha de Partida") {
                @Override
                public void setAccionBtnAceptar() {
                    Date fecha = this.calendario.getDate();
                    System.out.println("FECHA DE PARTIDA");
                    System.out.println(String.format("%s-%s-%s", this.getAno(), this.getMes(), this.getDia()));
                    txtDesde.setText(String.format("%s-%s-%s", this.getAno(), this.getMes(), this.getDia()));

                }
            };
        } catch (NullPointerException e)
        {

        }

        popu.add(calendario);
        popu.setLocation(evt.getLocationOnScreen());
        popu.setVisible(true);
    }//GEN-LAST:event_btnDesdeMouseClicked

    private void btnHastaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHastaMouseClicked
        PanelCalendario calendario = null;
        try
        {
            calendario = new PanelCalendario("Fecha de Fin") {
                @Override
                public void setAccionBtnAceptar() {
                    Date fecha = this.calendario.getDate();
                    System.out.println("FECHA DE FIN");
                    System.out.println(String.format("%s-%s-%s", this.getAno(), this.getMes(), this.getDia()));
                    txtHasta.setText(String.format("%s-%s-%s", this.getAno(), this.getMes(), this.getDia()));
                }
            };
        } catch (NullPointerException e)
        {

        }
        popu.add(calendario);
        popu.setLocation(evt.getLocationOnScreen());
        popu.setVisible(true);
    }//GEN-LAST:event_btnHastaMouseClicked

    private void btnCatAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatAgregarActionPerformed
        String data = this.txtCatCategoria.getText();
        try
        {
            Insercion.insertarCategoria(data);
            actualizarTablaCategoria();
            this.txtCatCategoria.setText("");
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCatAgregarActionPerformed

    private void btnCatModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatModificarActionPerformed
        try
        {
            if (VentanaLogin.ventana.obtenerIdSeleccionado(this.tablaCategoria) != -1)
            {
                Actualizacion.actualizarCategoria(this.txtCatCategoria.getText(), VentanaLogin.ventana.obtenerIdSeleccionado(this.tablaCategoria));
                this.txtCatCategoria.setText("");
                actualizarTablaCategoria();

            }
            else
            {
                JOptionPane.showMessageDialog(null, "No Has seleccionado Ningun registro!");
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCatModificarActionPerformed

    private void btnCatEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatEliminarActionPerformed
        try
        {
            if (VentanaLogin.ventana.obtenerIdSeleccionado(this.tablaCategoria) != -1)
            {
                
                Eliminacion.eliminarCategoria(VentanaLogin.ventana.obtenerIdSeleccionado(this.tablaCategoria));
                this.txtCatCategoria.setText("");
                actualizarTablaCategoria();
            } else
            {
                JOptionPane.showMessageDialog(null, "No Has seleccionado Ningun registro!");
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCatEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        try
        {
            this.actualizarTablaUsuario();
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        try
        {

            String desdedb = this.txtDesde.getText();
            String hastadb = this.txtHasta.getText();
            if (desdedb.equals("") || hastadb.equals(""))
            {
                JOptionPane.showMessageDialog(null, "No puedes dejar los las fechas vacias");
            } else
            {
                String desdedb2 = this.changeCharInPosition(0, '3', desdedb);
                String desdedb3 = this.changeCharInPosition(1, '9', desdedb2);

                String hastadb2 = this.changeCharInPosition(0, '3', hastadb);
                String hastadb3 = this.changeCharInPosition(1, '9', hastadb2);
                if (this.reportes.getSelection().getActionCommand().equals("venta"))
                {
                    this.generarReporte(desdedb3, hastadb3, "venta");
                } else if (this.reportes.getSelection().getActionCommand().equals("compra"))
                {
                    this.generarReporte(desdedb3, hastadb3, "compra");
                }

            }

        } catch (NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null, "Debes elegir si es de compra o venta");
            //Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex)
        {
            Logger.getLogger(PanelAdministracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarReporteActionPerformed
    public void actualizarTablaCategoria() throws SQLException, ClassNotFoundException {
        ArrayList<Object[]> lista = Seleccion.SeleccionarTodoCategoria();
        String[] columnas =
        {
            "ID", "Nombre"
        };
        DefaultTableModel modeloCategoria = new DefaultTableModel(new Object[][]
        {
        }, columnas);
        for (Object[] e : lista)
        {
            modeloCategoria.addRow(e);
        }
        this.tablaCategoria.setModel(modeloCategoria);
    }

    public void actualizarTablaUsuario() throws SQLException, ClassNotFoundException {
        if (this.txtBuscar.getText().equals(""))
        {
            ArrayList<Object[]> lista = Seleccion.SeleccionarUsuario();
            String[] columnas =
            {
                "ID", "Nombre", "Usuario", "Contrasena", "Rol"
            };
            DefaultTableModel modeloUsuario = new DefaultTableModel(new Object[][]
            {
            }, columnas);
            for (Object[] e : lista)
            {
                modeloUsuario.addRow(e);
            }
            this.tablaUsuario.setModel(modeloUsuario);

        } else
        {
            String filtro = this.txtBuscar.getText();
            ArrayList<Object[]> lista = Seleccion.SeleccionarUsuarioLike(filtro);
            String[] columnas =
            {
                "ID", "Nombre", "Usuario", "Contrasena", "Rol"
            };
            DefaultTableModel modeloUsuario = new DefaultTableModel(new Object[][]
            {
            }, columnas);
            for (Object[] e : lista)
            {
                modeloUsuario.addRow(e);
            }
            this.tablaUsuario.setModel(modeloUsuario);

        }
    }

    public void generarReporte(String desdedb3, String hastadb3, String tabla) throws DocumentException, SQLException, FileNotFoundException, ClassNotFoundException {
        crearCarpetaReportes();
        if (tabla.equals("venta"))
        {
            this.reporteVenta(desdedb3, hastadb3, tabla);

            //----------------------------------------------------------------------
        } else if (tabla.equals("compra"))
        {
            this.reporteCompra(desdedb3, hastadb3, tabla);
        }

    }

    public void reporteCompra(String desdedb3, String hastadb3, String tabla)
            throws FileNotFoundException, DocumentException, SQLException, ClassNotFoundException {
        Document documento = new Document();
        String hasta = this.txtHasta.getText();
        String desde = this.txtDesde.getText();
        System.out.println("Fecha es:" + desdedb3 + "," + hastadb3);

        String ruta2 = "reportes_generados/reporte_compra_" + desde + " - " + hasta + ".pdf";
        File ruta = new File(ruta2);
        PdfWriter.getInstance(documento, new FileOutputStream(ruta));
        Paragraph parrafos = new Paragraph();
        parrafos.setAlignment(Paragraph.ALIGN_CENTER);
        parrafos.setFont(FontFactory.getFont("Segoe UI", 18, Font.BOLD, BaseColor.DARK_GRAY));
        parrafos.add("Brandon Soft Technology\n");
        parrafos.setFont(FontFactory.getFont("Segoe UI", 16, Font.BOLD, BaseColor.DARK_GRAY));
        parrafos.add("Reporte de Compra\n\n");
        parrafos.setFont(FontFactory.getFont("Segoe UI", 15, Font.BOLD, BaseColor.DARK_GRAY));
        parrafos.add(desde + "  -  " + hasta + "\n\n\n");

        documento.open();
        documento.add(parrafos);
        Connection cnx = Conexion.obtenerConexion();
        String query1 = "SELECT \n"
                + "compra.id , usuario.nombre as usuario , proveedores.nombre_compania , compra.total , \n"
                + "compra.metodo_envio , compra.fecha , compra.estado , compra.cantidad_pago\n"
                + "FROM compra\n"
                + "LEFT JOIN usuario on usuario.id = compra.id_usuario\n"
                + "LEFT JOIN proveedores on proveedores.id = compra.id_proveedor\n"
                + " WHERE DATE(fecha) BETWEEN '" + desdedb3 + "' and '" + hastadb3 + "'";

        PreparedStatement st1 = (PreparedStatement) cnx.prepareStatement(query1);
        ResultSet rs1 = st1.executeQuery();
        while (rs1.next())
        {
            PdfPTable tabla1 = new PdfPTable(8);
            tabla1.setHorizontalAlignment(PdfPTable.ALIGN_CENTER);
            float[] columnWidths1 = new float[]
            {
                8f, 30f, 30f, 15f, 16f, 16f, 20f, 16f
            };
            tabla1.setWidths(columnWidths1);
            tabla1.setWidthPercentage(110);
            tabla1.setWidthPercentage(110);
            tabla1.addCell("ID");
            tabla1.addCell("USUARIO");
            tabla1.addCell("PROVEEDOR");
            tabla1.addCell("TOTAL");
            tabla1.addCell("METODO ENVIO");
            tabla1.addCell("FECHA");
            tabla1.addCell("ESTADO");
            tabla1.addCell("CANTIDAD PAGO");
            tabla1.addCell(String.valueOf(rs1.getInt("id")));
            System.out.println("1 - " + rs1.getString("id"));
            tabla1.addCell(rs1.getString("usuario"));
            System.out.println("2 - " + rs1.getString("usuario"));
            tabla1.addCell(rs1.getString("nombre_compania"));
            System.out.println("3 - " + rs1.getString("nombre_compania"));
            tabla1.addCell(rs1.getString("total"));
            System.out.println("4 - " + rs1.getString("total"));
            tabla1.addCell(rs1.getString("metodo_envio"));
            System.out.println("5 - " + rs1.getString("metodo_envio"));

            String fecha = this.changeCharInPosition(0, '2', rs1.getString("fecha"));
            fecha = this.changeCharInPosition(1, '0', fecha);
            tabla1.addCell(fecha);
            System.out.println("6 - " + rs1.getString("fecha"));
            tabla1.addCell(rs1.getString("estado"));
            System.out.println("7 - " + rs1.getString("estado"));
            tabla1.addCell(rs1.getString("cantidad_pago"));
            System.out.println("8 - " + rs1.getString("cantidad_pago"));

            System.out.println("--------------------------------------");
            // ingresar detalle compra
            PdfPTable tabla2 = new PdfPTable(5);
            tabla2.setHorizontalAlignment(PdfPTable.ALIGN_CENTER);
            float[] columnWidths2 = new float[]
            {
                8f, 30f, 30f, 15f, 16f
            };
            tabla2.setWidths(columnWidths2);
            tabla2.setWidthPercentage(110);

            String query2 = "SELECT id_compra, productos.nombre as producto, detalle_compra.precio_venta,\n"
                    + "detalle_compra.precio_compra, detalle_compra.cantidad FROM detalle_compra \n"
                    + "LEFT JOIN productos on productos.id = detalle_compra.id_producto\n"
                    + "WHERE detalle_compra.id_compra = " + rs1.getInt("id");

            PreparedStatement st2 = (PreparedStatement) cnx.prepareStatement(query2);
            ResultSet rs2 = st2.executeQuery();

            tabla2.addCell("ID");
            tabla2.addCell("Producto");
            tabla2.addCell("$ Venta");
            tabla2.addCell("$ Compra");
            tabla2.addCell("Cantidad");
            while (rs2.next())
            {
                tabla2.addCell(String.valueOf(rs2.getInt("id_compra")));
                tabla2.addCell(rs2.getString("producto"));
                tabla2.addCell(String.valueOf(rs2.getInt("precio_venta")));
                tabla2.addCell(String.valueOf(rs2.getInt("precio_compra")));
                tabla2.addCell(String.valueOf(rs2.getInt("cantidad")));
            }

            documento.add(tabla1);
            documento.add(tabla2);
        }

        documento.close();
        JOptionPane.showMessageDialog(null, "Reporte de compra generau");
    }

    public void reporteVenta(String desdedb3, String hastadb3, String tabla)
            throws FileNotFoundException, DocumentException, SQLException, ClassNotFoundException {

        Document documento = new Document();
        String hasta = this.txtHasta.getText();
        String desde = this.txtDesde.getText();
        System.out.println("Fecha es:" + desdedb3 + "," + hastadb3);

        String ruta2 = "reportes_generados/reporte_venta_" + desde + " - " + hasta + ".pdf";
        File ruta = new File(ruta2);
        PdfWriter.getInstance(documento, new FileOutputStream(ruta));
        Paragraph parrafos = new Paragraph();
        parrafos.setAlignment(Paragraph.ALIGN_CENTER);
        parrafos.setFont(FontFactory.getFont("Segoe UI", 18, Font.BOLD, BaseColor.DARK_GRAY));
        parrafos.add("Brandon Soft Technology\n");
        parrafos.setFont(FontFactory.getFont("Segoe UI", 16, Font.BOLD, BaseColor.DARK_GRAY));
        parrafos.add("Reporte de Venta\n\n");
        parrafos.setFont(FontFactory.getFont("Segoe UI", 15, Font.BOLD, BaseColor.DARK_GRAY));
        parrafos.add(desde + "  -  " + hasta + "\n\n\n");

        documento.open();
        documento.add(parrafos);
        //

        Connection cnx = Conexion.obtenerConexion();
        String queryVenta = "SELECT venta.id,usuario.nombre AS usuario,clientes.nombre AS cliente ,\n"
                + "        venta.fecha,venta.pago_cliente,venta.devuelta,venta.descuento,venta.total,\n"
                + "        venta.estado\n"
                + "        FROM venta\n"
                + "        LEFT JOIN usuario on usuario.id = venta.id_usuario\n"
                + "        LEFT JOIN clientes on clientes.id = venta.id_cliente\n"
                + "        WHERE DATE(fecha) BETWEEN '" + desdedb3 + "' and '" + hastadb3 + "'";

        PreparedStatement st = (PreparedStatement) cnx.prepareStatement(queryVenta);

        ResultSet rs = st.executeQuery();
        while (rs.next())
        {
            PdfPTable tabla1 = new PdfPTable(9);
            tabla1.setHorizontalAlignment(PdfPTable.ALIGN_CENTER);
            float[] columnWidths1 = new float[]
            {
                8f, 30f, 30f, 15f, 16f, 16f, 20f, 16, 23f
            };
            tabla1.setWidths(columnWidths1);
            tabla1.setWidthPercentage(110);

            tabla1.addCell("ID");
            tabla1.addCell("USUARIO");
            tabla1.addCell("CLIENTE");
            tabla1.addCell("FECHA");
            tabla1.addCell("PAGO CLIENTE");
            tabla1.addCell("DEVUELTA");
            tabla1.addCell("DESCUENTO");
            tabla1.addCell("TOTAL");
            tabla1.addCell("ESTADO");
            tabla1.addCell("\n" + String.valueOf(rs.getInt("id")));
            tabla1.addCell(rs.getString("usuario"));

            tabla1.addCell(rs.getString("cliente"));

            String fecha = this.changeCharInPosition(0, '2', rs.getString("fecha"));
            fecha = this.changeCharInPosition(1, '0', fecha);
            tabla1.addCell(fecha);

            tabla1.addCell(rs.getString("pago_cliente"));

            tabla1.addCell(rs.getString("devuelta"));

            tabla1.addCell(rs.getString("descuento"));

            tabla1.addCell(rs.getString("total"));

            tabla1.addCell(rs.getString("estado"));

            System.out.println("--------------------------------------");
            // anadiendo detalle venta

            PdfPTable tablaDetalleVenta = new PdfPTable(3);
            tablaDetalleVenta.setHorizontalAlignment(PdfPTable.ALIGN_CENTER);
            float[] columnWidthsDetalleVenta = new float[]
            {
                8f, 30f, 30f
            };
            tablaDetalleVenta.setWidths(columnWidthsDetalleVenta);
            tablaDetalleVenta.setWidthPercentage(110);
            String queryDetalleVenta = "SELECT id_venta,productos.nombre as producto,cantidad FROM detalle_venta\n"
                    + "LEFT JOIN productos on productos.id = detalle_venta.id_producto\n "
                    + "WHERE id_venta = " + rs.getInt("id");
            PreparedStatement st2 = (PreparedStatement) cnx.prepareStatement(queryDetalleVenta);
            ResultSet rs2 = st2.executeQuery();

            while (rs2.next())
            {
                tablaDetalleVenta.addCell(String.valueOf(rs2.getInt("id_venta")));
                tablaDetalleVenta.addCell(rs2.getString("producto"));
                tablaDetalleVenta.addCell("Cantidad:  " + String.valueOf(rs2.getInt("cantidad")));
            }
            documento.add(tabla1);
            documento.add(tablaDetalleVenta);

        }

        documento.close();
        JOptionPane.showMessageDialog(null, "Reporte de venta generau");

    }

    public static void crearCarpetaReportes() {
        File directorio = new File("reportes_generados");
        if (!directorio.exists())
        {
            System.out.println("Directorio no existe");
            if (directorio.mkdirs())
            {
                System.out.println("Directorio creado");
            } else
            {
                System.out.println("Error al crear directorio");
                JOptionPane.showMessageDialog(null, "Error al crear la carpeta de los reportes\nIntenta moviendo la aplicacion a otra carpeta\nPues en la que estas actualmente no permite crear archivos !");
            }
        } else
        {
            System.out.println("Directorio ya existe");
        }
    }

    public String changeCharInPosition(int position, char ch, String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelCategoria;
    public javax.swing.JPanel PanelReportes;
    public javax.swing.JPanel PanelUsuario;
    public RSMaterialComponent.RSButtonShape btnCatAgregar;
    public RSMaterialComponent.RSButtonShape btnCatEliminar;
    public RSMaterialComponent.RSButtonShape btnCatModificar;
    public RSMaterialComponent.RSButtonShape btnDesde;
    public RSMaterialComponent.RSButtonShape btnGenerarReporte;
    public RSMaterialComponent.RSButtonShape btnHasta;
    public RSMaterialComponent.RSButtonShape btnUsuarioAgregar;
    public RSMaterialComponent.RSButtonShape btnUsuarioEliminar;
    public RSMaterialComponent.RSButtonShape btnUsuarioModificar;
    public RSMaterialComponent.RSCheckBoxMaterial checkCompra;
    public RSMaterialComponent.RSCheckBoxMaterial checkVenta;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel8;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblImage;
    public javax.swing.JLabel lblRol;
    public javax.swing.JLabel lblUser;
    public RSMaterialComponent.RSButtonShape rSButtonShape6;
    public javax.swing.JTabbedPane tabbledPane;
    public RSMaterialComponent.RSTableMetroCustom tablaCategoria;
    public RSMaterialComponent.RSTableMetroCustom tablaUsuario;
    public RSMaterialComponent.RSTextFieldMaterial txtBuscar;
    public RSMaterialComponent.RSTextFieldMaterial txtCatCategoria;
    public RSMaterialComponent.RSTextFieldMaterial txtDesde;
    public RSMaterialComponent.RSTextFieldMaterial txtHasta;
    // End of variables declaration//GEN-END:variables
}
