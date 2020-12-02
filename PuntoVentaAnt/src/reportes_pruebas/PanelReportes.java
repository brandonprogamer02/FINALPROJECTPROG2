package reportes_pruebas;



import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import basedatos.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.sql.Connection;
//import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import login.VentanaLogin;

public class PanelReportes extends javax.swing.JPanel {

    public PanelReportes() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        popu = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        popuBusqueda = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        btnbtn = new RSMaterialComponent.RSButtonShape();
        click = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        txt = new RSMaterialComponent.RSTextFieldMaterial();
        btnBusqueda = new javax.swing.JButton();
        btnFrame = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        popu.add(jMenu1);

        jMenuItem3.setText("Busqueda 1");
        popuBusqueda.add(jMenuItem3);

        jMenuItem4.setText("Busqueda 2");
        popuBusqueda.add(jMenuItem4);

        btnbtn.setBackground(new java.awt.Color(0, 153, 153));
        btnbtn.setText("busqueda");
        btnbtn.setBackgroundHover(new java.awt.Color(0, 153, 153));
        btnbtn.setForma(RSMaterialComponent.RSButtonShape.FORMA.RECT);
        btnbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        click.setText("Clck Me");
        click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton2.setText("obtener");

        btnReporte.setText("Generar Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        txt.setPlaceholder("Escribe para buscar");
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKeyReleased(evt);
            }
        });

        btnBusqueda.setText("Boton Buscar");
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseClicked(evt);
            }
        });

        btnFrame.setText("CLICK ME");
        btnFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(click)
                                .addGap(32, 32, 32)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(btnReporte))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBusqueda))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnFrame)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(click)
                    .addComponent(jButton2)
                    .addComponent(btnReporte))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnFrame)
                .addGap(53, 53, 53))
        );
    }//GEN-END:initComponents

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        f = new JFrame();
        f.setSize(new Dimension(400, 300));
        f.setLocationRelativeTo(null);
        f.setLayout(new GridLayout());
        PanelReportes sa = new PanelReportes();
        f.add(sa);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       ArrayList<String> words2 = new ArrayList<>(); 
       words2.add("ehello"); 
       words2.add("eheritage"); 
       words2.add("eholacomoestapedroelmayor"); 
       words2.add("egoodbye"); 
       words2.add("ecruel"); 
       words2.add("ecar"); 
       words2.add("ewar"); 
       words2.add("ewill"); 
       words2.add("eworld"); 
       words2.add("ewall"); 
       words2.add("elite"); 
       words2.add("elpenco"); 
       words2.add("eros"); 
       
       String letra = sa.txt.getText();
       lista = Seleccion.seleccionarClientesNombre(letra);
       DialogTexto.accion(sa.txt, f, lista);
        
        
        
        popu = new JPopupMenu();
        popuBusqueda = new JPopupMenu();
        crearCarpetaReportes();

        calendario = new PanelCalendario("Fecha Inicio") {
            @Override
            public void setAccionBtnAceptar() {
                Date fecha = this.calendario.getDate();
                System.out.println(String.format("%s/%s/%s", this.getAno(), this.getMes(), this.getDia()));
            }
        };

        popu.add(calendario);

    }


    private void clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMouseClicked

        System.out.println("entro");
        popu.setLocation(evt.getLocationOnScreen());
        popu.setVisible(true);
        System.out.println("ahora aqui");
    }//GEN-LAST:event_clickMouseClicked
    public void getLista()
    {
        
    }
    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed

        try
        {
            Document documento = new Document();
            File ruta = new File("reportes_generados/reporte.pdf");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta));
            Paragraph parrafos = new Paragraph();
            parrafos.setAlignment(Paragraph.ALIGN_CENTER);
            parrafos.setFont(FontFactory.getFont("Segoe UI", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafos.add("Brandon Soft Technology\n");
            parrafos.setFont(FontFactory.getFont("Segoe UI", 16, Font.BOLD, BaseColor.DARK_GRAY));
            parrafos.add("Reporte de Compra\n\n");
            parrafos.setFont(FontFactory.getFont("Segoe UI", 15, Font.BOLD, BaseColor.DARK_GRAY));
            parrafos.add("2020/10/03  -  2020/10/04\n\n\n");

            documento.open();
            documento.add(parrafos);
            PdfPTable tabla = new PdfPTable(8);
            tabla.setHorizontalAlignment(PdfPTable.ALIGN_CENTER);
            float[] columnWidths = new float[]{5f, 30f, 30f, 15f,16f,16f,20f,20f}; 
            tabla.setWidths(columnWidths); 
            tabla.setWidthPercentage(110);
            tabla.addCell("ID");
            tabla.addCell("PRODUCTO");
            tabla.addCell("MEDIDA");
            tabla.addCell("STOCK");
            tabla.addCell("PRECIO VENTA");
            tabla.addCell("PRECIO COMPRA");
            tabla.addCell("PROVEEDOR");
            tabla.addCell("CATEGORIA");

            Connection cnx = Conexion.obtenerConexion();
            String query = "SELECT productos.id, productos.nombre as producto,"
                    + "categoria.id as categoria,productos.medida, productos.precio_venta, "
                    + "productos.precio_compra,productos.stock,"
                    + "proveedores.nombre_contacto\n"
                    + "FROM productos\n"
                    + "INNER JOIN proveedores on proveedores.id = productos.id_proveedor\n"
                    + "INNER JOIN categoria on categoria.id = productos.id_categoria";
            PreparedStatement st = (PreparedStatement) cnx.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                tabla.addCell(rs.getString("id"));
                System.out.println("1 - " + rs.getString("id"));
                tabla.addCell(rs.getString("producto"));
                System.out.println("1 - " + rs.getString("producto"));
                tabla.addCell(rs.getString("categoria"));
                System.out.println("1 - " + rs.getString("categoria"));
                tabla.addCell(rs.getString("medida"));
                System.out.println("1 - " + rs.getString("medida"));
                tabla.addCell(rs.getString("precio_venta"));
                System.out.println("1 - " + rs.getString("precio_venta"));
                tabla.addCell(rs.getString("precio_compra"));
                System.out.println("1 - " + rs.getString("precio_compra"));
                tabla.addCell(rs.getString("stock"));
                System.out.println("1 - " + rs.getString("stock"));
                tabla.addCell(rs.getString("nombre_contacto"));
                System.out.println("1 - " + rs.getString("nombre_contacto"));
                System.out.println("--------------------------------------");
            }
            documento.add(tabla);
            documento.close();
            JOptionPane.showMessageDialog(null, "reporte generau");

        } catch (SQLException ex)
        {
            Logger.getLogger(PanelReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(PanelReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex)
        {
            Logger.getLogger(PanelReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseClicked
        /*popuBusqueda.setBackground(Color.WHITE);
        popuBusqueda.add(this.btnbtn);
        popuBusqueda.add(jMenuItem1);

        popuBusqueda.add(new JButton("Click Me"));

        System.out.println("entro");
        Point f = this.txt.getLocation();
        f.setLocation(f.getX(), f.getY() + 25);
        popuBusqueda.setLocation(evt.getLocationOnScreen());
        popuBusqueda.setVisible(true);*/
        
    }//GEN-LAST:event_btnBusquedaMouseClicked

    private void txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyReleased
        
        try
        {
            System.out.println("entro en evento teclear");
            String letra = this.txt.getText();
            lista = Seleccion.seleccionarClientesNombre(letra);
            System.out.println("LA LISTA CONTIENE:");
            for(String e: lista)
            {
                System.out.println("* " + e);
                       
            }
            DialogTexto.accion(this.txt, f, lista);
            
        } catch (SQLException ex)
        {
            Logger.getLogger(PanelReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(PanelReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_txtKeyReleased

    private void btnFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrameActionPerformed
        login.FrameCarga f = new login.FrameCarga();
        f.setLocationRelativeTo(null); 
        f.setVisible(true);
        
    }//GEN-LAST:event_btnFrameActionPerformed
    
    

    public static void crearCarpetaReportes() {
        File directorio = new File("reportes_generados");
        if (!directorio.exists())
        {
            System.out.println("Directorio no existe");
            if (directorio.mkdirs())
            {
                System.out.println("Directorio creado");
            } else
            {
                System.out.println("Error al crear directorio");
            }
        } else
        {
            System.out.println("Directorio ya existe");
        }
    }
    static ArrayList<String> lista = new ArrayList();
    static PanelCalendario calendario;
    static JFrame f;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBusqueda;
    public javax.swing.JButton btnFrame;
    public javax.swing.JButton btnReporte;
    public RSMaterialComponent.RSButtonShape btnbtn;
    public javax.swing.JButton click;
    public javax.swing.JButton jButton2;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JMenuItem jMenuItem3;
    public javax.swing.JMenuItem jMenuItem4;
    public static javax.swing.JPopupMenu popu;
    public static javax.swing.JPopupMenu popuBusqueda;
    public RSMaterialComponent.RSTextFieldMaterial txt;
    // End of variables declaration//GEN-END:variables
}
