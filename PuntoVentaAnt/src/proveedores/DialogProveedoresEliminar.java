package proveedores;

import basedatos.Eliminacion;
import java.sql.SQLException;
import productos.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import login.VentanaLogin;

public class DialogProveedoresEliminar extends interfaz.DialogWithAnimation 
{
    
    
    public DialogProveedoresEliminar(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
        PanelProveedores f = (PanelProveedores) VentanaLogin.ventana.getPanelActual();
        String proveedor = (String) f.tablaProveedores.getValueAt(f.tablaProveedores.getSelectedRow(), 2);
        String nombreContacto = (String) f.tablaProveedores.getValueAt(f.tablaProveedores.getSelectedRow(), 1);
        this.lblProveedor.setText(proveedor);
        this.lblNombreContacto.setText(nombreContacto);
        
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        btnAceptar = new RSMaterialComponent.RSButtonShape();
        btnCerrar = new RSMaterialComponent.RSButtonShape();
        lblProveedor = new javax.swing.JLabel();
        lblNombreContacto1 = new javax.swing.JLabel();
        lblNombreContacto = new javax.swing.JLabel();
        lblNombreContacto3 = new javax.swing.JLabel();
        lblNombreContacto4 = new javax.swing.JLabel();

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
        jLabel25.setText("Eliminar Proveedor ?");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos/notification.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setForeground(new java.awt.Color(162, 212, 225));

        btnAceptar.setBackground(new java.awt.Color(81, 111, 244));
        btnAceptar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBackgroundHover(new java.awt.Color(102, 204, 255));
        btnAceptar.setFocusPainted(false);
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAceptar.setForma(RSMaterialComponent.RSButtonShape.FORMA.ROUND);
        btnAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

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

        lblProveedor.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(81, 111, 244));
        lblProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProveedor.setText("Zapatos Mosquino");

        lblNombreContacto1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        lblNombreContacto1.setForeground(new java.awt.Color(153, 153, 153));
        lblNombreContacto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreContacto1.setText("Si eliminas este Proveedor se borraran");

        lblNombreContacto.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        lblNombreContacto.setForeground(new java.awt.Color(81, 111, 244));
        lblNombreContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreContacto.setText("Juan Luis Guerra");

        lblNombreContacto3.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        lblNombreContacto3.setForeground(new java.awt.Color(153, 153, 153));
        lblNombreContacto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreContacto3.setText("de los productos, compras y reportes");

        lblNombreContacto4.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        lblNombreContacto4.setForeground(new java.awt.Color(153, 153, 153));
        lblNombreContacto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreContacto4.setText("en los que aparezca");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombreContacto3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreContacto4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(lblNombreContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombreContacto1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lblProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreContacto1)
                .addGap(3, 3, 3)
                .addComponent(lblNombreContacto3)
                .addGap(4, 4, 4)
                .addComponent(lblNombreContacto4)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            PanelProveedores f = (PanelProveedores) VentanaLogin.ventana.getPanelActual();
            int idSeleccionado = (int) f.tablaProveedores.getValueAt(f.tablaProveedores.getSelectedRow(), 0);
            
            Eliminacion.eliminarProveedor(idSeleccionado);
            f.actualizarTablaProveedores();
            cerrar();
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DialogProveedoresEliminar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(DialogProveedoresEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape btnAceptar;
    public RSMaterialComponent.RSButtonShape btnCerrar;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel11;
    public javax.swing.JPanel jPanel12;
    public javax.swing.JPanel jPanel13;
    public javax.swing.JLabel lblNombreContacto;
    public javax.swing.JLabel lblNombreContacto1;
    public javax.swing.JLabel lblNombreContacto3;
    public javax.swing.JLabel lblNombreContacto4;
    public javax.swing.JLabel lblProveedor;
    // End of variables declaration//GEN-END:variables
}
