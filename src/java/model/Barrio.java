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
public class Barrio {
    
    int id_barrio;
    String descripcion_barrio;
    int id_pais;
    String id_paisd;

    public Barrio() {
    }

    public Barrio(int id_barrio, String descripcion_barrio, int id_pais, String id_paisd) {
        this.id_barrio = id_barrio;
        this.descripcion_barrio = descripcion_barrio;
        this.id_pais = id_pais;
        this.id_paisd = id_paisd;
    }

    public int getId_barrio() {
        return id_barrio;
    }

    public void setId_barrio(int id_barrio) {
        this.id_barrio = id_barrio;
    }

    public String getDescripcion_barrio() {
        return descripcion_barrio;
    }

    public void setDescripcion_barrio(String descripcion_barrio) {
        this.descripcion_barrio = descripcion_barrio;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getId_paisd() {
        return id_paisd;
    }

    public void setId_paisd(String id_paisd) {
        this.id_paisd = id_paisd;
    }
    
    
}
