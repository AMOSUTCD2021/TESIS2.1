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
public class BarrioBD {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public int registrarBarrio(Barrio b) {
        int r = 0;
        String sql = "INSERT INTO public.barrio(\n"
                + "	descripcion_barrio, id_ciudad)\n"
                + "	VALUES (?, (SELECT ciu.id_ciudad FROM ciudad ciu\n"
                + "	INNER JOIN barrio bar\n"
                + "	ON bar.id_ciudad = ciu.id_ciudad\n"
                + "	WHERE descripcion_ciudad = ?));";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, b.getDescripcion_barrio());
            ps.setInt(2, b.getId_pais());
            rs = ps.executeQuery();
            while (rs.next()) {
                r = r + 1;
                Variables.id = Integer.parseInt(rs.getString("id_usuario"));
                b.setDescripcion_barrio(rs.getString("descripcion_barrio"));
                b.setId_pais(rs.getInt("id_ciudad"));
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
