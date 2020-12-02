package compra;

import ventas.*;
import basedatos.Actualizacion;
import basedatos.Conexion;
import basedatos.Seleccion;
import clientes.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import productos.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import login.VentanaLogin;

public class DialogRealizarCompra extends interfaz.DialogWithAnimation {

    public DialogRealizarCompra(java.awt.Frame parent, boolean modal) throws SQLException, ClassNotFoundException {

        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCerrar = new RSMaterialComponent.RSButtonShape();
        btnAceptar = new RSMaterialComponent.RSButtonShape();
        jLabel26 = new javax.swing.JLabel();
        txtPago = new RSMaterialComponent.RSTextFieldMaterial();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(81, 111, 244), 3, true));

        jPanel12.setBackground(new java.awt.Color(81, 111, 244));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Realizar Compra?");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra/compra1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(148, 148, 148))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setText("CANCELAR");
        btnCerrar.setBackgroundHover(new java.awt.Color(255, 51, 51));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(0, 204, 51));
        btnAceptar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBackgroundHover(new java.awt.Color(0, 204, 51));
        btnAceptar.setFocusPainted(false);
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAceptar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(81, 111, 244));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Cantidad A Pagar :");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPago.setForeground(new java.awt.Color(81, 111, 244));
        txtPago.setColorMaterial(new java.awt.Color(81, 111, 244));
        txtPago.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPago.setPlaceholder("");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel11);

        pack();
    }//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        cerrar();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        try
        {
            PanelCompras f = (PanelCompras) VentanaLogin.ventana.getPanelActual();
            int idUltimoRegistroCompras = (int) Seleccion.seleccionarCompraUltimoRegistroEstado().get(0)[0];
            int cantidadPago = 0;
            int total = Integer.valueOf(f.lblTotal.getText());
            // validar cantidad a pagar
            try
            {
                cantidadPago = Integer.valueOf(this.txtPago.getText());
                
                // ACTUALIZACION DE PRECIO Y STOCK DE PRODUCTOS
                System.out.println("LLEGO AQUI CABRONES");
                ArrayList<Object[]> lista = Seleccion.seleccionarDetalleCompraUltimoEnProceso();
                for(Object[] e: lista)
                {
                    Connection cnx = Conexion.obtenerConexion();
                    String query = "UPDATE productos SET precio_venta = ?,precio_compra = ?, stock = ? WHERE id = ?";
                    int cantidad = (int) Seleccion.seleccionarProductos((int) e[2]).get(0)[7];
                    PreparedStatement st = cnx.prepareStatement(query);
                    st.setInt(1, Integer.valueOf((String)e[4]));
                    st.setInt(2, Integer.valueOf((String)e[5]));
                    st.setInt(3, cantidad + Integer.valueOf((String)e[6]));
                    st.setInt(4, (int) e[2]);
                    
                    st.executeUpdate();
                    System.out.println("actualizacion realizada correctamente");
                }
                
                Actualizacion.actualizarCompras(total, cantidadPago,"REALIZADA",idUltimoRegistroCompras);
                JOptionPane.showMessageDialog(null, "Venta Realizada Correctamente");
                cerrar();
                f.actualizarTablaDetalleCompras();
                f.lblTotal.setText("0");
                f.txtCantidad.setText("");
                f.txtCodigo.setText("");
                f.txtPrecioCompra.setText("");
                f.txtPrecioVenta.setText("");
                f.txtProveedor.setSelectedItem("Selecciona");
                f.txtMetodoEnvio.setText("");
                f.txtNombre.setText("");
                f.txtProveedor.setEnabled(true);
                
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Debes introducir un valor numerico");
            }
            

        } catch (SQLException ex)
        {
            Logger.getLogger(DialogRealizarCompra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DialogRealizarCompra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAceptarActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape btnAceptar;
    public RSMaterialComponent.RSButtonShape btnCerrar;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel11;
    public javax.swing.JPanel jPanel12;
    public RSMaterialComponent.RSTextFieldMaterial txtPago;
    // End of variables declaration//GEN-END:variables
}
