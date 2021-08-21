package view;

import controller.ControladorRequerimientosReto4;

import model.vo.AsesorPorCiudad;
import model.vo.CompraPorProveedor;
import model.vo.ProyectosCasaCampestre;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void requerimiento1() {

        System.out.printf("*** Asesor por Ciudad ***");
        try {
            ArrayList<AsesorPorCiudad> respuesta = controlador.consultarAsesorPorCiudad();

            for (int i = 0; i < respuesta.size(); i++) {
                System.out.println(
                        + respuesta.get(i).getIdLider() + " "
                        + respuesta.get(i).getNombre() + ""
                        + respuesta.get(i).getPrimerApellido()
                        + respuesta.get(i).getCiudadResidencia());

            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento2() {
        System.out.println("*** Compras por Proveedor ***");

        try {
            ArrayList<CompraPorProveedor> respuesta = controlador.consultarCompraPorProveedor();
            for (int i = 0; i < respuesta.size(); i++) {
                System.out.println(
                        +respuesta.get(i).getIdCompra() + ""
                        + respuesta.get(i).getProveedor() + ""
                        + respuesta.get(i).getConstructora()
                        + respuesta.get(i).getBancoVinculado()
                        + respuesta.get(i).getCiudad());

            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento3() {
        System.out.println("*** Proyectos Casa Campestre ***");
        try {
            ArrayList<ProyectosCasaCampestre> respuesta = controlador.consultarProyectosCasaCampestres();
            for (int i = 0; i < respuesta.size(); i++) {
                System.out.println(
                        +respuesta.get(i).getIdProyecto() + " "
                        + respuesta.get(i).getConstructora() + " "
                        + respuesta.get(i).getNumeroHabitaciones()
                        + respuesta.get(i).getCiudad());
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrio un error!" + e.getMessage());
        }
    }

}
