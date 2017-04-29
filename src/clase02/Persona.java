/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02;

import java.util.Objects;

/**
 *
 * @author educacionit
 */
public class Persona {                            //BEANS: Clase con atributos privados, getters, setters
    private String nombre;                        //y constructor
    private String apellido;
    private int edad;
    
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getNombre(){
        return this.nombre;        
    }
    
    public boolean sonIguales(String nombre){
        return this.nombre.equals(nombre);
    }

    public String getApellido(){
        return this.apellido;        
    }      
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }
    
    public void hablar(){    
        System.out.println("Estoy hablando");
    }
    
//  public abstract void caminar();                //Todas las subclases deben sobreescribir el metodo
    
    public void caminar(){                              //Sobrecarga de metodos
        //System.out.println("camino 10m");
        caminar(10);
    }
    
    public void caminar(int m){
        System.out.println("camino" + m + "m");
    }  
    
    
}
