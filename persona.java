/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author marif
 */
public class persona {
    private String nombre, apellido, genero, ocupacion;
    private int edad;

    public persona() {
    }

    public persona(String nombre, String apellido, String genero, String ocupacion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.ocupacion = ocupacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void cambiarLlanta() {
        System.out.println(nombre + " está cambiando una llanta del coche.");
    }

    public void hablar() {
        System.out.println(nombre + " está hablando.");
    }

    public void revisarEspejos() {
        System.out.println(nombre + " está revisando los espejos del coche.");
    }

    public void ajustarAsiento() {
        System.out.println(nombre + " está ajustando su asiento en el coche.");
    }
    
    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", ocupacion=" + ocupacion + ", edad=" + edad + '}';
    }

    
}
