/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techForb.challenge.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String pais;
    private String paisImagen;
    private String nombrePlanta;
    private int lecturas;
    private int alertasMedias;
    private int alertasRojas;
    private int alertasVerdes;
    private int sensoresDeshabilitados;

    public Planta(long id, String pais, String paisImagen, String nombrePlanta,
            int lecturas, int alertasMedias, int alertasRojas, int alertasVerdes, int sensoresDeshabilitados) {
        this.id = id;
        this.pais = pais;
        this.paisImagen = paisImagen;
        this.nombrePlanta = nombrePlanta;
        this.lecturas = lecturas;
        this.alertasMedias = alertasMedias;
        this.alertasRojas = alertasRojas;
        this.alertasVerdes = alertasVerdes;
        this.sensoresDeshabilitados = sensoresDeshabilitados;
    }

    public Planta() {
    }

}
