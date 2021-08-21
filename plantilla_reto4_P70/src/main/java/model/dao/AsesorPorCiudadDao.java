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
import model.vo.AsesorPorCiudad;

public class AsesorPorCiudadDao {

    public ArrayList<AsesorPorCiudad> rankingAsesorPorCiudad() throws SQLException {

        ArrayList<AsesorPorCiudad> respuesta = new ArrayList<AsesorPorCiudad>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String consulta = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia"
                    + " FROM Lider "
                    + "WHERE Cargo = 'Asesor' "
                    + "ORDER BY Ciudad_Residencia";

            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                AsesorPorCiudad asesorPorCiudad = new AsesorPorCiudad();
                asesorPorCiudad.setIdLider(resultSet.getInt("ID_Lider"));
                asesorPorCiudad.setNombre(resultSet.getString("Nombre"));
                asesorPorCiudad.setPrimerApellido(resultSet.getString("Primer_Apellido"));
                asesorPorCiudad.setCiudadResidencia(resultSet.getString("Ciudad_Residencia"));

                respuesta.add(asesorPorCiudad);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error consultando los lideres por nombre: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return respuesta;

    }

}
