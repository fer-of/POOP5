/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Creacion de la practica 5
 * 
 * Uso de dos pilares de la programacion orientada a objetos
 * Abstracción y Encapsulamiento
 * 
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
public class persona {
    /**
     * Creacion de atributos de tipo cadena con scope privado
     * nombre, apellido, genero y ocupacion como cadena
     * Creacion de atributo de tipo entero con scope privado
     * edad
     */
    private String nombre, apellido, genero, ocupacion;
    private int edad;
    
    /**
     * Creacion del metodo de constructor vacio, por defecto
     */
    public persona() {
    }
    /**
     * Creacion del metodo constructor de los atributos
     * @param nombre Nombre de la persona
     * @param apellido Apellido de la persona
     * @param genero Genero de la persona
     * @param ocupacion Ocupacion de la persona
     * @param edad Edad de la persona
     */
    public persona(String nombre, String apellido, String genero, String ocupacion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.ocupacion = ocupacion;
        this.edad = edad;
    }
    
    /**
     * Creacion de metodos de servicio
     * Metodo getNombre
     * @return un nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre de la persona.
     * @param nombre El nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el apellido de la persona.
     * @return El apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Establece el apellido de la persona.
     * @param apellido El apellido de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Obtiene el género de la persona.
     * @return El género de la persona.
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Establece el género de la persona.
     * @param genero El género de la persona.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Obtiene la ocupación de la persona.
     * @return La ocupación de la persona.
     */
    public String getOcupacion() {
        return ocupacion;
    }
    /**
     * Establece la ocupación de la persona.
     * @param ocupacion La ocupación de la persona.
     */
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    /**
     * Obtiene la edad de la persona.
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Establece la edad de la persona.
     * @param edad La edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Realiza el cambio de una llanta del coche.
     * Imprime un mensaje indicando que la persona está cambiando una llanta del coche.
     */    
    public void cambiarLlanta() {
        System.out.println(nombre + " está cambiando una llanta del coche.");
    }
    /**
     * Realiza la acción de hablar.
     * Imprime un mensaje indicando que la persona está hablando.
     */
    public void hablar() {
        System.out.println(nombre + " está hablando.");
    }
    /**
     * Realiza la revisión de los espejos del coche.
     * Imprime un mensaje indicando que la persona está revisando los espejos del coche.
     */
    public void revisarEspejos() {
        System.out.println(nombre + " está revisando los espejos del coche.");
    }
    /**
     * Ajusta el asiento en el coche.
     * Imprime un mensaje indicando que la persona está ajustando su asiento en el coche.
     */
    public void ajustarAsiento() {
        System.out.println(nombre + " está ajustando su asiento en el coche.");
    }

    /**
     * Devuelve una representación en forma de cadena de la persona.
     * La representación incluye el nombre, apellido, género, ocupación y edad de la persona.
     * @return Una cadena que representa la información de la persona.
     */
    
    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", ocupacion=" + ocupacion + ", edad=" + edad + '}';
    }

    
}
