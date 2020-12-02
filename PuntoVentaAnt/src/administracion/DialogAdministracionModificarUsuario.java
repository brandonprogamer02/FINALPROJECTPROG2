package administracion;
import basedatos.Actualizacion;
import basedatos.Seleccion;
import interfaz.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import login.VentanaLogin;

public class DialogAdministracionModificarUsuario extends DialogWithAnimation 
{
    public ButtonGroup botones = new ButtonGroup();
    public DialogAdministracionModificarUsuario(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        this.btnRolAdministrador.setActionCommand("Administrador");
        this.btnRolVendedor.setActionCommand("Vendedor");
        PanelAdministracion f = (PanelAdministracion)VentanaLogin.ventana.getPanelActual();
        int idSeleccionado = VentanaLogin.ventana.obtenerIdSeleccionado(f.tablaUsuario);
        
        f.setVisible(true);VentanaLogin.ventana.obtenerIdSeleccionado(f.tablaUsuario);
        try
        {
            Object[] data = Seleccion.SeleccionarUsuario(idSeleccionado).get(0);
            this.txtNombre.setText((String)data[1]);
            this.txtUsuario.setText((String)data[2]);
            this.txtContrasena.setText((String)data[3]);
            if(data[4].equals("Administrador"))
            {
                System.out.println("entro en seleccionar admin");
                this.btnRolAdministrador.setSelected(true);
            }
            else if(data[4].equals("Vendedor"))
            {
                System.out.println("entro en seleccionar vendedor");
                this.btnRolVendedor.setSelected(true);
            }
            
        } catch (SQLException ex)
        {
            Logger.getLogger(DialogAdministracionModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DialogAdministracionModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IndexOutOfBoundsException ex)
        {
            JOptionPane.showMessageDialog(null,"No has seleccionado ningun registro!");
            cerrar();
            
        }
        
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel5 = new javax.swing.JLabel();
        txtContrasena = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel6 = new javax.swing.JLabel();
        btnRolVendedor = new RSMaterialComponent.RSCheckBoxMaterial();
        btnRolAdministrador = new RSMaterialComponent.RSCheckBoxMaterial();
        rSButtonShape1 = new RSMaterialComponent.RSButtonShape();
        btnCerrar = new RSMaterialComponent.RSButtonShape();
        btnActualizar = new RSMaterialComponent.RSButtonShape();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(81, 111, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODIFICAR USUARIO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion/update.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 111, 244), 3));

        txtNombre.setForeground(new java.awt.Color(81, 111, 244));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombre.setPlaceholder("Introduce el nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Nombre ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Rol");

        txtUsuario.setForeground(new java.awt.Color(81, 111, 244));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setPlaceholder("Introduce el usuario");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Usuario");

        txtContrasena.setForeground(new java.awt.Color(81, 111, 244));
        txtContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtContrasena.setPlaceholder("Introduce la contrasena");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Contraseña");

        botones.add(btnRolVendedor);
        btnRolVendedor.setForeground(new java.awt.Color(135, 155, 247));
        btnRolVendedor.setText("Vendedor");
        btnRolVendedor.setColorCheck(new java.awt.Color(81, 111, 244));
        btnRolVendedor.setColorUnCheck(new java.awt.Color(81, 111, 244));
        btnRolVendedor.setFocusPainted(false);
        btnRolVendedor.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N

        botones.add(btnRolAdministrador);
        btnRolAdministrador.setForeground(new java.awt.Color(135, 155, 247));
        btnRolAdministrador.setText("Administrador");
        btnRolAdministrador.setColorCheck(new java.awt.Color(81, 111, 244));
        btnRolAdministrador.setColorUnCheck(new java.awt.Color(81, 111, 244));
        btnRolAdministrador.setFocusPainted(false);
        btnRolAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N

        rSButtonShape1.setBackground(new java.awt.Color(81, 111, 244));
        rSButtonShape1.setText("ID 10");
        rSButtonShape1.setBackgroundHover(new java.awt.Color(81, 111, 244));
        rSButtonShape1.setFocusPainted(false);
        rSButtonShape1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rSButtonShape1.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        rSButtonShape1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnCerrar.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrar.setText("Cancelar");
        btnCerrar.setBackgroundHover(new java.awt.Color(255, 51, 51));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrar.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(81, 111, 244));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnActualizar.setFocusPainted(false);
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnRolVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btnRolAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(jLabel5)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(rSButtonShape1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButtonShape1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRolVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRolAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.cerrar();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        PanelAdministracion f = (PanelAdministracion)VentanaLogin.ventana.getPanelActual();
        int idSeleccionado = VentanaLogin.ventana.obtenerIdSeleccionado(f.tablaUsuario);
        String nombreTxt = this.txtNombre.getText();
        String usuarioTxt = this.txtUsuario.getText();
        String contrasenaTxt = this.txtContrasena.getText();
        String rolCheck = "";
        try
        {
            if(idSeleccionado == 1)
            {
                rolCheck = "MASTER";
            }else
            {
                rolCheck = this.botones.getSelection().getActionCommand();
            }
        }catch(NullPointerException e)
        {
            if(idSeleccionado == 1)
            {
                rolCheck = "MASTER";
            }else{
                JOptionPane.showMessageDialog(null,"Debes elegir un rol para el usuario");
            }
        }
        // verificar que ningun usuario tenga ese nombre
        boolean coincidenciaUsuario = false;
        try{
        ArrayList<Object[]> lista = Seleccion.SeleccionarUsuario();
        for(Object[] e: lista)
        {
            String user = (String)e[2];
            if(user.equals(usuarioTxt) && !user.equals((String)Seleccion.SeleccionarUsuario(idSeleccionado).get(0)[2]))
            {
                JOptionPane.showMessageDialog(null, "Ese nombre de usuario no esta disponible");
                coincidenciaUsuario = true;
            }
        }
        }catch(SQLException e)
        {
            Logger.getLogger(DialogAdministracionAgregarUsuario.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DialogAdministracionAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try
        {
            if(coincidenciaUsuario == false)
            {
                Actualizacion.actualizarUsuario(nombreTxt, usuarioTxt, contrasenaTxt, rolCheck,idSeleccionado);
                this.cerrar();
                f.actualizarTablaUsuario();
            }
            
        } catch (SQLException ex)
        {
            Logger.getLogger(DialogAdministracionAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(DialogAdministracionAgregarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape btnActualizar;
    public RSMaterialComponent.RSButtonShape btnCerrar;
    public RSMaterialComponent.RSCheckBoxMaterial btnRolAdministrador;
    public RSMaterialComponent.RSCheckBoxMaterial btnRolVendedor;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel3;
    public RSMaterialComponent.RSButtonShape rSButtonShape1;
    public RSMaterialComponent.RSTextFieldMaterial txtContrasena;
    public RSMaterialComponent.RSTextFieldMaterial txtNombre;
    public RSMaterialComponent.RSTextFieldMaterial txtUsuario;
    // End of variables declaration//GEN-END:variables
}
