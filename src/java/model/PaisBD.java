/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Francisca Gómez
 */
public class PaisBD  {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public int registrarPais(Pais p) {
        int r = 0;
        String sql = "INSERT INTO public.pais (descripcion_pais, estado_pais)\n"
                + "	VALUES (?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getDescripcion_pais());
            ps.setString(2, p.getEstado_pais());
            rs = ps.executeQuery();
            while (rs.next()) {
                r = r + 1;
                Variables.id = Integer.parseInt(rs.getString("id_usuario"));
                p.setDescripcion_pais(rs.getString("descripcion_pais"));
                p.setEstado_pais(rs.getString("estado_pais"));
            }
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }

        } catch (Exception e) {
            return 0;
        }  
    }
    
     
    public int seleccionarPais(Pais p) {
        int r = 0;
        String sql = "SELECT id_pais, descripcion_pais FROM pais";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getDescripcion_pais());
            ps.setString(2, p.getEstado_pais());
            rs = ps.executeQuery();
            while (rs.next()) {
                r = r + 1;
                Variables.id = Integer.parseInt(rs.getString("id_usuario"));
                p.setDescripcion_pais(rs.getString("descripcion_pais"));
                p.setEstado_pais(rs.getString("estado_pais"));
            }
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }

        } catch (Exception e) {
            return 0;
        }  
    }
}
