package basedatos;

import compra.PanelCompras;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import login.VentanaLogin;

public class Seleccion 
{
    public static ArrayList<Object[]> SeleccionarTodoCategoria() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM categoria");

        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            lista.add(new Object[]{id,nombre});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> SeleccionarCategoria(String Nombre) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM categoria WHERE nombre = ?");
        st.setString(1, Nombre);

        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            lista.add(new Object[]{id,nombre});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> SeleccionarUsuario() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM usuario");

        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String usuario = resultado.getString("usuario");
            String contrasena = resultado.getString("contrasena");
            String rol = resultado.getString("rol");
            lista.add(new Object[]{id,nombre,usuario,contrasena,rol});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> SeleccionarUsuarioLike(String filtro) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM usuario WHERE usuario.nombre LIKE '%"+ filtro+"%' ");

        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String usuario = resultado.getString("usuario");
            String contrasena = resultado.getString("contrasena");
            String rol = resultado.getString("rol");
            lista.add(new Object[]{id,nombre,usuario,contrasena,rol});
        }
        
        return lista;
    }
    
    public static ArrayList<Object[]> SeleccionarUsuario(int id) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM usuario WHERE id = ?");
        st.setInt(1, id);
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int Id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String usuario = resultado.getString("usuario");
            String contrasena = resultado.getString("contrasena");
            String rol = resultado.getString("rol");
            lista.add(new Object[]{Id,nombre,usuario,contrasena,rol});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> SeleccionarUsuario(String Usuario) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM usuario WHERE usuario = ?");
        st.setString(1, Usuario);
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int Id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String usuario = resultado.getString("usuario");
            String contrasena = resultado.getString("contrasena");
            String rol = resultado.getString("rol");
            lista.add(new Object[]{Id,nombre,usuario,contrasena,rol});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> seleccionarClientes() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM clientes");
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int Id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String correo = resultado.getString("correo");
            String ciudad = resultado.getString("ciudad");
            String sector = resultado.getString("sector");
            String calle = resultado.getString("calle");
            String numeroCelular = resultado.getString("numero_celular");
            lista.add(new Object[]{Id,nombre,correo,ciudad,sector,calle,numeroCelular});
        }
        
        return lista;
        
    }
    public static ArrayList<Object[]> seleccionarClientesLike(String filtro, String orden) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM clientes WHERE clientes.nombre LIKE '%"+ filtro+"%' "
                + "ORDER BY " + orden);
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int Id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String correo = resultado.getString("correo");
            String ciudad = resultado.getString("ciudad");
            String sector = resultado.getString("sector");
            String calle = resultado.getString("calle");
            String numeroCelular = resultado.getString("numero_celular");
            lista.add(new Object[]{Id,nombre,correo,ciudad,sector,calle,numeroCelular});
        }
        
        return lista;
        
    }
    
    public static ArrayList<Object[]> seleccionarClientesOrdenarPor(String ordenarPor) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM clientes ORDER BY " + ordenarPor);
        
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int Id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String correo = resultado.getString("correo");
            String ciudad = resultado.getString("ciudad");
            String sector = resultado.getString("sector");
            String calle = resultado.getString("calle");
            String numeroCelular = resultado.getString("numero_celular");
            lista.add(new Object[]{Id,nombre,correo,ciudad,sector,calle,numeroCelular});
        }
        
        return lista;
        
    }
    
    
    public static ArrayList<Object[]> seleccionarClientes(int id) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM clientes WHERE id = ?");
        st.setInt(1,id);
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int Id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String correo = resultado.getString("correo");
            String ciudad = resultado.getString("ciudad");
            String sector = resultado.getString("sector");
            String calle = resultado.getString("calle");
            String numeroCelular = resultado.getString("numero_celular");
            lista.add(new Object[]{Id,nombre,correo,ciudad,sector,calle,numeroCelular});
        }
        
        return lista;
        
    }
    
    
    
    public static ArrayList<Object[]> seleccionarClientes(String Nombre) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM clientes WHERE nombre = ?");
        st.setString(1,Nombre);
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int Id = resultado.getInt("id");
            String nombre = resultado.getString("nombre");
            String correo = resultado.getString("correo");
            String ciudad = resultado.getString("ciudad");
            String sector = resultado.getString("sector");
            String calle = resultado.getString("calle");
            String numeroCelular = resultado.getString("numero_celular");
            lista.add(new Object[]{Id,nombre,correo,ciudad,sector,calle,numeroCelular});
        }
        
        return lista;
        
    }
    public static ArrayList<String> seleccionarClientesNombre(String letra) throws SQLException, ClassNotFoundException
    {
        ArrayList<String> lista = new ArrayList();
        Connection cnx = Conexion.obtenerConexion();
        
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM clientes WHERE clientes.nombre LIKE '%" + letra+"%' ");
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            
            String nombre = resultado.getString("nombre");
            String id = String.valueOf(resultado.getInt("id"));
            nombre = nombre + " - " + id;
            lista.add(nombre);
        }
        
        return lista;
        
    }
    
    public static ArrayList<Object[]> seleccionarProveedoresLike(String filtro,String ordenarPor) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM proveedores "
        + "WHERE proveedores.nombre_compania LIKE '%" + filtro +"%' ORDER BY " + ordenarPor );

        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre_contacto");
            String compania = resultado.getString("nombre_compania");
            String ciudad = resultado.getString("ciudad");
            String sector = resultado.getString("sector");
            String calle = resultado.getString("calle");
            String numeroIdentificativo = resultado.getString("numero_identificativo");
            lista.add(new Object[]{id,nombre,compania,ciudad,sector,calle,numeroIdentificativo});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> seleccionarProveedores() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM proveedores");

        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre_contacto");
            String compania = resultado.getString("nombre_compania");
            String ciudad = resultado.getString("ciudad");
            String sector = resultado.getString("sector");
            String calle = resultado.getString("calle");
            String numeroIdentificativo = resultado.getString("numero_identificativo");
            lista.add(new Object[]{id,nombre,compania,ciudad,sector,calle,numeroIdentificativo});
        }
        
        return lista;
    }
    
    
    
    public static ArrayList<Object[]> seleccionarProveedoresOrdenarPor(String ordenarPor) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM proveedores ORDER BY proveedores." + ordenarPor);

        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre_contacto");
            String compania = resultado.getString("nombre_compania");
            String ciudad = resultado.getString("ciudad");
            String sector = resultado.getString("sector");
            String calle = resultado.getString("calle");
            String numeroIdentificativo = resultado.getString("numero_identificativo");
            lista.add(new Object[]{id,nombre,compania,ciudad,sector,calle,numeroIdentificativo});
        }
        
        return lista;
    }
    
    
    public static ArrayList<Object[]> seleccionarProveedores(int Id) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM proveedores WHERE id = " +Id);
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre_contacto");
            String compania = resultado.getString("nombre_compania");
            String ciudad = resultado.getString("ciudad");
            String sector = resultado.getString("sector");
            String calle = resultado.getString("calle");
            String numeroIdentificativo = resultado.getString("numero_identificativo");
            lista.add(new Object[]{id,nombre,compania,ciudad,sector,calle,numeroIdentificativo});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> seleccionarProveedores(String Nombre) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        PreparedStatement st = cnx.prepareStatement("SELECT * FROM proveedores WHERE nombre_compania = ?");
        st.setString(1, Nombre);
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String nombre = resultado.getString("nombre_contacto");
            String compania = resultado.getString("nombre_compania");
            String ciudad = resultado.getString("ciudad");
            String sector = resultado.getString("sector");
            String calle = resultado.getString("calle");
            String numeroIdentificativo = resultado.getString("numero_identificativo");
            lista.add(new Object[]{id,nombre,compania,ciudad,sector,calle,numeroIdentificativo});
        }
        
        return lista;
    }
    
    
    public static ArrayList<Object[]> seleccionarProductosOrdenarPor(String ordenadoPor) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        String query = "SELECT productos.id, proveedores.nombre_compania as proveedor , categoria.nombre\n" +
        "as categoria,productos.nombre as producto,productos.medida,productos.precio_venta,"
        + "productos.precio_compra,productos.stock\n" +
        "FROM productos\n" +
        "LEFT JOIN proveedores on proveedores.id = productos.id_proveedor\n" +
        "LEFT JOIN categoria on categoria.id = productos.id_categoria\n"
                + "ORDER BY " + ordenadoPor;
        
        PreparedStatement st = cnx.prepareStatement(query);
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String proveedor = resultado.getString("proveedor");
            String categoria = resultado.getString("categoria");
            String nombre = resultado.getString("producto");
            String medida = resultado.getString("medida");
            String precioVenta = resultado.getString("precio_venta");
            String precioCompra = resultado.getString("precio_compra");
            int stock = resultado.getInt("stock");
            lista.add(new Object[]{id,proveedor,categoria,nombre,medida,precioVenta,precioCompra,stock});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> seleccionarProductos() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        String query = "SELECT productos.id, proveedores.nombre_compania as proveedor , categoria.nombre\n" +
        "as categoria,productos.nombre as producto,productos.medida,productos.precio_venta,"
        + "productos.precio_compra,productos.stock\n" +
        "FROM productos\n" +
        "LEFT JOIN proveedores on proveedores.id = productos.id_proveedor\n" +
        "LEFT JOIN categoria on categoria.id = productos.id_categoria\n"
                + "ORDER BY productos.id";
        
        PreparedStatement st = cnx.prepareStatement(query);
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String proveedor = resultado.getString("proveedor");
            String categoria = resultado.getString("categoria");
            String nombre = resultado.getString("producto");
            String medida = resultado.getString("medida");
            String precioVenta = resultado.getString("precio_venta");
            String precioCompra = resultado.getString("precio_compra");
            int stock = resultado.getInt("stock");
            lista.add(new Object[]{id,proveedor,categoria,nombre,medida,precioVenta,precioCompra,stock});
        }
        
        return lista;
    }
    
    public static ArrayList<Object[]> seleccionarProductosLike(String filtro,String ordenarPor) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        String query = "SELECT productos.id, proveedores.nombre_compania as proveedor , categoria.nombre\n" +
        "as categoria,productos.nombre as producto,productos.medida,productos.precio_venta,"
        + "productos.precio_compra,productos.stock\n" +
        "FROM productos\n" +
        "LEFT JOIN proveedores on proveedores.id = productos.id_proveedor\n" +
        "LEFT JOIN categoria on categoria.id = productos.id_categoria\n"+
                " WHERE productos.nombre LIKE '%" + filtro +"%'"
                + "ORDER BY " + ordenarPor;
        
        PreparedStatement st = cnx.prepareStatement(query);
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String proveedor = resultado.getString("proveedor");
            String categoria = resultado.getString("categoria");
            String nombre = resultado.getString("producto");
            String medida = resultado.getString("medida");
            String precioVenta = resultado.getString("precio_venta");
            String precioCompra = resultado.getString("precio_compra");
            int stock = resultado.getInt("stock");
            lista.add(new Object[]{id,proveedor,categoria,nombre,medida,precioVenta,precioCompra,stock});
        }
        
        return lista;
    }
    
    
    
    public static ArrayList<Object[]> seleccionarProductos(int Id) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        String query = "SELECT productos.id, proveedores.nombre_compania as proveedor , categoria.nombre\n" +
        "as categoria,productos.nombre as producto,productos.medida,productos.precio_venta,"
        + "productos.precio_compra,productos.stock\n" +
        "FROM productos\n" +
        "LEFT JOIN proveedores on proveedores.id = productos.id_proveedor\n" +
        "LEFT JOIN categoria on categoria.id = productos.id_categoria "
                + "WHERE productos.id = ?";
                
        
        PreparedStatement st = cnx.prepareStatement(query);
        st.setInt(1, Id);
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String proveedor = resultado.getString("proveedor");
            String categoria = resultado.getString("categoria");
            String nombre = resultado.getString("producto");
            String medida = resultado.getString("medida");
            String precioVenta = resultado.getString("precio_venta");
            String precioCompra = resultado.getString("precio_compra");
            int stock = resultado.getInt("stock");
            lista.add(new Object[]{id,proveedor,categoria,nombre,medida,precioVenta,precioCompra,stock});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> seleccionarProductos(String Nombre) throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        String query = "SELECT productos.id, proveedores.nombre_contacto as proveedor , categoria.nombre\n" +
        "as categoria,productos.nombre as producto,productos.medida,productos.precio_venta,"
        + "productos.precio_compra,productos.stock\n" +
        "FROM productos\n" +
        "INNER JOIN proveedores on proveedores.id = productos.id_proveedor\n" +
        "INNER JOIN categoria on categoria.id = productos.id_categoria "
                + "WHERE productos.nombre = ?";
                
        
        PreparedStatement st = cnx.prepareStatement(query);
        st.setString(1, Nombre);
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            String proveedor = resultado.getString("proveedor");
            String categoria = resultado.getString("categoria");
            String nombre = resultado.getString("producto");
            String medida = resultado.getString("medida");
            String precioVenta = resultado.getString("precio_venta");
            String precioCompra = resultado.getString("precio_compra");
            int stock = resultado.getInt("stock");
            lista.add(new Object[]{id,proveedor,categoria,nombre,medida,precioVenta,precioCompra,stock});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> seleccionarDetalleCompraUltimoEnProceso() throws SQLException, ClassNotFoundException
    {
        
        int id_usuario =(int) Seleccion.SeleccionarUsuario(VentanaLogin.ventana.userLogiau).get(0)[0];
        System.out.println("EN SELECT:" + id_usuario);
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        String query = "SELECT detalle_compra.id,detalle_compra.id_compra, detalle_compra.id_producto ,"
                + " productos.nombre AS producto, detalle_compra.precio_venta ,"
                + " detalle_compra.precio_compra , detalle_compra.cantidad, compra.estado\n" +
        "FROM detalle_compra \n" +
        "INNER JOIN productos on productos.id = detalle_compra.id_producto\n" +
        "INNER JOIN compra on compra.id = detalle_compra.id_compra\n" +
        "WHERE (detalle_compra.id_compra = (SELECT MAX(id) FROM compra WHERE compra.id_usuario = " +id_usuario+")) AND (compra.estado = 'EN_PROCESO')";
                
        
        PreparedStatement st = cnx.prepareStatement(query);
        
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            int idCompra = resultado.getInt("id_compra");
            int idProducto = resultado.getInt("id_producto");
            String nombre = resultado.getString("producto");
            String precioVenta = resultado.getString("precio_venta");
            String precioCompra = resultado.getString("precio_compra");
            String cantidad = resultado.getString("cantidad");
            String estado = resultado.getString("estado");
            
            lista.add(new Object[]{id,idCompra,idProducto,nombre,precioVenta,precioCompra,cantidad,estado});
        }
        
        return lista;
    }
    
    public static ArrayList<Object[]> seleccionarDetalleVentaUltimoEnProceso() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        String userLogiau = VentanaLogin.ventana.userLogiau;
        int idUserLogiau = (int) Seleccion.SeleccionarUsuario(userLogiau).get(0)[0];
        String query = "SELECT detalle_venta.id,id_venta ,productos.id AS id_producto ,productos.nombre,categoria.nombre AS categoria,\n" +
"                productos.precio_venta,cantidad,venta.estado\n" +
"        FROM detalle_venta\n" +
"        INNER JOIN productos ON productos.id = detalle_venta.id_producto\n" +
"        INNER JOIN categoria ON categoria.id = productos.id_categoria\n" +
"        INNER JOIN venta ON venta.id = detalle_venta.id_venta\n" +
"        WHERE (venta.id = (SELECT MAX(id) FROM venta WHERE venta.id_usuario = "+idUserLogiau+")) AND (venta.estado = 'EN_PROCESO')";
                
        
        PreparedStatement st = cnx.prepareStatement(query);
        
        
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int id = resultado.getInt("id");
            int idVenta = resultado.getInt("id_venta");
            int idProducto = resultado.getInt("id_producto");
            String nombre = resultado.getString("nombre");
            String categoria = resultado.getString("categoria");
            String precioVenta = resultado.getString("precio_venta");
            String cantidad = resultado.getString("cantidad");
            String estado = resultado.getString("estado");
            
            lista.add(new Object[]{id,idVenta,idProducto,nombre,categoria,precioVenta,cantidad,estado});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> seleccionarVentaUltimoRegistroEstado() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        String userLogiau = VentanaLogin.ventana.userLogiau;
        int idUserLogiau = (int) Seleccion.SeleccionarUsuario(userLogiau).get(0)[0];
        String query = "SELECT id,estado FROM venta WHERE venta.id = (SELECT MAX(id) FROM venta WHERE venta.id_usuario = "+idUserLogiau+")";
        PreparedStatement st = cnx.prepareStatement(query);
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int idVenta = resultado.getInt("id");
            String estado = resultado.getString("estado");
            
            
            lista.add(new Object[]{idVenta,estado});
        }
        
        return lista;
    }
    public static ArrayList<Object[]> seleccionarCompraUltimoRegistroEstado() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        String userLogiau = VentanaLogin.ventana.userLogiau;
        int idUserLogiau = (int) Seleccion.SeleccionarUsuario(userLogiau).get(0)[0];
        String query = "SELECT id,estado FROM compra WHERE compra.id = (SELECT MAX(id) FROM compra WHERE compra.id_usuario = "+idUserLogiau+")";
        PreparedStatement st = cnx.prepareStatement(query);
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            int idVenta = resultado.getInt("id");
            String estado = resultado.getString("estado");
            
            
            lista.add(new Object[]{idVenta,estado});
        }
        
        return lista;
    }
    
    public static ArrayList<Object[]> seleccionarVentaUltimoRegistro() throws SQLException, ClassNotFoundException
    {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        Connection cnx = Conexion.obtenerConexion();
        String userLogiau ="";
        try{
        userLogiau = VentanaLogin.ventana.userLogiau;
        }catch(java.lang.NullPointerException e)
        {
            
        }
        int idUserLogiau = (int) Seleccion.SeleccionarUsuario(userLogiau).get(0)[0];
        
        String query = "SELECT usuario.nombre AS usuario,clientes.nombre AS cliente ,"
                + "venta.fecha,venta.pago_cliente,venta.devuelta,venta.descuento,venta.total,"
                + "venta.estado\n" +
        "FROM venta\n" +
        "INNER JOIN usuario on usuario.id = venta.id_usuario\n" +
        "INNER JOIN clientes on clientes.id = venta.id_cliente\n"
                + "WHERE venta.id = (SELECT MAX(venta.id) FROM venta WHERE venta.id_usuario = "+idUserLogiau+")";
        PreparedStatement st = cnx.prepareStatement(query);
        ResultSet resultado = st.executeQuery();
        while(resultado.next())
        {
            String usuario = resultado.getString("usuario");
            String cliente = resultado.getString("cliente");
            Date fecha = resultado.getDate("fecha");
            double pagoCliente = resultado.getDouble("pago_cliente");
            double devuelta = resultado.getDouble("devuelta");
            double descuento = resultado.getDouble("descuento");
            double total = resultado.getDouble("total");
            String estado = resultado.getString("estado");

            lista.add(new Object[]{usuario,cliente,fecha,pagoCliente,devuelta,descuento,total,estado});
        }
        
        return lista;
    }
    
}
