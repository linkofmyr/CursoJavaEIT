/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02;

public class Estudiante extends Persona {                                        //Herencia
    private String legajo;

    public Estudiante(String nombre, String apellido, int edad, String legajo) {
        super(nombre, apellido, edad);                                     //Hereda atributos de superclase
        this.legajo = legajo;
    }
    
    public void hablar(){
        System.out.println("Hablo como estudiante");
    }
    
}
