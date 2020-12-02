package interfaz;

import java.sql.SQLException;
import javax.swing.JPanel;
import login.VentanaLogin;
public class FactoriaPanel {
    public static JPanel getPanel(String nombrePanel) throws SQLException, ClassNotFoundException{
        Ventana instanciaVentana = VentanaLogin.ventana;
        switch (nombrePanel)
        {
            case "panelventas":
                instanciaVentana.panelVentas.actualizarTablaDetalleVentas();
                instanciaVentana.panelVentas.rellenarClientes();
                instanciaVentana.panelVentas.actualizarTotal();
                return instanciaVentana.panelVentas;

            case "panelproductos":
                instanciaVentana.panelProductos.actualizarTablaProductos();
                return instanciaVentana.panelProductos;

            case "panelclientes":
                instanciaVentana.panelClientes.actualizarTablaClientes();
                return instanciaVentana.panelClientes;

            case "panelcompras":
                instanciaVentana.panelCompras.actualizarTablaDetalleCompras();
                instanciaVentana.panelCompras.rellenarProveedores();
                return instanciaVentana.panelCompras;

            case "panelproveedores":
                instanciaVentana.panelProveedores.actualizarTablaProveedores();

                return instanciaVentana.panelProveedores;

            case "paneladministracion":
                instanciaVentana.panelAdministracion.actualizarTablaCategoria();
                instanciaVentana.panelAdministracion.actualizarTablaUsuario();
                return instanciaVentana.panelAdministracion;
        }
        return null;
        
    }
}
