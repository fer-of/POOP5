/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Esta clase proporciona métodos para obtener y establecer el radio del círculo,
 * calcular el perímetro y el área del círculo, y obtener una representación en forma de cadena del círculo.
 * 
 * Para obtener un resultado más preciso, se recomienda utilizar la constante {@code Math.PI} de la biblioteca Java.
 * 
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
public class Circulo {
    /** 
     * El valor de PI utilizado en los cálculos del círculo. 
     */
    final float PI = 3.1416f;
    /** 
     * El radio del círculo. 
     */
    private float radio;
    /**
     * Creacion del metodo de constructor vacio, por defecto
     */
    public Circulo() {
    }
    
    /**
     * Crea un nuevo objeto {@code Circulo} con el radio especificado.
     * 
     * @param radio El radio del círculo.
     */
    public Circulo(float radio) {
        this.radio = radio;
    }
    /**
     * Obtiene el radio del círculo.
     * 
     * @return El radio del círculo.
     */
    public float getRadio() {
        return radio;
    }
        /**
     * Establece el radio del círculo.
     * 
     * @param radio El nuevo radio del círculo.
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
        /**
     * Calcula y devuelve el perímetro del círculo.
     * 
     * @return El perímetro del círculo.
     */
    public float getPerimetro(){
        return 2*PI*radio;
    }
    /**
     * Calcula y devuelve el área del círculo.
     * 
     * @return El área del círculo.
     */
    public float getArea(){
        return PI*radio*radio;
    }
                 
            
//Metodos de servicio

    /**
     * Devuelve una representación en forma de cadena del círculo.
     * La representación incluye el valor de PI y el radio del círculo.
     * 
     * @return Una cadena que representa el círculo.
     */
    @Override
    public String toString() {
        return "Circulo{" + "PI=" + PI + ", radio=" + radio + '}';
    }
     
}
