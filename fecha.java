/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author poo01alu06
 */
class fecha {
    private int dia, anio ;
    private String mes;

    public fecha() {
    }

    public fecha(int dia, String mes, int anio) {
        this.dia = dia;
        this.anio = anio;
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "fecha{" + "dia=" + dia + ", anio=" + anio + ", mes=" + mes + '}';
    }
    
    
    
    
    
    
    
}
