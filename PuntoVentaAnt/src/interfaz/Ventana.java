package interfaz;

import RSMaterialComponent.RSTableMetroCustom;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import productos.*;
import administracion.*;
import clientes.PanelClientes;
import compra.PanelCompras;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import login.VentanaLogin;
import proveedores.PanelProveedores;
import rojeru_san.complementos.RSAnimation;
import ventas.PanelVentas;

public class Ventana extends javax.swing.JFrame {

    public String rolLogiau = "";
    public String userLogiau = "";

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        panelBarra = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnMinimizar = new RSMaterialComponent.RSButtonShape();
        btnCerrar = new RSMaterialComponent.RSButtonShape();
        panelFrame = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        btnVenta = new RSMaterialComponent.RSButtonShape();
        btnProductos = new RSMaterialComponent.RSButtonShape();
        btnClientes = new RSMaterialComponent.RSButtonShape();
        btnCompra = new RSMaterialComponent.RSButtonShape();
        btnProveedores = new RSMaterialComponent.RSButtonShape();
        btnAdministracion = new RSMaterialComponent.RSButtonShape();
        panelPayola = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lbla = new javax.swing.JLabel();
        panelBackground = new javax.swing.JPanel();
        lblText2 = new javax.swing.JLabel();
        lblText1 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1060, 460));
        setSize(new java.awt.Dimension(900, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panelBarra.setBackground(new java.awt.Color(81, 111, 244));
        panelBarra.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelBarraMouseDragged(evt);
            }
        });
        panelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBarraMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(81, 111, 244));
        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setText("-");
        btnMinimizar.setBackgroundHover(new java.awt.Color(153, 204, 255));
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnMinimizar.setForegroundText(new java.awt.Color(81, 111, 244));
        btnMinimizar.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMinimizar);

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("X");
        btnCerrar.setBackgroundHover(new java.awt.Color(255, 51, 51));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setForegroundText(new java.awt.Color(81, 111, 244));
        btnCerrar.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrar);

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
        );

        panelFrame.setBackground(new java.awt.Color(255, 255, 255));
        panelFrame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(81, 111, 244), 3, true));
        panelFrame.setMaximumSize(new java.awt.Dimension(500, 415));
        panelFrame.setMinimumSize(new java.awt.Dimension(0, 0));
        panelFrame.setPreferredSize(new java.awt.Dimension(900, 450));

        panelLateral.setBackground(new java.awt.Color(255, 255, 255));
        panelLateral.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 4, new java.awt.Color(81, 111, 244)));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new java.awt.GridLayout(6, 1, 0, 20));

        btnVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnVenta.setBorder(new javax.swing.border.MatteBorder(null));
        btnVenta.setText("Venta");
        btnVenta.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnVenta.setFocusPainted(false);
        btnVenta.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnVenta.setForegroundText(new java.awt.Color(81, 111, 244));
        btnVenta.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVenta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        jPanel23.add(btnVenta);

        btnProductos.setBackground(new java.awt.Color(255, 255, 255));
        btnProductos.setForeground(new java.awt.Color(51, 51, 255));
        btnProductos.setText("Productos");
        btnProductos.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnProductos.setFocusPainted(false);
        btnProductos.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnProductos.setForegroundText(new java.awt.Color(81, 111, 244));
        btnProductos.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel23.add(btnProductos);

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setForeground(new java.awt.Color(51, 51, 255));
        btnClientes.setText("Clientes");
        btnClientes.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnClientes.setFocusPainted(false);
        btnClientes.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnClientes.setForegroundText(new java.awt.Color(81, 111, 244));
        btnClientes.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel23.add(btnClientes);

        btnCompra.setBackground(new java.awt.Color(255, 255, 255));
        btnCompra.setForeground(new java.awt.Color(51, 51, 255));
        btnCompra.setText("Compra");
        btnCompra.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnCompra.setFocusPainted(false);
        btnCompra.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnCompra.setForegroundText(new java.awt.Color(81, 111, 244));
        btnCompra.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCompra.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });
        jPanel23.add(btnCompra);

        btnProveedores.setBackground(new java.awt.Color(255, 255, 255));
        btnProveedores.setForeground(new java.awt.Color(51, 51, 255));
        btnProveedores.setText("Proveedores");
        btnProveedores.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnProveedores.setFocusPainted(false);
        btnProveedores.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnProveedores.setForegroundText(new java.awt.Color(81, 111, 244));
        btnProveedores.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jPanel23.add(btnProveedores);

        btnAdministracion.setBackground(new java.awt.Color(255, 255, 255));
        btnAdministracion.setForeground(new java.awt.Color(51, 51, 255));
        btnAdministracion.setText("Administracion");
        btnAdministracion.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnAdministracion.setFocusPainted(false);
        btnAdministracion.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        btnAdministracion.setForegroundText(new java.awt.Color(81, 111, 244));
        btnAdministracion.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnAdministracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdministracion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracionActionPerformed(evt);
            }
        });
        jPanel23.add(btnAdministracion);

        panelPayola.setBackground(new java.awt.Color(81, 111, 244));
        panelPayola.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Punto de Venta");

        lbla.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbla.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPayolaLayout = new javax.swing.GroupLayout(panelPayola);
        panelPayola.setLayout(panelPayolaLayout);
        panelPayolaLayout.setHorizontalGroup(
            panelPayolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPayolaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPayolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbla, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelPayolaLayout.setVerticalGroup(
            panelPayolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPayolaLayout.createSequentialGroup()
                .addComponent(lbla, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
            .addComponent(panelPayola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralLayout.createSequentialGroup()
                .addComponent(panelPayola, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setLayout(null);

        lblText2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 40)); // NOI18N
        lblText2.setForeground(new java.awt.Color(255, 255, 255));
        lblText2.setText("Punto de Venta Ecommer");
        panelBackground.add(lblText2);
        lblText2.setBounds(190, 90, 510, 60);

        lblText1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 3, 60)); // NOI18N
        lblText1.setForeground(new java.awt.Color(255, 255, 255));
        lblText1.setText("BrandonSoft Technology");
        panelBackground.add(lblText1);
        lblText1.setBounds(90, 20, 720, 80);

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        panelBackground.add(lblImagen);
        lblImagen.setBounds(10, 0, 860, 410);

        javax.swing.GroupLayout panelFrameLayout = new javax.swing.GroupLayout(panelFrame);
        panelFrame.setLayout(panelFrameLayout);
        panelFrameLayout.setHorizontalGroup(
            panelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFrameLayout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFrameLayout.setVerticalGroup(
            panelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
            .addComponent(panelBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }//GEN-END:initComponents

    public Point locationCentrado = new Point();

    public Ventana() throws SQLException, ClassNotFoundException {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.locationCentrado.setLocation(this.getX(), this.getY());
        this.lbla.setText("<html><p>Brandon Soft <nr>   Technology</p></html>");

        this.panelVentas = new PanelVentas();
        this.panelVentas.setName("panelventas");
        this.panelProductos = new PanelProductos();
        this.panelProductos.setName("panelproductos");
        this.panelClientes = new PanelClientes();
        this.panelClientes.setName("panelclientes");
        this.panelCompras = new PanelCompras();
        this.panelCompras.setName("panelcompras");
        this.panelProveedores = new PanelProveedores();
        this.panelProveedores.setName("panelproveedores");
        this.panelAdministracion = new PanelAdministracion();
        this.panelAdministracion.setName("paneladministracion");

        this.panelBackground.add(panelVentas);
        this.panelVentas.setBounds(0, 0, 876, 408);
        //this.panelVentas.setVisible(false);

        this.panelBackground.add(panelProductos);
        this.panelProductos.setBounds(0, 0, 876, 408);
        //this.panelProductos.setVisible(false);

        this.panelBackground.add(panelClientes);
        this.panelClientes.setBounds(0, 0, 876, 408);
        //this.panelClientes.setVisible(false);

        this.panelBackground.add(panelCompras);
        this.panelCompras.setBounds(0, 0, 876, 408);
        //this.panelCompras.setVisible(false);

        this.panelBackground.add(panelProveedores);
        this.panelProveedores.setBounds(0, 0, 876, 408);
        //this.panelProveedores.setVisible(false);

        this.panelBackground.add(panelAdministracion);
        this.panelAdministracion.setBounds(0, 0, 876, 408);
        //panelAdministracion.setVisible(false);

        this.ocultarTodosPanel();
        //VentanaLogin.se.dispose();
        VentanaLogin.hiloCarga.stop();
        VentanaLogin.frameCarga.dispose();
    }


    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed

        try
        {
            //this.panelBackground.add(new PanelProductos());
            this.actualizarPanel("panelproductos");
            this.seleccionarBtn("productos");
        } catch (SQLException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed

        try
        {
            RSAnimation f = new RSAnimation();
            f.setBajar((int) this.locationCentrado.getY(), 1300, 1, 2, this);
            Thread.sleep(300);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setSize(900, 460);
        this.setLocationRelativeTo(null);

    }//GEN-LAST:event_formWindowActivated

    private void btnAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministracionActionPerformed

        try
        {
            if (this.rolLogiau.equals("Vendedor"))
            {
                JOptionPane.showMessageDialog(null, "Con tu cuenta de caracter 'Vendedor' no puedes acceder a este apartado !");
                PanelAdministracion f = (PanelAdministracion) FactoriaPanel.getPanel("paneladministracion");

            } else if (this.rolLogiau.equals("Administrador"))
            {
                PanelAdministracion f = (PanelAdministracion) FactoriaPanel.getPanel("paneladministracion");
                f.tabbledPane.remove(1);
                actualizarPanel("paneladministracion");
                this.seleccionarBtn("administracion");
            } else if (this.rolLogiau.equals("MASTER"))
            {
                actualizarPanel("paneladministracion");
                this.seleccionarBtn("administracion");
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAdministracionActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        try
        {
            if (this.rolLogiau.equals("Vendedor"))
            {
                JOptionPane.showMessageDialog(null, "Con tu cuenta de caracter 'Vendedor' no puedes acceeder a este apartado");
            } else if (this.rolLogiau.equals("Administrador") || this.rolLogiau.equals("MASTER"))
            {
                actualizarPanel("panelclientes");
                this.seleccionarBtn("clientes");
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        try
        {
            actualizarPanel("panelventas");
            this.seleccionarBtn("venta");
        } catch (SQLException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        try
        {
            if (this.rolLogiau.equals("Vendedor"))
            {
                JOptionPane.showMessageDialog(null, "Con tu cuenta de caracter 'Vendedor' no puedes accender a este apartado!");
            } else if (this.rolLogiau.equals("Administrador") || this.rolLogiau.equals("MASTER"))
            {
                PanelCompras f = new PanelCompras();
                actualizarPanel("panelcompras");
                this.seleccionarBtn("compra");
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        try
        {
            if (this.rolLogiau.equals("Vendedor"))
            {
                JOptionPane.showMessageDialog(null, "Con tu cuenta de caracter 'Vendedor' no puedes acceder a este apartado!");
            } else if (this.rolLogiau.equals("Administrador") || this.rolLogiau.equals("MASTER"))
            {
                actualizarPanel("panelproveedores");
                this.seleccionarBtn("proveedores");
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProveedoresActionPerformed
    
    int xx=0;
    int yy=0;
    
    private void panelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_panelBarraMouseDragged

    private void panelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBarraMousePressed
        
        xx=evt.getX();
        yy=evt.getY(); 
        
    }//GEN-LAST:event_panelBarraMousePressed
    public void seleccionarBtn(String nombre) {
        this.btnAdministracion.setSelected(false);
        this.btnClientes.setSelected(false);
        this.btnCompra.setSelected(false);
        this.btnProductos.setSelected(false);
        this.btnVenta.setSelected(false);
        this.btnProveedores.setSelected(false);
        switch (nombre)
        {
            case "venta":
                this.btnVenta.setSelected(true);
                break;
            case "clientes":
                this.btnClientes.setSelected(true);
                break;
            case "compra":
                this.btnCompra.setSelected(true);
                break;
            case "productos":
                this.btnProductos.setSelected(true);
                break;
            case "administracion":
                this.btnAdministracion.setSelected(true);
                break;
            case "proveedores":
                this.btnProveedores.setSelected(true);
                break;

        }

    }

    public void anadirToLista(JPanel panel) {
        try
        {
            lista.set(0, panel);
        } catch (java.lang.IndexOutOfBoundsException e)
        {
            lista.add(panel);
        }
    }
    public JPanel getPanelActual() {
        //panel.setVisible(true);
        return lista.get(0);
    }
    public void actualizarPanel(String nombrePanel) throws SQLException, ClassNotFoundException {
       
        this.panelBackground.validate();
        this.panelBackground.repaint();
        this.ocultarTodosPanel();
        // ocultamos las imagenes de fondo
        this.lblText1.setVisible(false);
        this.lblText2.setVisible(false);
        this.lblImagen.setVisible(false);
        JPanel f = FactoriaPanel.getPanel(nombrePanel);
        f.setVisible(true);
        this.panelBackground.revalidate();
        anadirToLista(f);
    }

    public void ocultarTodosPanel() {
        this.panelVentas.setVisible(false);
        this.panelProductos.setVisible(false);
        this.panelClientes.setVisible(false);
        this.panelCompras.setVisible(false);
        this.panelProveedores.setVisible(false);
        this.panelAdministracion.setVisible(false);

    }

    public int obtenerIdSeleccionado(RSTableMetroCustom tabla) {
        int idSeleccionado;
        int indiceSeleccionado = tabla.getSelectedRow();
        try
        {
            idSeleccionado = (int) tabla.getModel().getValueAt(indiceSeleccionado, 0);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            idSeleccionado = -1;
        }
        return idSeleccionado;
    }

 
    PanelVentas panelVentas;
    PanelProductos panelProductos;
    PanelClientes panelClientes;
    PanelCompras panelCompras;
    PanelProveedores panelProveedores;
    PanelAdministracion panelAdministracion;

    public static ArrayList<JPanel> lista = new ArrayList();
    //public static Ventana ventana;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape btnAdministracion;
    public RSMaterialComponent.RSButtonShape btnCerrar;
    public RSMaterialComponent.RSButtonShape btnClientes;
    public RSMaterialComponent.RSButtonShape btnCompra;
    public RSMaterialComponent.RSButtonShape btnMinimizar;
    public RSMaterialComponent.RSButtonShape btnProductos;
    public RSMaterialComponent.RSButtonShape btnProveedores;
    public RSMaterialComponent.RSButtonShape btnVenta;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel23;
    public javax.swing.JLabel lblImagen;
    public javax.swing.JLabel lblText1;
    public javax.swing.JLabel lblText2;
    public javax.swing.JLabel lbla;
    public javax.swing.JPanel panelBackground;
    public javax.swing.JPanel panelBarra;
    public javax.swing.JPanel panelFrame;
    public javax.swing.JPanel panelLateral;
    public javax.swing.JPanel panelPayola;
    // End of variables declaration//GEN-END:variables
}
