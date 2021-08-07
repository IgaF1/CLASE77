/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author 59399
 */
public class Automovil {
    
    private String placa;
    private String chasis;
    private String color;
    private String modelo;
    private Integer año;

    public Automovil() {
    }

    public Automovil(String placa, String chasis, String color, String modelo, Integer año) {
        this.placa = placa;
        this.chasis = chasis;
        this.color = color;
        this.modelo = modelo;
        this.año = año;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }
    
}
