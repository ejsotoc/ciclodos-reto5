package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.CompraPorProveedor;

public class CompraPorProveedorDao {

    public ArrayList<CompraPorProveedor> rankingCompraPorProveedor() throws SQLException {

        ArrayList<CompraPorProveedor> respuesta = new ArrayList<CompraPorProveedor>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
//            String consulta = "SELECT  ID_Compra, Proveedor, Constructora, Banco_Vinculado, Ciudad"
//                    + "FROM Compra"
//                    + "INNER JOIN Proyecto on Compra.ID_Proyecto = Proyecto.ID_proyecto"
//                    + "WHERE Ciudad = 'Salento' AND Proveedor = 'Homecenter'";

            String consulta = "SELECT  ID_Compra, Proveedor, Constructora, Banco_Vinculado, Ciudad "
                    + "FROM Compra "
                    + "INNER JOIN Proyecto "
                    + "USING (ID_Proyecto) "
                    + "WHERE  Proveedor like '%Homecenter%' AND  Ciudad like '%Salento%'";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                CompraPorProveedor compraPorProveedor = new CompraPorProveedor();

                compraPorProveedor.setIdCompra(resultSet.getInt("ID_Compra"));
                compraPorProveedor.setProveedor(resultSet.getString("Proveedor"));
                compraPorProveedor.setConstructora(resultSet.getString("Constructora"));
                compraPorProveedor.setBancoVinculado(resultSet.getString("Banco_Vinculado"));
                compraPorProveedor.setCiudad(resultSet.getString("Ciudad"));

                respuesta.add(compraPorProveedor);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error consultando las compras por proveedor: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return respuesta;

    }

}
