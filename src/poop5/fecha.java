/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Creacion de la clase fecha
 * 
 * Representa una fecha con día, mes y año.
 * 
 * Esta clase proporciona métodos para obtener y establecer el día, mes y año de la fecha.
 *  
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
class fecha {
    /**
     * Creacion de atributos de tipo entero con scope privado
     * dia y año
     * Creacion de atributos de tipo cadena con scope privado
     * mes
     */
    private int dia, anio ;
    private String mes;
    /**
     * Creacion del metodo de constructor vacio, por defecto
     */
    public fecha() {
    }
    /**
     * Creacion del metodo constructor de los atributos
     * @param dia represeenta al Dia
     * @param mes representa al mes
     * @param anio respresenta anio
     */
    public fecha(int dia, String mes, int anio) {
        this.dia = dia;
        this.anio = anio;
        this.mes = mes;
    }
    /**
     * Obtiene el día de la fecha.
     * @return El día de la fecha.
     */
    public int getDia() {
        return dia;
    }
    /**
     * Establece el día de la fecha.
     * @param dia El día de la fecha.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Obtiene el año de la fecha.
     * @return El año de la fecha.
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Establece el año de la fecha.
     * @param anio El año de la fecha.
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Obtiene el mes de la fecha.
     * @return El mes de la fecha.
     */
    public String getMes() {
        return mes;
    }
    /**
     * Establece el mes de la fecha.
     * @param mes El mes de la fecha.
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * Devuelve una representación en forma de cadena de la fecha.
     * La representación incluye el día, mes y año de la fecha.
     * @return Una cadena que representa la información de la fecha.
     */
    
    @Override
    public String toString() {
        return "fecha{" + "dia=" + dia + ", anio=" + anio + ", mes=" + mes + '}';
    }
    
       
}
