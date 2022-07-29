
package com.mycompany.ah4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insertar {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    
    public void crear(int codigo,
                     String nombre,
                     int cantidad,
                     String lugar,
                     String fecha){
    
        String sql = "insert into libreria(codigo,nombre,cantidad,lugar_Fabricacion,Fecha_Ingreso) values (?,?,?,?,?)";
    
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, cantidad);
            ps.setString(4, lugar);
            ps.setString(5, fecha);
            ps.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
