package login;

import administracion.PanelAdministracion;
import basedatos.Conexion;
import basedatos.Seleccion;
import clientes.PanelClientes;
import com.mysql.jdbc.Connection;
import compra.PanelCompras;
import interfaz.FactoriaPanel;
import interfaz.Ventana;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.UIManager;
import productos.PanelProductos;
import proveedores.PanelProveedores;
import javax.swing.table.DefaultTableModel;
import ventas.PanelVentas;

public class VentanaLogin extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        panelCarga = new javax.swing.JPanel();
        rSProgressMaterial1 = new rojerusan.componentes.RSProgressMaterial();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelFondo = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        btn = new RSMaterialComponent.RSButtonShape();
        jPanel1 = new javax.swing.JPanel();
        lblCentral = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new RSMaterialComponent.RSTextFieldMaterial();
        txtPass = new RSMaterialComponent.RSPasswordMaterial();
        btnLogin = new RSMaterialComponent.RSButtonShape();

        panelCarga.setBackground(new java.awt.Color(255, 255, 255));
        panelCarga.setMaximumSize(new java.awt.Dimension(256, 210));
        panelCarga.setMinimumSize(new java.awt.Dimension(256, 210));

        rSProgressMaterial1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Espera mientra se carga");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("La aplicacion ...");

        javax.swing.GroupLayout panelCargaLayout = new javax.swing.GroupLayout(panelCarga);
        panelCarga.setLayout(panelCargaLayout);
        panelCargaLayout.setHorizontalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargaLayout.createSequentialGroup()
                .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCargaLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(rSProgressMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCargaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCargaLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelCargaLayout.setVerticalGroup(
            panelCargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSProgressMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(359, 343));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 111, 244), 3));
        panelFondo.setMaximumSize(new java.awt.Dimension(362, 367));
        panelFondo.setMinimumSize(new java.awt.Dimension(362, 367));
        panelFondo.setLayout(null);

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login/user.png"))); // NOI18N
        panelFondo.add(lblUser);
        lblUser.setBounds(40, 140, 83, 50);

        lblPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login/pass.png"))); // NOI18N
        panelFondo.add(lblPass);
        lblPass.setBounds(40, 210, 74, 50);

        btn.setBackground(new java.awt.Color(255, 0, 0));
        btn.setText("Cerrar");
        btn.setFocusPainted(false);
        btn.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        panelFondo.add(btn);
        btn.setBounds(40, 290, 110, 30);

        jPanel1.setBackground(new java.awt.Color(81, 111, 244));

        lblCentral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login/login.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addComponent(lblCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelFondo.add(jPanel1);
        jPanel1.setBounds(0, 0, 360, 120);

        txtUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUser.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtUser.setPlaceholder("Introduce el Usuario");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        panelFondo.add(txtUser);
        txtUser.setBounds(120, 150, 200, 30);

        txtPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPass.setMargin(new java.awt.Insets(3, 10, 3, 6));
        txtPass.setPlaceholder("Introduce Contrasena");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        panelFondo.add(txtPass);
        txtPass.setBounds(120, 230, 200, 30);

        btnLogin.setBackground(new java.awt.Color(81, 111, 244));
        btnLogin.setText("Iniciar Sesion");
        btnLogin.setFocusPainted(false);
        btnLogin.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        panelFondo.add(btnLogin);
        btnLogin.setBounds(190, 290, 110, 30);

        getContentPane().add(panelFondo);

        pack();
    }//GEN-END:initComponents

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            this.txtPass.requestFocus();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            try
        {
            Object[] validacion = this.validar();
            if ((boolean) validacion[0])
            {
                this.dispose();
                hiloCarga = new Thread()
                {
                    @Override
                    public void run()
                    {
                        frameCarga = new FrameCarga();
                        frameCarga.setLocationRelativeTo(null);
                        frameCarga.setVisible(true);  
                        System.out.println("MERA COÑO!");
                        
                    }
                };
                hiloVentana = new Thread()
                {
                    @Override
                    public void run()
                    {
                        try
                        {
                            Thread.currentThread().sleep(1000);
                            VentanaLogin.mostrarVentana();
                            actualizarUserAndRol((String) validacion[1], (String) validacion[2]);
                        } catch (SQLException ex)
                        {
                            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex)
                        {
                            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InterruptedException ex)
                        {
                            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                };
                
                hiloCarga.start();
                try
                {
                    hiloCarga.join();
                    
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                hiloVentana.start();
                
                
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try
        {
            Object[] validacion = this.validar();
            if ((boolean) validacion[0])
            {
                this.dispose();
                hiloCarga = new Thread()
                {
                    @Override
                    public void run()
                    {
                        frameCarga = new FrameCarga();
                        frameCarga.setLocationRelativeTo(null);
                        frameCarga.setVisible(true);  
                        
                    }
                };
                hiloVentana = new Thread()
                {
                    @Override
                    public void run()
                    {
                        try
                        {
                            Thread.currentThread().sleep(1000);
                            VentanaLogin.mostrarVentana();
                            actualizarUserAndRol((String) validacion[1], (String) validacion[2]);
                        } catch (SQLException ex)
                        {
                            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex)
                        {
                            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InterruptedException ex)
                        {
                            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                };
                
                hiloCarga.start();
                try
                {
                    hiloCarga.join();
                    
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                hiloVentana.start();
                
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed
   
    public void actualizarUserAndRol(String user, String rol) throws SQLException, ClassNotFoundException {
        VentanaLogin.ventana.rolLogiau = rol;
        VentanaLogin.ventana.userLogiau = user;
        PanelAdministracion p1 = (PanelAdministracion) FactoriaPanel.getPanel("paneladministracion");
        p1.lblUser.setText(user);
        p1.lblRol.setText(rol);
        if(!rol.equals("MASTER"))
        {
            p1.tablaUsuario.setModel(new DefaultTableModel(new String[][]{},new String[]{}));
        }
        
        PanelClientes p2 = (PanelClientes) FactoriaPanel.getPanel("panelclientes");
        p2.lblUser.setText(user);
        p2.lblRol.setText(rol);
        PanelProveedores p3 = (PanelProveedores) FactoriaPanel.getPanel("panelproveedores");
        p3.lblUser.setText(user);
        p3.lblRol.setText(rol);
        PanelCompras p4 = (PanelCompras) FactoriaPanel.getPanel("panelcompras");
        p4.lblUsuario.setText(user);
        p4.lblRol.setText(rol);
        PanelVentas p5 = (PanelVentas) FactoriaPanel.getPanel("panelventas");
        p5.lblUser.setText(user);
        p5.lblRol.setText(rol);
        PanelProductos p6 = (PanelProductos) FactoriaPanel.getPanel("panelproductos");
        p6.lblUser.setText(user);
        p6.lblRol.setText(rol);

    }


    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnActionPerformed

    public VentanaLogin() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.panelFondo.setBackground(Color.WHITE);

//      this.txtPass.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //this.txtUser.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UI.put("Panel.background", new ColorUIResource(255, 255, 255));

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try
                {
                    boolean validacion = validarConexion();
                    if (validacion)
                    {
                        //VentanaLogin.mostrarVentana();
                        se = new VentanaLogin();
                        se.setVisible(true);
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "No se ha podido establecer conexion con la base de datos\nRevise que su zampp tenga el servisio de Apache y MySql predido");
                        JOptionPane.showMessageDialog(null, "Para ello abra el zampp como administrador y dele a start en el apartado de apache y mysql");
                        System.exit(0);
                    }

                } catch (SQLException ex)
                {
                    Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        setEstilo("Windows");
    }

    public static void setEstilo(String estilo) {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if (estilo.equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
        } catch (InstantiationException ex)
        {
        } catch (IllegalAccessException ex)
        {
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
        }
    }

    public String getUser() {
        String user = this.txtUser.getText();
        return user;
    }

    public String getPass() {
        String pass = this.txtPass.getText();
        return pass;
    }

    public Object[] validar() throws SQLException, ClassNotFoundException {
        boolean passIn = false;
        boolean userIn = false;
        boolean userAndPassIn = false;
        boolean userBlank = false;
        boolean passBlank = false;
        boolean userAndPassBlank = false;
        boolean loginCorrect = false;
        boolean validacion = false;
        String user = "";
        String rol = "";

        ArrayList<Object[]> usuarios = Seleccion.SeleccionarUsuario();

        for (Object[] usuario : usuarios)
        {

            Icon iconoRed = new ImageIcon(getClass().getResource("/imagenes/login/cancel.png"));
            Icon iconoGreen = new ImageIcon(getClass().getResource("/imagenes/login/c2.png"));

            if (this.getPass().equals((String) usuario[3]) && this.getUser().equals((String) usuario[2]))
            {
                JOptionPane.showMessageDialog(null, "      Login Correcto", "Mensaje", JOptionPane.INFORMATION_MESSAGE, iconoGreen);
                user = (String) usuario[2];
                rol = (String) usuario[4];
                validacion = true;
                return new Object[]
                {
                    validacion, user, rol
                };

            } else if (this.getUser().equals("") && this.getPass().equals(""))
            {
                userAndPassBlank = true;
                validacion = false;
            } else if (this.getUser().equals(""))
            {
                validacion = false;
                userBlank = true;
            } else if (this.getPass().equals(""))
            {
                validacion = false;
                passBlank = true;
            } else if (!this.getPass().equals((String) usuario[3]) && !this.getUser().equals((String) usuario[2]))
            {
                validacion = false;
                userAndPassIn = true;
            } else if (!this.getUser().equals((String) usuario[2]))
            {
                validacion = false;
                userIn = true;
            } else if (!this.getPass().equals((String) usuario[3]))
            {
                validacion = false;
                passIn = true;
            }
        }

        // mostrar mensajes sin repetir
        if (userAndPassBlank)
        {
            JOptionPane.showMessageDialog(null, "Usuario y Contrasena en blanco");
        } else if (userBlank)
        {
            JOptionPane.showMessageDialog(null, "Usuario en blanco");
        } else if (passBlank)
        {
            JOptionPane.showMessageDialog(null, "Contrasena en blanco");
        }

        if (userIn)
        {
            JOptionPane.showMessageDialog(null, "Usuario Incoorrecto");
        } else if (passIn)
        {
            JOptionPane.showMessageDialog(null, "Contrasena Incorrecta");
        } else if (userAndPassIn)
        {
            JOptionPane.showMessageDialog(null, "Usuario y contrasena incorrecta");
        }

        return new Object[]
        {
            validacion, user, rol
        };
    }

    public static void mostrarVentana() throws SQLException, ClassNotFoundException {
        ventana = new Ventana();
        ventana.setVisible(true);
    }

    public static boolean validarConexion() throws SQLException, ClassNotFoundException {
        boolean var = false;
        Connection cnx = Conexion.obtenerConexion();
        if (cnx != null)
        {
            var = true;
        } else
        {
            var = false;
        }
        return var;
    }
    public int value = 2; 
    public static VentanaLogin se;
    public static Ventana ventana;
    public static Thread hiloCarga;
    public static FrameCarga frameCarga;
    public static Thread hiloVentana;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape btn;
    public RSMaterialComponent.RSButtonShape btnLogin;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblCentral;
    public javax.swing.JLabel lblPass;
    public javax.swing.JLabel lblUser;
    public javax.swing.JPanel panelCarga;
    public javax.swing.JPanel panelFondo;
    public rojerusan.componentes.RSProgressMaterial rSProgressMaterial1;
    public RSMaterialComponent.RSPasswordMaterial txtPass;
    public RSMaterialComponent.RSTextFieldMaterial txtUser;
    // End of variables declaration//GEN-END:variables
}
