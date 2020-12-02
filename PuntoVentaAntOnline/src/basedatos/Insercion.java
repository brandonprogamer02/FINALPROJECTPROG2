package basedatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Insercion {

    public static void insertarCategoria(String nombre) throws SQLException, ClassNotFoundException {
        Connection cnx = Conexion.obtenerConexion();
        String query = "INSERT INTO categoria VALUES(null,?)";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1, nombre);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "INSERCION EXITOSA");
    }

    public static void insertarUsuario(String nombre, String usuario, String contrasena, String rol) throws SQLException, ClassNotFoundException {
        Connection cnx = Conexion.obtenerConexion();
        String query = "INSERT INTO usuario VALUES(null,?,?,?,?)";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1, nombre);
        st.setString(2, usuario);
        st.setString(3, contrasena);
        st.setString(4, rol);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "INSERCION EXITOSA");
    }

    public static void insertarCliente(String nombre, String correo, String ciudad, String sector, String calle, String numero)
            throws SQLException, ClassNotFoundException {
        Connection cnx = Conexion.obtenerConexion();
        String query = "INSERT INTO clientes VALUES(null,?,?,?,?,?,?)";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1, nombre);
        st.setString(2, correo);
        st.setString(3, ciudad);
        st.setString(4, sector);
        st.setString(5, calle);
        st.setString(6, numero);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "INSERCION EXITOSA");

    }

    public static void insertarProveedores(String nombre, String compania, String ciudad, String sector, String calle, int numeroIdentificativo)
            throws SQLException, ClassNotFoundException {
        Connection cnx = Conexion.obtenerConexion();
        String query = "INSERT INTO proveedores VALUES(null,?,?,?,?,?,?)";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1, nombre);
        st.setString(2, compania);
        st.setString(3, ciudad);
        st.setString(4, sector);
        st.setString(5, calle);
        st.setInt(6, numeroIdentificativo);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "INSERCION EXITOSA");

    }

    public static void insertarProductos(String nombre, int proveedor, int categoria, String medida)
            throws SQLException, ClassNotFoundException {
        Connection cnx = Conexion.obtenerConexion();
        String query = "INSERT INTO productos(nombre,id_proveedor,id_categoria,medida) VALUES(?,?,?,?)";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1, nombre);
        st.setInt(2, proveedor);
        st.setInt(3, categoria);
        st.setString(4, medida);

        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "INSERCION EXITOSA");

    }

    public static void insertarVentas(int idUsuario, int idCliente, Date fecha,
            double pagoCliente, double devuelta, double descuento, double total, String estado)
            throws SQLException, ClassNotFoundException {
        Connection cnx = Conexion.obtenerConexion();
        String query = "INSERT INTO venta(id_usuario,id_cliente,fecha,pago_cliente,devuelta,"
                + "descuento,total,estado) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setInt(1, idUsuario);
        st.setInt(2, idCliente);
        Timestamp f1 = new Timestamp(fecha.getTime());
        System.out.println("EN INSERCION ES:" + f1.getYear());
        System.out.println("EL GET TIME: " + f1.getTime());
        System.out.println("EL GET DATE: " + f1.getDate());
        st.setTimestamp(3, f1);
        st.setDouble(4, pagoCliente);
        st.setDouble(5, devuelta);
        st.setDouble(6, descuento);
        st.setDouble(7, total);
        st.setString(8, estado);

        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "INSERCION EXITOSA");

    }

    public static void insertarDetalleVentas(int idVenta, int idProducto, int cantidad)
            throws SQLException, ClassNotFoundException {
        Connection cnx = Conexion.obtenerConexion();
        String query = "INSERT INTO detalle_venta(id_venta,id_producto,cantidad) VALUES (?,?,?)";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setInt(1, idVenta);
        st.setInt(2, idProducto);
        st.setInt(3, cantidad);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "INSERCION EXITOSA");

    }
    public static void insertarDetalleCompra(int idCompra, int idProducto, int precioVenta,int precioCompra,int cantidad)
            throws SQLException, ClassNotFoundException {
        Connection cnx = Conexion.obtenerConexion();
        String query = "INSERT INTO detalle_compra(id_compra,id_producto,precio_venta,precio_compra,cantidad) VALUES (?,?,?,?,?)";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setInt(1, idCompra);
        st.setInt(2, idProducto);
        st.setInt(3, precioVenta);
        st.setInt(4, precioCompra);
        st.setInt(5, cantidad);
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "INSERCION EXITOSA");

    }

    public static void insertarCompras(int idUsuario, int idProveedor, double total,
            String metodoEnvio, Date fecha, String estado)
            throws SQLException, ClassNotFoundException 
    {
        Connection cnx = Conexion.obtenerConexion();
        String query = "INSERT INTO compra(id_usuario,id_proveedor,total,metodo_envio,fecha,"
                + "estado,cantidad_pago) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement st = cnx.prepareStatement(query);
        st.setInt(1, idUsuario);
        st.setInt(2, idProveedor);
        st.setDouble(3, total);
        st.setString(4, metodoEnvio);
        java.sql.Date f1 = new java.sql.Date(fecha.getTime());
        st.setDate(5, f1);
        st.setString(6, estado);
        st.setInt(7, 0);
       
        st.executeUpdate();
        JOptionPane.showMessageDialog(null, "INSERCION EXITOSA");

    }

}
