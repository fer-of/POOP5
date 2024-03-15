/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author marif
 */
public class Coche {
    private String marca, color;
    private int año, velocidades, asientos;
    private persona chofer, copiloto, pasajero1, pasajero2;
    private int anio;

    public Coche() {
    }

    public Coche(String marca, String color, int anio, int velocidades, int asientos, persona chofer, persona copiloto, persona pasajero1, persona pasajero2) {
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.velocidades = velocidades;
        this.asientos = asientos;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public persona getChofer() {
        return chofer;
    }

    public void setChofer(persona chofer) {
        this.chofer = chofer;
    }

    public persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(persona copiloto) {
        this.copiloto = copiloto;
    }

    public persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    //Metodos de accion
    public void cambiarVelocidad(int nuevaVelocidad) {
        System.out.println("Cambiando velocidad a " + nuevaVelocidad);
    }

    public void detectarReversa() {
        System.out.println("Detectando si el coche está en reversa");
    }

    public void avanzar() {
        System.out.println("Avanzando el coche");
    }

    public void girar(String direccion) {
        System.out.println("Girando el coche hacia " + direccion);
    }

    public void prenderLuces() {
        System.out.println("Prendiendo las luces del coche");
    }


    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", a\u00f1o=" + año + ", velocidades=" + velocidades + ", asientos=" + asientos + ", chofer=" + chofer + ", copiloto=" + copiloto + ", pasajero1=" + pasajero1 + ", pasajero2=" + pasajero2 + '}';
    }
  
   
 
    
    
}

