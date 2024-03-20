/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Creacion de la clase fecha
 * 
 * Representa un coche con diferentes atributos y métodos asociados.
 * 
 * Esta clase proporciona métodos para obtener y establecer la marca, color, año, velocidades,
 * asientos, conductor, copiloto y pasajeros del coche, así como también métodos para realizar
 * acciones relacionadas con el coche.
 * 
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
public class Coche {
    /**
     * Creacion de atributos de tipo cadena con scope privado
     * marca, color
     * Creacion de atributos de tipo entero con scope privado
     * año, velocidades, asientos
     * Creacion de atributos de tipo persona con scope privado
     * chofer, copiloto, pasajero1, pasajero2
     * 
     */
    private String marca, color;
    private int velocidades, asientos;
    private persona chofer, copiloto, pasajero1, pasajero2;
    private int anio;
    
    /**
     * Creacion del metodo de constructor vacio, por defecto
     */
    public Coche() {
    }
    /**
     * Constructor de la clase Coche que inicializa los atributos.
     * @param marca La marca del coche.
     * @param color El color del coche.
     * @param anio El año del coche.
     * @param velocidades La cantidad de velocidades del coche.
     * @param asientos La cantidad de asientos del coche.
     * @param chofer El conductor del coche.
     * @param copiloto El copiloto del coche.
     * @param pasajero1 El primer pasajero del coche.
     * @param pasajero2 El segundo pasajero del coche.
     */
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
    /**
     * Obtiene la marca del coche. 
     * @return La marca del coche
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Establece la marca del coche.
     * @param marca La marca del coche.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Obtiene el color del coche.
     * @return El color del coche.
     */
    public String getColor() {
        return color;
    }
    /**
     * Establece el color del coche.
     * @param color El color del coche.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene el año del coche.
     * @return El año del coche.
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Establece el año del coche.
     * @param anio El año del coche.
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Obtiene la cantidad de velocidades del coche.
     * @return La cantidad de velocidades del coche.
     */
    public int getVelocidades() {
        return velocidades;
    }
    /**
     * Establece la cantidad de velocidades del coche.
     * @param velocidades La cantidad de velocidades del coche.
     */
    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }
    /**
     * Obtiene la cantidad de asientos del coche.
     * @return La cantidad de asientos del coche.
     */
    public int getAsientos() {
        return asientos;
    }
    /**
     * Establece la cantidad de asientos del coche.
     * @param asientos La cantidad de asientos del coche.
     */
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    /**
     * Obtiene el conductor del coche.
     * @return El conductor del coche.
     */
    public persona getChofer() {
        return chofer;
    }
    /**
     * Establece el conductor del coche.
     * @param chofer El conductor del coche.
     */
    public void setChofer(persona chofer) {
        this.chofer = chofer;
    }
    /**
     * Obtiene el copiloto del coche.
     * @return El copiloto del coche.
     */
    public persona getCopiloto() {
        return copiloto;
    }
    /**
     * Establece el copiloto del coche.
     * @param copiloto El copiloto del coche.
     */
    public void setCopiloto(persona copiloto) {
        this.copiloto = copiloto;
    }
    /**
     * Obtiene el primer pasajero del coche.
     * @return El primer pasajero del coche.
     */
    public persona getPasajero1() {
        return pasajero1;
    }
    /**
     * Establece el primer pasajero del coche.
     * @param pasajero1 El primer pasajero del coche.
     */
    public void setPasajero1(persona pasajero1) {
        this.pasajero1 = pasajero1;
    }
    /**
     * Obtiene el segundo pasajero del coche.
     * @return El segundo pasajero del coche.
     */
    public persona getPasajero2() {
        return pasajero2;
    }
    /**
     * Establece el segundo pasajero del coche.
     * @param pasajero2 El segundo pasajero del coche.
     */
    public void setPasajero2(persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    //Metodos de accion
    /**
     * Cambia la velocidad del coche a una nueva velocidad especificada.
     * @param nuevaVelocidad 
     */
    public void cambiarVelocidad(int nuevaVelocidad) {
        System.out.println("Cambiando velocidad a " + nuevaVelocidad);
    }
    /**
     * Detecta si el coche está en reversa.
     * Imprime un mensaje indicando que se está detectando si el coche está en reversa.
     */
    public void detectarReversa() {
        System.out.println("Detectando si el coche está en reversa");
    }
    /**
     * Avanza el coche.
     * Imprime un mensaje indicando que el coche está avanzando.
     */
    public void avanzar() {
        System.out.println("Avanzando el coche");
    }
    /**
     * Gira el coche hacia una dirección específica.
     * @param direccion La dirección hacia la que se gira el coche.
     */
    public void girar(String direccion) {
        System.out.println("Girando el coche hacia " + direccion);
    }
    /**
     * Prende las luces del coche.
     * Imprime un mensaje indicando que se están prendiendo las luces del coche.
     */
    public void prenderLuces() {
        System.out.println("Prendiendo las luces del coche");
    }
    
    /**
     * Devuelve una representación en forma de cadena del coche.
     * La representación incluye la marca, color, año, velocidades, asientos, conductor, copiloto y pasajeros del coche.
     * @return Una cadena que representa la información del coche.
     */
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", a\u00f1o=" + anio + ", velocidades=" + velocidades + ", asientos=" + asientos + ", chofer=" + chofer + ", copiloto=" + copiloto + ", pasajero1=" + pasajero1 + ", pasajero2=" + pasajero2 + '}';
    }
   
}

