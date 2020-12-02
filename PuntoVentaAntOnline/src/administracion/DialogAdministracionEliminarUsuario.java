package administracion;

import basedatos.Eliminacion;
import basedatos.Seleccion;
import java.sql.SQLException;
import productos.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import login.VentanaLogin;

public class DialogAdministracionEliminarUsuario extends interfaz.DialogWithAnimation {

    
    public DialogAdministracionEliminarUsuario(java.awt.Frame parent, boolean modal) 
    {
        
        super(parent, modal);
        
        this.setLocationRelativeTo(null);
        initComponents();
        // actualizamos los labels de usuario y rol
        PanelAdministracion f = (PanelAdministracion)VentanaLogin.ventana.getPanelActual();
        this.lblUsuario.setText((String) f.tablaUsuario.getModel().getValueAt(f.tablaUsuario.getSelectedRow(), 2));
        this.lblRol.setText((String) f.tablaUsuario.getModel().getValueAt(f.tablaUsuario.getSelectedRow(), 4));
        
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
        lblUsuario = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(81, 111, 244), 3, true));

        jPanel12.setBackground(new java.awt.Color(81, 111, 244));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Eliminar Usuario ?");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion/notification.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel25))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel3)))
                .addContainerGap(76, Short.MAX_VALUE))
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

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(81, 111, 244));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("user01");

        lblRol.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        lblRol.setForeground(new java.awt.Color(81, 111, 244));
        lblRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRol.setText("VENDEDOR");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            PanelAdministracion f = (PanelAdministracion)VentanaLogin.ventana.getPanelActual();
            int idSeleccionado = (int) f.tablaUsuario.getValueAt(f.tablaUsuario.getSelectedRow(), 0);
            
            cerrar();
            
            String usuario = (String)Seleccion.SeleccionarUsuario(idSeleccionado).get(0)[2];
            Eliminacion.eliminarUsuario(idSeleccionado);
            f.actualizarTablaUsuario();
            
            System.out.println("EL USER:" +  usuario);
            
            if(usuario.equals(f.lblUser.getText()))
            {
                JOptionPane.showMessageDialog(null, "Haz eliminado tu propio usuario el programa va a cerrar");
                System.exit(0);
            }
            
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DialogAdministracionEliminarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(DialogAdministracionEliminarUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
    public javax.swing.JLabel lblRol;
    public javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
