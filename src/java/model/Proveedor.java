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
public class Proveedor implements ValidarProveedor {

    //CONSTRUCTORES - SET - GET
    int id_prov, id_pais;
    String nom_prov, proc_prov, ruc_prov, tel_prov, dir_prov, estado_prov, nom_usu_mod;

    public Proveedor(int id_prov, int id_pais, String nom_prov, String proc_prov, String ruc_prov, String tel_prov, String dir_prov, String estado_prov, String nom_usu_mod) {
        this.id_prov = id_prov;
        this.id_pais = id_pais;
        this.nom_prov = nom_prov;
        this.proc_prov = proc_prov;
        this.ruc_prov = ruc_prov;
        this.tel_prov = tel_prov;
        this.dir_prov = dir_prov;
        this.estado_prov = estado_prov;
        this.nom_usu_mod = nom_usu_mod;
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

    public String getNom_usu_mod() {
        return nom_usu_mod;
    }

    public void setNom_usu_mod(String nom_usu_mod) {
        this.nom_usu_mod = nom_usu_mod;
    }

    //FUNCIONES REGISTRAR - BUSCAR - MODIFICAR - CAMBIAR ESTADO
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public int registrarProveedor(Proveedor prov) {
        int r = 0;
        String sql = "INSERT INTO public.proveedor(\n"
                + "nombre_proveedor, procedencia_proveedor, ruc_proveedor, telefono_proveedor, direccion_proveedor, estado_proveedor, nombre_usuario_modificacion, fecha_modificacion, id_pais)\n"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, (SELECT current_date), ?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getNom_prov());
            ps.setString(2, prov.getProc_prov());
            ps.setString(3, prov.getRuc_prov());
            ps.setString(4, prov.getTel_prov());
            ps.setString(5, prov.getDir_prov());
            ps.setString(6, prov.getEstado_prov());
            ps.setString(7, prov.getNom_usu_mod());
            ps.setInt(8, prov.getId_pais());
            rs = ps.executeQuery();
            while (rs.next()) {
                r = r + 1;
                Variables.id = Integer.parseInt(rs.getString("id_usuario"));
                prov.setNom_prov(rs.getString("nombre_proveedor"));
                prov.setProc_prov(rs.getString("procedencia_proveedor"));
                prov.setProc_prov(rs.getString("ruc_proveedor"));
                prov.setProc_prov(rs.getString("telefono_proveedor"));
                prov.setProc_prov(rs.getString("direccion_proveedor"));
                prov.setProc_prov(rs.getString("estado_proveedor"));
                prov.setProc_prov(rs.getString("nombre_usuario_modificacion"));
                prov.setProc_prov(rs.getString("id_pais"));
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

    public HashMap seleccionarProveedor() {
        HashMap<String, String> drop_prov = new HashMap();
        try {
            ConectaBD conn = new ConectaBD();
            String sql = "SELECT id_proveedor as id_prov,nombre_proveedor\n"
                    + "	FROM public.proveedor"
                    + " WHERE estado_proveedor = 'activo';";
            conn.abrir();
            rs = conn.con.createStatement().executeQuery(sql);
            while (rs.next()) {
                drop_prov.put(rs.getString("id_prov"), rs.getString("nombre_proveedor"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return drop_prov;
    }

    public Proveedor buscarProveedor(String buscartxt) {
        int r = 0;
        Proveedor prov = new Proveedor();
        String sql = "SELECT prov.nombre_proveedor, pais.descripcion_pais\n"
                + "FROM pais pais\n"
                + "INNER JOIN proveedor prov\n"
                + "ON pais.id_pais = prov.id_proveedor\n"
                + "WHERE prov.nombre_proveedor = ?;";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, buscartxt);

            rs = ps.executeQuery();
            while (rs.next()) {
                r = r + 1;
                prov.setNom_prov(rs.getString("nombre_proveedor"));
                prov.setRuc_prov(rs.getString("descripcion_pais"));
            }

        } catch (Exception e) {
            System.out.println("hola");

        } finally {
            return prov;
        }
    }
}
