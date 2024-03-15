/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author poo01alu06
 */
public class Circulo {
    final float PI = 3.1416f;
    private float radio;
    
    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }
    
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public float getPerimetro(){
        return 2*PI*radio;
    }
    
    public float getArea(){
        return PI*radio*radio;
    }
            
            
            
            
            
            
            
            
//Metodos de servicio

    @Override
    public String toString() {
        return "Circulo{" + "PI=" + PI + ", radio=" + radio + '}';
    }
    

    
    
}
