package model;
import java.lang.String;

public class Persona {
    private String nombre, apellido, dni;

    private int edad, altura;

    private double peso;

    public Persona() {
    }


    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(java.lang.String nombre, java.lang.String apellido, java.lang.String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona (java.lang.String nombre, java.lang.String apellido){
     this.nombre = nombre;
     this.apellido = apellido;
     this.dni = "111111111X";
     this.edad = edad;
     this.altura = altura;
     this.peso = peso;
    }





    public java.lang.String getNombre() {
        return nombre;
    }

    public java.lang.String getApellido() {
        return apellido;
    }

    public java.lang.String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }

    public void setDni(java.lang.String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void mostrarDatos (){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("DNI: "+this.dni);
        System.out.println("Edad: "+this.edad);
        System.out.println("Altura: "+this.altura);
        System.out.println("Peso "+this.peso);
    }







}
