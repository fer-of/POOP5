/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;
/**
 * Creacion de la Practica 5 Abstraccion y Encapsulamiento
 * 
 * Esta clase crea instancias de diferentes clases, como `Alumno`, `Circulo`, y `Coche`, y demuestra su uso.
 *
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de instancias de objetos y demostración de su uso
        
        // Creación de un alumno
        Alumno alumno = new Alumno();
        // Establecimiento de valores utilizando métodos set
        alumno.setNombre("fer");
        System.out.println(alumno.getNombre());
        alumno.setApelllido("Ordoñez");
        alumno.setEdad(20);
        alumno.setCurso("POO");
        alumno.setPromedio(9.81f);
        // Impresión de información del alumno utilizando el método toString
        System.out.println(alumno);
        
        // Creación de otro alumno sin establecer valores
        Alumno alumno2 = new Alumno();
        System.out.println(alumno2);
        
        
        // Creación de un círculo con radio 8
        Circulo circulo = new Circulo(8);
        // Impresión de información sobre el círculo
        System.out.println(circulo);
        System.out.println(circulo.getPerimetro());
        System.out.println(circulo.getArea());
        
        // Creación de un alumno con fecha de nacimiento
        fecha fNacimiento = new fecha(12,"octubre",1999);
        Alumno alumno3 = new Alumno ("Jose", "Perez", "POO", 19, 8.8f, true, fNacimiento);
        System.out.println(alumno3);
        
        // Creación de otro alumno con fecha de nacimiento utilizando constructor simplificado
        Alumno alumno4 = new Alumno ("Pedro", "Figueroa" ,"poo" , 24 , 9.54f , false , new fecha(8,"febrero",2006));
        System.out.println(alumno4);
        
        // Creación de un coche con chofer, copiloto y pasajeros
        persona chofer = new persona("Juan", "Perez", "Masculino", "Chofer Profesional", 30);
        persona copiloto = new persona("Maria", "Lopez", "Femenino", "Estudiante", 25);
        persona pasajero1 = new persona("Carlos", "Gomez", "Masculino", "Empleado", 35);
        persona pasajero2 = new persona("Ana", "Martinez", "Femenino", "Doctora", 40);
        Coche miCoche = new Coche("Toyota", "Rojo", 2022, 6, 5, chofer, copiloto, pasajero1, pasajero2);
        System.out.println(miCoche);
    }
    
}
