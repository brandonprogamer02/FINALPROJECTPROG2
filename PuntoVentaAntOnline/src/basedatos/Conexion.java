package basedatos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Conexion 
{

    public static Connection cnx = null;

    public static Connection obtenerConexion() throws SQLException, ClassNotFoundException {
        if (cnx == null)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://db4free.net/punto_venta";
                String user = "admin02";
                String pass = "admin020325";
                Properties prop = new Properties();
                prop.put("user", user);
                prop.put("password", pass);
                prop.put("allowMultiQueries", "true");
                prop.put("zeroDateTimeBehavior", "convertToNull");
                cnx = (Connection) DriverManager.getConnection(url, prop);
                // prueba de conexion constante
                try{
                PreparedStatement f = cnx.prepareStatement("SELECT * FROM categoria");
                java.sql.ResultSet de =  f.executeQuery();
                }catch(com.mysql.jdbc.exceptions.jdbc4.CommunicationsException e)
                {
                    JOptionPane.showMessageDialog(null, "SE HA PERDIDO CONEXION CON EL SERVIDOR\nPOFAVOR CIERRA EL PROGRAMA Y APAGA Y PRENDE LOS SERVICIOS DE APACHA Y MYSQL EN XAMPP");
                    cnx = null;
                }

            } 
            catch (SQLException ex)
            {
               
                System.out.println("ENTRO EN FALLO");
                System.out.println("EL MENSAJE:" +ex.getLocalizedMessage());
                if (ex.getLocalizedMessage().equals("Unknown database 'punto_venta'"))
                {
                    // la base de datos no existe se va a crear
                    Class.forName("com.mysql.jdbc.Driver");
                    String url2 = "jdbc:mysql://localhost/test?zeroDateTimeBehavior=convertToNull";
                    String user2 = "root";
                    String pass2 = "";
                    Properties prop2 = new Properties();
                    prop2.put("user", user2);
                    prop2.put("password", pass2);
                    prop2.put("allowMultiQueries", "true");
                    // coneccion crear db
                    Connection cnx2 = (Connection) DriverManager.getConnection(url2, prop2);
                    PreparedStatement st2 = cnx2.prepareStatement("CREATE DATABASE punto_venta");
                    st2.executeUpdate();
                    // conexion con la db ya creada
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    String url3 = "jdbc:mysql://localhost/punto_venta?zeroDateTimeBehavior=convertToNull";
                    String user3 = "root";
                    String pass3 = "";
                    Properties prop3 = new Properties();
                    prop3.put("user", user3);
                    prop3.put("password", pass3);
                    prop3.put("allowMultiQueries", "true");
                    
                    Connection cnx3 = (Connection) DriverManager.getConnection(url3, prop3);
                    
                    cnx = cnx3;
                    crearTablas();
                    
                    
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"CONEXION FALLIDA\nRevisa que este activado el servidor mediante Zampp");
                    JOptionPane.showMessageDialog(null,"Cierre la aplicacion\nEjecuta Zampp como administrador y activa los servicios de apache y mySql y Listo");
               
                }

            } catch (ClassNotFoundException ex)
            {
                
            }
        }
        
        try{
                PreparedStatement f = cnx.prepareStatement("SELECT * FROM categoria");
                java.sql.ResultSet de =  f.executeQuery();
                }catch(com.mysql.jdbc.exceptions.jdbc4.CommunicationsException e)
                {
                    JOptionPane.showMessageDialog(null, "SE HA PERDIDO CONEXION CON EL SERVIDOR\nPOFAVOR CIERRA EL PROGRAMA Y APAGA Y PRENDE LOS SERVICIOS DE APACHA Y MYSQL EN XAMPP");
                    cnx = null;
                }
        
        return cnx;

    }

    public static void crearTablas() throws SQLException, SQLException {
        String query = "CREATE TABLE `categoria` (\n" +
" `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
" `nombre` varchar(100) NOT NULL,\n" +
" PRIMARY KEY (`id`)\n" +
");\n" +
"\n" +
"CREATE TABLE `clientes` (\n" +
" `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
" `nombre` varchar(40) NOT NULL,\n" +
" `correo` varchar(60) NOT NULL,\n" +
" `ciudad` varchar(50) NOT NULL,\n" +
" `sector` varchar(50) NOT NULL,\n" +
" `calle` varchar(50) NOT NULL,\n" +
" `numero_celular` varchar(50) NOT NULL,\n" +
" PRIMARY KEY (`id`)\n" +
");\n" +
"CREATE TABLE `proveedores` (\n" +
" `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
" `nombre_contacto` varchar(50) NOT NULL,\n" +
" `nombre_compania` varchar(50) NOT NULL,\n" +
" `ciudad` varchar(50) NOT NULL,\n" +
" `sector` varchar(50) NOT NULL,\n" +
" `calle` varchar(50) NOT NULL,\n" +
" `numero_identificativo` int(50) NOT NULL,\n" +
" PRIMARY KEY (`id`)\n" +
");\n" +
"CREATE TABLE `usuario` (\n" +
" `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
" `nombre` varchar(40) DEFAULT NULL,\n" +
" `usuario` varchar(40) NOT NULL,\n" +
" `contrasena` varchar(50) NOT NULL,\n" +
" `rol` varchar(40) NOT NULL,\n" +
" PRIMARY KEY (`id`)\n" +
");\n" +
"\n" +
"CREATE TABLE `productos` (\n" +
" `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
" `id_proveedor` int(11) DEFAULT NULL,\n" +
" `id_categoria` int(11) NOT NULL,\n" +
" `nombre` varchar(100) NOT NULL,\n" +
" `medida` varchar(60) NOT NULL,\n" +
" `precio_venta` decimal(10,0) DEFAULT NULL,\n" +
" `precio_compra` decimal(10,0) DEFAULT NULL,\n" +
" `stock` int(11) DEFAULT NULL,\n" +
" PRIMARY KEY (`id`),\n" +
" KEY `id_proveedor` (`id_proveedor`),\n" +
" KEY `id_categoria` (`id_categoria`),\n" +
" CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores` (`id`) ON UPDATE CASCADE,\n" +
" CONSTRAINT `productos_ibfk_2` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`) ON UPDATE CASCADE\n" +
");\n" +
"\n" +
"CREATE TABLE `compra` (\n" +
" `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
" `id_usuario` int(11) DEFAULT NULL,\n" +
" `id_proveedor` int(11) DEFAULT NULL,\n" +
" `total` decimal(10,0) NOT NULL,\n" +
" `metodo_envio` varchar(60) NOT NULL,\n" +
" `fecha` datetime NOT NULL,\n" +
" `estado` varchar(20) NOT NULL,\n" +
" `cantidad_pago` int(11) NOT NULL,\n" +
" PRIMARY KEY (`id`),\n" +
" KEY `id_usuario` (`id_usuario`),\n" +
" KEY `id_proveedor` (`id_proveedor`),\n" +
" CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores` (`id`) ON UPDATE CASCADE,\n" +
" CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON UPDATE CASCADE\n" +
");\n" +
"CREATE TABLE `detalle_compra` (\n" +
" `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
" `id_compra` int(11) NOT NULL,\n" +
" `id_producto` int(11) NOT NULL,\n" +
" `precio_venta` int(11) NOT NULL,\n" +
" `precio_compra` int(11) NOT NULL,\n" +
" `cantidad` int(11) NOT NULL,\n" +
" PRIMARY KEY (`id`),\n" +
" KEY `id_compra` (`id_compra`,`id_producto`),\n" +
" KEY `id_producto` (`id_producto`),\n" +
" CONSTRAINT `detalle_compra_ibfk_1` FOREIGN KEY (`id_compra`) REFERENCES `compra` (`id`) ON UPDATE CASCADE,\n" +
" CONSTRAINT `detalle_compra_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id`) ON UPDATE CASCADE\n" +
") ;\n" +
"CREATE TABLE `venta` (\n" +
" `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
" `id_usuario` int(11) DEFAULT NULL,\n" +
" `id_cliente` int(11) DEFAULT NULL,\n" +
" `fecha` datetime NOT NULL DEFAULT current_timestamp(),\n" +
" `pago_cliente` decimal(10,0) NOT NULL,\n" +
" `devuelta` decimal(10,0) NOT NULL,\n" +
" `descuento` decimal(10,0) NOT NULL,\n" +
" `total` decimal(10,0) NOT NULL,\n" +
" `estado` varchar(20) NOT NULL,\n" +
" PRIMARY KEY (`id`),\n" +
" KEY `id_usuario` (`id_usuario`,`id_cliente`),\n" +
" KEY `id_cliente` (`id_cliente`),\n" +
" CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON UPDATE CASCADE,\n" +
" CONSTRAINT `venta_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`) ON UPDATE CASCADE\n" +
") ;\n" +
"\n" +
"\n" +
"CREATE TABLE `detalle_venta` (\n" +
" `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
" `id_venta` int(11) NOT NULL,\n" +
" `id_producto` int(11) NOT NULL,\n" +
" `cantidad` int(11) NOT NULL,\n" +
" PRIMARY KEY (`id`),\n" +
" KEY `id_venta` (`id_venta`,`id_producto`),\n" +
" KEY `id_producto` (`id_producto`),\n" +
" CONSTRAINT `detalle_venta_ibfk_1` FOREIGN KEY (`id_venta`) REFERENCES `venta` (`id`) ON UPDATE CASCADE,\n" +
" CONSTRAINT `detalle_venta_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id`) ON UPDATE CASCADE\n" +
");\n" +
"\n" +
"CREATE TABLE `reportes` (\n" +
" `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
" `id_compra` int(11) DEFAULT NULL,\n" +
" `id_venta` int(11) DEFAULT NULL,\n" +
" `id_usuario` int(11) DEFAULT NULL,\n" +
" `fecha` date NOT NULL,\n" +
" PRIMARY KEY (`id`),\n" +
" KEY `id_venta` (`id_venta`),\n" +
" KEY `id_usuario` (`id_usuario`),\n" +
" KEY `id_compra` (`id_compra`),\n" +
" CONSTRAINT `reportes_ibfk_1` FOREIGN KEY (`id_compra`) REFERENCES `compra` (`id`) ON UPDATE CASCADE,\n" +
" CONSTRAINT `reportes_ibfk_2` FOREIGN KEY (`id_venta`) REFERENCES `venta` (`id`) ON UPDATE CASCADE,\n" +
" CONSTRAINT `reportes_ibfk_3` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON UPDATE CASCADE\n" +
");\n" +
"INSERT INTO usuario VALUES(null,'MASTER','MASTER','12345','MASTER')\n" +
"";

        PreparedStatement st = cnx.prepareStatement(query);
        st.executeUpdate();

    }

}
