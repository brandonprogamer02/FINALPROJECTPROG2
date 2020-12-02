package administracion;

import interfaz.Ventana;
import reportes_pruebas.*;
import java.util.Date;
import login.*;

public class PanelCalendario extends javax.swing.JPanel {

    public PanelCalendario() 
    {
        initComponents(); 
    }
    public PanelCalendario(String titulo)
    {
        initComponents(); 
        this.lblTitulo.setText(titulo);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new RSMaterialComponent.RSButtonShape();
        calendario = new newscomponents.RSCalendar();
        btnExit = new RSMaterialComponent.RSButtonShape();
        lblTitulo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(392, 338));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Fecha Actual");
        add(jLabel2);
        jLabel2.setBounds(110, 300, 100, 20);

        btnAceptar.setBackground(new java.awt.Color(81, 111, 244));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBackgroundHover(new java.awt.Color(81, 111, 244));
        btnAceptar.setFocusPainted(false);
        btnAceptar.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        add(btnAceptar);
        btnAceptar.setBounds(150, 260, 90, 20);

        calendario.setBackground(new java.awt.Color(81, 111, 244));
        calendario.setBgColor(new java.awt.Color(81, 111, 244));
        add(calendario);
        calendario.setBounds(0, 26, 392, 310);

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setText("X");
        btnExit.setBackgroundHover(new java.awt.Color(204, 0, 0));
        btnExit.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        add(btnExit);
        btnExit.setBounds(360, 0, 30, 20);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 255));
        lblTitulo.setText("CALENDARIO");
        add(lblTitulo);
        lblTitulo.setBounds(130, 0, 170, 20);
    }//GEN-END:initComponents
    int x = 0;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        PanelAdministracion f = (PanelAdministracion)VentanaLogin.ventana.getPanelActual();
        f.popu.removeAll();
        f.popu.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        setAccionBtnAceptar();
        PanelAdministracion f = (PanelAdministracion)VentanaLogin.ventana.getPanelActual();
        f.popu.removeAll();
        f.popu.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed
    
    public String getMes()
    {
        Date fecha = this.calendario.getDate();
        int dia = Integer.valueOf(fecha.getMonth() ) +1;
        
        String dia2 = String.valueOf(dia);
        
        return dia2;
    }
    public String getAno()
    {
        Date fecha = this.calendario.getDate();
       
        String ano = "";
        if(Integer.valueOf(fecha.getYear()) <100)
        {
            ano = "19" + String.valueOf(fecha.getYear());
        }else if(Integer.valueOf(fecha.getYear()) >=100 && Integer.valueOf(fecha.getYear()) < 200 )
        {
            if(Integer.valueOf(fecha.getYear()) -100 >= 0 && Integer.valueOf(fecha.getYear()) -100 <= 9)
            {
                ano = "200" + String.valueOf(Integer.valueOf(fecha.getYear()) -100) ;
            }else
            {
            ano = "20" + String.valueOf(Integer.valueOf(fecha.getYear()) -100);
            }
        }else if(Integer.valueOf(fecha.getYear()) >=200 )
        {
            ano = "2" + String.valueOf(Integer.valueOf(fecha.getYear()) -100);
        }
       
        return ano;
    }
    public String getDia()
    {
        Date fecha = this.calendario.getDate();
        
        String dia = String.valueOf(fecha);
        dia = dia.substring(8,10);
        
        return dia;
    }
    
    
    public void setAccionBtnAceptar()
    {  
    }
    Date fecha = new Date();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonShape btnAceptar;
    public RSMaterialComponent.RSButtonShape btnExit;
    public newscomponents.RSCalendar calendario;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
