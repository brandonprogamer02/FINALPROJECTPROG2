package basedatos;

import com.mysql.jdbc.MysqlDataTruncation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Actualizacion 
{
    public static void actualizarCategoria(String nombre, int id) throws SQLException, ClassNotFoundException
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "UPDATE categoria SET nombre = ? WHERE id = ?";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1, nombre);
        st.setInt(2, id);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ACTUALIZACION EXITOSA");
    }
    public static void actualizarUsuario(String nombre,String usuario,String contrasena,String rol, int id) throws SQLException, ClassNotFoundException
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "UPDATE usuario SET nombre = ?, usuario = ?,contrasena = ?,rol = ? WHERE id = ?";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1, nombre);
        st.setString(2, usuario);
        st.setString(3, contrasena);
        st.setString(4, rol);
        st.setInt(5, id);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ACTUALIZACION EXITOSA");
    }
    public static void actualizarClientes
    (String nombre, String correo,String ciudad,String sector,String calle,String numero,int id) 
    throws SQLException, ClassNotFoundException
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "UPDATE clientes SET nombre = ?, correo = ?,ciudad = ?,sector = ?,calle = ?,numero_celular = ? WHERE id = ?";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1, nombre);
        st.setString(2, correo);
        st.setString(3, ciudad);
        st.setString(4, sector);
        st.setString(5, calle);
        st.setString(6, numero);
        st.setInt(7, id);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ACTUALIZACION EXITOSA");
        
    }
    
    public static void actualizarProveedores
    (String nombre, String compania,String ciudad,String sector,String calle,int numero,int id) 
    throws SQLException, ClassNotFoundException
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "UPDATE proveedores SET nombre_contacto = ?, nombre_compania = ?,ciudad = ?,sector = ?,calle = ?,numero_identificativo = ? WHERE id = ?";
        
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1, nombre);
        st.setString(2, compania);
        st.setString(3, ciudad);
        st.setString(4, sector);
        st.setString(5, calle);
        st.setInt(6, numero);
        st.setInt(7, id);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ACTUALIZACION EXITOSA");
        
    }
    public static void actualizarProductos
    (int idProveedor, int idCategoria,String nombre ,String medida,double precioVenta,double precioCompra,int stock,int id) 
    throws SQLException, ClassNotFoundException
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "UPDATE productos SET id_proveedor = ?,id_categoria = ?,nombre = ?,medida = ?,"
        + "precio_venta = ?,precio_compra = ?,stock = ? WHERE productos.id = ?";
        
        PreparedStatement st = cnx.prepareStatement(query);
        st.setInt(1, idProveedor);
        st.setInt(2, idCategoria);
        st.setString(3, nombre);
        st.setString(4, medida);
        st.setDouble(5, precioVenta);
        st.setDouble(6, precioCompra);
        st.setInt(7, stock);
        st.setInt(8, id);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ACTUALIZACION EXITOSA");
        
    }
    public static void actualizarVentas
    (double pagoCliente, double devuelta,double descuento ,double total,String estado,int id) 
    throws SQLException, ClassNotFoundException
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "UPDATE venta SET pago_cliente = ?, devuelta = ?, descuento = ?,total = ?, estado = ? WHERE id = ?";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setDouble(1, pagoCliente);
        st.setDouble(2, devuelta);
        st.setDouble(3, descuento);
        st.setDouble(4, total);
        st.setString(5, estado);
        st.setInt(6, id);
        
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ACTUALIZACION EXITOSA");
        
    }
    
    public static void actualizarCompras
    (double total,int cantidadPago,String estado,int id) 
    throws SQLException, ClassNotFoundException
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "UPDATE compra SET total = ?,cantidad_pago = ?, estado = ? WHERE id = ?";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setDouble(1, total);
        st.setInt(2, cantidadPago);
        st.setString(3,estado);
        st.setInt(4, id);
        
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ACTUALIZACION EXITOSA");
        
    }
    
    
    
}
