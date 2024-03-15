/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;
//EN ESTA PRACTICA USAREMOS EL ENCAPSULAMIENTO Y LA ABSTRACCIÓN
/**
 *
 * @author poo01alu06
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //paso 1-crear alumno
        //paso 2-darle valores a alumno
        Alumno alumno = new Alumno();
        //Esto se marco como comentario despues de volve a los atributos privados
        /*alumno.nombre = "Fernanda";
        alumno.apellido = "Ordoñez";
        alumno.edad = 20;
        alumno.curso = "POO";
        alumno.promedio = 9.81f;
        
        System.out.println(alumno.nombre);
        System.out.println(alumno);
        System.out.println(alumno.toString());//no es necesaria*/
        
        //utilizando metodos set para meterles info
        alumno.setNombre("fer");
        System.out.println(alumno.getNombre());
        alumno.setApelllido("Ordoñez");
        alumno.setEdad(20);
        alumno.setCurso("POO");
        alumno.setPromedio(9.81f);
        //manda a llamar al toString
        System.out.println(alumno);
        
        /////Alumno 2
        Alumno alumno2 = new Alumno();
        System.out.println(alumno2);
        
        
        //Creando circulo paso 4
        Circulo circulo = new Circulo(8);
        System.out.println(circulo);
        System.out.println(circulo.getPerimetro());
        System.out.println(circulo.getArea());
        
        //Una clase que tiene una fecha dentro(otra clase), se le llama composicion
        //un alumno tiene una fecha
        
        //un alumno has-A fecha
        //creando a un alumno para añadir fecha
        fecha fNacimiento = new fecha(12,"octubre",1999);
        Alumno alumno3 = new Alumno ("Jose", "Perez", "POO", 19, 8.8f, true, fNacimiento);
        System.out.println(alumno3);
        
        //otra forma de crear esto, sin tener la variable nacimiento para no perder memoria
        Alumno alumno4 = new Alumno ("Pedro", "Figueroa" ,"poo" , 24 , 9.54f , false , new fecha(8,"febrero",2006));
        System.out.println(alumno4);
        
        
        //*****************************************+
        //EXTRA
        /*
        COCHE tiene un chofer,copiloto, pasajero1,pasajero2;
        
        choche
        --------
        -color()String
        -
        -
        -
        -
        -chofer:Persona
        -copiloto:Persona
        -pasajero1:Persona
        -pasajero2:Persona
        --------
        encender()
        
        //Composicion
        Persona
        --------
        -nombre:String
        -edad:int
        --------
        vacio
        */
        //creando coche
        persona chofer = new persona("Juan", "Perez", "Masculino", "Chofer Profesional", 30);
        persona copiloto = new persona("Maria", "Lopez", "Femenino", "Estudiante", 25);
        persona pasajero1 = new persona("Carlos", "Gomez", "Masculino", "Empleado", 35);
        persona pasajero2 = new persona("Ana", "Martinez", "Femenino", "Doctora", 40);
        
        Coche miCoche = new Coche("Toyota", "Rojo", 2022, 6, 5, chofer, copiloto, pasajero1, pasajero2);
        System.out.println(miCoche);
    }
    
}
