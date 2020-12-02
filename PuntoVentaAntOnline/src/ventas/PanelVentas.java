package ventas;

import basedatos.Conexion;
import basedatos.Eliminacion;
import basedatos.Insercion;
import basedatos.Seleccion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import login.VentanaLogin;
import reportes_pruebas.DialogTexto;

public class PanelVentas extends javax.swing.JPanel 
{

    public PanelVentas() throws SQLException, ClassNotFoundException {
        initComponents();

        //System.out.println("LA FECHA ACTUAL ES:" + this.getFechaActual().getYear() + "/"
        Date se = this.getFechaActual();
        System.out.println(String.format("%s-%s-%s; %s:%s:%s", se.getYear(), Integer.valueOf(se.getMonth()) + 1, se.getDate(), se.getHours(), se.getMinutes(), se.getSeconds()));
        //actualizarTablaDetalleVentas();
        // anadimos los datos al ComboBox
        
        try
        {
            Object[] lista = Seleccion.seleccionarVentaUltimoRegistro().get(0);
            //System.out.println("STATE:" +lista[7]);
            if (lista[7].equals("EN_PROCESO"))
            {
                this.txtCliente.setSelectedItem(lista[1]);
                this.txtDescuento.setText(String.valueOf(lista[5]));

            }
        } catch (IndexOutOfBoundsException e)
        {

        }

    }
    
    public void rellenarClientes() throws SQLException, ClassNotFoundException
    {
        this.txtCliente.removeAllItems();
        ArrayList<Object[]> data = Seleccion.seleccionarClientes();

        for (Object[] e : data)
        {
            String stringFormau = e[1] + " - " + e[0];
            this.txtCliente.addItem(stringFormau);
        }
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleVenta = new RSMaterialComponent.RSTableMetroCustom();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new RSMaterialComponent.RSTextFieldMaterial();
        txtNombre = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCantidad = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new RSMaterialComponent.RSTextFieldMaterial();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtDescuento = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel10 = new javax.swing.JLabel();
        txtCliente = new RSMaterialComponent.RSComboBoxMaterial();
        jPanel4 = new javax.swing.JPanel();
        btnAnadir = new RSMaterialComponent.RSButtonShape();
        jLabel15 = new javax.swing.JLabel();
        btnEliminar = new RSMaterialComponent.RSButtonShape();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblTotal = new RSMaterialComponent.RSButtonShape();
        btnCancelarVenta = new RSMaterialComponent.RSButtonShape();
        jLabel11 = new javax.swing.JLabel();
        btnRealizarVenta = new RSMaterialComponent.RSButtonShape();

        setBackground(new java.awt.Color(249, 249, 249));
        setPreferredSize(new java.awt.Dimension(876, 408));

        jPanel1.setBackground(new java.awt.Color(81, 111, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblImage.setBackground(new java.awt.Color(81, 111, 244));
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/sell.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENTAS");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/person.png"))); // NOI18N

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
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(135, 135, 135)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRol)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tablaDetalleVenta.setForeground(new java.awt.Color(81, 111, 244));
        tablaDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaDetalleVenta.setBackgoundHead(new java.awt.Color(81, 111, 244));
        tablaDetalleVenta.setBackgoundHover(new java.awt.Color(255, 255, 255));
        tablaDetalleVenta.setColorBorderHead(new java.awt.Color(255, 255, 255));
        tablaDetalleVenta.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaDetalleVenta.setColorPrimaryText(new java.awt.Color(81, 111, 244));
        tablaDetalleVenta.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaDetalleVenta.setColorSecundaryText(new java.awt.Color(81, 111, 244));
        tablaDetalleVenta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tablaDetalleVenta.setFontHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaDetalleVenta.setFontRowHover(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaDetalleVenta.setFontRowSelect(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaDetalleVenta.setGridColor(new java.awt.Color(81, 111, 244));
        tablaDetalleVenta.setHighHead(25);
        tablaDetalleVenta.setRowHeight(30);
        tablaDetalleVenta.setSelectionBackground(new java.awt.Color(139, 159, 247));
        tablaDetalleVenta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaDetalleVenta.setShowGrid(true);
        jScrollPane1.setViewportView(tablaDetalleVenta);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(145, 159, 222), 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Codigo");

        txtCodigo.setForeground(new java.awt.Color(81, 111, 244));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodigo.setPlaceholder("");
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.setForeground(new java.awt.Color(81, 111, 244));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombre.setPlaceholder("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Cantidad");

        txtCantidad.setForeground(new java.awt.Color(81, 111, 244));
        txtCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCantidad.setPlaceholder("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Precio");

        txtPrecio.setEditable(false);
        txtPrecio.setForeground(new java.awt.Color(81, 111, 244));
        txtPrecio.setText("0");
        txtPrecio.setFocusable(false);
        txtPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrecio.setPlaceholder("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(145, 159, 222), 2));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Cliente");

        txtDescuento.setForeground(new java.awt.Color(81, 111, 244));
        txtDescuento.setText("0");
        txtDescuento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDescuento.setPlaceholder("");
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Descuento");

        txtCliente.setForeground(new java.awt.Color(81, 111, 244));
        txtCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona" }));
        txtCliente.setColorMaterial(new java.awt.Color(81, 111, 244));
        txtCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(145, 159, 222), 2));

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

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(81, 111, 244));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Brandon Soft Technology S.A");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnCancelarVenta.setBackground(new java.awt.Color(81, 111, 244));
        btnCancelarVenta.setText("Cancelar Venta");
        btnCancelarVenta.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnCancelarVenta.setFocusPainted(false);
        btnCancelarVenta.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnCancelarVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });
        jPanel5.add(btnCancelarVenta);
        btnCancelarVenta.setBounds(360, 40, 150, 24);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/venta.png"))); // NOI18N
        jPanel5.add(jLabel11);
        jLabel11.setBounds(30, 0, 80, 70);

        btnRealizarVenta.setBackground(new java.awt.Color(81, 111, 244));
        btnRealizarVenta.setText("Realizar Venta");
        btnRealizarVenta.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnRealizarVenta.setFocusPainted(false);
        btnRealizarVenta.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnRealizarVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVentaActionPerformed(evt);
            }
        });
        jPanel5.add(btnRealizarVenta);
        btnRealizarVenta.setBounds(360, 10, 150, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            String estadoUltimoRegistroVenta = (String) Seleccion.seleccionarVentaUltimoRegistroEstado().get(0)[1];

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
                Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVentaActionPerformed
        try
        {
            if (this.actualizarTotal() == 0)
            {
                JOptionPane.showMessageDialog(null, "No hay ningun producto para realizar la venta");
            } else
            {
                DialogRealizarVenta f = new DialogRealizarVenta(VentanaLogin.ventana, true);
                f.setVisible(true);
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRealizarVentaActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        try
        {
            try
            {
                int longitud = this.txtCodigo.getText().length();

                if (evt.getKeyCode() == 8 && longitud == 0)
                {
                    this.txtPrecio.setText("0");
                    this.txtNombre.setText("");
                } else
                {
                    Object[] data = Seleccion.seleccionarProductos(Integer.valueOf(this.txtCodigo.getText())).get(0);
                    String precio = (String) data[5];
                    String nombre = (String) data[3];
                    this.txtPrecio.setText(precio);
                    this.txtNombre.setText(nombre);
                }

            } catch (NumberFormatException e)
            {
                this.txtPrecio.setText("");
                this.txtNombre.setText("");
            } catch (IndexOutOfBoundsException e)
            {
                this.txtPrecio.setText("");
                this.txtNombre.setText("");
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        try
        {
            String estadoUltimoRegistro = (String) Seleccion.seleccionarVentaUltimoRegistroEstado().get(0)[1];
            int idUltimoRegistro = (int) Seleccion.seleccionarVentaUltimoRegistroEstado().get(0)[0];
            if (estadoUltimoRegistro.equals("EN_PROCESO"))
            {
                DialogCancelarVenta f = new DialogCancelarVenta(VentanaLogin.ventana, true);
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

    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indice = this.tablaDetalleVenta.getSelectedRow();
        if (indice != -1)
        {
            try
            {
                ArrayList<Object[]> lista = Seleccion.seleccionarDetalleVentaUltimoEnProceso();
                int idUltimoRegistro = (int) lista.get(0)[1];
                int idAEliminar = 0;
                int cantidadIdAEliminar = 0;
                for (int i = 0; i <= indice; i++)
                {
                    if (i == indice)
                    {
                        idAEliminar = (int) lista.get(i)[0];
                        cantidadIdAEliminar = (int) this.aDescontar(Integer.valueOf((String) lista.get(i)[5])* Integer.valueOf((String) lista.get(i)[6]),Double.valueOf(this.txtDescuento.getText()));
                        System.out.println(String.format("PRECIO: %s, CANTIDAD: %s, ADESCONTAR: %s, RESULTADO: %s", Integer.valueOf((String) lista.get(i)[5]),Integer.valueOf((String) lista.get(i)[6]),this.txtDescuento.getText(),cantidadIdAEliminar));
                        //cantidadIdAEliminar = (int) (Double.valueOf(this.lblTotal.getText()) - Integer.valueOf((String)lista.get(i)[5]) - cantidadIdAEliminar);
                    }
                }

                Connection cnx = Conexion.obtenerConexion();

                String query = "DELETE FROM detalle_venta WHERE detalle_venta.id = ?";
                PreparedStatement st = cnx.prepareStatement(query);
                st.setInt(1, idAEliminar);
                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
                this.lblTotal.setText(String.valueOf(Double.valueOf(this.lblTotal.getText()) - cantidadIdAEliminar));
                
                if (lista.size() == 1)
                {
                    Eliminacion.eliminar(idUltimoRegistro, "venta");
                    this.txtCliente.setSelectedItem("Selecciona");
                    this.txtDescuento.setText("0");
                    this.txtCodigo.setText("");
                    this.txtCantidad.setText("");
                    this.txtPrecio.setText("0");
                    this.txtNombre.setText("");
                    this.lblTotal.setText("0");
                }
                this.actualizarTablaDetalleVentas();

            } catch (SQLException ex)
            {
                Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex)
            {
                Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "No tienes seleecionado ningun producto");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyReleased
        try
        {
            if(this.txtDescuento.getText().equals(""))
            {
                this.txtDescuento.setText("0");
            }else if(this.txtDescuento.getText().equals("0"))
            {
                this.txtDescuento.setText("");
            }
            this.actualizarTotal();
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtDescuentoKeyReleased
    public void actualizarTablaDetalleVentas() throws SQLException, ClassNotFoundException {
        ArrayList<Object[]> lista = Seleccion.seleccionarDetalleVentaUltimoEnProceso();

        String[] columnas =
        {
            "ID Venta", "ID Prod", "Producto", "Categoria", "Precio", "Cantidad"
        };
        DefaultTableModel modeloUsuario = new DefaultTableModel(new Object[][]
        {
        }, columnas);

        for (Object[] e : lista)
        {

            modeloUsuario.addRow(this.removerElemento(e, 0));
        }
        this.tablaDetalleVenta.setModel(modeloUsuario);

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

    public Date getFechaActual() {
        Calendar f = Calendar.getInstance();
        int ano = f.get(Calendar.YEAR);
        int mes = f.get(Calendar.MONTH);
        int dia = f.get(Calendar.DATE);
        int hora = f.get(Calendar.HOUR_OF_DAY);
        int minuto = f.get(Calendar.MINUTE);
        int segundo = f.get(Calendar.SECOND);
        Date f2 = new Date();
        f2.setYear(ano);
        f2.setMonth(mes);
        f2.setDate(dia);
        f2.setHours(hora);
        f2.setMinutes(minuto);
        f2.setSeconds(segundo);
        //System.out.println("LA FECHA Y TIEMPO ES: "+  f2);
        return f2;
    }

    public int actualizarTotal() throws SQLException, ClassNotFoundException {
        int resultado = 0;
        ArrayList<Object[]> lista = Seleccion.seleccionarDetalleVentaUltimoEnProceso();
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
        try{
            
        double cantidadADescontar = this.aDescontar(resultado,Double.valueOf(this.txtDescuento.getText()));
        this.lblTotal.setText(String.valueOf(cantidadADescontar));
        return (int)cantidadADescontar;
        
        }catch(NumberFormatException e)
        {
                
        }
        return 0;
       
    }

    public void transaccionEnProceso() throws SQLException, ClassNotFoundException {
        // VAMOS A INSERTAR EN DETALLE VENTA PUES AHI UNA TRANSACCION ACTIVA
        // EXTRAEMOS DATOS NECESARIOS PARA LA INSERCION

        int idUltimoRegistroVenta = (int) Seleccion.seleccionarVentaUltimoRegistroEstado().get(0)[0];
        boolean validacionCantidad = false;
        boolean validacionProducto = false;
        int cantidad = 0;
        int id_producto = 0;

        // validacion codigo de producto
        try
        {
            int codigoProducto = Integer.valueOf(this.txtCodigo.getText());
            id_producto = (int) Seleccion.seleccionarProductos(codigoProducto).get(0)[0];
            validacionProducto = true;

        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Debes introducir un valor numerico en el apartado del codigo de producto");

        } catch (IndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "No se encontro ningun producto con ese codigo");

        }

        // validacion cantidad 
        try
        {
            cantidad = Integer.valueOf(this.txtCantidad.getText());
            if (cantidad != 0 && validacionProducto)
            {
                // validar stock en inventario
                int cantidadInventario = (int) Seleccion.seleccionarProductos(id_producto).get(0)[7];
                if (cantidad <= cantidadInventario)
                {
                    validacionCantidad = true;
                } else
                {
                    JOptionPane.showMessageDialog(null, "Para ese producto solo hay stock de " + cantidadInventario);
                    validacionCantidad = false;
                }

            } else
            {
                validacionCantidad = false;
            }
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Debes introducir un valor numerico en cantidad");
            validacionCantidad = false;
        }

        if (validacionCantidad && validacionProducto)
        {
            Insercion.insertarDetalleVentas(idUltimoRegistroVenta, id_producto, cantidad);
            this.actualizarTablaDetalleVentas();
            this.actualizarTotal();
            this.txtCantidad.setText("");
            this.txtCodigo.setText("");
            this.txtNombre.setText("");
            this.txtPrecio.setText("");
        }

    }

    public void transaccionNueva() throws SQLException, ClassNotFoundException {

        //CREAR UN NUEVO REGISTRO DE VENTAS PUES NO HAY NINGUNA TRANSACCION
        //OBTENEMOS LOS DATOS PARA PODER INSERTAR EN LA TABLA VENTAS
        boolean validacionCliente = false;
        boolean validacionUsuario = false;
        boolean validacionDescuento = false;
        boolean validacionCantidad = false;
        boolean validacionProducto = false;
        Date fecha = this.getFechaActual();
        String cliente = (String) this.txtCliente.getSelectedItem();
        String usuario = this.lblUser.getText();
        int id_cliente = 0, id_usuario = 0, descuento = 0, id_producto, cantidad = 0;

        // validar cliente
        try
        {

            cliente = this.quitarIdCliente(cliente);
            id_cliente = (int) Seleccion.seleccionarClientes(cliente).get(0)[0];
            validacionCliente = true;
        } catch (IndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "El cliente ingresau no es valido");
            validacionCliente = false;
        }
        // validar usuario
        try
        {
            id_usuario = (int) Seleccion.SeleccionarUsuario(usuario).get(0)[0];
            validacionUsuario = true;
        } catch (IndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "El usuario ingresau no es valido");
            validacionUsuario = false;
        }
        // validacion descuento
        try
        {

            descuento = Integer.valueOf(this.txtDescuento.getText());

            validacionDescuento = true;
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "En descuento debes introducir una cantidad numerica entera");
            validacionDescuento = false;
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
                // validar stock en inventario
                try
                {
                    int codigoProducto = Integer.valueOf(this.txtCodigo.getText());
                    id_producto = (int) Seleccion.seleccionarProductos(codigoProducto).get(0)[0];
                    int cantidadInventario = (int) Seleccion.seleccionarProductos(id_producto).get(0)[7];
                    boolean validacionStockInventario = false;
                    if (cantidad <= cantidadInventario)
                    {
                        validacionCantidad = true;
                    } else
                    {
                        validacionCantidad = false;
                        JOptionPane.showMessageDialog(null, "Para ese producoto solo hay stock de " + cantidadInventario);
                    }

                } catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, "Debes introducir un valor numerico en el apartado del codigo de producto");
                    validacionProducto = false;
                    //throw new ClassCastException(e.getMessage());
                } catch (IndexOutOfBoundsException e)
                {
                    JOptionPane.showMessageDialog(null, "No se encontro ningun producto con ese codigo");
                    validacionProducto = false;
                }

            }
        } catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "en cantidad debes introducir una cantidad numerica entera");
            validacionCantidad = false;
        }

        // VALIDACION DE TODO
        if (validacionCliente && validacionUsuario && validacionDescuento && validacionCantidad)
        {

            Insercion.insertarVentas(id_usuario, id_cliente, fecha, 0, 0, descuento, 0, "EN_PROCESO");

            //----------------------------------------------------------------------------------
            // INSERCION EN DETALLE VENTA
            // OBTENEMOS LOS DATOS PARA DICHA TABLA
            int idUltimoRegistroVenta = (int) Seleccion.seleccionarVentaUltimoRegistroEstado().get(0)[0];
            // validacion codigo de producto
            try
            {
                int codigoProducto = Integer.valueOf(this.txtCodigo.getText());
                id_producto = (int) Seleccion.seleccionarProductos(codigoProducto).get(0)[0];

                // validar stock en inventario
                int cantidadInventario = (int) Seleccion.seleccionarProductos(id_producto).get(0)[7];
                boolean validacionStockInventario = false;
                if (cantidad <= cantidadInventario)
                {
                    validacionStockInventario = true;
                } else
                {
                    validacionStockInventario = false;
                    JOptionPane.showMessageDialog(null, "Para ese producoto solo hay stock de " + cantidadInventario);
                }
                if (cantidad != 0 && validacionCantidad && validacionStockInventario)
                {
                    Insercion.insertarDetalleVentas(idUltimoRegistroVenta, id_producto, cantidad);
                    this.actualizarTablaDetalleVentas();
                    this.actualizarTotal();
                    this.txtCantidad.setText("");
                    this.txtCodigo.setText("");
                    this.txtNombre.setText("");
                    this.txtPrecio.setText("");
                } else
                {
                    JOptionPane.showMessageDialog(null, "Debes introducir un valor numerico diferente a 0 en la cantidad");
                }

            } catch (NumberFormatException e)
            {

                JOptionPane.showMessageDialog(null, "Debes introducir un valor numerico en el apartado del codigo de producto");
                validacionProducto = false;
                throw new ClassCastException(e.getMessage());
            } catch (IndexOutOfBoundsException e)
            {
                JOptionPane.showMessageDialog(null, "No se encontro ningun producto con ese codigo");
                validacionProducto = false;
            }
        }
    }

    public String quitarIdCliente(String cadena) {
        char letra;
        String resultau = "";
        for (int i = 0; i < cadena.length(); i++)
        {
            letra = cadena.charAt(i);
            if (letra == '-')
            {
                resultau = cadena.substring(0, i);
            }
        }

        return resultau.strip();
    }
    
    public double aDescontar(double cantidad,double descuento)
    {
        double valorRetorno = -1;
        if( descuento < 0 ){ valorRetorno = -1; }
        if ( descuento > 100 ){ valorRetorno = -1; }
        else{ valorRetorno = cantidad * (descuento /100); }
        
        System.out.println("EN EL METODO es:" + (cantidad - valorRetorno));
        return cantidad - valorRetorno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape btnAnadir;
    public RSMaterialComponent.RSButtonShape btnCancelarVenta;
    public RSMaterialComponent.RSButtonShape btnEliminar;
    public RSMaterialComponent.RSButtonShape btnRealizarVenta;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
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
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblImage;
    public javax.swing.JLabel lblRol;
    public RSMaterialComponent.RSButtonShape lblTotal;
    public javax.swing.JLabel lblUser;
    public RSMaterialComponent.RSTableMetroCustom tablaDetalleVenta;
    public RSMaterialComponent.RSTextFieldMaterial txtCantidad;
    public RSMaterialComponent.RSComboBoxMaterial txtCliente;
    public RSMaterialComponent.RSTextFieldMaterial txtCodigo;
    public RSMaterialComponent.RSTextFieldMaterial txtDescuento;
    public RSMaterialComponent.RSTextFieldMaterial txtNombre;
    public RSMaterialComponent.RSTextFieldMaterial txtPrecio;
    // End of variables declaration//GEN-END:variables
}
