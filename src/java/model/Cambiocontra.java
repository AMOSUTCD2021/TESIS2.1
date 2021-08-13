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
 * @author Alvaro
 */
public class Cambiocontra implements Validar {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public int validar(Usuario u) {
        int r = 0;

        String sql = "UPDATE public.usuario\n"
                + "	SET  clave_usuario=?\n"
                + "	WHERE nombre_usuario=?";

        String sql2 = "UPDATE usuario\n"
                + "    SET clave_usuario = crypt(?,gen_salt('bf'))\n"
                + "    WHERE nombre_usuario=?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, u.getClave_usuario());
            ps.setString(2, u.getNombre_usuario());
            //  ps.setString(3, u.getEstado());

            rs = ps.executeQuery();

            while (rs.next()) {
                r = r + 1;

                Variables.id = Integer.parseInt(rs.getString("id_usuario"));
                u.setClave_usuario(rs.getString("clave_usuario"));
                u.setNombre_usuario(rs.getString("nombre_usuario"));

                //u.setEstado(rs.getString("estado"));
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
