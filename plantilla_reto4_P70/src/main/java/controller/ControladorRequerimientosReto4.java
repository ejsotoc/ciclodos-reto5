package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.AsesorPorCiudadDao;
import model.dao.CompraPorProveedorDao;
import model.dao.ProyectosCasaCampestreDao;

import model.vo.AsesorPorCiudad;
import model.vo.CompraPorProveedor;
import model.vo.ProyectosCasaCampestre;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {

    private final AsesorPorCiudadDao asesorPorCiudadDao;
    private final CompraPorProveedorDao compraPorProveedorDao;
    private final ProyectosCasaCampestreDao proyectosCasaCampestreDao;

    public ControladorRequerimientosReto4() {
        this.asesorPorCiudadDao = new AsesorPorCiudadDao();
        this.compraPorProveedorDao = new CompraPorProveedorDao();
        this.proyectosCasaCampestreDao = new ProyectosCasaCampestreDao();
    }

    public ArrayList<AsesorPorCiudad> consultarAsesorPorCiudad() throws SQLException {
        return this.asesorPorCiudadDao.rankingAsesorPorCiudad();
    }

    public ArrayList<CompraPorProveedor> consultarCompraPorProveedor() throws SQLException {
        return this.compraPorProveedorDao.rankingCompraPorProveedor();
    }

    public ArrayList<ProyectosCasaCampestre> consultarProyectosCasaCampestres() throws SQLException {
        return this.proyectosCasaCampestreDao.rankingProyectosCasaCampestre();
    }

}
