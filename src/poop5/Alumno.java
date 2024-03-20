/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Esta clase proporciona métodos para obtener y establecer información sobre el alumno, como su nombre, apellido, curso, edad, promedio, 
 * estado de inscripción, y fecha de nacimiento.
 * También incluye métodos para realizar acciones típicas de un estudiante, como dormir, estudiar, realizar tareas, hacer exámenes y tomar notas.
 * 
 * @author Fernanda Ordoñez
 * @version 19/03/2024
 */
public class Alumno {
    /** El nombre del alumno. */
    private String nombre;
    
    /** El apellido del alumno. */
    private String apellido;
    
    /** El curso en el que está inscrito el alumno. */
    private String curso;
    
    /** La edad del alumno. */
    private int edad;
    
    /** El promedio académico del alumno. */
    private float promedio;
    
    /** Indica si el alumno está inscrito en el curso. */
    private boolean inscrito;
    
    /** La fecha de nacimiento del alumno. */
    private fecha fNacimiento;
    private fecha fNacimento;
    
    /**
     * Creacion del metodo de constructor vacio, por defecto
     */
    public Alumno() {
    }
    
    /**
     * Crea un nuevo objeto Alumno con los atributos especificados.
     * 
     * @param nombre El nombre del alumno.
     * @param apellido El apellido del alumno.
     * @param curso El curso en el que está inscrito el alumno.
     * @param edad La edad del alumno.
     * @param promedio El promedio académico del alumno.
     * @param inscrito Indica si el alumno está inscrito en el curso.
     * @param fNacimento La fecha de nacimiento del alumno.
     */
    public Alumno(String nombre, String apellido, String curso, int edad, float promedio, boolean inscrito, fecha fNacimento){    
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.edad = edad;
        this.promedio = promedio;
        this.inscrito = inscrito;
        this.fNacimento = fNacimento;
    }

    /**
     * Devuelve el nombre del alumno.
     * 
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del alumno con el valor especificado.
     * 
     * @param nombre El nombre del alumno.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;  //"hardcodear-dejarle un valor estatico"
        //ocupamos this por que es el atributo y nombre solo es la variable
    }
    public String getApellido(){
        return apellido;
    }
    /**
     * Establece el apellido del alumno con el valor especificado.
     * 
     * @param apellido El apellido del alumno.
     */
    public void setApelllido(String apellido){
        this.apellido= apellido;
    }
    /**
     * Devuelve el curso en el que está inscrito el alumno.
     * 
     * @return El curso del alumno.
     */
    public String getCurso() {
        return curso;
    }
    /**
     * Establece el curso en el que está inscrito el alumno con el valor especificado.
     * 
     * @param curso El curso del alumno.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    /**
     * Devuelve la edad del alumno.
     * 
     * @return La edad del alumno.
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Establece la edad del alumno con el valor especificado.
     * 
     * @param edad La edad del alumno.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Devuelve el promedio académico del alumno.
     * 
     * @return El promedio académico del alumno.
     */
    public float getPromedio() {
        return promedio;
    }
    /**
     * Establece el promedio académico del alumno con el valor especificado.
     * 
     * @param promedio El promedio académico del alumno.
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    

    //Metodos de accion
    /**
     * Simula al alumno durmiendo.
     */
    public void dormir(){
        System.out.println("Zzzzz");
    }
    /**
     * Simula al alumno estudiando.
     */
    public void estudiar(){
        System.out.println("...Estudiando...");
    }
    /**
     * Simula al alumno realizando una tarea.
     */
    public void hacerTarea (){
        System.out.println("...Realizando tarea....");
    }
    /**
     * Simula al alumno realizando un examen.
     */
    public void hacerExamen () {
        System.out.println("...Haciendo examen....");
    }
    /**
     * Simula al alumno tomando notas.
     */
    public void tomarNotas(){
        System.out.println("...tomando notas...");
    }
    /**
     * Devuelve true si el alumno está inscrito en el curso, de lo contrario, devuelve false.
     * 
     * @return true si el alumno está inscrito en el curso, false de lo contrario.
     */
    public boolean isInscrito() {
        return inscrito;
    }
    /**
     * Establece el estado de inscripción del alumno con el valor especificado.
     * 
     * @param inscrito true si el alumno está inscrito en el curso, false de lo contrario.
     */
    public void setInscrito(boolean inscrito) {
        this.inscrito = inscrito;
    }
    /**
     * Devuelve la fecha de nacimiento del alumno.
     * 
     * @return La fecha de nacimiento del alumno.
     */
    public fecha getfNacimento() {
        return fNacimento;
    }
    /**
     * Establece la fecha de nacimiento del alumno con el objeto {@code fecha} especificado.
     * 
     * @param fNacimento La fecha de nacimiento del alumno.
     */
    public void setfNacimento(fecha fNacimento) {
        this.fNacimento = fNacimento;
    }
    
    /**
     * Devuelve una representación en forma de cadena del alumno.
     * @return Una cadena que representa al alumno.
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + ", edad=" + edad + ", promedio=" + promedio + ", inscrito=" + inscrito + ", fNacimento=" + fNacimento + '}';
    }
    
   //Paso 5, molularidad
    
}
