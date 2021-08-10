/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author Francisca Gómez
 */
public class Proveedor implements ValidarProveedor{
    
    //CONSTRUCTORES - SET - GET
    int id_prov, id_pais;
    String nom_prov, proc_prov, ruc_prov, tel_prov, dir_prov, estado_prov, nom_mod_prov;

    public Proveedor(int id_prov, int id_pais, String nom_prov, String proc_prov, String ruc_prov, String tel_prov, String dir_prov, String estado_prov, String nom_mod_prov) {
        this.id_prov = id_prov;
        this.id_pais = id_pais;
        this.nom_prov = nom_prov;
        this.proc_prov = proc_prov;
        this.ruc_prov = ruc_prov;
        this.tel_prov = tel_prov;
        this.dir_prov = dir_prov;
        this.estado_prov = estado_prov;
        this.nom_mod_prov = nom_mod_prov;
    }

    public Proveedor() {
    }

    public int getId_prov() {
        return id_prov;
    }

    public void setId_prov(int id_prov) {
        this.id_prov = id_prov;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getNom_prov() {
        return nom_prov;
    }

    public void setNom_prov(String nom_prov) {
        this.nom_prov = nom_prov;
    }

    public String getProc_prov() {
        return proc_prov;
    }

    public void setProc_prov(String proc_prov) {
        this.proc_prov = proc_prov;
    }

    public String getRuc_prov() {
        return ruc_prov;
    }

    public void setRuc_prov(String ruc_prov) {
        this.ruc_prov = ruc_prov;
    }

    public String getTel_prov() {
        return tel_prov;
    }

    public void setTel_prov(String tel_prov) {
        this.tel_prov = tel_prov;
    }

    public String getDir_prov() {
        return dir_prov;
    }

    public void setDir_prov(String dir_prov) {
        this.dir_prov = dir_prov;
    }

    public String getEstado_prov() {
        return estado_prov;
    }

    public void setEstado_prov(String estado_prov) {
        this.estado_prov = estado_prov;
    }

    public String getNom_mod_prov() {
        return nom_mod_prov;
    }

    public void setNom_mod_prov(String nom_mod_prov) {
        this.nom_mod_prov = nom_mod_prov;
    }
    
    //FUNCIONES REGISTRAR - BUSCAR - MODIFICAR - CAMBIAR ESTADO
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public int registrarProveedor(Proveedor prov) {
        int r = 0;
        String sql = "INSERT INTO public.pais (descripcion_pais, estado_pais)\n"
                + "	VALUES (?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getNom_prov());
            ps.setString(2, prov.getProc_prov());
            rs = ps.executeQuery();
            while (rs.next()) {
                r = r + 1;
                Variables.id = Integer.parseInt(rs.getString("id_usuario"));
                prov.setNom_prov(rs.getString("descripcion_pais"));
                prov.setProc_prov(rs.getString("estado_pais"));
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

    public HashMap seleccionarPais() {
        HashMap<String, String> drop_pais = new HashMap();
        try {
            ConectaBD conn = new ConectaBD();
            String sql = "SELECT id_pais as id_p,descripcion_pais\n"
                    + "	FROM public.pais"
                    + " WHERE estado_pais = 'activo';";
            conn.abrir();
            rs = conn.con.createStatement().executeQuery(sql);
            while (rs.next()) {
                drop_pais.put(rs.getString("id_p"), rs.getString("descripcion_pais"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return drop_pais;
    }
}
