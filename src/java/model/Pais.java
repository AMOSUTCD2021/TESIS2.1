/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Francisca Gómez
 */
public class Pais {

    int id_pais;
    String descripcion_pais;
    String estado_pais;

    public Pais() {
    }

    public Pais(int id_pais, String descripcion_pais, String estado_pais) {
        this.id_pais = id_pais;
        this.descripcion_pais = descripcion_pais;
        this.estado_pais = estado_pais;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getDescripcion_pais() {
        return descripcion_pais;
    }

    public void setDescripcion_pais(String descripcion_pais) {
        this.descripcion_pais = descripcion_pais;
    }

    public String getEstado_pais() {
        return estado_pais;
    }

    public void setEstado_pais(String estado_pais) {
        this.estado_pais = estado_pais;
    }
    
    
}
