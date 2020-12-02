package ventas;

import basedatos.Actualizacion;
import basedatos.Seleccion;
import clientes.*;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import productos.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import login.VentanaLogin;

public class DialogRealizarVenta extends interfaz.DialogWithAnimation {

    
    public DialogRealizarVenta(java.awt.Frame parent, boolean modal) throws SQLException, ClassNotFoundException 
    {
        
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
        int total = actualizarTotal();
        
        
    }
    public int actualizarTotal() throws SQLException, ClassNotFoundException
    {
        int resultado = 0;
        ArrayList<Object[]> lista = Seleccion.seleccionarDetalleVentaUltimoEnProceso();   
        for(Object[] e: lista)
        {
            int valor;
            try{
            valor = Integer.valueOf((String) e[5]);
            }catch(NumberFormatException ex)
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

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCerrar = new RSMaterialComponent.RSButtonShape();
        btnAceptar = new RSMaterialComponent.RSButtonShape();
        lblTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCambio = new RSMaterialComponent.RSTextFieldMaterial();
        lblCambio = new javax.swing.JLabel();
        txtPagaCon = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel1 = new javax.swing.JLabel();

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
        jLabel25.setText("Realizar Venta");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/sale.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel3)
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

        lblTotal.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(81, 111, 244));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(81, 111, 244));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PAGA CON:");

        txtCambio.setEditable(false);
        txtCambio.setForeground(new java.awt.Color(81, 111, 244));
        txtCambio.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtCambio.setPlaceholder("");

        lblCambio.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        lblCambio.setForeground(new java.awt.Color(81, 111, 244));
        lblCambio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCambio.setText("CAMBIO: ");

        txtPagaCon.setForeground(new java.awt.Color(81, 111, 244));
        txtPagaCon.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtPagaCon.setPlaceholder("");
        txtPagaCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagaConKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 111, 244));
        jLabel1.setText("TOTAL :");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtPagaCon, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(lblCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPagaCon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCambio)
                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
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
            int txtValue = Integer.valueOf(this.txtPagaCon.getText());
            int total = this.actualizarTotal();
            int cambio = txtValue - total;
            
            if(cambio <0)
            {
                JOptionPane.showMessageDialog(null,"Faltan " + cambio + "para completar la venta!");
            }else
            {
                PanelVentas f = (PanelVentas)VentanaLogin.ventana.getPanelActual();
                double descuento;
                try{
                descuento = Double.valueOf(f.txtDescuento.getText());
                }catch(NumberFormatException e)
                {
                    descuento = 0;
                }
                int idUltimoRegistroVentas = (int) Seleccion.seleccionarVentaUltimoRegistroEstado().get(0)[0];
                
                // TRANSACCION REMOVER PRODUCTOS
                ArrayList<Object[]> data = Seleccion.seleccionarDetalleVentaUltimoEnProceso();
                for(Object[] e: data)
                {
                    int id_producto = (int)e[2];
                    int cantidadDecrementar = Integer.valueOf((String)e[6]);
                    int cantidadAlbergada = (int)Seleccion.seleccionarProductos(id_producto ).get(0)[7];
                    System.out.println("cantidad albergada: " + cantidadAlbergada + ",cantidadDecrementar:" + cantidadDecrementar);
                    Connection cnx = basedatos.Conexion.obtenerConexion();
                    PreparedStatement st = cnx.prepareStatement("UPDATE productos SET stock = ? WHERE id  =?");
                    st.setInt(1,cantidadAlbergada - cantidadDecrementar);
                    st.setInt(2, id_producto);
                    st.executeUpdate();
                }
                
                Actualizacion.actualizarVentas(txtValue, cambio, descuento, total, "REALIZADA", idUltimoRegistroVentas);
                JOptionPane.showMessageDialog(null, "Venta Realizada Correctamente");
                cerrar();
                f.actualizarTablaDetalleVentas();
                f.lblTotal.setText("0");
                f.txtCantidad.setText("");
                f.txtCliente.setSelectedItem("Selecciona");
                f.txtCodigo.setText("");
                f.txtDescuento.setText("0");
                f.txtNombre.setText("");
                f.txtPrecio.setText("");
                f.txtDescuento.setEditable(true);
                //f.txtCliente.setEditable(true);
                
                
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(DialogRealizarVenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DialogRealizarVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtPagaConKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagaConKeyReleased
        try
        {
            int txtValue = Integer.valueOf(this.txtPagaCon.getText());
            int total = this.actualizarTotal();
            int cambio = txtValue - total;
            System.out.println("el cambio hecho es" + cambio);
            this.txtCambio.setText(String.valueOf(cambio));
        } catch (SQLException ex)
        {
            Logger.getLogger(DialogRealizarVenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DialogRealizarVenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex)
        {
            //Logger.getLogger(DialogRealizarVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtPagaConKeyReleased

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape btnAceptar;
    public RSMaterialComponent.RSButtonShape btnCerrar;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel11;
    public javax.swing.JPanel jPanel12;
    public javax.swing.JLabel lblCambio;
    public javax.swing.JLabel lblTotal;
    public RSMaterialComponent.RSTextFieldMaterial txtCambio;
    public RSMaterialComponent.RSTextFieldMaterial txtPagaCon;
    // End of variables declaration//GEN-END:variables
}
