/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author poo01alu06
 */
public class Alumno {
    
    //Creando atributos
    private String nombre, apellido, curso;
    private int edad;
    private float promedio;
    private boolean inscrito;
    private fecha fNacimento;
    //sobrecarga con los dos metosos pues tienen el mismo nombre diferentes parametros
    //Constructor vacio
    public Alumno() {
    }
    
    //Constructor con atributos
    public Alumno(String nombre, String apellido, String curso, int edad, float promedio, boolean inscrito, fecha fNacimento){    
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.edad = edad;
        this.promedio = promedio;
        this.inscrito = inscrito;
        this.fNacimento = fNacimento;
    }

    //metodos de servicio
    //paso 3 crear getters y setters, por hacere privados los atributos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;  //"hardcodear-dejarle un valor estatico"
        //ocupamos this por que es el atributo y nombre solo es la variable
    }
    public String getApellido(){
        return apellido;
    }
    public void setApelllido(String apellido){
        this.apellido= apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    
   //metodos de accion
    public void dormir(){
        System.out.println("Zzzzz");
    }
    
    public void estudiar(){
        System.out.println("...Estudiando...");
    }
    
    public void hacerTarea (){
        System.out.println("...Realizando tarea....");
    }
    
    public void hacerExamen () {
        System.out.println("...Haciendo examen....");
    }
    
    public void tomarNotas(){
        System.out.println("...tomando notas...");
    }

    public boolean isInscrito() {
        return inscrito;
    }

    public void setInscrito(boolean inscrito) {
        this.inscrito = inscrito;
    }

    public fecha getfNacimento() {
        return fNacimento;
    }

    public void setfNacimento(fecha fNacimento) {
        this.fNacimento = fNacimento;
    }
    
//metodos de servicio pero de escritura
    //Sobreescritura
    //no retornamos direccion de memoria, retornamos el valor de los atributos como cadena
    

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + ", edad=" + edad + ", promedio=" + promedio + ", inscrito=" + inscrito + ", fNacimento=" + fNacimento + '}';
    }
    
   //Paso 5, molularidad
    
}
