package basedatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Eliminacion 
{
    public static void eliminar(int id,String tabla) throws ClassNotFoundException 
    {
        try{
        Connection cnx = Conexion.obtenerConexion();
        
        String query = "DELETE FROM " + tabla+" WHERE id = ?";
        PreparedStatement st = cnx.prepareStatement(query);
        
        
        st.setInt(1, id);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
        } catch (SQLException ex)
        {
            //JOptionPane
            Logger.getLogger(Eliminacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void eliminarDetalleVenta(int id) throws ClassNotFoundException 
    {
        try{
        Connection cnx = Conexion.obtenerConexion();
        
        String query = "DELETE FROM detalle_venta WHERE id_venta = ?";
        PreparedStatement st = cnx.prepareStatement(query);
        
        
        st.setInt(1, id);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
        } catch (SQLException ex)
        {
            //JOptionPane
            Logger.getLogger(Eliminacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void eliminarProveedor(int id) throws ClassNotFoundException 
    {
        try{
        Connection cnx = Conexion.obtenerConexion();
        
        String query = "UPDATE compra SET compra.id_proveedor = null\n" +
        "WHERE compra.id_proveedor = ?;\n" +
        "\n" +
        "UPDATE productos SET productos.id_proveedor = null\n" +
        "WHERE productos.id_proveedor = ?;\n" +
        "\n" +
        "DELETE FROM proveedores WHERE proveedores.id = ?";
        PreparedStatement st = cnx.prepareStatement(query);
        
        st.setInt(1, id);
        st.setInt(2, id);
        st.setInt(3, id);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
        } catch (SQLException ex)
        {
            //JOptionPane
            Logger.getLogger(Eliminacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void eliminarCategoria(int id) throws SQLException, ClassNotFoundException
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "UPDATE productos SET id_categoria = null WHERE productos.id_categoria = " + id
        + ";\n DELETE FROM categoria WHERE categoria.id = " + id;
        PreparedStatement st = cnx.prepareStatement(query);
        st.executeUpdate();
        
    }
    
    
    
    public static void eliminarCliente(int id) throws ClassNotFoundException 
    {
        try{
        Connection cnx = Conexion.obtenerConexion();
        
        String query = "UPDATE venta SET venta.id_cliente = null WHERE venta.id_cliente = ?;\n" +
        "DELETE FROM clientes WHERE clientes.id = ?;";
        PreparedStatement st = cnx.prepareStatement(query);
        
        st.setInt(1, id);
        st.setInt(2, id);
        
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
        } catch (SQLException ex)
        {
            //JOptionPane
            Logger.getLogger(Eliminacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void eliminarProducto(int id) throws ClassNotFoundException 
    {
        try{
        Connection cnx = Conexion.obtenerConexion();
        
        String query = "DELETE FROM detalle_venta WHERE detalle_venta.id_producto = ?;\n" +
        "DELETE FROM detalle_compra WHERE detalle_compra.id_producto = ?;\n" +
        "DELETE FROM productos WHERE productos.id = ?;";
        PreparedStatement st = cnx.prepareStatement(query);
        
        st.setInt(1, id);
        st.setInt(2, id);
        st.setInt(3, id);
        
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
        } catch (SQLException ex)
        {
            //JOptionPane
            Logger.getLogger(Eliminacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public static void eliminarDetalleCompra(int id) throws ClassNotFoundException 
    {
        try{
        Connection cnx = Conexion.obtenerConexion();
        
        String query = "DELETE FROM detalle_compra WHERE id_compra = ?";
        PreparedStatement st = cnx.prepareStatement(query);
        
        st.setInt(1, id);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
        } catch (SQLException ex)
        {
            //JOptionPane
            Logger.getLogger(Eliminacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void eliminarUsuario(int id) throws SQLException, ClassNotFoundException
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "UPDATE venta set venta.id_usuario = null WHERE venta.id_usuario = ?;\n" +
        "UPDATE compra SET compra.id_usuario = null WHERE compra.id_usuario =  ?;\n" +
        "UPDATE reportes SET reportes.id_usuario = null WHERE reportes.id_usuario = ?;\n" +
        "DELETE FROM usuario WHERE usuario.id = ?;";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setInt(1,id);
        st.setInt(2,id);
        st.setInt(3, id);
        st.setInt(4, id);
        st.executeUpdate();
    }
    
    public static void eliminarTodo(String tabla) throws SQLException, ClassNotFoundException
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "DELETE FROM ? ";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1,tabla);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "ELIMINACION COMPLETA EXITOSA");
        
    }
    
}
