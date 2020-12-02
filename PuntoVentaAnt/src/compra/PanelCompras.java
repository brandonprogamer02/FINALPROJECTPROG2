package compra;

import basedatos.Conexion;
import basedatos.Eliminacion;
import basedatos.Insercion;
import basedatos.Seleccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.VentanaLogin;
import ventas.DialogCancelarVenta;
import ventas.DialogRealizarVenta;
import ventas.PanelVentas;

public class PanelCompras extends javax.swing.JPanel 
{

    public PanelCompras() throws SQLException, ClassNotFoundException {
        initComponents();
        //actualizarTablaDetalleCompras();
        

        // Introducir datos al ComboBox de proveedores
        this.rellenarProveedores();
        System.out.println("Brandon - 2");
        System.out.println(this.getIdProveedor("Brandon - 2"));
    }
    public void cancelarCompra()
    {
        try
        {
            String estadoUltimoRegistro = (String) Seleccion.seleccionarCompraUltimoRegistroEstado().get(0)[1];
            int idUltimoRegistro = (int) Seleccion.seleccionarCompraUltimoRegistroEstado().get(0)[0];
            if (estadoUltimoRegistro.equals("EN_PROCESO"))
            {
                DialogCancelarCompra f = new DialogCancelarCompra(VentanaLogin.ventana, true);
                f.setVisible(true);
            } else
            {
                JOptionPane.showMessageDialog(null, "No hay ninguna venta en proceso ha eliminar");
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void rellenarProveedores() throws SQLException, ClassNotFoundException 
    {
        this.txtProveedor.removeAllItems();
        ArrayList<Object[]> data = Seleccion.seleccionarProveedores();
        for (Object[] e : data)
        {
            String c = (String) e[2] + " - " + String.valueOf(e[0]);
            this.txtProveedor.addItem(c);

        }
    }
    

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleCompra = new RSMaterialComponent.RSTableMetroCustom();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new RSMaterialComponent.RSTextFieldMaterial();
        txtPrecioVenta = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioCompra = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel13 = new javax.swing.JLabel();
        txtCantidad = new RSMaterialComponent.RSTextFieldMaterial();
        txtNombre = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMetodoEnvio = new RSMaterialComponent.RSTextFieldMaterial();
        txtProveedor = new RSMaterialComponent.RSComboBoxMaterial();
        jPanel4 = new javax.swing.JPanel();
        btnEliminar = new RSMaterialComponent.RSButtonShape();
        btnAnadir = new RSMaterialComponent.RSButtonShape();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblTotal = new RSMaterialComponent.RSButtonShape();
        btnCancelarCompra = new RSMaterialComponent.RSButtonShape();
        jLabel11 = new javax.swing.JLabel();
        btnRealizarCompra = new RSMaterialComponent.RSButtonShape();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(876, 408));
        setMinimumSize(new java.awt.Dimension(876, 408));
        setPreferredSize(new java.awt.Dimension(876, 408));

        jPanel1.setBackground(new java.awt.Color(81, 111, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblImage.setBackground(new java.awt.Color(81, 111, 244));
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra/buy.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMPRA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/person.png"))); // NOI18N

        lblRol.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRol.setForeground(new java.awt.Color(255, 255, 255));
        lblRol.setText("ADMINISTRADOR");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("admin02");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(139, 139, 139)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRol)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuario))
                .addContainerGap())
        );

        tablaDetalleCompra.setForeground(new java.awt.Color(81, 111, 244));
        tablaDetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, "Harley Cooper", "Brandon Fernandez", null},
                {"3", "Carnicerias San Pedro S.A", "Carne", "libra"},
                {null, null, null, null},
                {null, null, null, null},
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDetalleCompra.setBackgoundHead(new java.awt.Color(81, 111, 244));
        tablaDetalleCompra.setBackgoundHover(new java.awt.Color(255, 255, 255));
        tablaDetalleCompra.setColorBorderHead(new java.awt.Color(255, 255, 255));
        tablaDetalleCompra.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaDetalleCompra.setColorPrimaryText(new java.awt.Color(81, 111, 244));
        tablaDetalleCompra.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaDetalleCompra.setColorSecundaryText(new java.awt.Color(81, 111, 244));
        tablaDetalleCompra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tablaDetalleCompra.setFontHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaDetalleCompra.setFontRowHover(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaDetalleCompra.setFontRowSelect(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaDetalleCompra.setGridColor(new java.awt.Color(81, 111, 244));
        tablaDetalleCompra.setHighHead(25);
        tablaDetalleCompra.setRowHeight(30);
        tablaDetalleCompra.setSelectionBackground(new java.awt.Color(139, 159, 247));
        tablaDetalleCompra.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaDetalleCompra.setShowGrid(true);
        jScrollPane1.setViewportView(tablaDetalleCompra);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(145, 159, 222), 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Cod Producto");

        txtCodigo.setForeground(new java.awt.Color(81, 111, 244));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodigo.setPlaceholder("");
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        txtPrecioVenta.setForeground(new java.awt.Color(81, 111, 244));
        txtPrecioVenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrecioVenta.setPlaceholder("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Precio Venta");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Precio Compra");

        txtPrecioCompra.setForeground(new java.awt.Color(81, 111, 244));
        txtPrecioCompra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrecioCompra.setPlaceholder("");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Cantidad");

        txtCantidad.setForeground(new java.awt.Color(81, 111, 244));
        txtCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCantidad.setPlaceholder("");

        txtNombre.setEditable(false);
        txtNombre.setForeground(new java.awt.Color(81, 111, 244));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombre.setPlaceholder("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Nombre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(145, 159, 222), 2));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Proveedor");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Metodo Envio");

        txtMetodoEnvio.setForeground(new java.awt.Color(81, 111, 244));
        txtMetodoEnvio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMetodoEnvio.setPlaceholder("");

        txtProveedor.setForeground(new java.awt.Color(81, 111, 244));
        txtProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona" }));
        txtProveedor.setColorMaterial(new java.awt.Color(81, 111, 244));
        txtProveedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMetodoEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMetodoEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(145, 159, 222), 2));

        btnEliminar.setBackground(new java.awt.Color(81, 111, 244));
        btnEliminar.setText("Eliminar Producto");
        btnEliminar.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnEliminar.setFocusPainted(false);
        btnEliminar.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAnadir.setBackground(new java.awt.Color(81, 111, 244));
        btnAnadir.setText("Añadir Producto");
        btnAnadir.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnAnadir.setFocusPainted(false);
        btnAnadir.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnAnadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(145, 159, 222), 2));
        jPanel5.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(81, 111, 244));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("TOTAL ");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel14);
        jLabel14.setBounds(160, 10, 90, 27);

        lblTotal.setBackground(new java.awt.Color(81, 111, 244));
        lblTotal.setText("0");
        lblTotal.setBackgroundHover(new java.awt.Color(81, 111, 244));
        lblTotal.setFocusPainted(false);
        lblTotal.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(lblTotal);
        lblTotal.setBounds(150, 40, 120, 24);

        btnCancelarCompra.setBackground(new java.awt.Color(81, 111, 244));
        btnCancelarCompra.setText("Cancelar Compra");
        btnCancelarCompra.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnCancelarCompra.setFocusPainted(false);
        btnCancelarCompra.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnCancelarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCompraActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelarCompra);
        btnCancelarCompra.setBounds(350, 40, 150, 24);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra/compra.png"))); // NOI18N
        jPanel5.add(jLabel11);
        jLabel11.setBounds(30, 0, 80, 70);

        btnRealizarCompra.setBackground(new java.awt.Color(81, 111, 244));
        btnRealizarCompra.setText("Realizar Compra");
        btnRealizarCompra.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnRealizarCompra.setFocusPainted(false);
        btnRealizarCompra.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnRealizarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarCompraActionPerformed(evt);
            }
        });
        jPanel5.add(btnRealizarCompra);
        btnRealizarCompra.setBounds(350, 10, 150, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }//GEN-END:initComponents

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        try
        {
            String estadoUltimoRegistroVenta = (String) Seleccion.seleccionarCompraUltimoRegistroEstado().get(0)[1];

            if (estadoUltimoRegistroVenta.equals("REALIZADA"))
            {
                this.transaccionNueva();
            } else if (estadoUltimoRegistroVenta.equals("EN_PROCESO"))
            {
                this.transaccionEnProceso();
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IndexOutOfBoundsException ex1)
        {
            try
            {
                this.transaccionNueva();
            } catch (SQLException ex)
            {
                Logger.getLogger(PanelCompras.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(PanelCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        {
            
        }
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCompraActionPerformed
        this.cancelarCompra();
    }//GEN-LAST:event_btnCancelarCompraActionPerformed

    private void btnRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarCompraActionPerformed
        try
        {
            if (this.actualizarTotal() == 0)
            {
                JOptionPane.showMessageDialog(null, "No hay ningun producto para realizar la venta");
            } else
            {
                DialogRealizarCompra f = new DialogRealizarCompra(VentanaLogin.ventana, true);
                f.setVisible(true);
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRealizarCompraActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indice = this.tablaDetalleCompra.getSelectedRow();
        if(indice != -1)
        {
            try
        {
            
            ArrayList<Object[]> lista = Seleccion.seleccionarDetalleCompraUltimoEnProceso();
            int idUltimoRegistro = (int) lista.get(0)[1];
            int idAEliminar = 0;
            for (int i = 0; i <= indice; i++)
            {
                if (i == indice)
                {
                    idAEliminar = (int) lista.get(i)[0];
                }
            }

            Connection cnx = Conexion.obtenerConexion();

            String query = "DELETE FROM detalle_compra WHERE detalle_compra.id = ?";
            PreparedStatement st = cnx.prepareStatement(query);

            st.setInt(1, idAEliminar);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
            if(indice == 0)
            {
                Eliminacion.eliminar(idUltimoRegistro, "compra");
                this.txtProveedor.setSelectedItem("Selecciona");
                this.txtMetodoEnvio.setText("");
                this.txtCodigo.setText("");
                this.txtCantidad.setText("");
                this.txtPrecioVenta.setText("0");
                this.txtPrecioCompra.setText("");
                this.lblTotal.setText("0");
                this.txtProveedor.setEnabled(true);
            }
            this.actualizarTablaDetalleCompras();
            this.actualizarTotal();

        } catch (SQLException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(null,"No tienes seleecionado ningun producto");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        try
        {
            int longitud = this.txtCodigo.getText().length();
            
            if(evt.getKeyCode() == 8 && longitud == 0)
            {
                this.txtNombre.setText("");
                this.txtPrecioVenta.setText("");
                this.txtPrecioCompra.setText("");
                this.txtCantidad.setText("");
                this.txtProveedor.setSelectedItem("Selecciona");
                
                this.txtProveedor.setEnabled(true);
                
            }else{
            
            int codigo = Integer.valueOf(this.txtCodigo.getText());
            Object[] data = Seleccion.seleccionarProductos(codigo).get(0);
            this.txtNombre.setText((String) data[3]);
            this.txtPrecioVenta.setText((String) data[5]);
            this.txtPrecioCompra.setText((String) data[6]);
            
            // formando forma proveedor
            
            Connection cnx = basedatos.Conexion.obtenerConexion();
            PreparedStatement st = cnx.prepareStatement("SELECT id,nombre_compania FROM proveedores WHERE nombre_contacto = ?");
            st.setString(1,(String)data[1]);
            ResultSet resultado = st.executeQuery();
            
            if(resultado.next())
            {
                int id_proveedor = resultado.getInt("id");
                String nombre_compania = resultado.getString("nombre_compania");
                String formadoFormatoProveedor = nombre_compania + " - "+String.valueOf(id_proveedor);
                this.txtProveedor.setSelectedItem(formadoFormatoProveedor);
                
                this.txtProveedor.setEnabled(false);
            }
            
            //
            
            }
            
            
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IndexOutOfBoundsException e)
        {
            this.txtNombre.setText("");
            this.txtPrecioVenta.setText("");
            this.txtPrecioCompra.setText("");
            this.txtCantidad.setText("");
            this.txtProveedor.setSelectedItem("Selecciona");
            this.txtProveedor.setEnabled(true);
            
        }catch(NumberFormatException e)
        {
            
        }
        
    }//GEN-LAST:event_txtCodigoKeyReleased
    public void actualizarTablaDetalleCompras() throws SQLException, ClassNotFoundException {
        ArrayList<Object[]> lista = Seleccion.seleccionarDetalleCompraUltimoEnProceso();
        System.out.println("LA LISTA EN ACTUALIZAR DETALLE COMPRA:" + lista.size());
        String[] columnas =
        {
            "ID Compra", "ID Prod", "Producto", "$ Venta", "$ Compra", "Cantidad"
        };
        DefaultTableModel modeloUsuario = new DefaultTableModel(new Object[][]
        {
        }, columnas);

        for (Object[] e : lista)
        {

            modeloUsuario.addRow(this.removerElemento(e, 0));
        }
        this.tablaDetalleCompra.setModel(modeloUsuario);

    }

    public Object[] removerElemento(Object[] arrayObjetos, int i) {

        Object[] nuevoArray = new Object[arrayObjetos.length - 1];
        if (i > 0)
        {
            System.arraycopy(arrayObjetos, 0, nuevoArray, 0, i);
        }
        if (nuevoArray.length > i)
        {
            System.arraycopy(arrayObjetos, i + 1, nuevoArray, i, nuevoArray.length - i);
        }
        return nuevoArray;
    }

    public void transaccionNueva() throws SQLException, ClassNotFoundException {

        //CREAR UN NUEVO REGISTRO DE VENTAS PUES NO HAY NINGUNA TRANSACCION
        //OBTENEMOS LOS DATOS PARA PODER INSERTAR EN LA TABLA VENTAS
        boolean validacionUsuario = true;
        boolean validacionProveedor = false;
        boolean validacionMetodoEnvio = false;
        boolean validacionFecha = true;
        boolean validacionCantidad = false;
        boolean validacionEstado = true;
        int id_usuario = 0, id_producto = 0, cantidad = 0, id_proveedor = 0, precio_venta = 0, precio_compra = 0;
        Date fecha = this.getFechaActual();

        // VALIDACION METODO ENVIO
        String metodoEnvio = this.txtMetodoEnvio.getText();
        if (metodoEnvio.equals(""))
        {
            JOptionPane.showMessageDialog(null, "No puedes dejar vacio el metodo de envio");
            validacionMetodoEnvio = false;
        } else
        {
            validacionMetodoEnvio = true;
        }
        
        // VALIDACION USUARIO
        String usuario = this.lblUsuario.getText();
        id_usuario = (int) Seleccion.SeleccionarUsuario(usuario).get(0)[0];
        
        // validacion estado
        String estado = "EN_PROCESO";
        
        // validacion proveedor
        String proveedor = (String) this.txtProveedor.getSelectedItem();
        if (proveedor.equals("Selecciona"))
        {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un proveedor");
            validacionProveedor = false;
        } else
        {
            id_proveedor = Integer.valueOf(this.getIdProveedor(proveedor));
            validacionProveedor = true;
        }

        // validacion cantidad
        try
        {
            cantidad = Integer.valueOf(this.txtCantidad.getText());
            if (cantidad == 0)
            {
                JOptionPane.showMessageDialog(null, "en cantidad debes introducir una cantidad mayor a 0");
                validacionCantidad = false;
            } else
            {
                validacionCantidad = true;
            }
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "en cantidad debes introducir una cantidad numerica entera");
            validacionCantidad = false;
        }
        // VALIDACION DE TODO
        if (validacionUsuario && validacionProveedor && validacionMetodoEnvio && validacionFecha && validacionEstado && validacionCantidad)
        {
            Insercion.insertarCompras(id_usuario, id_proveedor, 0, metodoEnvio, fecha, estado);
            System.out.println("LLEGO AQUI");

            //----------------------------------------------------------------------------------
            // INSERCION EN DETALLE COMPRA  
            // OBTENEMOS LOS DATOS PARA DICHA TABLA
            boolean validacionProducto = false;
            boolean validacionPrecioVenta = false;
            boolean validacionPrecioCompra = false;

            int idUltimoRegistroCompra = (int) Seleccion.seleccionarCompraUltimoRegistroEstado().get(0)[0];
            // validacion codigo de producto

            int codigoProducto = Integer.valueOf(this.txtCodigo.getText());

            try
            {
                id_producto = (int) Seleccion.seleccionarProductos(codigoProducto).get(0)[0];
                validacionProducto = true;
            } catch (IndexOutOfBoundsException ex)
            {
                JOptionPane.showMessageDialog(null, "El codigo introducido no se encuentra");
                validacionProducto = false;
            } catch (NumberFormatException ex1)
            {
                JOptionPane.showMessageDialog(null, "Debes introducir caracteres numericos en el apartado de codigo de producto");
                validacionProducto = false;
            }

            // VALIDACION PRECIO VENTA
            try
            {
                precio_venta = Integer.valueOf(this.txtPrecioVenta.getText());
                validacionPrecioVenta = true;
            } catch (NumberFormatException ex1)
            {
                JOptionPane.showMessageDialog(null, "Debes introducir caracteres numericos en el apartado de precio de venta");
                validacionPrecioVenta = false;
            }

            // VALIDACION PRECIO COMPRA
            try
            {
                precio_compra = Integer.valueOf(this.txtPrecioCompra.getText());
                validacionPrecioCompra = true;
            } catch (NumberFormatException ex1)
            {
                JOptionPane.showMessageDialog(null, "Debes introducir caracteres numericos en el apartado de precio de compra");
                validacionPrecioCompra = false;
            }

            // VALIDAR TODO
            if (validacionProducto && validacionPrecioVenta && validacionPrecioCompra && validacionCantidad)
            {
                Insercion.insertarDetalleCompra(idUltimoRegistroCompra, id_producto, precio_venta, precio_compra, cantidad);
                this.actualizarTablaDetalleCompras();
                this.actualizarTotal();
                this.txtCodigo.setText("");
                this.txtPrecioVenta.setText("0");
                this.txtPrecioCompra.setText("0");
                this.txtCantidad.setText("");
                this.txtNombre.setText("");
                this.txtProveedor.setEnabled(true);
            }

        }
    }

    public int actualizarTotal() throws SQLException, ClassNotFoundException {
        int resultado = 0;
        ArrayList<Object[]> lista = Seleccion.seleccionarDetalleCompraUltimoEnProceso();
        for (Object[] e : lista)
        {
            int valor = 0;
            try
            {
                valor = Integer.valueOf((String) e[5]);
            } catch (NumberFormatException ex)
            {
                valor = 0;
            }
            int cantidad = Integer.valueOf((String) e[6]);
            int mult = valor * cantidad;
            resultado += mult;
        }
        this.lblTotal.setText(String.valueOf(resultado));
        return resultado;
    }

    public String getIdProveedor(String cadena) {
        char letra;
        String resultau = "";
        for (int i = 0; i < cadena.length(); i++)
        {
            letra = cadena.charAt(i);
            if (letra == '-')
            {
                resultau = cadena.substring(i +1);
            }
        }

        return resultau.strip();
    }

    public void transaccionEnProceso() throws SQLException, ClassNotFoundException {

        // INSERCION EN DETALLE COMPRA  
        // OBTENEMOS LOS DATOS PARA DICHA TABLA
        
        boolean validacionProducto = false;
        boolean validacionPrecioVenta = false;
        boolean validacionPrecioCompra = false;
        boolean validacionCantidad = false;

        int idUltimoRegistroCompra = (int) Seleccion.seleccionarCompraUltimoRegistroEstado().get(0)[0];
        // validacion codigo de producto

        int codigoProducto;
        int id_producto = 0;
        int precio_venta = 0;
        int precio_compra = 0 ;
        int cantidad = 0;
        
        // VALIDACION PRODUCTO
        try
        {
            codigoProducto = Integer.valueOf(this.txtCodigo.getText());
            id_producto = (int) Seleccion.seleccionarProductos(codigoProducto).get(0)[0];
            validacionProducto = true;
        } catch (IndexOutOfBoundsException ex)
        {
            JOptionPane.showMessageDialog(null, "El codigo introducido no se encuentra");
            validacionProducto = false;
        } catch (NumberFormatException ex1)
        {
            JOptionPane.showMessageDialog(null, "Debes introducir caracteres numericos en el apartado de codigo de producto");
            validacionProducto = false;
        }

        // VALIDACION PRECIO VENTA
        try
        {
            precio_venta = Integer.valueOf(this.txtPrecioVenta.getText());
            validacionPrecioVenta = true;
        } catch (NumberFormatException ex1)
        {
            JOptionPane.showMessageDialog(null, "Debes introducir caracteres numericos en el apartado de precio de venta");
            validacionPrecioVenta = false;
        }

        // VALIDACION PRECIO COMPRA
        try
        {
            precio_compra = Integer.valueOf(this.txtPrecioCompra.getText());
            validacionPrecioCompra = true;
        } catch (NumberFormatException ex1)
        {
            JOptionPane.showMessageDialog(null, "Debes introducir caracteres numericos en el apartado de precio de compra");
            validacionPrecioCompra = false;
        }
        
        // VALIDACION CANTIDAD
        try
        {
            cantidad = Integer.valueOf(this.txtCantidad.getText());
            if (cantidad == 0)
            {
                JOptionPane.showMessageDialog(null, "en cantidad debes introducir una cantidad mayor a 0");
                validacionCantidad = false;
            } else
            {
                validacionCantidad = true;
            }
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "en cantidad debes introducir una cantidad numerica entera");
            validacionCantidad = false;
        }
        

        // VALIDAR TODO
        if (validacionProducto && validacionPrecioVenta && validacionPrecioCompra && validacionCantidad)
        {
            Insercion.insertarDetalleCompra(idUltimoRegistroCompra, id_producto, precio_venta, precio_compra, cantidad);
            this.actualizarTablaDetalleCompras();
            this.actualizarTotal();
            this.txtCodigo.setText("");
            this.txtPrecioVenta.setText("0");
            this.txtPrecioCompra.setText("0");
            this.txtCantidad.setText("");
            this.txtNombre.setText("");
            this.txtProveedor.setEnabled(true);
        }

    }

    public Date getFechaActual() {
        Calendar f = Calendar.getInstance();
        int ano = f.get(Calendar.YEAR);
        int mes = f.get(Calendar.MONTH);
        int dia = f.get(Calendar.DATE);
        Date f2 = new Date();
        f2.setYear(ano);
        f2.setMonth(mes);
        f2.setDate(dia);
        return f2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape btnAnadir;
    public RSMaterialComponent.RSButtonShape btnCancelarCompra;
    public RSMaterialComponent.RSButtonShape btnEliminar;
    public RSMaterialComponent.RSButtonShape btnRealizarCompra;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblImage;
    public javax.swing.JLabel lblRol;
    public RSMaterialComponent.RSButtonShape lblTotal;
    public javax.swing.JLabel lblUsuario;
    public RSMaterialComponent.RSTableMetroCustom tablaDetalleCompra;
    public RSMaterialComponent.RSTextFieldMaterial txtCantidad;
    public RSMaterialComponent.RSTextFieldMaterial txtCodigo;
    public RSMaterialComponent.RSTextFieldMaterial txtMetodoEnvio;
    public RSMaterialComponent.RSTextFieldMaterial txtNombre;
    public RSMaterialComponent.RSTextFieldMaterial txtPrecioCompra;
    public RSMaterialComponent.RSTextFieldMaterial txtPrecioVenta;
    public RSMaterialComponent.RSComboBoxMaterial txtProveedor;
    // End of variables declaration//GEN-END:variables
}
