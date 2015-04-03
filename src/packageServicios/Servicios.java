/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageServicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import packageBeans.EncuestaBeans;

/**
 *
 * @author Neuschwanstein
 */
public class Servicios {
    private Connection abrirConexion() throws SQLException {
        Connection conexion;
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/encuesta_presidencial?zeroDateTimeBehavior=convertToNull","root","root");
        return conexion;
    }
    private void cerrarConexion(Connection conexion){
        if(conexion != null){
            try{
            conexion.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    public void registrarVotos(EncuestaBeans bean)throws SQLException{
    String s = "UPDATE candidatos SET votos_totales = votos_totales +1 WHERE id_candidato =?";
    Connection conexion = abrirConexion();
    PreparedStatement ps = conexion.prepareStatement(s);
    ps.setInt(1,bean.getIdCandidato());
    ps.executeUpdate();
    conexion.close();
    ps.close();
        
    }
}
